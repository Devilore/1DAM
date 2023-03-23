package tarea07;

import java.util.HashSet;
import java.util.Set;


/**
 * Ejercicio 1. Gestionando mascotas
 *
 * @author Profesor
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Constantes
        final int NUMERO_MASCOTAS = 4;

        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios
        System.out.println("CONJUNTOS DE MASCOTAS");
        System.out.println("---------------------");

        //----------------------------------------------
        //                  Procesamiento
        //----------------------------------------------
        // Rellenamos los conjuntos con aleatorios hasta que haya NUMERO_MASCOTAS
        Set<Mascota> AleatorioMascotas = new HashSet<>(NUMERO_MASCOTAS);

        for (int i = 0; i < NUMERO_MASCOTAS; i++) {

            AleatorioMascotas.add(Utilidades.mascotaAleatoria());
        }

        Set<Mascota> AleatorioMascotas2 = new HashSet<>(NUMERO_MASCOTAS);

        for (int i = 0; i < NUMERO_MASCOTAS; i++) {

            AleatorioMascotas2.add(Utilidades.mascotaAleatoria());
        }

        // Cálculo de la Unión de los dos conjuntos 
        Set<Mascota> UnionMascotas = new HashSet<>(AleatorioMascotas2);
        UnionMascotas.addAll(AleatorioMascotas);
        

        // Cálculo de la Intersección de los conjuntos
        Set<Mascota> Interseccion = new HashSet<>(UnionMascotas);
       Interseccion.retainAll(AleatorioMascotas);

        // Cálculo de la Diferencia de los conjuntos
         Set<Mascota> Diferencia = new HashSet<>(UnionMascotas);
        Diferencia.removeAll(AleatorioMascotas);
        
        
        
        
        //----------------------------------------------
        //              Salida de Resultados 
        //----------------------------------------------
        System.out.println("cONJUNTO DE MASCOTAS");
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("Conjunto Mascotas1:");
        System.out.println(AleatorioMascotas);
        System.out.println();
        System.out.println("Conjunto Mascotas2:");
        System.out.println(AleatorioMascotas2);
        System.out.println();
        System.out.println("Union Mascotas1 y Mascotas2:");
        System.out.println(UnionMascotas);
        System.out.println();
        System.out.println("Interseción  Unión y Mascota1");
        System.out.println(Interseccion);
        System.out.println("Difrencia entre Unión - Mascota1");
        System.out.println(Diferencia);

    }

}
