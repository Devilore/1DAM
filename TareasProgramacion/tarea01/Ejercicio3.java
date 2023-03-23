/*
 * Ejercicio 03. Recluido en casa, algoritmos para saber si puedo salir de casa.
 */
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada 
        boolean lloviendo; // Se usara Boolean al necesitar que nos confirmen o niegen las distintas opciones.
        boolean tareas;
        boolean supermercado;

        // Variables de salida
        String textoSalir;

        // Variables auxiliares
        String saliralacalle;

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos  // Aquí vendrá nuestro código de entrada de datos
        //----------------------------------------------
        System.out.println("Ejercicio 3. Saludo ");
        System.out.println("----------------------");

        System.out.println("¿Esta lloviendo?: (Introduce True/False) "); //Mostramos un mensaje sobre la información que precisamos
        lloviendo = teclado.nextBoolean();    //A traver de scanner pedimos al usuario el boolean es decir, que indique que si es true o false.

        System.out.println("¿Has realizado las tareas? (Introduce True/False)");
        tareas = teclado.nextBoolean();

        System.out.println("¿Tienes que ir al supermercado? (Introduce True/False)");
        supermercado = teclado.nextBoolean();

        //----------------------------------------------
        //                 Procesamiento  // Aquí vendrá nuestro código de procesamiento
        //----------------------------------------------
        saliralacalle = (!lloviendo && tareas) || supermercado ? "Sí" : "No";
        /*Operacion que me indica (Si no llueve y acabe las tareas) 
        o tengo que ir al supermercado puedo salir. (! niega) y (|| significa "o")*/
        textoSalir = "¿Puedo salir a la calle? " + saliralacalle;

        //----------------------------------------------
        //              Salida de resultados // Aquí vendrá nuestro código de salida de resultados
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");

        System.out.println(textoSalir);  // Se muestra el contenido de la variable textosalir, indicandonos Si o No podemos salir.
        System.out.println();
        System.out.println("Fin del programa.");
    }
}
