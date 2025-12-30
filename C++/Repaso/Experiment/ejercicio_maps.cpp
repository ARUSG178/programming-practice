/*
Crear map<string,int> para contar palabras de un texto corto.
Insertar manualmente 10 palabras y sus frecuencias.
Recorrer el map y mostrar claves y valores ordenados.
Crear unordered_map<string,int> y comparar el orden.
Buscar palabras con find y comprobar si existen.
Incrementar el contador de una palabra existente (map["hola"]++).
Borrar una palabra específica (erase).
Verificar tamaño (size) y si está vacío (empty).
Mezclar map y vector: guardar palabras en vector y luego contar con map.
Ordenar las palabras por frecuencia (requiere copiar a vector y usar sort).
Usar count para ver si la clave existe en unordered_map.
Copiar un map a otro map.
Limpiar un map (clear).
Comparar eficiencia: medir tiempo de búsqueda entre map y unordered_map para 10000 elementos.
Crear unordered_map<int, vector<int>> (ej: lista de amigos por ID).
*/
#include <iostream>
#include <vector>
#include <string>
#include <map>
#include <unordered_map>
#include <algorithm>
#include <chrono>   // for time measurement
using namespace std;

int main () {
    // --- Create and fill a map ---
    map <string, int> countWords;
    countWords["hello"] = 3;
    countWords["world"] = 2;
    countWords["c++"] = 5;
    countWords["programming"] = 1;
    countWords["map"] = 4;
    countWords["text"] = 2;
    countWords["word"] = 6;
    countWords["example"] = 1;
    countWords["frecuency"] = 3;
    countWords["counter"] = 2;

    // --- Show values in map (ordered by key) ---
    for(const auto &uwu : countWords) 
        cout << "Key: " << uwu.first << " Value: " << uwu.second << endl;
    cout << endl;

    // --- Create and fill an unordered_map ---
    unordered_map <string, int> countWords2;
    countWords2["hello"] = 3;
    countWords2["world"] = 2;
    countWords2["c++"] = 5;
    countWords2["programming"] = 1;
    countWords2["map"] = 4;
    countWords2["text"] = 2;
    countWords2["word"] = 6;
    countWords2["example"] = 1;
    countWords2["frecuency"] = 3;
    countWords2["counter"] = 2;

    // --- Show values in unordered_map (no order guaranteed) ---
    for(const auto &owo : countWords2) 
        cout << "Key: " << owo.first << " Value: " << owo.second << endl;
    cout << endl;

    // --- Find a key in map ---
    auto it = countWords.find("hello");
    if (it != countWords.end()) 
        cout << "Found: " << it->first << " -> " << it->second << endl;
    else 
        cout << "\"hello\" not found" << endl;

    // --- Increment a value in map ---
    countWords["hello"]++;

    // --- Erase a specific key from map ---
    countWords.erase("c++");
    for(const auto &uwu : countWords) 
        cout << "Key: " << uwu.first << " Value: " << uwu.second << endl;
    cout << endl;

    // --- Check size and empty ---
    auto owo = countWords.size();
    auto ewe = countWords2.size();
    cout << owo << " " << ewe << endl;
    if(!countWords.empty()) cout << "Maduro coño´e tu madre" << endl;

    // --- Copy map to vector ---
    vector<pair<string, int>> countWords3;
    for(const auto &ewe : countWords) 
        countWords3.push_back(ewe);

    // --- Count words again from vector into a new map ---
    map <string, int> countWords4;
    {
        auto i = countWords3.begin();
        while(i != countWords3.end()){
            countWords4[i->first] += i->second;
            ++i;       
        }
    }
    for (const auto& p : countWords4) 
        cout << "Key: " << p.first << " Value: " << p.second << endl;

    // --- Sort vector by frequency (descending) ---
    sort(countWords3.begin(), countWords3.end(),
        [](const pair<string, int> &a, const pair<string, int> &b) {
            return a.second > b.second;
        });
    for(const auto &uwu : countWords3 ) 
        cout << "Key: " << uwu.first << " Value: " << uwu.second << endl;

    // --- Check if a key exists in map ---
    if(countWords.count("hello")) cout << "Culo\n";
    else cout << "kk\n";

    // --- Copy map to another map ---
    map <string, int> copyMap;
    copyMap = countWords;

    // --- Clear a map ---
    copyMap.clear();
    if(copyMap.empty()) cout << "Diablo muchacho" << endl;

    // --- Compare search efficiency: map vs unordered_map ---
    map<int,int> m;
    unordered_map<int,int> um;
    const int N = 10000;
    for(int i=0; i<N; i++){
        m[i] = i;
        um[i] = i;
    }
    int key = N/2;

    auto start1 = chrono::high_resolution_clock::now();
    auto it1 = m.find(key);
    auto end1 = chrono::high_resolution_clock::now();
    cout << "map find: " 
         << chrono::duration<double, micro>(end1-start1).count() 
         << " microseconds\n";

    auto start2 = chrono::high_resolution_clock::now();
    auto it2 = um.find(key);
    auto end2 = chrono::high_resolution_clock::now();
    cout << "unordered_map find: " 
         << chrono::duration<double, micro>(end2-start2).count() 
         << " microseconds\n";

    // --- unordered_map<int, vector<int>> example (friends list by ID) ---
    unordered_map<int, vector<int>> friends;
    friends[1] = {2,3,4};   // user 1 has friends 2,3,4
    friends[2] = {1,5};     // user 2 has friends 1 and 5
    friends[3] = {1};       // user 3 has friend 1

    cout << "Friends of user 1: ";
    for(int id : friends[1]) cout << id << " ";
    cout << endl;

    return 0;
}