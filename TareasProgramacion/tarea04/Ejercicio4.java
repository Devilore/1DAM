package tarea04;

import java.util.StringTokenizer;

/**
 *
 * @author luisnavarro
 */
//parsea notas y las mete en matriz, calcula medias, etc y si aprobados
public class Ejercicio4 {

    private enum Asignaturas {
        LENGUA, MATEMATICAS, INGLES, HISTORIA, FISICA, LATIN
    };

    public static void main(String[] args) {

        final int NUMERO_ALUMNOS = 30;
        final int NUMERO_NOTAS = 6;
        String NOTAS_ALUMNOS = "6,6,0,4,10,8\n"
                + "7,7,7,4,2,4\n"
                + "4,7,1,2,3,5\n"
                + "5,10,5,8,5,7\n"
                + "6,3,4,2,1,6\n"
                + "4,8,8,8,8,9\n"
                + "2,4,0,4,5,4\n"
                + "3,1,8,9,8,7\n"
                + "5,3,2,8,7,9\n"
                + "7,3,1,2,8,4\n"
                + "6,8,2,6,10,4\n"
                + "3,3,7,5,6,9\n"
                + "1,7,10,2,1,2\n"
                + "3,5,3,4,8,9\n"
                + "2,3,1,1,2,10\n"
                + "3,1,2,6,3,9\n"
                + "2,9,9,7,0,8\n"
                + "8,9,8,8,2,0\n"
                + "2,4,3,7,6,1\n"
                + "8,0,5,4,7,1\n"
                + "8,8,5,7,1,6\n"
                + "8,0,6,4,10,1\n"
                + "5,6,9,1,2,7\n"
                + "5,6,7,8,6,4\n"
                + "0,7,9,4,9,5\n"
                + "6,4,9,2,8,5\n"
                + "5,1,3,1,10,3\n"
                + "6,6,10,0,2,8\n"
                + "4,7,9,5,3,8\n"
                + "2,5,6,6,8,1";
        //-----------
        //Procesamiento
        //-----------
        //1. Primero debemos crear un tokenizer de alumnos para reccorer y dividir en subcadenas
        StringTokenizer notasAlumnos = new StringTokenizer(NOTAS_ALUMNOS, "\n");
        int i = 0;
        int j = 0;

        int[][] matrizNotas = new int[NUMERO_ALUMNOS][NUMERO_NOTAS];

        while (notasAlumnos.hasMoreTokens()) {
            //1.1 Extraer individualmente cada nota de alumnos (String)
            String notaAlumno = notasAlumnos.nextToken();
            //System.out.println(notaAlumno);

            //1.2 Mediante otro StringTokenizer extraemos las 6 notas de esa cadena con el separador ejemplo (,)
            StringTokenizer calificaciones = new StringTokenizer(notaAlumno, ",");
            j = 0;
            //1.3 Recorremos mientras existan tokens sin recorrer
            while (calificaciones.hasMoreTokens()) {

                //1.4 Leemos cada nota individual y la almacenamos para a futuro comparar y usas para las medias
                int nota = Integer.parseInt(calificaciones.nextToken());
                //System.out.print("\t" + nota);

                matrizNotas[i][j] = nota;
                j++;
                //NotasSuspensas
            }

            // System.out.println();
            i++;
        }
        int medias[] = new int[NUMERO_ALUMNOS];
        int numeroMayor = medias[0];
        for (i = 0; i < NUMERO_ALUMNOS; i++) {
            int sumaNotaas = 0;
            for (j = 0; j < NUMERO_NOTAS; j++) {
                sumaNotaas += matrizNotas[i][j];
                medias[i] = ((int) sumaNotaas / NUMERO_NOTAS);
                if (numeroMayor < medias[i]) {
                    numeroMayor = medias[i];
                }

            }
        }

        //Para hacer la media de asignaturas
        //System.out.println("-----------");
        int mediasAsignaturas[] = new int[NUMERO_NOTAS];

        for (i = 0; i < NUMERO_NOTAS; i++) {
            int sumaNotaas = 0;
            int mediaAsignatura = 0;
            for (j = 0; j < NUMERO_ALUMNOS; j++) {
                //System.out.print(matrizNotas[j][i] + " ");
                sumaNotaas += matrizNotas[j][i];
                mediasAsignaturas[i] = ((int) sumaNotaas / NUMERO_ALUMNOS);
            }

        }
        //Suspensos alumnos
        int suspensoAlumno[] = new int[NUMERO_ALUMNOS];

        for (i = 0; i < NUMERO_ALUMNOS; i++) {
            int suspenso = 0;
            for (j = 0; j < NUMERO_NOTAS; j++) {

                if (matrizNotas[i][j] <= 4) {
                    suspenso++;
                    suspensoAlumno[i] = ((int) suspenso);
                }

            }

        }
        //Suspensos alumnos
        int suspensoAsignaturas[] = new int[NUMERO_NOTAS];
        int numeroAlto = suspensoAsignaturas[0];
        for (i = 0; i < NUMERO_NOTAS; i++) {
            int suspenso = 0;
            for (j = 0; j < NUMERO_ALUMNOS; j++) {

                if (matrizNotas[j][i] <= 4) {
                    suspenso++;
                    suspensoAsignaturas[i] = ((int) suspenso);
                }

                if (numeroAlto < suspensoAsignaturas[i]) {
                    numeroAlto = suspensoAsignaturas[i];
                }
            }

        }
        //-------------
        //Salida en Pantalla
        //-------------
        System.out.println("Análisis de calificaciones y estádisticas.");
        System.out.println("He leído la cadena de texto con las 6 notas de los 30 alumnos original "
                + "y represento a cada alumno en una fila y en ella la nota de las 6 asignaturas: ");
        //Para la media por alumno

        for (i = 0; i < NUMERO_ALUMNOS; i++) {
            for (j = 0; j < NUMERO_NOTAS; j++) {
                System.out.print(matrizNotas[i][j] + "-");

            }
            if (numeroMayor == medias[i]) {

                System.out.print("----Este es el alumno con la nota más alta");

            }
            System.out.println("");
        }
        //Para la media por asignatura
        System.out.println(" ");
        System.out.println("Asignaturas:");
        for (i = 0; i < NUMERO_NOTAS; i++) {

            for (j = 0; j < NUMERO_ALUMNOS; j++) {
                //System.out.print(matrizNotas[j][i] + " ");

            }

            System.out.println("Asignatura" + (i + 1) + ",  notamedia : " + mediasAsignaturas[i] + ", numero de suspensos: " + suspensoAsignaturas[i]);
            
        }

        //Suspensas Alumnos
        System.out.println(" ");
        System.out.println("Alumnos:");
        for (i = 0; i < NUMERO_ALUMNOS; i++) {
            int suspenso = 0;
            for (j = 0; j < NUMERO_NOTAS; j++) {

                if (matrizNotas[i][j] <= 4) {
                    suspenso++;
                    suspensoAlumno[i] = ((int) suspenso);
                }

            }
            System.out.print("[Alu" + (i + 1) + ", numero de suspensas: " + suspenso + ", nota media=" + medias[i] + "]");
        }
        System.out.println("");
        for (i = 0; i < NUMERO_NOTAS; i++) {
            for (j = 0; j < NUMERO_ALUMNOS; j++) {

            }
            if (numeroAlto == suspensoAsignaturas[i]) {

                System.out.println("La asignatura con mayor numero de suspensos es la asignatura número:" + (i + 1));
            }
        }

        for (i = 0; i < NUMERO_ALUMNOS; i++) {
            for (j = 0; j < NUMERO_NOTAS; j++) {

            }
            if (numeroMayor == medias[i]) {

                System.out.println("El alumno con la media más alta es el alumno con el numero:" + (i + 1));

            }

        }

    }
}
