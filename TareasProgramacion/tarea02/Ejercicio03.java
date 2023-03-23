/*
 * Juego de las Siete y Media
 */
package tarea02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Variables de entrada (aquí se definen las variables que recibirán valores, si fueran necesarias)
        double carta = 0; //Cartas simples que vamos sumando y tiene sus valores
        double suma = 0; //Acumulador 
        float banca; //Banca
        

        // Variables de salida (aquí se definen las variables que almacenarán resultados y se mostrarán al usuario, si fueran necesarias)
        String resultado; //Resultado final
        int numAleatorio; //Nuestro numero aleatorio
        boolean pedircarta; //Consultar si queremos mas cartas
        // Clase Scanner para petición de datos al usuario a través del teclado
        Random r = new Random();
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        // Generamos un número entre 4 y 7.5
        /* La clase Random es una clase de Java que nos sirve para generar elementos aleatorios
            en este caso el objeto "r", consigue a través de su método nextInt(número), generar
            un número aleatorio entero entre 0 y número-1, por ejemplo r.nextInt(4), generará 
            un número entero entre 0 y 3, es decir, podrá devolver 0,1,2 o 3 cada vez que se 
            utilice.
            En la siguiente línea generamos un número entre  0 y 3, al que le sumamos 4, de esta
            forma la banca obtendrá siempre un número bastante competivo, entre 4 y 7.
            Posteriormente utilizamos este mismo método sin parámetros, generando un entero entre
            0 y 2 elevado a 32
         */
        System.out.println("Ejercicio 4. Juego Siete y Media");
        System.out.println("----------------------------------------------------");
        System.out.println("La banca a jugado, hasta donde te atreves a apostar");

        banca = 4 + r.nextInt(4) + ((r.nextInt() % 2 == 0) ? 0f : 0.5f);
        numAleatorio = aleatorio.nextInt(12);

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        System.out.println("     ");
        System.out.println("JUEGO");
        System.out.println("---------------");

        do {
            switch (numAleatorio) {
                case 1:
                    carta = 1;
                    System.out.println("Ha obtenido un: " + 1);
                    break;
                case 2:
                    carta = 2;
                    System.out.println("Ha obtenido un: " + 2);
                    break;
                case 3:
                    carta = 3;
                    System.out.println("Ha obtenido un: " + 3);
                    break;
                case 4:
                    carta = 4;
                    System.out.println("Ha obtenido un: " + 4);
                    break;
                case 5:
                    carta = 5;
                    System.out.println("Ha obtenido un: " + 5);
                    break;
                case 6:
                    carta = 6;
                    System.out.println("Ha obtenido un: " + 6);
                    break;
                case 7:
                    carta = 7;
                    System.out.println("Ha obtenido un: " + 7);
                    break;
                case 8:
                case 9:
                    carta = 0;
                    System.out.println("Ha obtenido una carta sin valor: " + 0);

                    break;
                case 10:
                case 11:
                case 12:
                    carta = 0.5;
                    System.out.println("Ha obtenido una figura: " + carta);
                    break;

            }

            suma = carta + suma;
            System.out.println("La suma total de sus cartas es " + suma);
            if (suma + carta < 7.5) {
                System.out.println("¿Desea seguir? (True/False)");
                pedircarta = teclado.hasNextBoolean();
            }if (suma <= 7.5 && teclado.nextBoolean() == true) {
                    numAleatorio = aleatorio.nextInt(12);

                } else {
                    break;

                }
            }
            while (suma < 7.5);

            //----------------------------------------------
            //              Salida de resultados 
            //----------------------------------------------
            System.out.println("        ");
            System.out.println("RESULTADO");
            System.out.println("---------------");
            if (suma > 7.5) {
                System.out.println("Ha ganado la banca, te has pasado");
            } else if (suma < banca) {
                System.out.println("Has perdido banca (" + banca + ") vs jugador (" + suma + ")");
            } else if (suma > banca) {
                System.out.println("Has ganado banca (" + banca + ") vs jugador (" + suma + ")");
            } else if (suma == banca) {
                System.out.println("Has empatado (" + banca + ") vs jugador (" + suma + ")");
            }
        }
    }
