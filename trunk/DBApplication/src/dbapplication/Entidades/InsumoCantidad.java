/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

/**
 * Relaciona un insumo con una cantidad en inventario
 * @author prometheus
 */
public class InsumoCantidad {
    private int idInsumo;
    private int cantidad;

    /**
     * Constructor por defecto
     */
    public InsumoCantidad () {    }

    /**
     * Constructor con parámetros
     * @param id id insumo
     * @param cant cantidad disponible
     */
    public InsumoCantidad (int id, int cant) {
        this.idInsumo = id;
        this.cantidad = cant;
    }

    /**
     * @return the idInsumo
     */
    public int getIdInsumo() {
        return idInsumo;
    }

    /**
     * @param idInsumo the idInsumo to set
     */
    public void setIdInsumo(int idInsumo) {
        this.idInsumo = idInsumo;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
