package tarea05.clases;

/**
 * Clase que nos servirá para la configuración del sistema
 *
 * @author Profe
 */
public class Configuracion {

    //Numero maximo de pizzas
    public final static int NUMEROMAX_PIZZAS = 3;
    //Precios según tamaños.
    final static float BASE_PEQUENHA = 5f;
    final static float BASE_MEDIANA = 9f;
    final static float BASE_GRANDE = 13f;

    //Precios según el tipo de pizza.
    final static float PIZZA_MARGARITA = 1f;
    final static float PIZZA_CARBONARA = 4f;
    final static float PIZZA_BARBACOA = 6f;
    final static float PIZZA_4ESTACIONES = 5f;

    public void configuracionInicial() {
        System.out.println("Parámetros de configuración de la aplicación- Pedido pizzas");
        System.out.println("Número máximo de pizzas por pedido: " + NUMEROMAX_PIZZAS);
        System.out.println("Precio de base pequeña: " + BASE_PEQUENHA);
        System.out.println("Precio de base pequeña: " + BASE_MEDIANA);
        System.out.println("Precio de base pequeña: " + BASE_GRANDE);

    }

}
