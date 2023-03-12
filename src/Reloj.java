import java.io.*;
import java.text.*;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.util.*;

public class Reloj {
  private static final String FORMATO_FECHA = "dd/MM/yyyy HH:mm:ss";
  private static final String ARCHIVO_FECHA = "fecha.txt";
  
  private static Date fechaInicial;
  private static Timer timer;
  
  public static void main(String[] args) {
    leerFecha();
    iniciarContador();
  }
  
  private static void leerFecha() {
    try {
      BufferedReader lector = new BufferedReader(new FileReader(ARCHIVO_FECHA));
      String fechaStr = lector.readLine();
      lector.close();
      SimpleDateFormat formatoFecha = new SimpleDateFormat(FORMATO_FECHA);
      fechaInicial = formatoFecha.parse(fechaStr);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Error al leer la fecha del archivo");
      System.exit(1);
    }
  }
  
  private static void iniciarContador() {
    // Ajustar la hora actual a la hora almacenada en el archivo
    Date fechaActual = new Date();
    fechaActual.setTime(fechaInicial.getTime());
    
    timer = new Timer(1000, e -> {
      long tiempoTranscurrido = fechaActual.getTime() - fechaInicial.getTime();
      fechaActual.setTime(fechaActual.getTime() + 1000);
      SimpleDateFormat formatoFecha = new SimpleDateFormat(FORMATO_FECHA);
      String fechaStr = formatoFecha.format(fechaActual);
      System.out.println(fechaStr);
      
      
    });
    timer.start();

    //JOptionPane.showMessageDialog(null, "Presione OK para detener el programa");
    timer.stop();
    guardarFecha(fechaActual);
  }
  
  private static void guardarFecha(Date fechaGuardar) {
    try {
      SimpleDateFormat formatoFecha = new SimpleDateFormat(FORMATO_FECHA);
      String fechaStr = formatoFecha.format(fechaGuardar);
      BufferedWriter escritor = new BufferedWriter(new FileWriter(ARCHIVO_FECHA));
      escritor.write(fechaStr);
      escritor.close();
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Error al guardar la fecha en el archivo");
    }
  }
}
