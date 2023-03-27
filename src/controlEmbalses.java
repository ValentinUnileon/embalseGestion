

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

    //se podria hacer con una database pero debido a que son pocos embalse, se ahorra tiempo con arrays

    public String[] embalsesCaracteristicas= {"Nombre", "Rio", "Ciudad", "AñoCreacion", "CapacidadMaxima", "CapacidadUtil", "CapacidadMinima", "DesalojoTurbinas", "NumeroTurbinas", "DesalojoPresa"};
    public String[] aldeadavila = {"aldeadavila", "Duero", "Aldeadavila de la Ribera", "1963", "114,8", "56,03", "0", "414000", "6", "39600000" };
    public static double capacidadAldeadavila = 98.03; //emepzamos en octubre

    
    
    public static void main(String[] args) throws SQLException {

        //Reloj reloj = new Reloj();  //reloj.timer.stop
        //reloj.iniciarReloj();




        boolean activado=true;
        while(activado){

            System.out.println("Introduce un comando");
            Scanner entradaEscaner = new Scanner (System.in);
            String entradaTeclado = entradaEscaner.nextLine ();
            //s
            System.out.println("Introd"+ entradaTeclado);

            switch(entradaTeclado){
                case "!salir":

                    System.out.println("Saliendo del sistema");
                    activado=false;
                    break;

                case "!info":

                    System.out.println("Introduce el embalse");
                    Scanner entradaEmbalse = new Scanner (System.in);
                    String entradaInfo = entradaEmbalse.nextLine ();

                    //busccar embalse
                    break;
                case "!iniciarSimulacion":

                    simulacion();

                    break;
                
            }
            entradaEscaner.close();

            
        }
    
        
    }


    public static void simulacion(){

        //suponemos que la comprobacion es cada 8 horas

        // if capacidadEmbalse-gastoAgua8horasTurbinas > capacidad minima -> encendemos turbinas

        //primero calculamos gastoAgua
        // 414000 m3 por hora x 8 horas

        for(int i=0; i< 8760/8; i++){

            /*------------------------------------------------- 

            if(){  si capacidadAldea > 0.98*capMax y  ** ------------->abrir
               continue

            }


            if(){

            }

            if(){ ** if
                
            }



            //toDo
               datos de consumo de energia en españa
               pillar datos csv
               






            se recalculan los parametros del embalse para la siguiente iteracion

            **Para simular la entrada de agua en el embalse se repartira al azar la cantidad de agua que cae cada dia
            al embalse durante un mes.---> lista de 30ints para calcular cuanto llueve cada dia del mes, dada la precipitacion total del mes (puede ser cero)

            ------------------------------------------------- */

            




        }



    
}
