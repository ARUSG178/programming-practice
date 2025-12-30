#include <iostream>
#include <string>
#include <vector>
using namespace std;

class Product {
protected:
    string ID;
    double basePrice;
public:
    Product(const string &id, double bP) : ID(id), basePrice(bP) {}
    virtual double getSalePrice() const = 0; 
    virtual ~Product() {}
};

class Libro : public Product {
    string titulo, autor, editorial, ISBN;
    int anio;
public:
    Libro(const string &id, double bP, const string &t, const string &a,
          int an, const string &e, const string &isbn)
        : Product(id, bP), titulo(t), autor(a), editorial(e), ISBN(isbn), anio(an) {}

    double getSalePrice() const override {
        double iva = basePrice * 0.08;      // 8% IVA
        double descuento = basePrice * 0.20; // 20% descuento
        return basePrice + iva - descuento;
    }
};

class CD : public Product {
    string titulo, interprete;
    int anio;
public:
    CD(const string &id, double bP, const string &t, const string &i, int an)
        : Product(id, bP), titulo(t), interprete(i), anio(an) {}

    double getSalePrice() const override {
        double iva = basePrice * 0.12;      // 12% IVA
        double descuento = basePrice * 0.10; // 10% descuento
        return basePrice + iva - descuento;
    }
};

int main() {
    Libro l("L001", 100.0, "Cien años de soledad", "García Márquez", 1967, "Sudamericana", "123456789");
    CD c("C001", 50.0, "Thriller", "Michael Jackson", 1982);

    cout << "Precio libro: " << l.getSalePrice() << endl;
    cout << "Precio CD: " << c.getSalePrice() << endl;

    return 0;
}