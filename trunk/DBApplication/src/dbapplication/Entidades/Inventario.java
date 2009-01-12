/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 * Gestiona información sobre los inventarios
 * @author prometheus
 */
public class Inventario {
    private int idInventario;
    private ArrayList stock;   //contendrá objetos con el ID del producto y la cantidad existente en el inventario.
    private Date fecha;


    public Inventario () {
        this.stock = null;
    }

    public Inventario (Date fecha, int id, ArrayList productos) {
        this.fecha = fecha;
        this.idInventario = id;
        this.stock = productos;
    }

    /**
     * @return the idInventario
     */
    public int getIdInventario() {
        return idInventario;
    }

    /**
     * @param idInventario the idInventario to set
     */
    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    /**
     * @return the stock
     */
    public ArrayList getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(ArrayList stock) {
        this.stock = stock;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
