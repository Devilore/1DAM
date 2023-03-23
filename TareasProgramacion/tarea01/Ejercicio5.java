/*
 * Ejercicio 05. Venta de pienso para animales (Descuentos)
 */
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada 
        int sacos;
        double precio = 9.75; //Precio de los sacos

        // Variables de salida
        String textoSacosComprados;
        String textoDescuento;
        String textoDescuentoAplicado;
        String textoIVA;
        String textoImporteFinal;

        // Variables auxiliares
        double precioSacos;
        double descuento;
        double importeAplicado;
        double precioIVA;
        double importeFinal;

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos  // Aquí vendrá nuestro código de entrada de datos
        //----------------------------------------------
        System.out.println("Ejercicio 5. Saludo ");
        System.out.println("----------------------");

        System.out.println("¿Cuantos Sacos quieres comprar? "); //Mostramos un mensaje sobre la información que precisamos
        sacos = teclado.nextInt();    //A traver de scanner pedimos al usuario que intruduzca un entero o decimal, segun necesidades.

        //----------------------------------------------
        //                 Procesamiento  // Aquí vendrá nuestro código de procesamiento
        //----------------------------------------------
        precioSacos = (sacos * precio);
        descuento = (sacos <= 5) ? 0 : (sacos >= 8) ? 10.5 : 5.3;
        /* Usamos un Terciario 
        Si no se cumple saldra 0, si se cumple la condición saldra 10.5 o 5.3 respectivamente */

        importeAplicado = precioSacos - ((precioSacos / 100) * descuento);
        precioIVA = importeAplicado - (importeAplicado / 10);
        importeFinal = precioIVA;

        textoSacosComprados = ("Has comprado " + sacos + " sacos");
        textoDescuento = ("Tienes un descuento del " + descuento + "%");
        textoDescuentoAplicado = ("El importe aplicando el descuento (Sin IVA) es de: ");
        textoIVA = ("El importe total con IVA es de: ");
        textoImporteFinal = ("El importe final a pagar con IVA es: ");
        //----------------------------------------------
        //              Salida de resultados // Aquí vendrá nuestro código de salida de resultados
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println(textoSacosComprados);  // se muestra la cantidad sacos comprados
        System.out.println(textoDescuento);  //Se muestra el % de descuento  
        System.out.printf("%n%s%.2f%s", textoDescuentoAplicado, importeAplicado, "€"); //Se muestra el importe sin IVA
        System.out.printf("%n%s%.2f%s", textoIVA, precioIVA, "€");  //Se muestra el importe con IVA
        System.out.printf("%n%s%.2f%s", textoImporteFinal, importeFinal, "€"); //Se muestra el importe final
        System.out.println();
        System.out.println("Fin del programa.");
    }
}
