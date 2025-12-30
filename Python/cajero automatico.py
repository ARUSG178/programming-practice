saldo = 1000
print("\t.:MENU:.")
print("\n1. Deposito")
print("2. Retiro")
print("3. Consultar saldo")
print("4. Salir")
opcion = int(input("\nDigite una opcion: "))

if opcion == 1:
    saldoAdicional = float(input("Ingrese el saldo a debitar: "))
    saldo += saldoAdicional
    print("Saldo actualizado: ", saldo)
elif opcion == 2:
    saldoRestar = float(input("Ingrese el saldo a retirar: "))
    saldo -= saldoRestar
    print("Saldo actualizado: ", saldo)
elif opcion == 3:
    print("El saldo disponible es: ", saldo)
elif opcion == 4:
    print("Hasta luego")
else:
    print("Opcion invalida")