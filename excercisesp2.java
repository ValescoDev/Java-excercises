package EjerciciosParaEntregar;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosParaEntregar {
    
    // Saber si un numero es primo

    // Función que determina si un número es primo o no
    static boolean esPrimo(int numero) {
        // Se comprueba si el número es menor o igual a 1, en cuyo caso no es primo
        if(numero <= 1) {
            return false;
        }
        
        // Se itera hasta la raíz cuadrada del número de entrada
        for(int i = 2; i <= Math.sqrt(numero); i++) {
            // Si el número es divisible entre algún número en este rango, no es primo
            if(numero % i == 0) {
                return false;
            }
        }
        
        // Si no se encontró ningún divisor, el número es primo
        return true;
    }
    
    // Funcion para sumar dos valores
    public static int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }
    
    public static void imprimirGuiones() {
        System.out.println("--------------------------");
    }
    
    public static void salidaBonitaSuma(int a, int b) {
        System.out.println("La suma de los valores " + a + " y " + b + " es: " + sumar(a, b));
    }
    
    // static tambien nos permite declarar variables por fuera del main que se puede acceder
    //  en cualquier lugar dentro de la clase 
    static int[] numeros = {8, 78, 2, 3, 4, 4, -99999999, 9, 9999};
    
    
    //Arrays.toString(nombreDelArray)
    public static String numeroMayor(int[] entrada) {
        System.out.println("Para el arreglo de entrada: " + Arrays.toString(entrada));
        int maximo = entrada[0];
        for(int i = 1; i < entrada.length ; i++) {
            //System.out.println(entrada[i]);
            if(entrada[i]>maximo) {
                maximo = entrada[i];
            }
        }
        return "El numero mas grande es: " + maximo;
    }
    
    
    /*
     Mostrar mensaje para explicar el programa al usuario
     Scanner para entrada
     Acumulador de suma inicializado en cero
     Ciclo while que compare numero ingresado != 0 
     
     Sumar entrada al
     
     */
    
    public static void acumuladorDeEntradas() {
        System.out.println("Este programa toma los valores ingresados por el usuario y los suma, en caso de ingresar '0' el programa se termina");
        // Se crea el scanner
        Scanner numerosEntrada = new Scanner(System.in);
        
        // Se incializa la variable donde se ira sumando cada entrada
        int acumulador = 0;
        
        System.out.println("Ingrese la primera entrada:");
        // Se inicia el ciclo while que se repite mientras el usuario no ingrese 0
        while(true) {
            // Se toma la entrada del usuario
            int entrada = numerosEntrada.nextInt();
            
            // Si la entrada es 0, se termina el ciclo while
            if(entrada == 0) {
                break;
            }
            
            // Se va sumando la entrada al acumulador
            acumulador += entrada;
            
            // Se imprime el acumulador actualizado
            System.out.println("Acumulador actualizado: " + acumulador);
            
            // Se solicita la siguiente entrada
            System.out.println("Ingrese la siguiente entrada:");
            }
            
            // Se cierra el scanner
            numerosEntrada.close();
        }

        public static void main(String[] args) {
            
            // Se prueba la función esPrimo
            System.out.println("La función esPrimo dice que 7 es primo: " + esPrimo(7));
            System.out.println("La función esPrimo dice que 10 es primo: " + esPrimo(10));
            System.out.println("La función esPrimo dice que 97 es primo: " + esPrimo(97));
            
            // Se imprime una línea de asteriscos
            imprimirGuiones();
            
            // Se prueba la función sumar
            int resultadoSuma = sumar(10, 20);
            System.out.println("El resultado de la suma es: " + resultadoSuma);
            
            // Se imprime una línea de asteriscos
            imprimirGuiones();
            
            // Se prueba la función salidaBonitaSuma
            salidaBonitaSuma(15, 25);
            
            // Se imprime una línea de asteriscos
            imprimirGuiones();
            
            // Se prueba la función numeroMayor
            int[] numerosPrueba = {10, 20, 5, 35, 45};
            System.out.println(numeroMayor(numerosPrueba));
            
            // Se imprime una línea de asteriscos
            imprimirGuiones();
            
            // Se prueba la función acumuladorDeEntradas
            acumuladorDeEntradas();
            
            // Se imprime una línea de asteriscos
            imprimirGuiones();
        }
}