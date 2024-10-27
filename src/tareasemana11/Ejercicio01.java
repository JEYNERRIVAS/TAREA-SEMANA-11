
package tareasemana11;

/*1.	Crear un programa en Java que permita registrar ventas dentro de una
matriz de 4x4. Visualizar el total de las ventas.
 */
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        int ventas=0,totalventas=0,f,c;
        int[][]mventas=new int[4][4];
         Scanner lectura=new Scanner(System.in);
         
         //entrada de datos
         for (f = 0; f < mventas[0].length; f++) {
             for (c = 0; c < mventas[0].length; c++) {
                 System.out.print("Ingrese las ventas : ");
                 ventas=lectura.nextInt();
                 mventas[f][c]=ventas;
             }
        }
         //proceso de datos
         for (f = 0; f < mventas[0].length; f++) {
             for (c = 0; c < mventas[0].length; c++) {
                 totalventas+=mventas[f][c];
                 
             }
         }
         //salida de datos
         System.out.println("el total de ventas es : "+totalventas);

    }
}
