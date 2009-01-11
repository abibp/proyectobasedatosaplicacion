/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;
import java.util.*;

/**
 * Clase ClienteJuridico, almacena información para manipular clientes jurídicos
 * @author Administrador
 */
public class ClienteJuridico extends Cliente {
private String rif;

/**
 * Constructor por defecto
 */
public ClienteJuridico() {
    super();
    this.cotizaciones = null;
}

/**
 * Constructor con atributos
 * @param id id de la compañía
 * @param telf telefono de la compañía
 * @param mail correo de la compañía
 * @param nom nombre de la compañía
 * @param dir dirección de la compañía
 * @param fac facturas de la compañía
 * @param cot cotizaciones de la compañía
 * @param rif rif de la compañía
 */
public ClienteJuridico (int id, int telf, String mail, String nom, String dir,
                                        ArrayList fac, ArrayList cot, String rif) {
    super(id, telf, mail, nom, dir, fac, cot);
    this.rif = rif;
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