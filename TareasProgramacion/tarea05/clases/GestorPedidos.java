package tarea05.clases;

import java.util.ArrayList;
import java.util.List;
import utilidades.ES;

/**
 *
 * @author profe
 */
public class GestorPedidos {

    //----------------------------------------------
    //          Declaración de variables 
    //----------------------------------------------
    //Constantes
    private final int INTRODUCIR_PIZZA = 1;
    private final int MOSTRAR_PEDIDO = 2;
    private final int FINALIZAR_PEDIDO = 3;
    private final int SALIR = 4;
    private Pizza[] pedido;
    private int numeroPedido = 0;
    private float costetotal = 0;

    public void gestionarPedidos() {//Método que mostrará el menú de la aplicación y que lanzará los diferentes métodos internos en función de lo se pida
        //Variables        
        boolean terminar = false;

        // Variables de entrada
        int opcionElegida = 0;

        //----------------------------------------------
        //               Procesamiento 
        //----------------------------------------------
        do {
            ES.msgln("\nMenú Pedido Pizza");
            ES.msgln("-------------------------");
            ES.msgln(INTRODUCIR_PIZZA + ".- Introducir pizza en el pedido.");
            ES.msgln(MOSTRAR_PEDIDO + ".- Ver estado del pedido.");
            ES.msgln(FINALIZAR_PEDIDO + ".- Finalizar Pedido.");
            ES.msgln(SALIR + ".- Apagar aplicación.");
            opcionElegida = ES.leeEntero("elija una opción:", 1, 4); //Leeremos un número entero entre 1 y 4.

            switch (opcionElegida) {

                case INTRODUCIR_PIZZA: //Crearemos una pizza y la guardaremos.
                    // Llamar al método nsertarPizzaEnPedido
                    if (Pizza.numPizzas < Configuracion.NUMEROMAX_PIZZAS) {
                        Pizza p1 = new Pizza(Pizza.tamaho, Pizza.tipoPizza);
                        nsertarPizzaEnPedido(p1);
                        pedido[Pizza.numPizzas - 1] = p1;
                        ES.msgln("Ahora hay " + Pizza.numPizzas + " Pizzas");
                    } else {
                        ES.msgln("Ya se han pedido " + Configuracion.NUMEROMAX_PIZZAS + " pizzas, no puedes pedir más");
                    }
                    break;

                case MOSTRAR_PEDIDO: //Mostraremos las pizzas del pedido.
                    //Llamar al método mostrarPedido 
                    System.out.println("Pedido:");
                    mostrarPedido();

                    break;

                case FINALIZAR_PEDIDO: // Mostraremos las pizzas del pedido, el coste y prepararemos la aplicación para un nuevo pedido.
                    //Llamar al método finalizaPedido
                    numeroPedido++;
                    finalizarPedido();
                    imprimeTicket();
                    Pizza.numPizzas = 0;
                    costetotal = 0;

                    break;

                case SALIR:
                    terminar = true;
                    break;
            }

        } while (!terminar);
        ES.msg("Finalizando aplicación...\n");
    }

    //Crear todos el resto de métodos de la clase.
    /**
     * Gestiona el pedido, añadiendo a este el numero total de pizzas para no
     * superar el maximo permitidas.
     *
     */
    public GestorPedidos() {
        pedido = new Pizza[Configuracion.NUMEROMAX_PIZZAS];
    }

    /**
     * Invoca los diferentes metodos de la clase Pizza, para insentar una pizza
     * mostrando por pantalla las preguntas en cuestion sobre su tamaño y tipo.
     * respuestas 1,2,3 o 4.
     *
     */
    public void nsertarPizzaEnPedido(Pizza p) {

        p.setTamaho();
        p.setTipo();
        p.toString();

    }

    /**
     * Muestra el carrito del pedido, indicando las pizzas elegidas y su precio.
     * Si el pedido esta vacio se indicara "El pedido aún esta vacío"
     *
     */
    public void mostrarPedido() {
        if (Pizza.numPizzas > 0) {
            StringBuilder cadena = new StringBuilder("Pedido:\n");
            for (int i = 0; i < Pizza.numPizzas; i++) {
                cadena.append(pedido[i] + "\n");
            }
        } else {
            ES.msgln("El pedido aún está vacío");
        }
    }

    /**
     * Imprime el ticket final del pedido, mostrando una simplificacion de este
     * y el coste total.
     *
     *
     */

    public void imprimeTicket() {

        ES.msgln("+--------------------------------------------+");
        ES.msgln("|              Paco´s Pizza                  |");
        ES.msgln("|               PEDIDO: 00" + numeroPedido + "                  |");
        ES.msgln("|                                            |");
        for (int i = 0; i < Pizza.numPizzas; i++) {
            ES.msgln("|        " + pedido[i].gettamaho() + " " + pedido[i].getTipopizza() + " " + pedido[i].getPrecio() + " €            ");
        }
        ES.msgln("|                                            |");
        ES.msgln("|               TOTAL: " + costetotal + " €                ");
        ES.msgln("|                                            |");
        ES.msgln("|             GRACIAS POR SU VISITA          |");
        ES.msgln("+--------------------------------------------+");
    }

    /**
     * Muestra un resumen escrito de nuestro numero de pedido, precio total y
     * nos informa.
     *
     */
    public void finalizarPedido() {
        for (int i = 0; i < Pizza.numPizzas; i++) {
            costetotal += pedido[i].getPrecio();
        }
        ES.msgln("Su número de pedido es el " + numeroPedido
                + " El total de su pedido asciende a " + costetotal + " €. Imprimiendo ticket... no olvide pasar por caja. Gracias y hasta pronto.");
    }
}
