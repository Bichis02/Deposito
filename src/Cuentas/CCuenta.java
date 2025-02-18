
package Cuentas;

/**
 *
 * @author Jacqueline
 */
public class CCuenta {
    
private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    // Constructor sin parámetros
    public CCuenta() {
    }

    // Constructor con parámetros
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    // Método para obtener el saldo actual
    public double estado() {
        return getSaldo();
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        try {
            System.out.println("Retiro en cuenta: " + cantidad);
            if (cantidad <= 0)
                throw new Exception("No se puede retirar una cantidad negativa");
            if (estado() < cantidad)
                throw new Exception("No hay suficiente saldo");
            setSaldo(getSaldo() - cantidad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Método para ingresar dinero
    public void ingresar(double cantidad) {
        try {
            System.out.println("Ingreso en cuenta: " + cantidad);
            if (cantidad < 0)
                throw new Exception("No se puede ingresar una cantidad negativa");
            setSaldo(getSaldo() + cantidad);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
