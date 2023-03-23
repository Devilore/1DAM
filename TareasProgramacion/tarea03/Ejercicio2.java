package tarea03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Ejercicio 2: ¡A jugar! Utilización de las clases CartonBingo y Bombo para
 * simular una partida.<br>
 * En este ejercicio probamos el funcionamiento de la clase Bombo tratando de
 * conocer los métodos que tiene y el funcionamiento de cada uno de ellos.
 *
 * @author [COLOCA AQUÍ TU NOMBRE]
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        // 1.- Presentación del ejercicio
        System.out.println("Ejercicio 2. ¡A jugar!");
        System.out.println("----------------------");
        /* 
            Debes mostrar la fecha ACTUAL (hoy) usando la API de LocalDate
            (usa también DateTimeFormatter para formatear la fechala correctamente (ej. 08/11/2022)
         */
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha ACTUAL de ejecución: " + fechaActual.format(formatter));

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        CartonBingo c1, c2;
        String c1nombre, c2nombre;
        Bombo bola;
        Scanner teclado = new Scanner(System.in);

        //----------------------------------------------
        //          Entrada de datos
        //----------------------------------------------
        System.out.println("Introduce el nombre del primer jugador");
        c1nombre = teclado.nextLine();

        System.out.println("Introduce el nombre del segundo jugador");
        c2nombre = teclado.nextLine();

        System.out.println("");

        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        // 2.- Creación de los cartones para los jugadores
        System.out.println("Creando el cartón de " + c1nombre + " con 15 números para el sorteo de hoy");
        c1 = new CartonBingo(c1nombre);
        System.out.println(c1.toString());

        System.out.println("");
        System.out.println("Creando el cartón de " + c1nombre + " con 15 números para el sorteo de hoy");
        c2 = new CartonBingo(c2nombre);
        System.out.println(c2.toString());
        System.out.println("");
        // 3.- Creación del bombo para el sorteo de hoy
        System.out.println("Creando el bombo para el sorteo de hoy...");

        bola = new Bombo(fechaActual);
        System.out.println("");
        // 4.- Comienza el juego. Jugamos para "Línea"
        System.out.println("Comienza el juego, jugamos para linea...");
        System.out.println("");
        // 4.1.- Extraer una bola del bombo y "cantarla"
        while (!c1.cantarLinea() || !c2.cantarLinea()) {

            int sacar = bola.sacarBola();
            System.out.println(bola.cantarNumero(sacar));
        // 4.2.- Marcar el número de la bola en el cartón de cada jugador
            c1.marcarNumero(sacar);
            c2.marcarNumero(sacar);
            c1.cantarLinea();
            c2.cantarLinea();
        }
        System.out.println("");
        if (c1.cantarLinea()) {
            System.out.println("****" + c1nombre + ": LINEAAAA****");
        } else if (c2.cantarLinea()) {
            System.out.println("****" + c2nombre + ": LINEAAAA****");

        }
        System.out.println("");
        // 4.3.- Comprobar si alguno de los jugadores puede cantar ¡Línea! y comprobar si es correcta o no

        if (c1.tieneLinea()) {
            bola.verificarLinea(c1);
            System.out.println("Verificamos la línea cantada por " + c1nombre);
            System.out.println(c1.toString());
            System.out.println("La linea cantada por " + c1nombre + " es VÁLIDA");
        } else if (c2.tieneLinea()) {
            bola.verificarLinea(c2);
            System.out.println("Verificamos la línea cantada por " + c2nombre);
            System.out.println(c2.toString());
            System.out.println("La línea cantada por " + c1nombre + " es VÁLIDA");
        }

        System.out.println("");

        // 5.- Una vez se ha cantado una línea correcta continúa el juego para "Bingo"
        System.out.println("Comienza el juego, jugamos para bingo...");
        // 5.1.- Extraer una bola del bombo y "cantarla"
        System.out.println("");
        try{
        while (!c1.cantarBingo() || !c2.cantarBingo()) {

            int sacar = bola.sacarBola();
            System.out.println(bola.cantarNumero(sacar));

            // 5.2.- Marcar el número de la bola en el cartón de cada jugador
            c1.marcarNumero(sacar);
            c2.marcarNumero(sacar);
            c1.cantarBingo();
            c2.cantarBingo();
            }
        }catch (Exception e){
        System.out.println("");
        if (c1.cantarBingo()) {
            System.out.println("****" + c1nombre + ": BINGOOO****");
        } else if (c2.cantarBingo()) {
            System.out.println("****" + c2nombre + ": BINGOOO****");
     
        
        System.out.println("");
        // 5.3.- Comprobar si alguno de los jugadores puede cantar ¡Bingo! y comprobar si es correcto o no
          }
            if (c1.tieneBingo()) {
            bola.verificarBingo(c1);
            System.out.println("Verificamos el Bingo cantado por " + c1nombre);
            System.out.println(c1.toString());
            System.out.println("El Bingo cantado por " + c1nombre + " es VÁLIDO");
        } else if (c2.tieneBingo()) {
            bola.verificarBingo(c2);
            System.out.println("Verificamos el Bingo cantado por " + c2nombre);
            System.out.println(c2.toString());
            System.out.println("La Bingo cantada por " + c2nombre + " es VÁLIDO");
        }

        System.out.println("");
        // 6.- Mostrar un resumen del sorteo
        System.out.println(bola.toString());
        System.out.println();
        System.out.println("El sorteo ha finalizado!!");
        System.out.println();

    }

    }
}