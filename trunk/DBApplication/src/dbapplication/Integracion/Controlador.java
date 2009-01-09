/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Integracion;

import dbapplication.Gestion.*;
/**
 *
 * @author Administrador
 */
public class Controlador {
    /**
     * verifica si existe el administrador //OJO: se hace en una BD distinta, por?
     * @param nom
     * @param clave
     */
    public static boolean isAministrador(String nom,String clave){
        return true;
    }



//**********************CONSULTAR**************************\\
    public static void cargarCientes(){

    }

    public static void cargarEventos(){

    }

    public static void cargarProveedores(){

    }
    
    public static void cargarInventario(){

    }

    public static void cargarEmpleados(){

    }


//**********************EIMINAR**************************\\
//**********************INSERTAR**************************\\
     public static void insertarCientes(){
         Manejador.insertarC_Natural();

    }

    public static void insertarEventos(){

    }

    public static void insertarProveedores(){

    }

    public static void insertarInventario(){

    }

    public static void insertarEmpleados(){

    }

//**********************MODIFICAR**************************\\
}
