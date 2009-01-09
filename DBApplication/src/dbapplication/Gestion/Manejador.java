/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbapplication.Gestion;


import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.Collection;
import org.apache.log4j.Logger;
import dbapplication.Entidades.*;
/**
 *
 * @author Administrador
 */
public class Manejador {

     // Variable de Instancia para la configuracion de Log4j
    private static Logger logger = Logger.getLogger(Manejador.class);


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
     public static void insertarC_Natural(){
         Reader reader = null;

        try {
//            logger.info("Iniciando carga del archivo ibatis-config.xml");-----
System.out.println("Iniciando carga del archivo ibatis-config.xml");
            reader = Resources.getResourceAsReader("ibatis-config.xml");

            SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);

            C_Natural nuevo = new C_Natural();
            
            nuevo.setId_cliente(01);
            nuevo.setNombre("pepe");
            nuevo.setApellido("perez");
            nuevo.setDireccion("dir");
            nuevo.setTelf(123);
            nuevo.setMail("mail");
            nuevo.setCi(234);
            
//            logger.info("Registrando la persona " + nuevo);-------------------
System.out.println("Registrando la persona " + nuevo);
            sqlMap.insert("guardarCliente", nuevo);

//            PARTE DEL LOGGER PARA MOSTRA TODOS LOS CLIENTES Q EXISTEN---------
//            Collection<Cliente> clientes = sqlMap.queryForList("buscarTodasLosClientes");
//
//            for (Cliente p : clientes){
//                logger.debug(p);
//            }
//
//            Cliente otra = (Cliente) sqlMap.queryForObject("buscarClientePorID", 1);
//            logger.debug(otra);-----------------------------------------------


        } catch (SQLException ex) {
System.out.println("erro ibatis "+ex);
//            logger.error("Ocurrio un error en la ejecucion de ibatis", ex);
        } catch (IOException ex) {
System.out.println("erro I/O  "+ex);
//            logger.error("Ocurrio un error de I/O", ex);
        }

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
