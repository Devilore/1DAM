package trenes.controladores;

/**
 * Clase ConjuntoAltavoces.
 *
 * Esta clase hereda de la clase ControlServicio e implementa la interfaz
 * Modificable (implementa los métodos aumentar() y disminiur()). Representa un
 * determinado conjunto de altavoces de un vagon. Este control presenta como
 * atributos el nombre de la pista o melodía que se está reproduciendo, así como
 * el volumen de salida de sonido del conjunto de altavoces.
 *
 * @author David - IES Trassierra
 * @version 1.0
 *
 */
public class ConjuntoAltavoces extends ControlServicio implements Modificable {

    /*
     * Atributo pistaReproduciendo. 
     */
    private String pistaReproduciendo;

    /*
     * Atributo volumenReproduccion.
     */
    private int volumenReproduciendo;

    /**
     * Constructor con tres parámetros de ConjuntoAltavoces.
     *
     * @param volumenReproduciendo Numero del volumen al que se reproduce la
     * musica
     * @param pistaReproduciendo Nombre de la musica que se encuentra
     * reproduciendose
     * @param valorInicial Numero inicial del volumen de la musica.
     *
     */
    public ConjuntoAltavoces(int valorInicial, String pistaReproduciendo, int volumenReproduciendo) {

        this.volumenReproduciendo = volumenReproduciendo;
        this.pistaReproduciendo = pistaReproduciendo;
    }

    /**
     * Constructor por defecto
     *
     */
    public ConjuntoAltavoces() {
        this(0, "Desconocida", 0);

    }

    /**
     * Constructor con dos parámetros de ConjuntoAltavoces.
     *
     * @param volumenReproduciendo Numero del volumen al que se reproduce la
     * musica
     * @param pistaReproduciendo Nombre de la musica que se encuentra
     * reproduciendose
     *
     *
     */
    public ConjuntoAltavoces(String pistaReproduciendo, int volumenReproduciendo) {
        super.setNombreControlServicios("Altavocex Vagon");
        super.setTipoControlServicio("Altavoz");
        this.pistaReproduciendo = pistaReproduciendo;
        this.volumenReproduciendo = volumenReproduciendo;
    }

    /**
     * Método observador (getter) pista o melodia que se está reproduciendo
     *
     * @return pistaReproduciendo Pista en reproducción actualmente.
     *
     */
    public String getPistaReproduciendo() {
        return pistaReproduciendo;
    }

    /**
     * Método modificador (setter) el nombre de la nueva pista
     *
     * @param pistaReproduciendo - nombre de la nueva pista que se va a
     * reproducir en el control de servicio.
     *
     */
    public void setPistaReproduciendo(String pistaReproduciendo) {
        this.pistaReproduciendo = pistaReproduciendo;
    }

    /**
     * Método observador (getter) volumen actual
     *
     * @return volumenReproducciendo Volumen actual de reproducción
     *
     */
    public int getVolumenReproduciendo() {
        return volumenReproduciendo;
    }

    /**
     * Método modificador (setter) nuevo volumen de reproducción
     *
     * @param volumenReproduciendo - Nuevo volumen de reproducción.
     *
     */
    public void setVolumenReproduciendo(int volumenReproduciendo) {
if (volumenReproduciendo >= Modificable.minvalor && volumenReproduciendo <= Modificable.maxvalor) {

            this.volumenReproduciendo = volumenReproduciendo;

        }

     }
     

    /**
     * Implementación del método de la interfaz Modificable para aumentar el
     * volumen en 1. Aumentar in interface Modificable
     *
     * @throws Exception - si el altavoz ya está en su valor máximo
     * de volumen
     *
     */
    public void aumentar() {
        volumenReproduciendo += 1;
        if (volumenReproduciendo == Modificable.maxvalor) {
            try {

                throw new Exception("El volumen de reproducción ya está en su valor máximo (100%)");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Implementaión del método de la interfaz Modificable para disminiur el
     * volumen en 1. Disminuir in interface Modificable
     *
     * @throws Exception - si el altavoz ya está en su valor mínimo
     * de volumen
     *
     */
    public void disminuir() {
        volumenReproduciendo -= 1;
        if (volumenReproduciendo == Modificable.minvalor) {
            try {

                throw new Exception("El volumen de reproducción ya está en su valor minimo (0%)");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    /**
     * Método toString Cadena con los valores de los atributos
     */
    public String toString() {

        return ""
                + ConjuntoAltavoces.super.toString() + "\n"
                + "Conjunto altavoces" + "\n"
                + "   Sonido Reproduciendo: " + getPistaReproduciendo() + "\n"
                + "   Volumen: " + getVolumenReproduciendo() + "\n";

    }

}
