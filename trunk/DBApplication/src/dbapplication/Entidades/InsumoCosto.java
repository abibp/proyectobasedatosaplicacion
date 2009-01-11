/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

/**
 * relaciona un insumo con un precio y una cantidad
 * @author prometheus
 */
public class InsumoCosto {
    private int idInsumo;
    private int cantidad;
    private int precioUnitario;

    /**
     * Constructor por Defecto
     */
    public InsumoCosto () {
        this.idInsumo = 0;
        this.cantidad = 0;
        this.precioUnitario = 0;
    }

    /**
     * Constructor con todos los atributos
     * @param id  id del insumo
     * @param cant  cantidad cotizada
     * @param pvp   precio por unidad
     */
    public InsumoCosto (int id, int cant, int pvp) {
        this.idInsumo = id;
        this.cantidad = cant;
        this.precioUnitario = pvp;
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

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precioUnitario;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precioUnitario = precio;
    }
}
