
package Cuentas;

/**
 *
 * @author Jacqueline
 */
public class Main {
    
 public static void main(String[] args) {
        CCuenta cuenta1; // Renombramos miCuenta a cuenta1
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
        
        // Llamamos al método de operaciones
        System.out.println("Realizado operaciones en la cuenta...");
        operaciones(cuenta1);

        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }

        // Método de las operaciones de saldo
    private static void operaciones(CCuenta cuenta1) {
        // Operaciones de ingreso y retiro
        cuenta1.retirar(2300);
        cuenta1.ingresar(685);
    }
}