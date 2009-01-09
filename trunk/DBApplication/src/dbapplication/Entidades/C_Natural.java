/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

/**
 *
 * @author Administrador
 */
public class C_Natural {
    private int    id_cliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telf;
    private String mail;
    private int     ci;
  


    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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
     * @return the dir
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param dir the dir to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telf
     */
    public int getTelf() {
        return telf;
    }

    /**
     * @param telf the telf to set
     */
    public void setTelf(int telf) {
        this.telf = telf;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the ci
     */
    public int getCi() {
        return ci;
    }

    /**
     * @param ci the ci to set
     */
    public void setCi(int ci) {
        this.ci = ci;
    }



    //-------------------------------------------------------
    //  Override from Class Object
    //-------------------------------------------------------

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Persona[id= " + id_cliente + ", nombre= " +
                nombre +  "]";
    }

}
