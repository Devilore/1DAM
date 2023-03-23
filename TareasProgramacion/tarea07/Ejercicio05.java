package tarea07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Ejercicio 5. Ordenación de mascotas
 *
 * @author Profesor
 */
public class Ejercicio05 {

    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Constantes
        final int NUMERO_MASCOTAS = 4;
        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------

        // No se piden datos al usuario, ya que vamos a introducir unos datos concretos
        System.out.println("ORDENACIÓN DE MASCOTAS");
        System.out.println("-----------------------------");

        // Mostramos el contenido inicial de la lista
        //----------------------------------------------
        //     Procesamiento + Salida de resultados
        //----------------------------------------------
        // Creamos la lista con las 4 mascotas
        ArrayList<Mascota> ListaOrdenar = new ArrayList<Mascota>(NUMERO_MASCOTAS);
        
        for (int i = 1; i < NUMERO_MASCOTAS; i++) {
            ListaOrdenar.add(Utilidades.mascotaAleatoria());
        }
        System.out.println("Contenido inicial de la lista");
        System.out.println(ListaOrdenar);
        // Ordenación de la lista por nombre de la mascota (alfabético) y la mostramos por pantalla
        class ComparadorMascotasPorNombre implements Comparator<Mascota>{
            
            public int compare(Mascota obj1, Mascota obj2) {
                return obj1.getNombre().compareTo(obj2.getNombre());
            }
        }
        Collections.sort(ListaOrdenar, new ComparadorMascotasPorNombre());
        System.out.println();
         System.out.println("Ordenación de la lista por nombre (Alfabetico):");
        System.out.println(ListaOrdenar);

        // Ordenación de la lista por edades y la mostramos por pantalla
         class ComparadorMascotasPorEdad implements Comparator<Mascota>{
        
            public int compare(Mascota obj1, Mascota obj2) {
		return new Integer(obj1.getEdad()).compareTo(new Integer(obj2.getEdad()));
	}
        }
        Collections.sort(ListaOrdenar, new ComparadorMascotasPorEdad());
        System.out.println();
         System.out.println("Ordenación de la lista por edad:");
        System.out.println(ListaOrdenar);
        // Ordenación de la lista por número de características de las mascotas y la mostramos por pantalla
        
         class ComparadorMascotasPorNumCaracteristicas implements Comparator<Mascota>{
        
            public int compare(Mascota obj1, Mascota obj2) {
		 return obj1.getCaracteristicas().size();
	}
        }
        Collections.sort(ListaOrdenar, new ComparadorMascotasPorNumCaracteristicas());
        System.out.println();
         System.out.println("Ordenación de la lista por número de caracteristicas que describen a la mascota:");
        System.out.println(ListaOrdenar);
    }

}
