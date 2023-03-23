/*
 * Ejercicio 02
 */
package tarea02;

import java.util.Scanner;

/**
 *
 * @author lorena Barea
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Variables de entrada (aquí se definen las variables que recibirán valores, si fueran necesarias)
        int dia, mes;
        boolean fValida = false; //Con el boolean nos confirma que se escriba bien la fecha.
        // Variables de salida (aquí se definen las variables que almacenarán resultados y se mostrarán al usuario, si fueran necesarias)

        String signo = "";
        // Clase Scanner para petición de datos al usuario a través del teclado
        Scanner teclado = new Scanner(System.in);
        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        System.out.println("Ejercicio 2. Signos del Zodíaco");
        System.out.println("----------------------------------------------------");

        System.out.print("Introduzca el número del mes en que nació (1-12): "); //Pedimos primero el mes ya que asi podemos segmentar en 12 case.
        mes = teclado.nextInt();

        System.out.println("Introduce el dia en el que nacio:"); //Luego pedimos el mes para dividir en 2 signos por mes.
        dia = teclado.nextInt();
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        switch (mes) {
            case 1: 
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (dia > 0 & dia < 32) { //Se comprueba si las fechas son correctas, ponemos 3 opciones agrupadas... si esta entre esos dias es true.
                    fValida = true;
                }
                break;
            case 2:
                if (dia > 0 & dia < 30) {
                    fValida = true;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia > 0 & dia < 31) {
                    fValida = true;
                }
                break;
        }
        if (fValida == true) { //Indicamos que si la fecha es correcta se pasa a este switch y luego vamos segmentando por signos, iniciando por enero.
            switch (mes) {
                case 1://Enero
                    if (dia > 20) {
                        signo = "Acuario";
                    } else {
                        signo = "Capricornio";
                    }
                    break;
                case 2://Febrero
                    if (dia > 19) {
                        signo = "Piscis";
                    } else {
                        signo = "Acuario";
                    }
                    break;
                case 3://Marzo
                    if (dia > 20) {
                        signo = "Aries";
                    } else {
                        signo = "Piscis";
                    }
                    break;
                case 4://Abril
                    if (dia > 20) {
                        signo = "Tauro";
                    } else {
                        signo = "Aries";
                    }
                    break;
                case 5://Mayo
                    if (dia > 21) {
                        signo = "Geminis";
                    } else {
                        signo = "Tauro";
                    }
                    break;
                case 6://Junio
                    if (dia > 20) {
                        signo = "Cancer";
                    } else {
                        signo = "Geminis";
                    }
                    break;
                case 7://Julio
                    if (dia > 22) {
                        signo = "Leo";
                    } else {
                        signo = "Cancer";
                    }
                    break;
                case 8://Agosto
                    if (dia > 21) {
                        signo = "Virgo";
                    } else {
                        signo = "Leo";
                    }
                    break;
                case 9://septiembre
                    if (dia > 22) {
                        signo = "Libra";
                    } else {
                        signo = "Virgo";
                    }
                    break;
                case 10://octubre
                    if (dia > 22) {
                        signo = "Escorpio";
                    } else {
                        signo = "Libra";
                    }
                    break;
                case 11://nobiembre
                    if (dia > 21) {
                        signo = "Sagitario";
                    } else {
                        signo = "Escorpio";
                    }
                    break;
                case 12://diciembre
                    if (dia > 21) {
                        signo = "Capricornio";
                    } else {
                        signo = "Sagitario";
                    }
                    break;
            }
            //----------------------------------------------
            //              Salida de resultados 
            //----------------------------------------------
            System.out.println("El signo correspondiente al dia " + dia + " del mes " + mes + " es: " + signo); //Finalmente si sale todo correcto se imprime esto.
        } else {
            System.out.println("La fecha es invalida"); //Si las fechas estan mal introducidas se imprime esto.

        }

    }
}
