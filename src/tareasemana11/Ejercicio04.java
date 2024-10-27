
package tareasemana11;

/*4.	Crear un programa en Java que permita generar ventas aleatorias 
(1000-10000) y asignarlos a una matriz de datos de 3 x 3. 
Visualizar el total y el promedio de las ventas.
 */
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
public class Ejercicio04 {
    public static void main(String[] args) {
        double totalventas=0.0, promedioventas=0.0;
        int f,c,cantmatriz;
        double[][]ventas=new double[3][3];
        Scanner lectura=new Scanner(System.in);
        DecimalFormat formato=new DecimalFormat("#.##");
        Random random=new Random();
        
        //entrada de datos
        for (f = 0; f <ventas[0].length; f++) {
             for (c = 0; c < ventas[0].length; c++) {
                 ventas[f][c]=1000+random.nextInt(9000);
                 totalventas+=ventas[f][c];
            }
        }
        
        //proceso de datos
        cantmatriz=ventas[0].length*ventas[0].length;
        promedioventas=totalventas/cantmatriz;
        System.out.println("MATRIZ DE VENTAS");
        for (f = 0; f <ventas[0].length; f++) {
             for (c = 0; c < ventas[0].length; c++) {
                 System.out.print(formato.format(ventas[f][c])+"\t");
                 
             }
             System.out.println();
             }
        System.out.println("El total de ventas es : "+formato.format(totalventas));
        System.out.println("El promedio de ventas es : "+formato.format(promedioventas));
        
    }
    
}
