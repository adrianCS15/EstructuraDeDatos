
package cola;

/**
 *
 * @author carlo
 */
import java.util.Scanner; 
public class COLA { 
public static void main(String[] args) { 

    Scanner Leer = new Scanner(System.in); 
    int opt = 0; 
    String nombre = null; 
    System.out.println("-------tamaño del vector -------"); 
        int tope = Leer.nextInt(); 
        String v1[] = new String[tope]; 
    do { 
        System.out.println("1-llenar \n"); 
        System.out.println("2-mostrar \n"); 
        System.out.println("3-agregar \n"); 
        System.out.println("4-eliminar\n"); 
        switch (opt = Leer.nextInt()) { 
            case 1: 
                System.out.println("-------ingresar datos -------"); 
            for (int i = 0; i < tope; i++) { 
                 System.out.println((i + 1) + "-dijite un nombre nombre-"); 
                 nombre = Leer.next(); 
                 v1[i] = nombre; 
                } 
    { 
        System.out.println("agregados " + tope + " elementos a la cola"); 
    } 

        break; 
                case 2: 
                        for (int i = 0; i < tope; i++) { 
                        System.out.println("valor de la posicion [" + i + "] es: " + v1[i]); 
     } 
        break; 
                case 3: 
                    System.out.println("-dijite un nombre nombre-"); 
                    nombre = Leer.next(); 
                    v1[tope] = nombre; 
                    tope++; 
        System.out.println("nombre agregado...."); 
        break; 
                case 4: 
                        tope--; 
                    for (int i = 0; i < tope; i++) { 
                    v1[i] = v1[i + 1]; 
        } 
            System.out.println("nombre eliminado..."); 
            break; 
        } 
                } while (opt != 5); 
        } 
} 
