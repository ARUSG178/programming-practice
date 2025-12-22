#include <iostream>
using namespace std;

class Profesor {
    string nombre;
    string materia;
    int id;

    public:

        Profesor(const string &n, const string& m, const int &i) : nombre(n), materia(m), id(i) {}
        string getNombre() const { return nombre; }
};

class Auxiliar {
    string nombre;
    string materia;
    string nombreProfesor;

    public:
        Auxiliar(const string &n, const string& m, const Profesor &prof) : nombre(n), materia(m){
            nombreProfesor = prof.getNombre();
        }

};

class Alumno {};

class Catedra {
    Profesor profesor;
    Auxiliar auxiliares[4];
};


int main () { 

    return 0;
}