
package tareasemana11;

/*2.	Crear un programa en Java que permita registrar compras dentro de una
matriz de 4x4. Visualizar el total y el promedio de las compras.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio02 {
    public static void main(String[]args){
        int compras=0,f,c,cantelementos;
        double totalcompras=0.0,promediocompras=0.0;
        int[][]acompras=new int[4][4];
        Scanner lectura=new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("#.##");
        
        // Entrada de datos
         System.out.println("PROGRAMA SOBRE COMPRAS DE UNA EMPRESA");
         for (f = 0; f < acompras[0].length; f++) {
              for (c = 0;  c< acompras[0].length; c++) {
             
                  System.out.print("Ingrese las compras : ");
                  compras=lectura.nextInt();
                  acompras[f][c]=compras;
             }
        }
         //proceso de datos
         
          for (f = 0; f < acompras[0].length; f++) {
              for (c = 0;  c< acompras[0].length; c++) {
                  totalcompras+=acompras[f][c];
              }
          }
          cantelementos=acompras[0].length*acompras[0].length;
          promediocompras=totalcompras/cantelementos;
          
          System.out.println("El total de compras es : "+formato.format(totalcompras));
          System.out.println("El promedio de compras es : "+formato.format(promediocompras));
         
    }
    
}
