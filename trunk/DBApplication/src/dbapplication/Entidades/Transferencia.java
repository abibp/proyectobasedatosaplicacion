/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

/**
 * Maneja información de pagos via Transferencia Bancaria
 * @author prometheus
 */
public class Transferencia extends FormaDePago {
    private String banco;
    private String cuenta;
    private String transaccion;

    /**
     * Constructor por Defecto
     */
    public Transferencia () {
        super ();
        this.banco = null;
        this.cuenta = null;
        this.transaccion = null;
    }

    /**
     * Constructor con parámetros
     * @param id id del pago
     * @param bank nombre del banco
     * @param cuenta duenta bancaria
     * @param transac número de la transacción
     */
    public Transferencia (int id, String bank, String cuenta, String transac) {
        super (id);
        this.banco = bank;
        this.cuenta = cuenta;
        this.transaccion = transac;
    }

    /**
     * @return the banco
     */
    public String getBanco() {
        return banco;
    }

    /**
     * @param banco the banco to set
     */
    public void setBanco(String banco) {
        this.banco = banco;
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
     * @return the transaccion
     */
    public String getTransaccion() {
        return transaccion;
    }

    /**
     * @param transaccion the transaccion to set
     */
    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

}
