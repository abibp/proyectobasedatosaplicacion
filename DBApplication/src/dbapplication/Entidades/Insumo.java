/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

/**
 * Clase Insumo: reune comestibles, servicios y decoración disponibles
 * @author prometheus
 */
public class Insumo {
    protected int idInsumo;
    protected String nombre;
    protected String descripcion;

    /**
     * Constructor por Defecto
     */
    public Insumo () {
        this.nombre = null;
        this.descripcion = null;
    }

    /**
     * Constructor con parámetros
     * @param id id insumo
     * @param nom nombre insumo
     * @param des descripción insumo
     */
    public Insumo (int id, String nom, String des) {
        this.idInsumo = id;
        this.nombre = nom;
        this.descripcion = des;
    }
}
