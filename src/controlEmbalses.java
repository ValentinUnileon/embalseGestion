

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

//git
/**
 *
 * @author valen
 */
public class controlEmbalses {


    
    
    public static void main(String[] args) throws SQLException {

        while(true){

            System.out.println("Introduce un comando");
            Scanner entradaEscaner = new Scanner (System.in);
            String entradaTeclado = entradaEscaner.nextLine ();
            System.out.println("Introd"+ entradaTeclado);

            switch(entradaTeclado){
                case "!salir":
                    System.out.println("Saliendo del sistema");
                    break;
                case "!info":

                    System.out.println("Introduce el embalse");
                    Scanner entradaEmbalse = new Scanner (System.in);
                    String entradaInfo = entradaEmbalse.nextLine ();
                    //busccar embalse
                    break;
                case "":
                
            }

            
        }
        
         
       

        
    }
    
}
