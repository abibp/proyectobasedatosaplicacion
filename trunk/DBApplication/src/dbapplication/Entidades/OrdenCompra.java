/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 * Maneja inforación sobre órdenes de compra
 * @author prometheus
 */
public class OrdenCompra {
    private int idODC;
    private Date fecha;
    private int monto;
    private ArrayList insumos;
    /**
     * Constructor por defecto
     */
    public OrdenCompra () {
        this.insumos = null;
    }

    /**
     * Constructor con parámetros
     * @param id id orden
     * @param fecha fecha orden
     * @param monto monto orden
     * @param ins insumos de la orden
     */
    public OrdenCompra (int id, Date fecha, int monto, ArrayList ins) {
        this.fecha = fecha;
        this.idODC = id;
        this.insumos = ins;
        this.monto = monto;
    }

    /**
     * @return the idODC
     */
    public int getIdODC() {
        return idODC;
    }

    /**
     * @param idODC the idODC to set
     */
    public void setIdODC(int idODC) {
        this.idODC = idODC;
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
     * @return the insumos
     */
    public ArrayList getInsumos() {
        return insumos;
    }

    /**
     * @param insumos the insumos to set
     */
    public void setInsumos(ArrayList insumos) {
        this.insumos = insumos;
    }


}
