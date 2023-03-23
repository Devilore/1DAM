package tarea04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author luisnavarro
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        System.out.println("Ejercicio 3-Ajustando el nuevo radar de la DGT");
        System.out.println();
        //Scanner para pedir datos
        Scanner teclado = new Scanner(System.in);
        //0.Declaramos las constantes y variables
        //Constantes
        final int MAXIMO_CARACTERES_POR_LINEA = 80;
        
        final String cadenaEntrada = "PA-762-ED & 191#CU-3344-H & 166 # 3344BBF & 136 #RM 437-LU & 122 #A233456L & 156 # RM 437-BB & 132# CD-332-SD&144#RM333-FF&172#DD-333-EE&222#RR-444-WW&148# 4567EBF & 116 ";
        //Porcentaje y dinero de la multa
        final int[][] TABLA_MULTAS = {{15, 100}, {20, 200}, {40, 300}, {50, 500}};
        CapturaRadar[] arrayCapturas;
        //--------------------
        //Declaramos las variables:
        //------------------------

        // Necesitamos un StringTokenizer para recorrer cadena de entrada
        // y trocear usando de separador # (Este divide en partes las cadenas)
        StringTokenizer paresMatricula = new StringTokenizer(cadenaEntrada, "#");
        int lecturas = paresMatricula.countTokens();
        int i = 0;
        char repito;
        arrayCapturas = new CapturaRadar[lecturas];
        while (paresMatricula.hasMoreTokens()) {
            String cadaparesMatricula = paresMatricula.nextToken(); //Me saca cadenas
            //   System.out.println(cadaparesMatricula);

            //StringTokenizer para separar medicion concreta en matricula/velocidad
            StringTokenizer parMatricula = new StringTokenizer(cadaparesMatricula, "&");

            String matricula = parMatricula.nextToken().trim();
            String velocidadMedida = parMatricula.nextToken().trim();
           
              
        
            
            
            //System.out.println("Velocidad: " + velocidadMedida);
            
            String francia = "[A-Z]{2}-[0-9]{3}-[A-Z]{2}";
            String españa = "[0-9]{4}[A-Z]{3}";
            String españaantiguo = "[A-Z]{1,2}-[0-9]{4}-[A-Z]{1,2}";
            String italia = "[A-Z]{2}\\s[0-9]{3}-[A-Z]{2}";  

            if (matricula.matches(españa)) {
                 CapturaRadar españaa = new CapturaRadar(CapturaRadar.Paises.ESPAÑA, Integer.parseInt(velocidadMedida), matricula);
            arrayCapturas[i] = españaa;
            i++;
            }else if (matricula.matches(españaantiguo)) {
                 CapturaRadar españaa = new CapturaRadar(CapturaRadar.Paises.ESPAÑA, Integer.parseInt(velocidadMedida), matricula);
            arrayCapturas[i] = españaa;
            i++;
            }else if (matricula.matches(francia)) {
                 CapturaRadar españaa = new CapturaRadar(CapturaRadar.Paises.FRANCIA, Integer.parseInt(velocidadMedida), matricula);
            arrayCapturas[i] = españaa;
            i++;
            }else if (matricula.matches(italia)) {
                 CapturaRadar españaa = new CapturaRadar(CapturaRadar.Paises.ITALIA, Integer.parseInt(velocidadMedida), matricula);
            arrayCapturas[i] = españaa;
            i++;
            } else {
                CapturaRadar otros = new CapturaRadar(CapturaRadar.Paises.OTRO, Integer.parseInt(velocidadMedida), matricula);
            arrayCapturas[i] = otros;
            i++;

            }

        }
        //Coches multados

        //-------------------------------------------
        //Mostramos en pantalla
        //-----------------------
        //1.Presentamos la cadena separando en 80 caracteres maximo.
        System.out.println("La cadena que nos da el rádar es: " + cadenaEntrada);
        System.out.println("Lo separo en líneas de máxino 80 caracteres: ");
        System.out.println(cadenaEntrada.substring(0, 80));
        System.out.println(cadenaEntrada.substring(80, 160));
        System.out.println(cadenaEntrada.substring(160));
        System.out.println();
        System.out.println("Escanenado obtenemos los datos: ");

        //2.CapturaRadar.Indicamos vehiculos, velocidad con sus paises
        for (i = 0; i < arrayCapturas.length; i++) {
            
             System.out.println(arrayCapturas[i]);
             
        }
do {
        // 3.Pedimos al usuario que introduzca un velocidad limite
        System.out.println("Diga un límite de velocidad para simular las multas que pondríamos para las mediciones introducidad en km/h: ");

        int velocidadLimite = teclado.nextInt();
        //4. Calculamos los vehiculos que la han superado y sus multas
        System.out.println("Vamos a simular las multas que pondríamos si el límite estuviera en " + velocidadLimite + " km/h:");
        int coches = 0;
        double sumaMultas=0;
        double suma=0;
       
            for (i = 0; i < arrayCapturas.length; i++) {

                //System.out.println(porcentaje);
                if (arrayCapturas[i].getVelocidadCaptura() > velocidadLimite) {

                    int resultado = (arrayCapturas[i].getVelocidadCaptura() - velocidadLimite);
                    double porcentaje = (double) resultado / velocidadLimite * 100;
                    porcentaje = Math.round(porcentaje);

                    if (porcentaje > 15 && porcentaje <= 30) {
                        System.out.println("Exceso: " + arrayCapturas[i].getVelocidadCaptura() + " - " + velocidadLimite + " : " + resultado + "km/h," + " que es un " + porcentaje + "% , multa 100€.........." + arrayCapturas[i]);
                        coches++;
                        sumaMultas = sumaMultas +100;
                    } else if (porcentaje > 30 && porcentaje <= 40) {
                        System.out.println("Exceso: " + arrayCapturas[i].getVelocidadCaptura() + " - " + velocidadLimite + " : " + resultado + "km/h," + " que es un " + porcentaje + "% , multa 200€.........." + arrayCapturas[i]);
                        coches++;
                        sumaMultas = sumaMultas +200;
                    } else if (porcentaje > 40 && porcentaje <= 50) {
                        System.out.println("Exceso: " + arrayCapturas[i].getVelocidadCaptura() + " - " + velocidadLimite + " : " + resultado + "km/h," + " que es un " + porcentaje + "% , multa 300€.........."+ arrayCapturas[i]);
                        coches++;
                        sumaMultas = sumaMultas +300;
                    } else if (porcentaje > 50) {
                        System.out.println("Exceso: " + arrayCapturas[i].getVelocidadCaptura() + " - " + velocidadLimite + " : " + resultado + "km/h," + " que es un " + porcentaje + "% , multa 500€.........." + arrayCapturas[i]);
                        coches++;
                        sumaMultas = sumaMultas +500;

                    }
                    
                }
               
            }
            double media = Math.round(sumaMultas/coches);
             System.out.println("En total "+ coches + " multados, la suma de las multas es "+ sumaMultas + "€"+ " y la media es " + media + "€");
            System.out.println("Quiere hacer otra simulación?");

            repito = teclado.next().charAt(0);

        } while (repito == 'S');

        //4. Repetimos
    }
}

