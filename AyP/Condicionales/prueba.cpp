/*Tu misión es activar la Cápsula de Contención Temporal con un Código de Activación de 5 dígitos. El algoritmo debe validar el código en tres protocolos secuenciales: 
1) Por Paridad Compuesta, el código debe ser capicúa o la suma de sus dígitos pares debe ser mayor que la de los impares; si no cumple, se detiene con 'Error de Simetría'. 
2) Si procede, el dígito central debe ser un divisor de 8 (sin incluir el 1); si no lo es, se detiene con 'Fallo de Sincronización'  
3) Finalmente, el primer dígito debe coincidir con una Frecuencia Crítica: Beta (2, 3) o Gamma (5, 7); cualquier otro dígito detiene la activación.
*/

#include <iostream>
using namespace std;

int main() {
    
    int codigo;
    cin >> codigo;

    if (codigo <= 9999 || codigo >= 100000 ) return 1;

    int copiaCodigo = codigo;

    // Paridad Compuesta
    int d1, d2, d3, d4, d5 = 0;
    //Capicua
    bool validarCapi = false;

    d1 = copiaCodigo % 10; // 59433 -> 3
    copiaCodigo /= 10; // 59433 -> 5943
    d2 = copiaCodigo % 10; // 5943 -> 3
    copiaCodigo /= 10; // 5943 -> 594
    d3 = copiaCodigo % 10; // 594 -> 4 
    copiaCodigo /= 10; // 594 -> 59
    d4 = copiaCodigo % 10; // 59 -> 9
    copiaCodigo /= 10; // 59 -> 5
    d5 = copiaCodigo % 10; // 5 -> 5

    cout << d5 << d4 << d3 << d2 << d1 << endl;


    return 0;
}