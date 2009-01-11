/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

/**
 * especificación de insumos, decoración
 * @author prometheus
 */
public class Decoracion extends Insumo {
    private String color;
    private String modelo;

    /**
     * Constructor por defecto
     */
    public Decoracion () {
        super();
        this.color = null;
        this.modelo = null;
    }

    /**
     * Constructor con Parámetros
     * @param id id de la decoración
     * @param nombre nombre de la decoración
     * @param desc descripción de la decoración
     * @param color color de la decoración
     * @param model modelo de la decoración
     */
    public Decoracion(int id, String nombre, String desc, String color, String model) {
        super (id, nombre, desc);
        this.color = color;
        this.modelo = model;
    }
}
