/*
 * Ejercicio 02. Operadores aritméticos.
 */
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // Constantes
        // Variables de entrada
        int N1; //En el ejercicio se piden numeros enteros asi que optamos por int
        int N2;
        int N3;

        // Variables de salida
        String textoSuma;
        String textoPar;
        String textoResto;
        String textoMayorque;
        String textoAlcuadrado;

        // Variables auxiliares
        int sumadelos3;
        boolean sumaPar;
        boolean reston1;
        boolean mayorque;
        boolean alcuadrado;

        // Clase Scanner para petición de datos de entrada
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //                Entrada de datos  // Aquí vendrá nuestro código de entrada de datos
        //----------------------------------------------
        System.out.println("Ejercicio 2. Saludo ");
        System.out.println("----------------------");

        System.out.println("Introduce el primer numero: "); //Mostramos un mensaje sobre la información que precisamos
        N1 = teclado.nextInt();    //A traver de scanner pedimos al usuario que intruduzca un numero entero

        System.out.println("Introduce el segundo numero : ");
        N2 = teclado.nextInt();

        System.out.println("Introduce el tercer numero : ");
        N3 = teclado.nextInt();

        //----------------------------------------------
        //                 Procesamiento  // Aquí vendrá nuestro código de procesamiento
        //----------------------------------------------
        sumadelos3 = N1 + N2 + N3; //Se la suma de los numeros con esta formula
        // se almacena en la variable TextoSuma, el texto completo
        textoSuma = "La Suma de los numeros " + N1 + ", " + N2 + " y " + N3 + " es: " + sumadelos3;

        sumaPar = sumadelos3 % 2 == 0; //Formula para saber si un numero o suma de numeros es par %2
        textoPar = "La Suma de los tres numeros es par: " + sumaPar;

        reston1 = N1 % N2 != 0; //Formula para saber si el resultado de una operación es no igual a 0 != / Si es igual ==
        textoResto = "El resto del primer numero dividido entre el segundo es diferente a cero: " + reston1;

        mayorque = N1 * (N2 / 2) > N3; //Formula para cualcular usando () para dar prioridades y usando > o < para menor que o mayor que
        textoMayorque = "La multiplicación del primer numero por la mitad del segundo es mayor que el tercer numero: " + mayorque;

        alcuadrado = ((N1 * N1) - (N2 * 3)) * N3 < 0; //Formula para operar y dar prioridades a formulas usando el < para indicar que el mayor es 0
        textoAlcuadrado = "El resultado del cuadrado del primer número menos el triple del segundo número por el tercer número es menor que 0: " + alcuadrado;

        //----------------------------------------------
        //              Salida de resultados // Aquí vendrá nuestro código de salida de resultados
        //----------------------------------------------
        System.out.println();
        System.out.println("RESULTADO");
        System.out.println("---------");

        System.out.println(textoSuma);  // se muestra el contenido de la variable TextoSuma
        System.out.println(textoPar);
        System.out.println(textoResto);
        System.out.println(textoMayorque);
        System.out.println(textoAlcuadrado);
        System.out.println();
        System.out.println("Fin del programa.");
    }
}
