// * @author Luz Aide Loaiza Garcia G55
package Principal;
import Vistas.*;
import Modelo.*;


public class Main {

    public static void main(String[] args) {
        //1. Crear instancia de la clase Conexion
        Conexion conexion = new Conexion();
        conexion.getConnection();
        
        //2. Crear instancia del JFrame Login
        Login login = new Login();
        login.setVisible(true);
        System.out.println("Hola mundo");
    }
    
}
