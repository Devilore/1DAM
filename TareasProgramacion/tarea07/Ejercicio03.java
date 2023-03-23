package tarea07;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Ejercicio 3. La mascota del mes
 *
 * @author Profesor
 */
public class Ejercicio03 {

    public static void main(String[] args) {

        //----------------------------------------------
        //    Declaración de variables y constantes
        //----------------------------------------------
        // Constantes
        final int MESES = 12;

        //----------------------------------------------
        //               Entrada de datos 
        //----------------------------------------------
        // No se piden datos al usuario, ya que se usa un número fijo de elementos aleatorios
        System.out.println("LA MASCOTA DEL MES");
        System.out.println("-------------------");

        //----------------------------------------------
        //                  Procesamiento
        //----------------------------------------------
        //Primero creamos la fecha
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.of(2023, 1, 1);

        //Luego el mapa el cual sale sin el formato indicado
        LinkedHashMap<LocalDate, Mascota> MascotaMes = new LinkedHashMap<LocalDate, Mascota>();

        for (int e = 1; e < 13; e++) {
            fecha = LocalDate.of(2023, e, 1);
            if (!MascotaMes.containsValue(Utilidades.mascotaAleatoria())){
            MascotaMes.putIfAbsent(fecha, Utilidades.mascotaAleatoria());
            }
        }

        //----------------------------------------------
        //           Salida de resultados
        //----------------------------------------------
        System.out.printf("Contenido final del mapa de mascotas organizado por fechas:\n\n");
        //Consegui el formato indicado pero no se como referenciarlo sin poner todo el codigo.
        for (Map.Entry<LocalDate, Mascota> entrada : MascotaMes.entrySet()) {
            LocalDate clave = entrada.getKey();
            Mascota valor = entrada.getValue();
            System.out.println("Fecha: " + clave.format(formato) + " " + valor);
            System.out.println();
        }

    }

}
