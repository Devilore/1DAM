package tarea03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Scanner;

/**
 * Ejercicio 3: Vamos al cine.<br>
 * En este ejercicio trabajaremos con objetos de tipo fecha y de tipo hora a
 * través de las clases LocalDate y LocalTime respectivamente.
 *
 * @author [LORENA BAREA ROT]
 */
public class Ejercicio3 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        System.out.println("\nEjercicio 3. ¡Vamos al cine!");
        System.out.println("----------------------------");

        //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        // 1.- Lectura por teclado de la fecha para la que se quiere reservar (mínimo con una semana de antelación)
        /* Se deberán cumplir los requisitos del enunciado y determinará si es uno de los Días del Espectador */
        Scanner teclado = new Scanner(System.in);
        LocalDate fecha = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Introduce la fecha para la que quieres comprar la entrada");
        System.out.println("-----------------------------------------------");
        String diaSesion = teclado.nextLine();
        LocalDate validarfecha = null;

        validarfecha = LocalDate.parse(diaSesion, formatter);

        System.out.println("-Fecha ejemplo (ej. " + fecha.plusWeeks(1).format(formatter) + " ):" + validarfecha.format(formatter));
        while (validarfecha.isBefore(fecha.plusWeeks(1))) {
            //código a ejecutar por defecto en caso de que no se cumpla alguna de las condiciones anteriores
            
            System.err.println("¡ERROR! La fecha introducida NO es valida  (utiliza el formato introducido)");
            diaSesion = teclado.nextLine();
            validarfecha = LocalDate.parse(diaSesion, formatter);
            System.out.println(" ");
            System.out.println("-Fecha ejemplo (ej. " + fecha.plusWeeks(1).format(formatter) + " ):" + validarfecha.format(formatter));
            
        }

