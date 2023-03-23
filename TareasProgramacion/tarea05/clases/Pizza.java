package tarea05.clases;

import utilidades.ES;

/**
 *
 * @author Lorena
 */
public class Pizza {

    //----------------------------------------------
    //          Declaración de variables 
    //----------------------------------------------
    //Constantes
    public static String tamaho;
    public static String tipoPizza;
    public static int numPizzas = 0;
    private static String toString;
    private static float precio;

//Para elegir
    private final int Opcion1 = 1;
    private final int Opcion2 = 2;
    private final int Opcion3 = 3;
    private final int Opcion4 = 4;
    int opcionElegida;
    int opcionElegida2;

    //Constuctores
    public Pizza(String tamaho, String tipoPizza) {
        this.tamaho = tamaho;
        this.tipoPizza = tipoPizza;
        numPizzas++;
        this.precio = precio;

    }

    //----------------------------------------------
    //               Procesamiento 
    //----------------------------------------------
    /**
     * Lanzamos en pantalla mensaje con opciones para que el usuario escoja el
     * tamaño de la pizza. Si el numero es erroneo se repetira la pregunta.
     *
     */
    public void setTamaho() {

        ES.msgln("\nTamaño de la pizza");
        ES.msgln("-------------------------");
        System.out.println("¿De que tamaño quiere la pizza?");
        ES.msgln(Opcion1 + ".- Base Pequeña.");
        ES.msgln(Opcion2 + ".- Base Mediana.");
        ES.msgln(Opcion3 + ".- Base Grande.");
        opcionElegida = ES.leeEntero("elija una opción:", 1, 3); //Leeremos un número entero entre 1 y 4.

    }

    /**
     * Lanzamos en pantalla mensaje con opciones para que el usuario escoja el
     * tipo de la pizza. Si el numero es erroneo se repetira la pregunta.
     *
     */
    public void setTipo() {
        ES.msgln("\nTipo de la pizza");
        ES.msgln("-------------------------");
        System.out.println("¿De que sabor quieres la pizza?");
        ES.msgln(Opcion1 + ".- Barbacoa.");
        ES.msgln(Opcion2 + ".- 4 Estaciones.");
        ES.msgln(Opcion3 + ".- Carbonara.");
        ES.msgln(Opcion4 + ".- Margarita");
        opcionElegida2 = ES.leeEntero("elija una opción:", 1, 4); //Leeremos un número entero entre 1 y 4.

    }

    /**
     * Se determinara el tipo de pizza segun la opcion elegida. Este tipo de
     * pizza se guardara en el objeto pizza como su atributo tipoPizza.
     *@return tipopizza
     */
    public String getTipopizza() {
        switch (opcionElegida2) {

            case Opcion1: //Crearemos una pizza segun el sabor escogido
                tipoPizza = "Barbacoa";
                break;
            case Opcion2:
                tipoPizza = "4 Estaciones";

                break;

            case Opcion3:
                tipoPizza = "Carbonara";
                break;

            case Opcion4: // Elegimos la Base Grande
                tipoPizza = "Margarita";
                break;
        }
        return tipoPizza;
    }

    /**
     * Se determinara el tamaño de pizza segun la opcion elegida. Este tipo de
     * pizza se guardara en el objeto pizza como su atributo tamaho.
     *@return tamaho
     */
    public String gettamaho() {
        switch (opcionElegida) {

            case Opcion1: //Crearemos una pizza y la guardaremos.
                tamaho = "Pequeña";
                break;
            case Opcion2: //Mostraremos las pizzas del pedido.
                tamaho = "Mediana";

                break;

            case Opcion3: // Elegimos la Base Grande
                tamaho = "Grande";
                break;

        }
        return tamaho;
    }

    /**
     * Se determinara el precio de la pizza, basandonos en los precios dados en
     * la clase configuracion. Segun las opciones elegidas se determinara el
     * tamaho y tipoPizza.
     *@return precio
     */
    public float getPrecio() {
        float[] base = {0, Configuracion.BASE_PEQUENHA, Configuracion.BASE_MEDIANA, Configuracion.BASE_GRANDE};
        float[] sabor = {0, Configuracion.PIZZA_BARBACOA, Configuracion.PIZZA_4ESTACIONES, Configuracion.PIZZA_CARBONARA, Configuracion.PIZZA_MARGARITA};
        precio = base[opcionElegida] + sabor[opcionElegida2];
        return precio;
    }

    /**
     * Resumen del objeto pizza creado especificando sus atributos tamaho,
     * tipoPizza y precio.
     */
    public String toString() {

        ES.msgln("Pizza de tamaño " + gettamaho() + ", del tipo " + getTipopizza() + ", y su precio es de " + getPrecio() + " €");

        return toString;
    }
}
