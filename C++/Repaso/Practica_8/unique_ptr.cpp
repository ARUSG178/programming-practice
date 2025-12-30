#include <iostream>
#include <string>
#include <vector>
#include <memory> // Necesario para std::unique_ptr y std::make_unique
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
    
    // LECCIÓN 1: unique_ptr (Puntero Único)
    // -------------------------------------
    // Declaramos un vector de 'unique_ptr'. Esto significa:
    // 1. "Yo, la clase Catedra, soy la DUEÑA absoluta de estos estudiantes".
    // 2. "Nadie más puede borrarlos ni tenerlos a la vez".
    // 3. "Cuando yo (Catedra) muera, ellos morirán conmigo automáticamente".
    vector<unique_ptr<Student>> students; 

public:
    // LECCIÓN 2: Transferencia de Propiedad (std::move)
    // ------------------------------------------------
    // No podemos copiar un unique_ptr (porque es único).
    // Por eso usamos std::move(s). Le dice al compilador:
    // "No copies el vector. ROBALE las tripas al vector 's' que entra y pónselas al mío".
    Catedra(const Teacher& t, const vector<Auxiliar>& a, vector<unique_ptr<Student>> s)
        : teacher(t), students(std::move(s)) {
        size_t n = a.size() < 4 ? a.size() : 4;
        auxiliars.assign(a.begin(), a.begin() + n);
    }

    const Teacher& getTeacher() const { return teacher; }
    const vector<Auxiliar>& getAuxiliars() const { return auxiliars; }
    
    // Devolvemos referencia const para que puedan VER la lista pero no ROBARNOS los punteros
    const vector<unique_ptr<Student>>& getStudents() const { return students; }

    const Student* getStudent(string name) const {
        // Iteramos sobre los unique_ptr
        for (const auto& s : students) {
            // LECCIÓN 3: Acceso (-> y .get())
            // -------------------------------
            // 's' es el envoltorio (el puntero inteligente).
            // s->getName() : La flecha atraviesa el envoltorio y llama al método del objeto real.
            // s.get()      : Saca el puntero crudo (Student*) solo para "mirar" (lectura), sin transferir propiedad.
            if (s->getName() == name) return s.get(); 
        }
        return nullptr;
    }
    
    void addStudent(unique_ptr<Student> s) {
        // Aquí también usamos move, porque el estudiante viene de fuera y entra a la cátedra para siempre.
        students.push_back(std::move(s));
    }
};

int main () {
    Teacher profesor;
    vector<Auxiliar> listaAuxiliares(2); 

    // LECCIÓN 4: Creación Segura (make_unique)
    vector<unique_ptr<Student>> misEstudiantes;
    misEstudiantes.push_back(make_unique<Student>("Ana Perez", Evaluation{"2024-05-10", 14}, Practical{{"2024-05-20", 18}, false}, FinalExam{{"2024-06-15", 16}, 1, 1}));

    // LECCIÓN 5: El Gran Traspaso (std::move)
    Catedra catedra(profesor, listaAuxiliares, std::move(misEstudiantes));

    // LECCIÓN 6: Destrucción Automática
    // Al llegar al 'return 0', todo se limpia solo.

    return 0;
}