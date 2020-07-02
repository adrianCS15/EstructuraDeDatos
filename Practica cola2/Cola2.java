/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola2;
import java.util.Scanner; 
/**
 *
 * @author carlo
 */
public class Cola2 {

   
    public static void main(String[] args) {
        
    Scanner Leer = new Scanner(System.in); int opt = 0; String nombre = "abcd"; if (nombre.length() > 6) { 
    System.out.println("El numero de caracteres es maximo"); }
        else { 
            System.out.println(""); } System.out.println("-------tamaño del vector -------"); 
            int tope = Leer.nextInt(); String v1[] = new String[tope]; 
            { 
        System.out.println("1-llenar \n"); System.out.println("2-mostrar \n"); System.out.println("3-agregar \n"); System.out.println("4-eliminar\n"); 
            switch (opt = Leer.nextInt()) { 
            case 1: 
    System.out.println("-------ingresar datos -------"); for (int i = 0; i < tope; i++) { 
    System.out.println((i + 1) + "-dijite un nombre nombre-"); nombre = Leer.next(); if (nombre.length() < 4) { 
    System.out.println("dijite un nombre min de 4 o max de 6 letras"); } else { 
        if (nombre.length() > 6) { 
    System.out.println("supera el numero de letras"); } else { 
        v1[i] = nombre; } } } 
    { 
    System.out.println("agregados " + tope + " elementos a la cola"); } break; case 2: 
        for (int i = 0; i < tope; i++) { 
    System.out.println("valor de la posicion [" + i + "] es: " + v1[i]); } 
        break; case 3: 
    System.out.println("-dijite un nombre -"); nombre = Leer.next(); if (nombre.length() > 6) { 
    System.out.println("El numero de caracteres es maximo"); } else { } 
        v1[tope] = nombre; tope++; System.out.println("nombre agregado...."); break; case 4: 
        tope--; for (int i = 0; i < tope; i++) { 
        v1[i] = v1[i + 1]; } System.out.println("nombre eliminado..."); 
        break; }    
        } while (opt != 5); } 
    } 