// 2. Lectura por teclado y comprobación de hora y minuto (cumpliendo los requisitos del enunciado)
        System.out.println("Introduce la hora (0-23) para la sesion que quieres comprar la entrada");
        System.out.println("-----------------------------------------------");
        int horaSesion = teclado.nextInt();
        LocalTime hora = LocalTime.of(horaSesion, 0);
        LocalTime horainicio = LocalTime.of(0, 0);
        LocalTime horafinal = LocalTime.of(23, 0);
        System.out.println("-Hora (0-23): " + hora);

        while (!hora.isAfter(horainicio) && !hora.isBefore(horafinal)) {
            //código a ejecutar por defecto en caso de que no se cumpla alguna de las condiciones anteriores   
            System.err.println("¡ERROR! La hora introducida NO es valida  (utiliza el formato introducido)");
            horaSesion = teclado.nextInt();
            hora = LocalTime.of(horaSesion, 0);
            System.out.println("-Hora (0-23): " + hora);
        }

        System.out.println("Introduce los minutos (0-59) para la sesion que quieres comprar la entrada");
        System.out.println("-----------------------------------------------");
        int minutosSesion = teclado.nextInt();
        LocalTime minutos = LocalTime.of(horaSesion, minutosSesion);
        LocalTime minutosinicio = LocalTime.of(horaSesion, 0);
        LocalTime minutosfinal = LocalTime.of(horaSesion, 59);
        System.out.println("-Hora (0-59): " + minutos);

        while (!minutos.isAfter(minutosinicio) && !minutos.isBefore(minutosfinal)) {
            //código a ejecutar por defecto en caso de que no se cumpla alguna de las condiciones anteriores   
            System.err.println("¡ERROR! La hora introducida NO es valida  (utiliza el formato introducido)");
            minutosSesion = teclado.nextInt();
            minutos = LocalTime.of(minutosSesion, 0);
            System.out.println("-Hora (0-59): " + minutos);
        }

        // 3.1. Creación de un objeto LocalTime de referencia para almacenar la hora de la primera sesión de cine (17:00)
        LocalTime primeraSesion = LocalTime.of(17, 01);
        long hora1 = (primeraSesion.getLong(ChronoField.HOUR_OF_DAY) * 60);
        //2SESION
        LocalTime segundaSesion = LocalTime.of(19, 31);
        long hora2 = 30 + (segundaSesion.getLong(ChronoField.HOUR_OF_DAY) * 60);
        //UltimaSesion
        LocalTime ultimaSesion = LocalTime.of(22, 01);
        long hora3 = (ultimaSesion.getLong(ChronoField.HOUR_OF_DAY) * 60);
        //Pasarse de hora
        

        // 3.2 Creación de objeto LocalTime con la hora indicada a partir de los datos (hora y minuto) leídos por teclado
        LocalTime horaEspectador = LocalTime.of(horaSesion, minutosSesion);
        long horafinall = minutosSesion + (horaEspectador.getLong(ChronoField.HOUR_OF_DAY) * 60);

        //----------------------------------------------
        //               Procesamiento 
        //----------------------------------------------
        // 4. Obtener la siguiente sesión (y su precio) a la que el usuario puede entrar según la hora que ha indicado
        if (horaEspectador.isBefore(primeraSesion)) {
            long resta = (hora1 - horafinall);
            System.out.println("A la hora indicada quedan " + resta + " minutos para el inicio de la primera sesión");
            System.out.println(" ");
            //SegundaSesion
        } else if (horaEspectador.isAfter(primeraSesion) && horaEspectador.isBefore(segundaSesion)) {
            long resta2 = (hora2 - horafinall);
            System.out.println("A la hora indicada quedan " + resta2 + " minutos para el inicio la segunda sesion a las 19:30");
            System.out.println(" ");

        } else if (horaEspectador.isAfter(segundaSesion) && horaEspectador.isBefore(ultimaSesion)) {
            long resta3 = (hora3 - horafinall);
            System.out.println("A la hora indicada quedan " + resta3 + " minutos para el inicio la sesion a las 22:00");
            System.out.println(" ");
        } else if (horaEspectador.isAfter(ultimaSesion)){
            long resta4 = (horafinall - hora3);
            System.out.println("La última sesíon  de este dia comienza " + resta4 + " ANTES de la hora indicada");
            
        }
        
            if ((validarfecha.getDayOfWeek().equals(DayOfWeek.TUESDAY) || validarfecha.getDayOfWeek().equals(DayOfWeek.MONDAY)) && (horaEspectador.isBefore(segundaSesion))) {
                double precio = 4.50 / 2;
                System.out.println("El precio para esta sesión es de " + precio + "€");
                System.out.println(" ");
                System.out.println("Nota: se ha aplicado un descuento del 50.0% por el Dia del Espectador");
            } else if ((validarfecha.getDayOfWeek().equals(DayOfWeek.TUESDAY) || validarfecha.getDayOfWeek().equals(DayOfWeek.MONDAY)) && (horaEspectador.isAfter(segundaSesion) && horaEspectador.isBefore(ultimaSesion))) {
                double precio = 5.50/2;
                System.out.println("El precio para esta sesión es de " + precio + "€");
                System.out.println("Nota: se ha aplicado un descuento del 50.0% por el Dia del Espectador");
            } else if (horaEspectador.isAfter(segundaSesion) && horaEspectador.isBefore(ultimaSesion)) {
                double precio = 5.50;
                System.out.println("El precio para esta sesión es de " + precio + "€");
            } else if (horaEspectador.isAfter(ultimaSesion)){
                 System.out.println("No hay más sesiones despues de esta");
            } else {
                double precio = 4.50;
                System.out.println("El precio para esta sesión es de " + precio + "€");
                System.out.println(" ");
                System.out.println(" ");
            

            }
            //----------------------------------------------
            //            Salida de resultados 
            //----------------------------------------------
            // 5. Mostrar por pantalla los resultados obtenidos según el procesamiento realizado.
            System.out.println();
            System.out.println("El programa ha finalizado!!");
            System.out.println();

        }
    }

