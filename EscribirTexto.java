package Tema9;
import java.io.*;

public class EscribirTexto {
    


   public static void main(String[] args) {
      
      try {
         BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
         FileWriter archivo = new FileWriter("texto.txt");
         String linea;
         
         while (!(linea = entrada.readLine()).equalsIgnoreCase("fin")) {
            archivo.write(linea + "\n");
         }
         
         archivo.close();
         System.out.println("Se ha escrito el archivo exitosamente.");
         
      } catch (IOException e) {
         System.out.println("Ha ocurrido un error al escribir el archivo.");
         e.printStackTrace();
      }
   }
}

    
    

