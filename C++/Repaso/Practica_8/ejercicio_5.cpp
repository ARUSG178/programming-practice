#include <iostream>
#include <string>
#include <vector>
#include <memory>
using namespace std;

struct Evaluation {
    string date;
    int grade;
};

struct Practical : public Evaluation {
    bool delayed;
};

struct FinalExam : public Evaluation {
    int mesa;   
    int call;   
};

class Student {
    string name;
    Evaluation partial;  
    Practical practical;
    FinalExam finalExam;

public:
    Student(const string &n,const Evaluation& p, const Practical& tp, const FinalExam& fe) : name(n), partial(p), practical(tp), finalExam(fe) {}

    const string& getName() const { return name; }
    const Evaluation& getPartials() const { return partial; }
    const Practical& getPractical() const { return practical; }
    const FinalExam& getFinalExam() const { return finalExam; }
};

class Teacher {
    public:
    Teacher() = default;
};
class Auxiliar {
    public:
    Auxiliar() = default;
};
class Catedra {
    Teacher teacher;
    vector<Auxiliar> auxiliars;
    vector<unique_ptr<Student>> students; // Catedra es dueña de los punteros
public:
    // Recibimos el vector por valor y lo movemos (std::move) para transferir la propiedad
    Catedra(const Teacher& t, const vector<Auxiliar>& a, vector<unique_ptr<Student>> s)
        : teacher(t), students(std::move(s)) {
        size_t n = a.size() < 4 ? a.size() : 4;
        auxiliars.assign(a.begin(), a.begin() + n);
    }
    const Teacher& getTeacher() const { return teacher; }
    const vector<Auxiliar>& getAuxiliars() const { return auxiliars; }
    
    // Devolvemos referencia al vector de unique_ptr
    const vector<unique_ptr<Student>>& getStudents() const { return students; }

    const Student* getStudent(string name) const {
        // Iteramos sobre los unique_ptr
        for (const auto& s : students) {
            // s es un unique_ptr, usamos -> para acceder al objeto y .get() si necesitamos el puntero crudo
            if (s->getName() == name) return s.get(); 
        }
        return nullptr;
    }
    
    void addStudent(unique_ptr<Student> s) {
        students.push_back(std::move(s));
    }
};

int main () {
    // 1. Crear objetos básicos (en la pila/stack)
    Teacher profesor;
    vector<Auxiliar> listaAuxiliares(2); // Crea 2 auxiliares por defecto

    // 2. Crear lista de Punteros Inteligentes (Forma Moderna)
    vector<unique_ptr<Student>> misEstudiantes;

    // Usamos make_unique: Es más seguro y eficiente que 'new'
    misEstudiantes.push_back(make_unique<Student>(
        "Ana Perez",
        Evaluation{"2024-05-10", 14},           // Parcial
        Practical{{"2024-05-20", 18}, false},   // Práctico
        FinalExam{{"2024-06-15", 16}, 1, 1}     // Final
    ));

    // 3. Crear la Cátedra transfiriendo la propiedad con std::move
    // Una vez hecho esto, 'misEstudiantes' queda vacío en el main y pasa a ser de 'catedra'
    Catedra catedra(profesor, listaAuxiliares, std::move(misEstudiantes));

    // 4. Probar que funciona
    const Student* s = catedra.getStudent("Ana Perez");
    if (s != nullptr) {
        cout << "Alumno encontrado: " << s->getName() << endl;
        cout << "Nota Final: " << s->getFinalExam().grade << endl;
    }

    // 5. ¡Sin limpieza manual! 
    // Todo se destruye automáticamente al salir del ámbito.

    return 0;
}