numero1 = int(input("Ingresa el primer numero: "))
numero2 = int(input("Ingresa el segundo numero: "))

if (numero1 % 2 == 0 and numero2 % 2 == 0):
    print("Ambos numeros son pares")
elif (numero1 % 2 == 0 and numero2 % 2 != 0):
    print(f"El {numero1} es par y el {numero2} es impar")
elif (numero1 % 2 != 0 and numero2 % 2 == 0):
    print(f"El {numero1} es impar y el {numero2} es par")
else:
    print("Ambos numeros son impares")
