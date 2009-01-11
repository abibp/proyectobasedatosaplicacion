/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;
import java.util.ArrayList;

/**
 * Clase Cliente: manipula información general de clientes
 * @author prometheus
 */
public class Cliente extends Persona {
    protected int idCliente;
    protected String mail;
    protected ArrayList cotizaciones;
    protected ArrayList facturas;

    /**
     * Constructor por Defecto
     */
    public Cliente () {
        super();
        this.mail = null;
        this.cotizaciones = null;
        this.facturas = null;
    }

    /**
     * Constructor con parámetros
     * @param id identificador cliente
     * @param telf teléfono cliente
     * @param mail correo-e cliente
     * @param nom nombre cliente
     * @param dir dirección cliente
     * @param fac facturas cliente
     * @param cot cotizaciones cliente
     */
    public Cliente (int id, int telf,  String mail, String nom, String dir,
                              ArrayList fac, ArrayList cot) {
        super(nom, telf, dir);
        this.cotizaciones = cot;
        this.facturas = fac;
        this.idCliente = id;
        this.mail = mail;
    }
}
