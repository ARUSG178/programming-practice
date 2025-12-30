package OOP.Classes;

public class BankAccount {
    private double balance; // Ahora es privado (solo accesible desde esta clase)

    public BankAccount() { balance = 0; }

    public void deposit(double money) {
        if (money > 0) { // Podemos añadir validaciones de seguridad
            balance += money;
        }
    }
    
    // Getter: Método público para LEER el saldo sin poder modificarlo directamente
    public double getBalance() { return balance; }
}
