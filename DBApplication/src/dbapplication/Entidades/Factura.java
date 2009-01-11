/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

import java.util.ArrayList;

/**
 * Manejo de información de facturas
 * @author prometheus
 */
public class Factura {
    private int idFactura;
    private String descripción;
    private ArrayList pagos;

    /**
     * Constructor por defecto
     */
    public Factura () {
        this.descripción = null;
        this.pagos = null;
    }

    /**
     * Constructori con Parámetros
     * @param id id factura
     * @param dest descripción
     * @param ins insumos facturados
     */
    public Factura(int id, String dest, ArrayList p) {
        this.idFactura = id;
        this.descripción = dest;
        this.pagos = p;
    }
}
