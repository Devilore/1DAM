package tarea07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Ejercicio 2. Clasificación de mascotas
 *
 * @author Profesor
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Constantes
        final int NUMERO_MASCOTAS = 10;

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios
        System.out.println("CLASIFICACIÓN DE MASCOTAS");
        System.out.println("-------------------------");

        //----------------------------------------------
        //               Procesamiento
        //----------------------------------------------
        //Creamos la lista con nuestras mascotas aleatorias
        ArrayList<Mascota> MascotasAleatorias = new ArrayList<Mascota>();

        for (int i = 0; i < NUMERO_MASCOTAS; i++) {

            MascotasAleatorias.add(Utilidades.mascotaAleatoria());
        }

        //Hacemos una lista de los perros
        ArrayList<Mascota> ListaPerros = new ArrayList<Mascota>();

        for (int i = 0; i < NUMERO_MASCOTAS; i++) {

            if (MascotasAleatorias.get(i).getTipo().equals("Perra") || MascotasAleatorias.get(i).getTipo().equals("Perro")) {

                ListaPerros.add(MascotasAleatorias.get(i));
            }
        }

        //Hacemos una lista de los gatos
        ArrayList<Mascota> ListaGatos = new ArrayList<Mascota>();

        for (int i = 0; i < NUMERO_MASCOTAS; i++) {

            if (MascotasAleatorias.get(i).getTipo().equals("Gata") || MascotasAleatorias.get(i).getTipo().equals("Gato")) {

                ListaGatos.add(MascotasAleatorias.get(i));
            }
        }
        //Hacemos una lista de machos
        ArrayList<Mascota> ListaMachos = new ArrayList<Mascota>();

        for (int i = 0; i < NUMERO_MASCOTAS; i++) {

            if (MascotasAleatorias.get(i).getSexo().equals("Macho")) {

                ListaMachos.add(MascotasAleatorias.get(i));
            }
        }
        //Hacemos una lista de hembras
        ArrayList<Mascota> ListaHembras = new ArrayList<Mascota>();

        for (int i = 0; i < NUMERO_MASCOTAS; i++) {

            if (MascotasAleatorias.get(i).getSexo().equals("Hembra")) {

                ListaHembras.add(MascotasAleatorias.get(i));
            }
        }
        //La lista final de mascotas eliminadas
        ArrayList<Mascota> ListaFinal = new ArrayList<Mascota>();
        for (int i = 0; i < NUMERO_MASCOTAS; i++) {
            ListaFinal.add(MascotasAleatorias.get(i));
        }
        ListaFinal.removeAll(ListaPerros);

        //Hacemos una lista de nombres eliminados
        ArrayList<String> ListaNombres = new ArrayList<String>();

        for (int i = 0; i < NUMERO_MASCOTAS; i++) {

            if (MascotasAleatorias.get(i).getTipo().equals("Perra") || MascotasAleatorias.get(i).getTipo().equals("Perro")) {
                ListaNombres.add(MascotasAleatorias.get(i).getNombre());

            }
        }

        //Conjunto de nombres finales sin repetir
        Set ListaNombresSinRepetir = new HashSet<>(ListaNombres);

        //Hacemos una lista de posiciones eliminadas
        ArrayList<Integer> PosicionesEliminadas = new ArrayList<Integer>();

        for (int i = 0; i < NUMERO_MASCOTAS; i++) {

            if (MascotasAleatorias.get(i).getTipo().equals("Perra") || MascotasAleatorias.get(i).getTipo().equals("Perro")) {
                PosicionesEliminadas.add(i + 1);

            }
        }

        //----------------------------------------------
        //            Salida de resultados
        //----------------------------------------------
        // Rellenamos la lista con mascotas aleatorias hasta que haya NUMERO_MASCOTAS
        System.out.println("1.Contenido inicial de la lista de mascotas");
        System.out.print(MascotasAleatorias);
        System.out.println();
        System.out.println("2.Contenido final de la lista de mascotas");
        System.out.println(ListaFinal);
        System.out.println();
        System.out.println("3.Contenido final de la lista de perr@s");
        System.out.println(ListaPerros);
        System.out.println();
        System.out.println("4.Contenido final de la lista de Gat@s");
        System.out.println(ListaGatos);
        System.out.println();
        System.out.println("5.Contenido final de la lista de Machos");
        System.out.println(ListaMachos);
        System.out.println();
        System.out.println("6.Contenido final de la lista de Hembras");
        System.out.println(ListaHembras);
        System.out.println();
        System.out.println("7.Lista de nombres eliminados");
        System.out.println(ListaNombres);
        System.out.println();
        System.out.println("8.Lista de posiciones eliminadas");
        System.out.println(PosicionesEliminadas);
        System.out.println();
        System.out.println("9.Lista de nombres eliminados sin repetir");
        System.out.println(ListaNombresSinRepetir);
    }
}
