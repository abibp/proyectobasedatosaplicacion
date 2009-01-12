/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

/**
 * Maneja información sobre pagos con cheques
 * @author prometheus
 */
public class Cheque extends FormaDePago {
    private String numeroCheque;
    private String banco;

    /**
     * Constructor por defecto
     */
    public Cheque() {
        super();
        this.banco = null;
        this.numeroCheque = null;
    }

    /**
     * Constructor con parámetros
     * @param id id pago
     * @param numCheque número de queche
     * @param bank banco del cheque
     */
    public Cheque(int id, String numCheque, String bank) {
        super (id);
        this.banco = bank;
        this.numeroCheque = numCheque;
    }

    /**
     * @return the numeroCheque
     */
    public String getNumeroCheque() {
        return numeroCheque;
    }

    /**
     * @param numeroCheque the numeroCheque to set
     */
    public void setNumeroCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
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
}
