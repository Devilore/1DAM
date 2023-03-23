/*
 * Ejercicio 01. Cálculo del área de un trapecio regular.
 * Pidiendo la Base Mayor, Menor y Altura
 * @author (Lorena Barea )
 */

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada 
        double baseMayor; /* Al ser el caculo del area se opta por usar double 
        ante la necesidad de tener decimales, si fuera edad o unidades se usaria (Int / nextint)*/
        double baseMenor;
        double altura;

        // Variables de salida
        String textoResultado;

        // Variables auxiliares
        double area;

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos  // Aquí vendrá nuestro código de entrada de datos
        //----------------------------------------------
        System.out.println("Ejercicio 1. Saludo ");
        System.out.println("----------------------");

        System.out.println("Introduce la Base Mayor del Trapecio: "); //Mostramos un mensaje sobre la información que precisamos
        baseMayor = teclado.nextDouble();    //A traver de scanner pedimos al usuario que intruduzca un entero o decimal, segun necesidades.

        System.out.println("Introduce la Base Menor del Trapecio: "); 
        baseMenor = teclado.nextDouble();   

        System.out.println("Introduce la Altura del Trapecio: "); 
        altura = teclado.nextDouble();   

        //----------------------------------------------
        //                 Procesamiento  // Aquí vendrá nuestro código de procesamiento
        //----------------------------------------------
        area = (baseMayor + baseMenor) / 2 * altura; //Se calcula el Area del Trapecio con esta formula
        // Se almacena en la variable TextoResultado, el texto completo
        textoResultado = "El area del trapecio de base mayor " + baseMayor + ", base menor " + baseMenor + " y altura " + altura + " es: " ;

        //----------------------------------------------
        //              Salida de resultados // Aquí vendrá nuestro código de salida de resultados
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");

        System.out.printf("%s%.3f",textoResultado,area);  /* Se muestra el contenido de la variable textoResultado, es decir el Area.
         Se añadio metodo printf para que no nos muestre más de 3 */
        System.out.println();
        System.out.println("Fin del programa.");
    }
}
