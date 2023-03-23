package tarea07;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Ejercicio 4. Clasificación de mascotas coincidentes
 *
 * @author Profesor
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Constantes
        final int NUMERO_MASCOTAS = 20;

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios
        System.out.println("CLASIFICACIÓN DE COINCIDENTES");
        System.out.println("-----------------------------");

        // Rellenamos la lista con mascotas aleatorias hasta que haya NUMERO_MASCOTAS
        //----------------------------------------------
        //                 Procesamiento
        //----------------------------------------------
        //Hacemos una primera lista de 20 Mascotas Aleatorias
        ArrayList<Mascota> Lista1Mascotas = new ArrayList<Mascota>(NUMERO_MASCOTAS);
        for (int i = 0; i < NUMERO_MASCOTAS; i++) {
            Lista1Mascotas.add(Utilidades.mascotaAleatoria());
        }

        //Hacemos una segunda lista de 20 Mascotas Aleatorias
        ArrayList<Mascota> Lista2Mascotas = new ArrayList<Mascota>(NUMERO_MASCOTAS);
        for (int i = 0; i < NUMERO_MASCOTAS; i++) {
            Lista2Mascotas.add(Utilidades.mascotaAleatoria());
        }
        
        //Hacemos un map y buscamos los nombres en la misma posicion
        LinkedHashMap<String, Integer> MapNombres = new LinkedHashMap<String, Integer>();
        for (int i = 0; i < NUMERO_MASCOTAS; i++) {
        if (Lista1Mascotas.get(i).getNombre().equals(Lista2Mascotas.get(i).getNombre())){
        MapNombres.put(Lista1Mascotas.get(i).getNombre(),i+1 );
        }
        }
        //----------------------------------------------
        //           Salida de resultados
        //----------------------------------------------
        System.out.println("Contenido inicial de la lista de Mascotas1");
        System.out.println(Lista1Mascotas);
        System.out.println();
        System.out.println("Contenido inicial de la lista de Mascotas2");
        System.out.println(Lista2Mascotas);
        System.out.println();
        System.out.println("Clasificacion de coincidencias");
        System.out.println(MapNombres);

    }

}
