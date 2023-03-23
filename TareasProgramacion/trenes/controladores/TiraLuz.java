package trenes.controladores;

import java.io.InputStream;
import java.util.Random;

/**
 * Clase TiraLuz.
 *
 * Esta clase hereda de la clase ControlServicio e implementa la interfaz
 * Modificable (implementa los métodos aumentar() y disminiur()) y la interfaz
 * Activable (implementa los métodos on() y off()). Representa una tira o
 * columna de luces del vagón. Este control presenta como atributos un valor de
 * estado para saber si la tira está encendida o no. La ubicación de la tira de
 * luces. Un valor entero entre 0 y 100 para controlar la intensidad de la luz.
 * Así como, tres valores enteros entre 0 y 255 (ambos inclusive) para
 * determinar el color que se quiere establecer de la tira de luz, siguiendo el
 * sistema RGB (Rojo, Verde, Azul).
 *
 * Además para gestionar posibles funcionalidades aleatorias de la tira,
 * presenta un atributo de clase de tipo Random para generar esa aleatoriedad.
 *
 * @author David - IES Trassierra
 * @version 1.0
 */
public class TiraLuz extends ControlServicio implements Modificable, Activable {

    /*
     * Atributo aleatorio. 
     */
    Random sb = new Random();
    private int Aleatorio;

    /*
     * Atributo encendida.
     * 
     */
    private boolean encendida;

    /*
     * Atributo ubicacionTira. 
     */
    private String ubicacionTira;

    /*
     * Atributo intensidadTira. 
     */
    private int intensidadTira;

    /*
     * Atributo colorAzul.
     */
    private int colorAzul;

    /*
     * Atributo colorVerde.
     */
    private int colorVerde;

    /*
     * Atributo colorRojo. 
     */
    private int colorRojo;

    /**
     * * Constructor con siete parámetros de TiraLuz.
     *
     * @param encendida -Estado de la tira de luz (Encendida/true o
     * Apagada/false)
     * @param ubicacionTira -Ubicación fisica de la tira de luz
     * @param intensidadTira -Valor numerico de la intensidad de la Tira
     * @param colorAzul - Cantidad de Azul de la Tira de Luz
     * @param colorVerde -Cantidad de Verde de la Tira de Luz
     * @param colorRojo -Cantidad de Rojo de la Tira de Luz
     * @param nombreDelServicio - Nombre del Servicio.
     *
     */
    public TiraLuz(boolean encendida, String ubicacionTira, int intensidadTira, int colorAzul, int colorVerde, int colorRojo, String nombreDelServicio) {

        this.encendida = encendida;
        this.ubicacionTira = ubicacionTira;
        this.intensidadTira = intensidadTira;
        this.colorAzul = colorAzul;
        this.colorVerde = colorVerde;
        this.colorRojo = colorRojo;
    }

    /**
     ** Constructor con cuatro parámetros de TiraLuz.
     *
     * @param encendida -Estado de la tira de luz (Encendida/true o
     * Apagada/false)
     * @param ubicacionTira -Ubicación fisica de la tira de luz
     * @param intensidadTira -Valor numerico de la intensidad de la Tira
     * @param nombreDelServicio - Nombre del Servicio.
     *
     */
    public TiraLuz(boolean encendida, String ubicacionTira, int intensidadTira, String nombreDelServicio) {
        super.setNombreControlServicios("TiraLuz Vagon 1");
        super.setTipoControlServicio("TiraLuz");

        this.encendida = encendida;
        this.ubicacionTira = ubicacionTira;
        this.intensidadTira = intensidadTira;
    }

    /**
     * Constructor por defecto
     *
     *
     */
    public TiraLuz() {
        this(false, "Izquierda", 0, "TiraLuz");

    }

    /**
     * Método observador (getter) estado de la tira de luz
     *
     * @return Muestra el estado actual de la tira de Luz
     */
    public String getencendida() {

        if (this.encendida == true) {
            return " Encendida";
        } else {
            return " Apagada";
        }
    }

