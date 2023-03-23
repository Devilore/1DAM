package tarea04;

import java.util.Scanner;

/**
 *
 * @author luisnavarro
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        // final int VUELTAS=2; //Al cifrado/descifrado le doy dos vueltas o hago dos correspondencias consecutivas
        int vueltas = 0;
        int cont = 0;
        Scanner teclado = new Scanner(System.in);
        String cifrar = " ";

        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alfabetoCifrado = "BVWHGZMLXKONIYFSTUCEDPRAQJ";

        String textoOriginal = "Doha se suma a las ciudades que han acogido uno de los grandes duelos europeos, los España-Alemania, las dos selecciones que han ganado más veces la Eurocopa (tres), ambas con estrellas en su camiseta (4-1 para los germanos) y qu";
        String textoTraducido = "";
        StringBuilder textoTraducidoBuilder = new StringBuilder();
        String textoMayusculas = textoOriginal.toUpperCase();

        do {
            System.out.println("¿Quieres cifrar o descifrar? (C/D) ");
            cifrar = teclado.nextLine();
        } while (cifrar.equalsIgnoreCase("C") && cifrar.equalsIgnoreCase("D"));

        do {
            System.out.println("¿Cuantas vueltas quieres dar");
            vueltas = teclado.nextInt();
        } while (vueltas < 1 || vueltas > 6);

        if (cifrar.equals("C")) {
            //CIFRADO
           
            for (int i = 0; i < textoMayusculas.length(); i++) {
                char caracter = textoMayusculas.charAt(i);
                int posicionCaracter = alfabeto.indexOf(caracter);

                if (posicionCaracter >= 0) {
                    caracter = alfabetoCifrado.charAt(posicionCaracter);
                }
                textoTraducidoBuilder.append(caracter);
                cont++;
                textoTraducido = textoTraducidoBuilder.toString();
            }
            
            do{
            for (int i = 0; i < textoTraducido.length(); i++) {
                char caracter = textoTraducido.charAt(i);
                int posicionCaracter = alfabeto.indexOf(caracter);

                if (posicionCaracter >= 0) {
                    caracter = alfabetoCifrado.charAt(posicionCaracter);
                }
                textoTraducidoBuilder.append(caracter);
                cont++;
                
            }
            
            }while (cont < vueltas);
            System.out.println(" ");
            System.out.println("Digame un texto: ");
            System.out.println(textoMayusculas);

            System.out.println("El texto original:" + textoMayusculas);
            System.out.println("El texto traducido:" + textoTraducido);
            

        } else if (cifrar.equals("D")) {
            //DESCRIFRADO
            
            for (int i = 0; i < textoTraducido.length(); i++) {
                char caracter = textoTraducido.charAt(i);
                int posicionCaracter = alfabetoCifrado.indexOf(caracter);

                if (posicionCaracter >= 0) {
                    caracter = alfabeto.charAt(posicionCaracter);

                }

                textoTraducidoBuilder.append(caracter);
            }
            textoTraducido = textoTraducidoBuilder.toString();

            System.out.println(" ");
            System.out.println("Digame un texto: ");
            System.out.println(textoTraducido);
            textoTraducido = textoTraducidoBuilder.toString();
            System.out.println("El texto original:" + textoMayusculas);
            System.out.println("El texto traducido:" + textoTraducido);
        }

    }

}
