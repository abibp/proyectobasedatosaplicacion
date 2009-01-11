/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;
import java.util.*;
import java.util.Date;

/**
 * Clase Cotización: manipula información sobre las cotizaciones
 * @author prometheus
 */
public class Cotizacion {
    private int idCotizacion;
    private Date fecha;
    private int status;
    private String motivo;
    private int monto;
    private ArrayList insumosCotizados;      //no contiene insumos como tal, sino un objeto con el ID del insumo la cantidad y el precio por unidad

    /**
     * Constructor por defecto
     */
    public Cotizacion () {
        this.insumosCotizados = null;
        this.motivo = null;
    }

    /**
     * Constructor con parámetros
     * @param id id de la cotización
     * @param fecha fecha de la cotización
     * @param status status de la cotización
     * @param motivo motivo del futuro evento
     * @param todo productos y servicios solicitados
     */
    public Cotizacion (int id, Date fecha, int status, String motivo, ArrayList todo) {
        this.idCotizacion = id;
        this.fecha = fecha;
        this.status = status;
        this.motivo = motivo;
        this.insumosCotizados = todo;
        this.monto = this.calcularMonto (this.insumosCotizados);
    }

    /**
     * @return the idCotizacion
     */
    public int getIdCotizacion() {
        return idCotizacion;
    }

    /**
     * @param idCotizacion the idCotizacion to set
     */
    public void setIdCotizacion(int idCotizacion) {
        this.idCotizacion = idCotizacion;
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
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
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
     * @return the insumosCotizados
     */
    public ArrayList getInsumosCotizados() {
        return insumosCotizados;
    }

    /**
     * @param insumosCotizados the insumosCotizados to set
     */
    public void setInsumosCotizados(ArrayList insumosCotizados) {
        this.insumosCotizados = insumosCotizados;
    }

    private int calcularMonto (ArrayList productos) {
        int suma = 0;
        for (int i = 0; i < productos.size(); i++) {
           InsumoCosto ic = (InsumoCosto) productos.get(i);
           suma += (ic.getCantidad() * ic.getPrecio());
        }
        return suma;
    }
}
