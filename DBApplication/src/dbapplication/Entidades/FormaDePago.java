/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

/**
 * Maneja Información sobre las distintas formas de pago
 * @author prometheus
 */
public class FormaDePago {
    protected int idFormaDePago;

    /**
     * Constructor por Defecto
     */
    public FormaDePago () {

    }

    /**
     * Constructor con parámetros
     * @param id id del pago
     */
    public FormaDePago (int id) {
        this.idFormaDePago = id;
    }

    /**
     * @return the idFormaDePago
     */
    public int getIdFormaDePago() {
        return idFormaDePago;
    }

    /**
     * @param idFormaDePago the idFormaDePago to set
     */
    public void setIdFormaDePago(int idFormaDePago) {
        this.idFormaDePago = idFormaDePago;
    }

}
