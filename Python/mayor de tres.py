numero1 = int(input("Ingresa el primer numero: "))
numero2 = int(input("Ingresa el segundo numero: "))
numero3 = int(input("Ingresa el tercer numero: "))

if numero1 >= numero2 and numero1 >= numero3:
    print(f"El numero mayor es: {numero1}")
elif numero2 >= numero1 and numero2 >= numero3:
    print(f"El numero mayor es: {numero2}")
else:
    print(f"El numero mayor es: {numero3}")
