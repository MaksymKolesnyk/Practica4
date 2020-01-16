package cuentas;
/**
 * Esta clase simula una cuenta bancaria 
 * @author maksymkolesnyk
 * @version 1.0.0
 * @since 9//01/2020
 */


public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
/**
 * Constructor con 4 parametros String, String, float, float.
 * @param nom
 * @param cue
 * @param sal
 * @param tipo
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Metodo que nos devuelve el saldo de la cuenta
     * @return
     */

    public double estado()
    {
        return saldo;
    }
    /**
     * Metodo para ingresar dinero a la cuenta recibiendo por parametro la cantidad a ingresar.
     * @param cantidad
     * @throws Exception
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Metodo para retirar dinero de la cuenta recibiendo por parametro la cantidad a retirar.
     * @param cantidad
     * @throws Exception
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

}