    /**
     * Método modificador (setter) estado para la tira
     *
     * @param encendida valor booleano para el nuevo estado de la tira de luz.
     *
     */
    public void setencendida(Boolean encendida) {
        if (encendida) {
            try {
                on();
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        } else {
            try {
                off();
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }
        this.encendida = encendida;
    }

    /**
     * Método observador (getter) ubicación de la tira
     *
     * @return ubicacionTira - Indica donde se encuentra la tira de luz
     */
    public String getUbicacionTira() {
        return ubicacionTira;
    }

    /**
     * Método modificador (setter) nueva ubicación a la tira
     *
     * @param ubicacionTira - Modifica el lugar de la tira de luz
     */
    public void setUbicacionTira(String ubicacionTira) {
        this.ubicacionTira = ubicacionTira;
    }

    /**
     * Método observador (getter) que devuelve la intensidad de brillo
     *
     * @return intensidadTira - Indica el valor de la intensidad del brillo de
     * Tira de Luz
     */
    public int getIntensidadTira() {
        return intensidadTira;
    }

    /*
        
     */
    /**
     * Método modificador (setter) nueva intensidad de brillo
     *
     * @param intensidadTira - Modifica el valor de la intensidad del brillo de
     * la Tira de Luz
     */
    public void setIntensidadTira(int intensidadTira) {
        this.intensidadTira = intensidadTira;
    }

    /**
     * Método observador (getter)cantidad de color azul
     *
     * @return Indica la cantidad de color azul de la tira de Luz
     */
    public int getColorAzul() {
        return colorAzul;
    }

    /**
     * Método modificador (setter) cantidad de color azul
     *
     * @param colorAzul Modifica la cantidad de color azul de la tira de Luz
     *
     */
    public void setColorAzul(int colorAzul) {
        this.colorAzul = colorAzul;
    }

    /**
     * Método observador (getter) la cantidad de color verde
     *
     * @return colorVerde- Indica la cantidad de color azul de la tira de Luz
     *
     */
    public int getColorVerde() {
        return colorVerde;
    }

    /**
     * Método modificador (setter) cantidad de color verde
     *
     * @param colorVerde Modifica la cantidad de color verde de la tira de Luz
     */
    public void setColorVerde(int colorVerde) {
        this.colorVerde = colorVerde;
    }

    /**
     * Método observador (getter) cantidad de color rojo
     *
     * @return ColorRojo - Indica la cantidad de color Rojo de la tira de Luz
     */
    public int getColorRojo() {
        return colorRojo;
    }

    /**
     * Método modificador (setter) color rojo
     *
     * @param colorRojo -Modifica la cantidad de color Rojo de la tira de Luz
     */
    public void setColorRojo(int colorRojo) {
        this.colorRojo = colorRojo;
    }

    /**
     * Método estático generarColorAleatorio Aleatorio - Saca un numero
     * aleatorio del 0 al 255
     */
    public void generarColorAleatorio() {
        Aleatorio = sb.nextInt(256);
    }

    /**
     * Método cambiarColorTira sin parámetros
     *
     * @return Cadena de valores de la cantidad de cada uno de los tres colores
     */
    public String getcambiarColorTira() {
        return colorAzul + "," + colorRojo + "," + colorVerde;
    }

    /**
     * Método cambiarColorTira que asigna valores pasados como parámetro para
     * cambiar los valores de los atributos rojo, verde y azul
     *
     */
    public void setcambiarColorTira() {
        this.colorAzul = sb.nextInt(256);
        this.colorRojo = sb.nextInt(256);
        this.colorVerde = sb.nextInt(256);
    }

    /**
     * Implementaión del método de la interfaz Modificable para aumentar la
     * intensidad en 10 unidades.
     *
     * @throws IllegalStateException - La tira de luz ya está en su valor máximo
     *
     */
    public void aumentar() {
        intensidadTira += 10;
        if (intensidadTira == Modificable.minvalor) {
            try {

                throw new IllegalStateException("La tira de luz ya está en su valor máximo");

            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /*
     * Implementaión del método de la interfaz Modificable para disminiur la
     * intensidad en 10 unidades.
    * @throws IllegalStateException - La tira de luz ya está en su valor máximo
     */
    public void disminuir() {
        intensidadTira -= 10;
        if (intensidadTira == Modificable.minvalor) {
            try {

                throw new IllegalStateException("La tira de luz ya está en su valor mínimo");

            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Implementaión del método de la interfaz Activable para encender control
     * de servicio
     *
     * @throws IllegalStateException - Tira de Luz encendida
     *
     */
    public void on() {
        encendida = true;
        try {
            if (encendida == true) {

                throw new IllegalStateException("Tira luz ya encendida");
            } else {

            }
        } catch (IllegalStateException x) {
            System.out.println(x.getMessage());
        }

    }

    /**
     * Implementaión del método de la interfaz Activable para apagar control de
     * servicio
     *
     * @throws IllegalStateException - Tira de Luz ya apagada
     *
     */
    public void off() {
        encendida = false;
        try {
            if (encendida == false) {
                throw new IllegalStateException("Tira luz ya apagada");

            }
        } catch (IllegalStateException x) {
            System.out.println(x.getMessage());
        }
    }

    /**
     * Método toString
     *
     * @return Cadena con los valores de los atributos
     */
    public String toString() {
        return ""
                + TiraLuz.super.toString() + "\n"
                + "Luz" + "\n"
                + "   Tira Luz: " + getencendida() + "\n"
                + "   Ubicacion Tira Luz: " + getUbicacionTira() + "\n"
                + "   Intensidad Luz: " + getIntensidadTira() + "\n"
                + "   RGB: " + getcambiarColorTira() + "\n";
    }

}
