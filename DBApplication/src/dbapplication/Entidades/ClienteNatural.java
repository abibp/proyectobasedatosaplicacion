/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;
import java.util.*;

/**
 * Clase ClienteNatural: almacena información para manejar datos del tipo Cliente Natural
 * @author Administrador
 */
public class ClienteNatural extends Cliente {
    private int cedulaIdentidad;
    private String apellido;

    /**
     * Constructor por defecto
     */
    public ClienteNatural () {
        super();
        this.apellido = null;
    }


    /**
     * Constructor con parámetros
     * @param nom nombre del cliente
     * @param ape apellido del cliente
     * @param dir dirección del cliente
     * @param telf teléfono del cliente
     * @param mail correo del cliente
     * @param id id del cliente
     * @param cot todas las cotizaciones del cliente
     * @param fac todas las facturas del cliente
     * @param ci cédula de identidad del cliente
     */
    public ClienteNatural (String nom, String ape, String dir, int telf, String mail, int id,
                                            ArrayList cot, ArrayList fac, int ci) {
         super(id, telf, mail, nom, dir, fac, cot);
        this.cedulaIdentidad = ci;
        this.apellido = ape;
    }

 /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the cotizaciones
     */
    public ArrayList getCotizaciones() {
        return cotizaciones;
    }

    /**
     * @param cotizaciones the cotizaciones to set
     */
    public void setCotizaciones(ArrayList cotizaciones) {
        this.cotizaciones = cotizaciones;
    }

    /**
     * @return the facturas
     */
    public ArrayList getFacturas() {
        return facturas;
    }

    /**
     * @param facturas the facturas to set
     */
    public void setFacturas(ArrayList facturas) {
        this.facturas = facturas;
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
}
