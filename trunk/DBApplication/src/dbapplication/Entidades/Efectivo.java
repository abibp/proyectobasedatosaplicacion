/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

/**
 * Maneja pagos en efectivo
 * @author prometheus
 */
public class Efectivo extends FormaDePago {
    private String moneda;

    /**
     * Constructor por defecto
     */
    public Efectivo () {
        super();
        this.moneda = null;
    }

    /**
     * Constructor con parámetros
     * @param id id pago
     * @param moneda moneda en la que se realizó
     */
    public Efectivo (int id, String moneda) {
        super (id);
        this.moneda = moneda;
    }

    /**
     * @return the moneda
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * @param moneda the moneda to set
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

}
