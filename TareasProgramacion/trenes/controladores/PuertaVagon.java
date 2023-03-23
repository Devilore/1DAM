package trenes.controladores;

/**
 * Clase PuertaVagon.
 *
 * Esta clase hereda de la clase ControlServicio e implementa la interfaz
 * Activable (implementa los métodos on() y off()). Representa una puerta del
 * vagón. Este control presenta como atributos un valor de estado para saber si
 * la puerta está cerrada o no. La ubicación de la puerta.
 *
 * @author David - IES Trassierra
 * @version 1.0
 */
public class PuertaVagon extends ControlServicio implements Activable {

    /*
     * Atributo estadoPuertaCerrada. 
     */
    protected boolean estadoPuertaCerrada;
    /*
     * Atributo ubicacionPuerta. 
     */

    protected String ubicacionPuerta;

    /**
     * Constructor con dos parámetros de PuertaVagon.
     *
     * @param estadoPuertaCerrada -Booleano del estado de la puerta (Cerrada o
     * Abierta)
     * @param ubicacionPuerta -Nombre del lugar donde se encuentra la puerta
     */
    public PuertaVagon(boolean estadoPuertaCerrada, String ubicacionPuerta) {
        this.estadoPuertaCerrada = estadoPuertaCerrada;
        this.ubicacionPuerta = ubicacionPuerta;
    }

    /**
     * Constructor con tres parámetros de PuertaVagon.
     *
     * @param nombreControlServicios - Nombre del Control
     * @param estadoPuertaCerrada -Booleano del estado de la puerta (Cerrada o
     * Abierta)
     * @param ubicacionPuerta -Nombre del lugar donde se encuentra la puerta
     */
    public PuertaVagon(String nombreControlServicios, boolean estadoPuertaCerrada, String ubicacionPuerta) {
        super.setNombreControlServicios(nombreControlServicios);
        super.setTipoControlServicio("Puerta");
        this.estadoPuertaCerrada = estadoPuertaCerrada;
        this.ubicacionPuerta = ubicacionPuerta;
    }

    /**
     * Constructor por defecto
     *
     */
    public PuertaVagon() {
        this("Puerta Derecha", true, "Derecha");
    }

    /**
     * Método observador (getter) estado de la puerta
     *
     * @return estadoPuertaCerrada -Muestra el estado de la puerta (True/Cerrada
     * y False/Abierta)
     */
    public String getestadoPuertaCerrada() {

        if (this.estadoPuertaCerrada == true) {
            return " Estado Cerrada";
        } else {
            return " Estado Abierta";
        }
    }

    /**
     * Método modificador (setter) estado
     *
     * @param estadoPuertaCerrada -Modifica el estado de la puerta (True/Cerrada
     * y False/Abierta)
     */
    public void setEstadoPuertaCerrada(boolean estadoPuertaCerrada) {
        if (estadoPuertaCerrada == true) {

            try {

                on();

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }

        } else {

            try {

                off();

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }

        }

    }

    /**
     * Método observador (getter) ubicación de la puerta
     *
     * @return UbicacionPuerta- Muestra la ubicacion de la puerta
     */
    public String getUbicacionPuerta() {
        return ubicacionPuerta;
    }

    /**
     * Método modificador (setter) nueva ubicación a la puerta
     *
     * @param ubicacionPuerta - Modifica la ubicación de la puerta
     */
    public void setUbicacionPuerta(String ubicacionPuerta) {
        this.ubicacionPuerta = ubicacionPuerta;
    }

    /**
     * Implementaión del método de la interfaz Activable on
     *
     * @throws IllegalStateException -La puerta ya Activada (Cerrada)
     *
     */
    @Override
    public void on() throws Exception {

        if (estadoPuertaCerrada) {
            throw new Exception("La puerta ya activada (cerrada)");
        }
        estadoPuertaCerrada = true;
    }

    /**
     * Implementaión del método de la interfaz Activable off
     *
     * @throws java.lang.Exception
     * @throws IllegalStateException -La puerta ya desactivada (Abierta)
     *
     */
    @Override
    public void off() throws Exception {

        if (!estadoPuertaCerrada) {
            throw new Exception("La puerta ya desactivada (abierta)");

        }
        estadoPuertaCerrada = false;
    }

    /**
     * Método toString
     *
     * @return Cadena con los valores de los atributos
     *
     */
    public String toString() {
        return ""
                + PuertaVagon.super.toString() + "\n"
                + "Puerta Vagon Tren" + "\n"
                + "   Puerta: " + getestadoPuertaCerrada() + "\n"
                + "   Ubicacion puerta: " + getUbicacionPuerta() + "\n";
    }

}
