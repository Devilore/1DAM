/*
 * Ejercicio 04. Horas, minutos y segundos.
 */
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada 
        int segundosIniciales;
        int horas; // Se usara int al no poder tener decimales las horas, minutos o segundo si queremos especificamente su valor entero.
        int minutos;
        int segundos;

        // Variables de salida
        String textototal;

        // Variables auxiliares
        int totalMinutos;
        int totalHoras;
        int minutosFinales;
        int segundosFinales;

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos  // Aquí vendrá nuestro código de entrada de datos
        //----------------------------------------------
        System.out.println("Ejercicio 4. Saludo ");
        System.out.println("----------------------");

        System.out.println("Introduce un total de segundos: "); //Mostramos un mensaje sobre la información que precisamos
        segundosIniciales = teclado.nextInt();    //A traver de scanner pedimos al usuario un numero entero de segundos

        System.out.println("Introduce un numero de Horas: "); //Mostramos un mensaje sobre la información que precisamos
        horas = teclado.nextInt();    //A traver de scanner pedimos al usuario un numero entero de Horas

        System.out.println("Introduce un numero de Minutos: "); //Mostramos un mensaje sobre la información que precisamos
        minutos = teclado.nextInt();    //A traver de scanner pedimos al usuario un numero entero de Minutos

        System.out.println("Introduce un numero de segundos: "); //Mostramos un mensaje sobre la información que precisamos
        segundos = teclado.nextInt();    //A traver de scanner pedimos al usuario un numero entero de Segundos

        //----------------------------------------------
        //                 Procesamiento  // Aquí vendrá nuestro código de procesamiento
        //----------------------------------------------
        totalMinutos = (((segundos + segundosIniciales) / 60) + minutos); //Sumanos los minutos totales, dividimos para trasformar en minutos y sumamos minutos.
        totalHoras = ((totalMinutos / 60) + horas); //Para calcular horas hacemos lo mismo es decir dividimos para trasformas min en Horas y sumamos Horas.
        minutosFinales = (totalMinutos % 60);  // Buscamos el resto sobrante de la operacion de transformar minutos en Horas
        segundosFinales = ((segundos + segundosIniciales) % 60);   //Buscamos el resto sobrante de la operacion de transformar segundos en minutos.

        textototal = "En total tenemos " + totalHoras + " horas," + minutosFinales + " minutos y " + segundosFinales + " Segundos";

        //----------------------------------------------
        //              Salida de resultados // Aquí vendrá nuestro código de salida de resultados
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");

        System.out.println(textototal);  // se muestra el contenido de la variable Textototal, que nos calcula cuantas horas, minutos y segundos tenemos.
        System.out.println("Fin del programa.");
    }
}
