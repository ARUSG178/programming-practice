numero1 = float(input("Ingrese primer numero: "))
numero2 = float(input("Ingrese segundo numero: "))
op = input("Ingrese la operacion a hacer: 's/S', 'r/R', 'p/P/m/M' o 'd/D': ")

if op == "s" or op == "S":
    suma = numero1 + numero2
    print(f"La suma es {suma}")
elif op == "r" or op == "R":
    resta = numero1 - numero2
    print(f"La resta es {resta}")
elif op == "p" or op == "P" or op == "m" or op == "M":
    producto = numero1 * numero2
    print(f"El producto es {producto}")
elif op == "d" or op == "D":
    div = numero1 / numero2
    print(f"La division es {div}")
