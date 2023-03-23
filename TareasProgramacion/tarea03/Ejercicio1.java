package tarea03;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;


/**
 * Ejercicio 1: Creación y uso de cartones de bingo. 
 * En este ejercicio probamos el funcionamiento de la clase CartonBingo tratando
 * de conocer los métodos que tiene y el funcionamiento de cada uno de ellos
 *
 * @author Lorena Barea Rot
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        // 1. Presentación del ejercicio
        System.out.println("Ejercicio 1. Creación y uso de cartones de bingo");
        System.out.println("------------------------------------------------");
        
        /* 
            Debes mostrar la fecha ACTUAL (hoy) usando la API de LocalDate
            (usa también DateTimeFormatter para formatear la fechala correctamente (ej. 08/11/2022)
         */
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Fecha ACTUAL de ejecución: " + fechaActual.format(formatter));

        //Aunque get.fechaSorteo nos da bien la fecha use LocalDate para mostrar que se utilizarlo
        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        // 2.- Declaración de tres variables referencia a objetos instancia de la clase CartonBingo
        int numeros = 18;
        int superarNumeros = 30;
        LocalDate fechaNueva = LocalDate.of(2023, Month.MARCH, 05);

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        /* 
            En este ejercicio no habrá entrada de datos como tal ya que los datos que se piden en el enunciado son fijos, 
            y son introducidos por el/la programador/a (no hay que pedir datos por teclado al usuario de la aplicación).
         */
        // 3.- Instanciación de objetos de la clase CartonBingo
        System.out.println("------------------------------------------------");
        CartonBingo​ c1, c2, c3, c4, c5;

        // 3.1.- Comprobación del lanzamiento de excepciones (se intentan crear cartones no válidos)
        try {

            // 3.1.1.- Intento de creación de un cartón de bingo con fecha de sorteo de la semana pasada (hay gestionar la posible excepción)
            System.out.println("Intentando crear un carton para el sorteo celebrado hace una semana " + fechaActual.minusWeeks(1).format(formatter));
            c4 = new CartonBingo(fechaActual.minusWeeks(1));
        } catch (Exception a) {
            System.err.println("¡ERROR! Fecha " + fechaActual.minusWeeks(1).format(formatter) + " no válida, no se puede crear un carton para una fecha inválida o para un sorteo que ya a pasado!");

            // 3.1.2.- Intento de creación de un cartón de bingo con una cantidad de números no válida (30 números)
            try {

                System.out.println("Intentando crear un cartón con " + superarNumeros + " números (cantidad no valida)");
                c5 = new CartonBingo(superarNumeros, "Desconocido", fechaActual);
            } catch (Exception e) {
                System.err.println("¡ERROR! Cantidad de numeros no válida, no se puede crear un carton con " + superarNumeros + " (debe tener un minimo de 15 y un maximo de 20) ");
            }
            // 3.2 Creación de cartones válidos

            // 3.2.1.- Creación de un cartón válido para María siguiendo las especificaciones del enunciado
            System.out.println(""); //Espacio
            System.out.println("Creamos un cartón para María con 18 números y  fecha de sorteo 5 de marzo de 2023");
            c1 = new CartonBingo(numeros, "Maria", fechaNueva);

            // 3.2.2.- Creación de un cartón válido para Ada siguiendo las especificaciones del enunciado
            System.out.println(""); //Espacio
            System.out.println("Creando un cartón para Ada, sin indicar nada más");
            c2 = new CartonBingo("Ada");
            // 3.2.3.- Creación de un cartón válido para Juan siguiendo las especificaciones del enunciado

            System.out.println(""); //Espacio
            System.out.println("Creando un cartón para Juan, utilizando los valores por defecto");
            c3 = new CartonBingo();
            System.out.println("");
            //----------------------------------------------
            //       Procesamiento + Salida de Resultados
            //----------------------------------------------
            /* 
            Dado que se va a ir mostrando información de salida a la vez que se van realizando operaciones, podemos considerar en este caso
            que el procesamiento y la salida de resultado van unidos y "mezclados" 
             */
            // 4.- Obtención de información de los cartones creados
            System.out.println("Obtención de información de los cartones creados");
            System.out.println("------------------------------------------------");
            System.out.println("");
            System.out.println("Total de cartones creados: " + CartonBingo.getTotalCartones());
            System.out.println("Identificador del cartón de María: " + c1.getIdCarton());
            System.out.println("Cantidad de números que tiene el cartón de Ada: " + c2.getTotalNumerosCarton());
            System.out.println("Fecha de sorteo del cartón de Juan: " + c3.getFechaSorteo());
            System.out.println("Lista de números del cartón de Ada: " + c2.listadoNumerosPendientes());
            System.out.println("Número de días que faltan para el sorteo en el que participará el cartón de María: " + c1.diasHastaSorteo());
            System.out.println("Total de cartones que participan en el sorteo de hoy: " + CartonBingo.totalCartonesSorteo(fechaActual));

            System.out.println("");
            // 5.- Realización de algunas operaciones con los cartones creados
            System.out.println("Realización de algunas operaciones con los cartones creados");
            System.out.println("------------------------------------------------");
            // 5.1.- Marcar los números del 20 al 35 en los tres cartones
            System.out.println("Marcar los números del 20 al 35 en los tres cartones...");
            int n = 35, i;
            for (i = 20; i <= n; i++) {
                c1.marcarNumero(i);
                c2.marcarNumero(i);
                c3.marcarNumero(i);
            }
            System.out.println("");
            // 5.2.- Mostrar los números que han podido marcar correctamente en cada uno de los cartones
            System.out.println("De los números anteriores. mostramos la lista de numeros sí se han podido marcar en cada uno de los tres cartones");
            System.out.println("En el carton de Maria estaban los numeros: " + c1.listadoNumerosMarcados());
            System.out.println("En el carton de Ada estaban los numeros: " + c2.listadoNumerosMarcados());
            System.out.println("En el carton de Juan estaban los numeros: " + c3.listadoNumerosMarcados());
            // 5.3.- Indica de los tres cartones, a cuál de ellos le quedan menos números
            System.out.println(" ");
            if (c1.getCantidadNumerosPendientes() < c2.getCantidadNumerosPendientes() && c1.getCantidadNumerosPendientes() < c3.getCantidadNumerosPendientes()) {
                System.out.println("Al jugador/a que le quedan menos números pendientes de marcar en su cartón es...Maria que le quedan " + c1.getCantidadNumerosPendientes() + " por marcar.");
            } else if (c2.getCantidadNumerosPendientes() < c1.getCantidadNumerosPendientes() && c2.getCantidadNumerosPendientes() < c3.getCantidadNumerosPendientes()) {
                System.out.println("Al jugador/a que le quedan menos números pendientes de marcar en su cartón es...Ada que le quedan " + c2.getCantidadNumerosPendientes() + " por marcar.");
            } else if (c3.getCantidadNumerosPendientes() < c1.getCantidadNumerosPendientes() && c3.getCantidadNumerosPendientes() < c2.getCantidadNumerosPendientes()) {
                System.out.println("Al jugador/a que le quedan menos números pendientes de marcar en su cartón es...Juan que le quedan " + c3.getCantidadNumerosPendientes() + " por marcar.");

                // Si hay dos jugadores con los mismos numeros
            } else if (c1.getCantidadNumerosPendientes() == c2.getCantidadNumerosPendientes()) {
                System.out.println("A los jugadores que menos números pendientes le quedan por marcar en su carton son... Maria y Ada que le quedan " + c1.getCantidadNumerosPendientes() + " por marcar.");
            } else if (c1.getCantidadNumerosPendientes() == c3.getCantidadNumerosPendientes()) {
                System.out.println("A los jugadores que menos números pendientes le quedan por marcar en su carton son... Maria y Juan que le quedan " + c1.getCantidadNumerosPendientes() + " por marcar.");
            } else if (c2.getCantidadNumerosPendientes() == c3.getCantidadNumerosPendientes()) {
                System.out.println("A los jugadores que menos números pendientes le quedan por marcar en su carton son... Ada y Juan que le quedan " + c2.getCantidadNumerosPendientes() + " por marcar.");

                // Si todos los jugadores tienen los mismos numeros
            } else if (c2.getCantidadNumerosPendientes() == c3.getCantidadNumerosPendientes() && c2.getCantidadNumerosMarcados() == c1.getCantidadNumerosMarcados()) {
                System.out.println("A todos los jugadores les quedan en su carton... " + c2.getCantidadNumerosPendientes() + " por marcar.");

            }
            System.out.println("");
            // 6.- Muestra el estado final de los cartones
            System.out.println("Estado final de los cartones");
            System.out.println("------------------------------------------------");
            System.out.println(c1.toString());
            System.out.println(c2.toString());
            System.out.println(c3.toString());
            System.out.println();
            System.out.println("El programa ha finalizado!!");
            System.out.println();
        }
    }

}
