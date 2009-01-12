/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

/**
 * Manejo de Información de Pagos
 * @author prometheus
 */
public class Pago {
    private int idPago;
    private int monto;
    private FormaDePago fdp;

    /**
     * Constructor por defecto
     */
    public Pago () {
        this.fdp = null;
    }

    /**
     * Constructor con parámetros
     * @param id id pago
     * @param monto monto del pago
     * @param f forma de pago
     */
    public Pago (int id, int monto, FormaDePago f) {
        this.idPago = id;
        this.fdp = f;
        this.monto = monto;
    }

    /**
     * @return the idPago
     */
    public int getIdPago() {
        return idPago;
    }

    /**
     * @param idPago the idPago to set
     */
    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    /**
     * @return the monto
     */
    public int getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(int monto) {
        this.monto = monto;
    }

    /**
     * @return the fdp
     */
    public FormaDePago getFdp() {
        return fdp;
    }

    /**
     * @param fdp the fdp to set
     */
    public void setFdp(FormaDePago fdp) {
        this.fdp = fdp;
    }

}
