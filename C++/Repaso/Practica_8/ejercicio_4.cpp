#include <iostream>
#include <string>
#include <vector>
#include <memory> // Necesario para std::unique_ptr y std::make_unique
using namespace std;

class Tool {
    string name, description, code, nameFabricant, typeOfUse;
    float cost;
public:
    Tool(const string &na, const string &des, const string &co,const string &naFa, const string &use, const float &ct)
        : name(na), description(des), code(co),nameFabricant(naFa), typeOfUse(use), cost(ct) {}

    virtual ~Tool() = default;

    const string& getName() const { return name; }
    const string& getDescription() const { return description; }
    const string& getCode() const { return code; }
    const string& getNameFabricant() const { return nameFabricant; }
    const string& getTypeOfUse() const { return typeOfUse; }
    float getCost() const { return cost; }
};

class ManualTools : public Tool {
public:
    ManualTools(const string &na, const string &des, const string &co, const string &naFa, const string &use, const float &ct)
    : Tool(na, des, co, naFa, use, ct) {}
};

class ElectricTools : public Tool {
    float voltage;
    bool hasBattery;
public:
    ElectricTools(const string &na, const string &des, const string &co,
                  const string &naFa, const string &use, const float &c,
                  const float &v, const bool &bat)
        : Tool(na, des, co, naFa, use, c), voltage(v), hasBattery(bat) {}

    float getVoltage() const { return voltage; }
    bool getHasBattery() const { return hasBattery; }
};

class MotorTools : public Tool {
    float power;
    float tankCapacity;
    bool needsOil;
public:
    MotorTools(const string &na, const string &des, const string &co,
               const string &naFa, const string &use, const float &c,
               const float &po, const float &tC, const bool &oil)
        : Tool(na, des, co, naFa, use, c), power(po), tankCapacity(tC), needsOil(oil) {}

    float getPower() const { return power; }
    float getTankCapacity() const { return tankCapacity; }
    bool getNeedsOil() const { return needsOil; }
};

int main() {
    // Escenario Moderno: Usamos unique_ptr para gestión automática y segura
    vector<unique_ptr<Tool>> toolbox;

    // make_unique crea el objeto y lo envuelve en un puntero inteligente (C++14 en adelante)
    toolbox.push_back(make_unique<ManualTools>("Hammer", "Steel hammer", "M001", "ACME", "Construction", 15.0f));
    toolbox.push_back(make_unique<ElectricTools>("Drill", "Electric drill", "E001", "Bosch", "Plumbing", 120.0f, 220.0f, true));
    toolbox.push_back(make_unique<MotorTools>("Chainsaw", "Gas-powered chainsaw", "C001", "Stihl", "Gardening", 300.0f, 5.5f, 1.2f, true));

    cout << "--- Inventario de Herramientas ---" << endl;
    // Usamos 'const auto&' para observar el puntero sin robárselo al vector
    for (const auto& t : toolbox) {
        cout << "Tool: " << t->getName() << " | Cost: $" << t->getCost() << endl;
    }

    // ¡Magia! No hace falta delete. Al salir del main, el vector se destruye
    // y cada unique_ptr llama automáticamente al destructor virtual de cada herramienta.

    return 0;
}