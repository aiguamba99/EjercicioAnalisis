
package ejerciciosanalisis;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Santy
 */
public class EjerciciosAnalisis {
    static Scanner leer= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        adrian();
        
    }
    
    public static void stefy(){
        System.out.println("Hola por favor ingresa dos numeros");
        int min;
        int acu=0;
        int max;
        System.out.println("Ingresa el minimo");
        min=leer.nextInt();
        System.out.println("Ingresa el maximo");
        max= leer.nextInt();
        for (int i = min; i <= max; i++) {
            if(i%2==0){
                System.out.println(i+" es par");
                acu=acu+i;
            }  
        }
        System.out.println("La suma es: "+acu);
    }
    
    public static void ruben(){
        
    }
    
    public static void alex(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un radio");
        scanner.useLocale(Locale.US);
        double radio=scanner.nextDouble();
        double area=Math.PI*Math.pow(radio, 2);
        System.out.println("El area del circulo es "+area);
    
        
    }
    
    public static void adrian(){
        System.out.println("Bienvenido al sistema de conversión de moneda");
        double peso=3950.17;
        System.out.println("Cuanto dinero deseas cambiar:");
        double dolar=leer.nextDouble();
        double valor=0;
        while(dolar>0){
                valor=dolar*peso;
            System.out.println("el monto en pesos es:"+valor);
            System.out.println("Ingresa el 0 para terminar");
            dolar=leer.nextDouble();
        } 
    }
    
    public static void luis(){
        
    }
    
    public static void darwin(){
        
    }
    
}
