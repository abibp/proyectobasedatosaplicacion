/**********************************************************
 * FALTA VECTOR DE EMPLEADOS TRABAJADORES
 */


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Entidades;

import java.sql.Time;
import java.util.Date;
import java.util.ArrayList;

/**
 * Clase Evento, almacena información para manejar datos de eventos realizados o por realizar.
 * @author prometheus
 */
public class Evento {
    private int idEvento;
    private Date fecha;
    private Time horaInicio;
    private Time horaFin;
    private String direccion;
    private Empleado organizador;
    private ArrayList pagos;

    /**
     * Constructor por Defecto
     */
    public Evento () {
        this.direccion = null;
        this.organizador = null;
    }

    /**
     * Constructor con todos los parámetros
     * @param id identificador del evento
     * @param dia fecha del evento
     * @param inicio hora de inicio del evento
     * @param fin hora de finalización del evento
     * @param dir dirección del evento
     * @param ejec ejecutivo organizador del evento
     */
    public Evento (int id, Date dia, Time inicio, Time fin, String dir, Empleado ejec) {
        this.idEvento = id;
        this.fecha = dia;
        this.horaInicio = inicio;
        this.horaFin = fin;
        this.direccion = dir;
        this.organizador = ejec;
    }

    /**
     * @return the pagos
     */
    public ArrayList getPagos() {
        return pagos;
    }

    /**
     * @param pagos the pagos to set
     */
    public void setPagos(ArrayList pagos) {
        this.pagos = pagos;
    }
}
