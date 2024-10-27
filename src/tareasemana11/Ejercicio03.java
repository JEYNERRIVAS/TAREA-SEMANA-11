
package tareasemana11;

/*3.	Crear un programa en Java que permita registrar ventas de forma
aleatoria (10 - 5000) dentro de una matriz de 4x4. Visualizar la venta mayor y menor.
 */
import java.util.Scanner;
import java.util.Random;
public class Ejercicio03 {
    public static void main(String[]args){
        int vtamayor,vtamenor,f,c;
        int[][]ventas=new int[4][4];
        Scanner lectura=new Scanner(System.in);
        Random random=new Random();
        //entrada de datos
        for (f = 0; f < ventas[0].length; f++) {
            for (c = 0; c < ventas[0].length; c++) {
                ventas[f][c]=10+random.nextInt(4090);
            }
        }
        //proceso de datos
        System.out.println("La matriz de ventas");
        vtamayor=ventas[0][0];
        vtamenor=ventas[0][0];
         for (f = 0; f < ventas[0].length; f++) {
            for (c = 0; c < ventas[0].length; c++) {
                System.out.print(ventas[f][c]+"\t");
                if (ventas[f][c]>vtamayor) {
                    vtamayor=ventas[f][c];
                }
                    if (ventas[f][c]<vtamenor) {
                        vtamenor=ventas[f][c];
                    }
            }
                    System.out.println();
                
            
         }
        //salida de datos
        System.out.println("La venta mayor es : "+vtamayor);
        System.out.println("La venta menor es : "+vtamenor);
    }
    
}
