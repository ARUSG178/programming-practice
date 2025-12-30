/*
Crear vector<pair<string,int>> con nombre y edad de 5 personas.
Imprimir todos los pares (.first y .second).
Ordenar por edad ascendente usando sort + lambda.
Ordenar por edad descendente.
Ordenar alfabéticamente por nombre.
Buscar la persona más joven (min_element).
Buscar la persona más vieja (max_element).
Contar cuántas personas son mayores de 20 (count_if).
Sumar todas las edades (accumulate con lambda).
Filtrar personas menores de 30 en un nuevo vector (copy_if).
Cambiar el nombre de todos agregando “Sr./Sra.” usando for_each + lambda.
Crear un map<string,int> desde el vector de pares.
Crear un unordered_map<string,int> desde el vector de pares.
Verificar si existe alguien con edad = 25.
*/
#include <iostream>
#include <string>
#include <map>
#include <unordered_map>
#include <vector>
#include <algorithm>
#include <numeric>
using namespace std;

bool Compare(const pair<string, int> &x, const pair<string, int> &b) {
    return x.second < b.second;
}

int main () {
    // Creating a vector
    vector<pair<string, int>> EwE {{"Dana",17},{"Aaron",22},{"Luis",19},{"Maria",41},{"Sofia",20}};
    // Printing both componentes
    for(auto &uwu : EwE) cout << "Name: " << uwu.first << " Age: " << uwu.second << endl;
    // sort + lambda ascend
    sort(EwE.begin(), EwE.end(), [](const pair<string, int> &x, const pair<string, int> &b) { return x.second < b.second; });
    // sort ascend  withoud lambda
    sort(EwE.begin(), EwE.end(), [](const pair<string, int> &x, const pair<string, int> &b) { return x.second > b.second; });
    sort(EwE.begin(), EwE.end(), Compare); // El tercer argumento puede ser el puntero a una función, una estructura. No se pasa argumentos.
    // sort ascend for name
    sort(EwE.begin(), EwE.end(), [](const pair<string, int> &x, const pair<string, int> &b) { return x.first < b.first; });
    // search the youngest person
    auto it = min_element(EwE.begin(), EwE.end(), [](const pair<string, int> &x, const pair<string, int> &b) { return x.second < b.second;});
    cout << "Youngest: " << it->first << " (" << it->second << ")" << endl; // Como devuelve un iterador, apunta al contenedor de la información, por ende hay que usar "it->" ó "(*it)".
    // search the oldest person
    it = max_element(EwE.begin(), EwE.end(), [] (const pair<string, int> &x, const pair<string, int>  &b) { return x.first > b.first; });
    cout << "Oldest: " << (*it).first << " (" << (*it).second << ")" << endl;
    // Persons up to 20 years old
    auto persons = count_if(EwE.begin(), EwE.end(), [](const pair<string, int> x) { return x.second > 20; });
    cout << "Up to 20: " << persons << endl;
    // Sum all ages
    auto sumatory = accumulate(EwE.begin(), EwE.end(), 0, [] (int sum, const pair<string, int> &p) { return sum + p.second; });
    cout << "Sumatory: " << sumatory << endl;
    // copy with conditions
    vector<pair<string, int>> OwO;
    copy_if(EwE.begin(), EwE.end(), back_inserter(OwO), [] (const pair<string, int> &x){ return x.second < 30; });
    for(auto &it : OwO) cout << it.first << " (" << it.second << ")" << endl;
    // Add "Sr/Sra" at the beginning of all names
    for_each(EwE.begin(), EwE.end(), [] (pair<string,int> &p) { p.first = "Sr./Sra. " + p.first; });
    for(auto &it: EwE) cout << it.first << " (" << it.second << ")" << endl ;
    // vector to map
    map <string, int> personas;
    for(const auto &p : EwE) personas[p.first] = p.second; 
    for(auto &it : personas) cout << it.first << " (" << it.second << ")" << endl;
    // vector to unordered_map
    unordered_map <string, int> personas2;
    for(const auto &p : EwE) personas2[p.first] = p.second;
    for(auto &it : personas2) cout << it.first << " (" << it.second << ")" << endl;
    // Search a data
    for(auto &it : personas) { if (it.second == 25) cout << "Finded"; else cout << "Nya"; }
    return 0;
} 