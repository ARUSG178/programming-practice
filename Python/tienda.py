precio = float(input("Ingrese el precio del producto sujetos a nuestra promocion: "))

descuento = precio * 0.15;
precioFinal = precio - descuento
print(f"Tu producto valdra un total de {precioFinal:.2f}$")