#include <iostream>
#include <string>
using namespace std;

class Herramienta {
    string nombre;
    string descripcion;
    double costo;
    int codigo_fabrica;
    string nombre_fabricante;
    string tipo; // Manuales, Electricas, Motoras

    public:
        Herramienta(const string &n, const string &d, const double &c, const int &code, const string &fabri, const string &type) 
        : nombre(n), descripcion(d), costo(c), codigo_fabrica(code), nombre_fabricante(fabri), tipo(type) {}
        
        string getNombre() const { return nombre; }
        string getDescripcion() const {return descripcion; }
        double getCosto() const { return costo; }
        int getCodigo() const { return codigo_fabrica; }
        string getFabricante() const { return nombre_fabricante; }
        string getTipo() const { return tipo; }

};

class Manual : public Herramienta {

    public:
        Manual(const string &n, const string &d, const double &c, const int &code, const string &fabri, const string &type)
            : Herramienta(n, d, c, code, fabri, type) {}
};

class Electrica : public Herramienta {
    double voltaje;
    double energia_almacenada;

    public:
        Electrica(const string &n, const string &d, const double &c, const int &code, const string &fabri, const string &type, const double &v, const double &energy)
        : Herramienta(n, d, c, code, fabri, type), voltaje(v), energia_almacenada(energy) {}

        double getVoltaje() const { return voltaje; }

        double getEnergiaAlmacenada () const { return energia_almacenada; }
};

class Motora : public Herramienta {
    double cilindrada_motor;
    int combustible_litros;
    int aceite;

    public:
        Motora(const string &n, const string &d, const double &c, const int &code, const string &fabri, const string &type, const double &potencia, const int &com, const int &ace)
            : Herramienta(n, d, c, code, fabri, type), cilindrada_motor(potencia), combustible_litros(com), aceite(ace) {}

        double getCilindrada() const { return cilindrada_motor; }

        bool isEmptyCombustible() {return combustible_litros; }

        bool needAceite() { return aceite; }
};


int main(){

    return 0;
}