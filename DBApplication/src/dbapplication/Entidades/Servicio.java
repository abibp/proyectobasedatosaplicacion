/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

/**
 * Clase Servicio: Manipula Información de los servicios disponibles
 * @author prometheus
 */
public class Servicio extends Insumo {
   
    /**
     * Constructor por Defecto
     */
    public Servicio () {
        super();
    }

    /**
     * Constructor con Parámetros
     * @param id id servicio
     * @param nom nombre servicio
     * @param desc descripción servicio
     */
    public Servicio (int id, String nom, String desc) {
        super(id, nom, desc);
        this.idInsumo = id;
    }
}
