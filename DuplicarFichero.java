package Tema9;

import java.io.*;

public class DuplicarFichero {
   public static void main(String[] args) {
      
      try {
         BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Introduce el nombre del fichero a duplicar:");
         String nombreFichero = entrada.readLine();
         
         File fichero = new File(nombreFichero);
         if (!fichero.exists()) {
            System.out.println("El fichero no existe.");
            return;
         }
         
         String nombreCopia = "copia_de_" + nombreFichero;
         FileWriter archivo = new FileWriter(nombreCopia);
         BufferedReader lector = new BufferedReader(new FileReader(nombreFichero));
         
         String linea;
         while ((linea = lector.readLine()) != null) {
            archivo.write(linea + "\n");
            archivo.write(linea + "\n");
         }
         
         lector.close();
         archivo.close();
         System.out.println("Se ha duplicado el fichero exitosamente.");
         
      } catch (IOException e) {
         System.out.println("Ha ocurrido un error al duplicar el fichero.");
         e.printStackTrace();
      }
   }
}
