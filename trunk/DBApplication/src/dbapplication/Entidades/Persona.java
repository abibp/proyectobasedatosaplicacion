/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

/**
 * Clase para manipular información de personas Naturales o Jurídicas
 * es por ello que los proveedores extienden de esta clase también, como sin
 * empresas, se consideran personas jurídicas.
 * @author prometheus
 */
public class Persona {
    protected String nombre;
    protected String direccion;
    protected int telefono;

    /**
     * Constructor por Defecto
     */
    public Persona () {
        this.nombre = null;
        this.direccion = null;
        this.telefono = 0;
    }

    /**
     * Constructor con todos los atributos
     * @param nom nombre
     * @param tlf  teléfono
     * @param dir dirección
     */
    public Persona (String nom, int tlf, String dir) {
        this.nombre = nom;
        this.direccion = dir;
        this.telefono = tlf;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
