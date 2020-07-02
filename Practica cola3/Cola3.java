
package colas3;
import java.util.Scanner;
/**
 *
 * @author carlo
 */

public class Cola3 {
    
    int i, j, x;
    int v1[ ];
    int tope = 100;
    int rango = 100;
    
    public Cola3() {
        this.v1 = new int[tope];
        
        }
    public void llenarcola() {
        if (i < tope) {
            v1[i] = (int) (Math.random() * rango);
            i++;
            } else {
    System.out.println("dato agregado");
        }
    }
    
    public void mostrarcola() {
        for (j = 0; j < i; j++) {
            System.out.println("el numero en la posicion [" + j + "] es: " + v1[j]);
        }
        if (i == 0) {
            System.out.println("la cola esta vacia, agrege un numero: ");
            }
        }
    
    public void ordenar() {
        
        int aux;
        for (j = 1; j < i; j++) {
            for (x = 0; x < i - 1; x++) {
                if (v1[x] > v1[x + 1]) {
                    aux = v1[x];
                    v1[x] = v1[x + 1];
                    v1[x + 1] = aux;
                    
                }
            }
        }
        System.out.println("elementos ordenados...");
    }
        public void vaciar() {
            i = 0;
                System.out.println("datos eliminados...");
          }
        public static void main(String[] args) {
            
            Cola3 c = new Cola3();
            Scanner sc = new Scanner(System.in);
                int opt = 0;
                do {
                    
                    System.out.println("1 llenar \n2 mostrar \n3 ordenar \n4 vaciar");
                    switch (opt = sc.nextInt()) {
                        case 1:
                            c.llenarcola();
                        break;
                        case 2:
                            c.mostrarcola();
                        break;
                        case 3:
                            c.ordenar();
                        break;
                        case 4:
                            c.vaciar();
                        break;
                        
                    }
            } while (opt != 5);
    }
}
