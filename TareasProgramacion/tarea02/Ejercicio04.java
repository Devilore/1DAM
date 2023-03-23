/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Programación DAM y DAW IES Trassierra
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Variables de entrada (aquí se definen las variables que recibirán valores, si fueran necesarias)
        int numerofilas;
        int multiplo;
        int simbolos;
        // Variables de salida (aquí se definen las variables que almacenarán resultados y se mostrarán al usuario, si fueran necesarias)
        // Clase Scanner para petición de datos al usuario a través del teclado
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        System.out.println("¿Cuantas filas quieres? Debe se mayor o igual a 12");
        numerofilas = teclado.nextInt();

        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        if (numerofilas >= 12) {
            multiplo = (numerofilas / 4) * 4; //Ajustamos para que sea las filas el mayor multiplo de 4
            //Bucle para las linea

            String cadena = "";
            String cadena1 = "";
            String cadena2 = "";
            String cadena3 = "";
            for (int i = 0; i < multiplo; i++) {
                simbolos = 3 + aleatorio.nextInt(multiplo / 2);
                cadena = "";
               cadena1 = "";
               cadena2 = "";
           cadena3 = "";
                if (i % 1 == 0) { //Por cada conjunto de cadenas separamos
                    System.out.println("---------------------");
                }
                for (int j = 0; j < simbolos; j++) {
               cadena += "*";
               cadena1 += "#";
               cadena2 += "@";
               cadena3 += ">";

                }

                //Numero maximo de simbolos que seria la mitad del numero de filas
                /*
            numAleatorio =3 + aleatorio.nextInt(multiplo/2); 
            numsimbolos=numAleatorio;
            
        
            
            
            
            
            
            for (int i=1; i<=multiplo; ++i,numsimbolos=numAleatorio) {
               
                 while(numsimbolos != 2 * i - 1) {
                    System.out.println("*");
               
                    System.out.println ("#");
               
                    System.out.println("@");
                
                   System.out.println(">");
            
                   ++numsimbolos;
                 }*/
                //----------------------------------------------
                //              Salida de resultados 
                //----------------------------------------------
                System.out.println(cadena);
                System.out.println(cadena1);
                System.out.println(cadena2);
                System.out.println(cadena3);
            }
        }

    }
}
