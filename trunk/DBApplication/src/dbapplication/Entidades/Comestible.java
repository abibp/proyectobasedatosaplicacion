/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

/**
 * especificación de insumos: comestibles
 * @author prometheus
 */
public class Comestible extends Insumo {
    private String sabor;

    /**
     * Constructor por defecto
     */
    public Comestible () {
        super();
        this.sabor = null;
    }

    /**
     * Constructor con Parámetros
     * @param id id del comestible
     * @param nom nombre del comestible
     * @param desc descripción del comestible
     * @param sabor sabor del comestible
     */
    public Comestible (int id, String nom, String desc, String sabor) {
        super (id, nom, desc);
        this.sabor = sabor;
    }
}
