/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbapplication.Entidades;

/**
 * Almacena información para manipular empleados
 * @author prometheus
 */

/**
 * Clase Empleado, para manipular información sobre empleados
 * @author prometheus
 */
public class Empleado extends Persona {
    private int idEmpleado;
    private String apellido;
    private String cargo;
    private int sueldo;
    private int cedulaIdentidad;

    /**
     * Constructor por Defecto
     */
    public Empleado() {
        super();
        this.apellido = null;
        this.cargo = null;
    }

    /**
     * Constructor con Parámetros
     * @param id id del empleado
     * @param nom nombre del empleado
     * @param ape apellido del empleado
     * @param dir dirección del empleado
     * @param tlf teléfono del empleado
     * @param car cargo del empleado
     * @param ci cédula del empleado
     * @param sueldo sueldo del empleado
     */
    public Empleado(int id, String nom, String ape, String dir, int tlf,
            String car, int ci, int sueldo) {
        super(nom, tlf, dir);
        this.apellido = ape;
        this.cargo = car;
        this.cedulaIdentidad = ci;
        this.idEmpleado = id;
        this.sueldo = sueldo;
    }

    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the sueldo
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the cedulaIdentidad
     */
    public int getCedulaIdentidad() {
        return cedulaIdentidad;
    }

    /**
     * @param cedulaIdentidad the cedulaIdentidad to set
     */
    public void setCedulaIdentidad(int cedulaIdentidad) {
        this.cedulaIdentidad = cedulaIdentidad;
    }
}
