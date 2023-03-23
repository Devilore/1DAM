package tarea04;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author luisnavarro
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] palabrasProhibidas = {"STAR", "THE", "AL", "DE", "AS"};
        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        //Cadena resultado de las letras

        String[] coincidencia = {".*[aeiouAEIOU][^aeiouAEIOU][aeiouAEIOU].*"};
//Variables auxiliares

        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        boolean repetido = true;
        System.out.println("Cifrado. Generación de correspondencia entre alfabeto origen y destino.");

        String cadena = sb.toString();
        // 1.Generamos la cadena aleatoria del alfabeto.
        do {

            Set<Integer> generados = new HashSet<>();
            for (int i = 0; i < alfabeto.length(); i++) {
                int aleatorio = -1;
                boolean generado = false;
                while (!generado) {
                    // 1.2 Indicamos que nos saque numero aleatorios y que si ese numero a salido, que no lo tome.
                    int posible = r.nextInt(26);
       
                    if (!generados.contains(posible)) {
                        generados.add(posible);
                        sb.append(letras[posible]);
                        
                        aleatorio = posible;
                        generado = true;
                    }
                    }

                }
                cadena = sb.toString();
                
       //2. Comprobamos si en la cadena existe palabras Prohibidas o una consonante entre dos vocales. Sino repetimos.
            if (cadena.length() <= alfabeto.length()) {
                System.out.println("Intento de correspondencia: " +sb.toString());
            }
            for (String vocales : coincidencia) {
                for (String palabras : palabrasProhibidas) {
                    if (cadena.contains(palabras)) {
                        if (palabras.length()<=2){
                        System.out.println("La cadena contiene una de las palabras prohibidas " + cadena.replaceAll(palabras, "**"));
                        sb.delete(0, 26);
                        }
                        else if (palabras.length()==3){
                        System.out.println("La cadena contiene una de las palabras prohibidas " + cadena.replaceAll(palabras, "***"));
                        sb.delete(0, 26);
                        }
                        else if (palabras.length()>3){
                        System.out.println("La cadena contiene una de las palabras prohibidas " + cadena.replaceAll(palabras, "****"));
                        sb.delete(0, 26);
                        }
                    }
                    }
                    if (cadena.matches(vocales)) {
                        System.out.println("La cadena contiene una consonante entre dos vocales " + cadena.replaceAll("([aeiouAEIOU])[^aeiouAEIOU]([aeiouAEIOU])", "***"));
                        sb.delete(0, 26);
                        repetido = true;

                    
                }
            }
        } while (sb.length() < 26);

        // 2. Una vez llegados a este punto 2, hemos generado una correspondecia válida y mostramos el resultado
        System.out.println(
                "Ya se ha generado una correspondencia válida.");
        //----------------------------------------------
        //     Procesamiento + Salida de Resultados
        //----------------------------------------------
        System.out.println(
                " ");
        System.out.println(
                "Las letras correspondientes a :" + alfabeto);
        System.out.println(
                "son las siguientes en orden.. :" + sb.toString());
        System.out.println(
                "");
        System.out.println(
                "Letra sin codificar-------Letra codificada");
        for (int i = 0;
                i < alfabeto.length();
                i++) {
            System.out.println("      " + alfabeto.charAt(i) + "--------------" + sb.charAt(i));
        }
    }
}
