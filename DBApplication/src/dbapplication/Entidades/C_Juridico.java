/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

/**
 *
 * @author Administrador
 */
public class C_Juridico {
    private int    id_cliente;
    private String nombre;
    private String direccion;
    private int    telf;
    private String mail;
    private String rif;



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
     * @return the rif
     */
    public String getRif() {
        return rif;
    }

    /**
     * @param rif the rif to set
     */
    public void setRif(String rif) {
        this.rif = rif;
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
