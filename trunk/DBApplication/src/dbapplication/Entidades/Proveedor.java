/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;
import java.util.*;

/**
 * Clase Proveedor, almacena información para manipular proveedores
 * @author prometheus
 */
public class Proveedor extends Persona {
    private int idProveedor;
    private ArrayList insumos;
    private ArrayList ordenesDeCompra;
    private ArrayList pagos;

    /**
     * Constructor por defecto
     */
    public Proveedor () {
        super();
        this.insumos = null;
        this.ordenesDeCompra = null;
    }

    /**
     * Constructor con Parámetros
     * @param nom nombre del proveedor
     * @param dir dirección del proveedor
     * @param tlf teléfono de contacto del proveedor
     * @param id id del proveedor
     * @param ins insumos que provée
     * @param odc órdenes de compra efectuadas al proveedor
     */
    public Proveedor(String nom, String dir, int tlf, int id, ArrayList ins, ArrayList odc) {
        super(nom, tlf, dir);
        this.insumos = ins;
        this.ordenesDeCompra = odc;
        this.idProveedor = id;
    }

    /**
     * @return the idProveedor
     */
    public int getIdProveedor() {
        return idProveedor;
    }

    /**
     * @param idProveedor the idProveedor to set
     */
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
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

    /**
     * @return the ordenesDeCompra
     */
    public ArrayList getOrdenesDeCompra() {
        return ordenesDeCompra;
    }

    /**
     * @param ordenesDeCompra the ordenesDeCompra to set
     */
    public void setOrdenesDeCompra(ArrayList ordenesDeCompra) {
        this.ordenesDeCompra = ordenesDeCompra;
    }

    /**
     * @return the pagos
     */
    public ArrayList getPagos() {
        return pagos;
    }

    /**
     * @param pagos the pagos to set
     */
    public void setPagos(ArrayList pagos) {
        this.pagos = pagos;
    }
}
