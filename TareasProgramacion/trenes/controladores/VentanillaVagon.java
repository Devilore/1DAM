package trenes.controladores;

/**
 * Clase VentanillaVagon.
 *
 * Esta clase hereda de la clase ControlServicio e implementa la interfaz
 * Modificable (implementa los métodos aumentar() y disminiur()). Representa una
 * ventanilla del vagón. Este control presenta como atributos un valor que
 * marcará el porcentaje de opacidad de la ventanilla siendo el 0 transparente y
 * el 100 completamente opaco. La ubicación de la ventanilla.
 *
 * @author David - IES Trassierra
 * @version 1.0
 */
public class VentanillaVagon extends ControlServicio implements Modificable {

    /*
     * Atributo opacidadVentanilla. 
     */
    private int opacidadVentanilla;

    /*
     * Atributo ubicacionVentanilla.
     */
    private String ubicacionVentanilla;

    /**
     * Constructor con tres parámetros de VentanillaVagon.
     *
     * @param valorinicialopacidad -Porcentaje de opacidad inicial
     * @param opacidadVentanilla -Porcentaje actual de opacidad
     * @param ubicacionVentanilla -Ubicacion de la ventanilla
     */
    public VentanillaVagon(int valorinicialopacidad, int opacidadVentanilla, String ubicacionVentanilla) {
        super.setNombreControlServicios("Ventanilla");
        super.setTipoControlServicio("Ventanilla Vagon");
        this.opacidadVentanilla = opacidadVentanilla;
        this.ubicacionVentanilla = ubicacionVentanilla;
    }

    /**
     * Constuctor por defecto
     *
     */
    public VentanillaVagon() {
        this(0, 0, "Derecha");

    }

    /**
     * Constructor con dos parámetros de VentanillaVagon.
     *
     * @param opacidadVentanilla -Valor numerico de la opacidad de la ventanilla
     * @param ubicacionVentanilla -Nombre de la ubicacion de la ventanilla
     */
    public VentanillaVagon(int opacidadVentanilla, String ubicacionVentanilla) {
        super.setTipoControlServicio("Ventanilla Vagon");
        this.opacidadVentanilla = opacidadVentanilla;
        this.ubicacionVentanilla = ubicacionVentanilla;
    }

    /**
     * Método observador (getter) opacidad
     *
     * @return opacidadVentanilla - Valor numerico de la opacidad de la
     * ventanilla
     */
    public int getOpacidadVentanilla() {
        return opacidadVentanilla;
    }

    /**
     * Método modificador (setter) nuevo el porcentaje de opacidad .
     *
     * @param opacidadVentanilla -Modifica valor del porcentaje de la ventanilla
     */
       public void setOpacidadVentanilla(byte opacidadVentanilla) {

        if (opacidadVentanilla >= Modificable.minvalor && opacidadVentanilla <= Modificable.maxvalor) {

            this.opacidadVentanilla = opacidadVentanilla;

        }

    }

    /**
     * Método observador (getter) ubicación de la ventana
     *
     * @return ubicacionVentanilla - Devuelve el nombre de la ubicacion de la
     * ventanilla
     */
    public String getUbicacionVentanilla() {
        return ubicacionVentanilla;
    }

    /**
     * Método modificador (setter) nueva ubicación
     *
     * @param ubicacionVentanilla -Modifica ubicacion de la ventanilla
     */
    public void setUbicacionVentanilla(String ubicacionVentanilla) {
        this.ubicacionVentanilla = ubicacionVentanilla;
    }

    /**
     * Implementaión del método de la interfaz Modificable para aumentar la
     * opacidad de la ventanilla en 5 unidades.
     *
     * @throws IllegalStateException - La opacidad de la ventanilla ya está en
     * su valor máximo (100%)
     */
    @Override
    public void aumentar() {
        opacidadVentanilla += 5;
        if (opacidadVentanilla == Modificable.maxvalor) {
            try {

                throw new IllegalStateException("La opacidad de la ventanilla ya está en su valor máximo (100%)");

            } catch (IllegalStateException x) {
                System.out.println(x.getMessage());
            }
        }
    }

        /**
         * Implementaión del método de la interfaz Modificable para disminiur la
         * opacidad de la ventanilla en 5 unidades.
         *
         * @throws IllegalStateException - La opacidad de la ventanilla ya está
         * en su valor mínimo (0%)
         *
         */
        @Override
        public void disminuir () {
   
            if (opacidadVentanilla == Modificable.minvalor) {
                try {

                    throw new IllegalStateException("La opacidad de la ventanilla ya está en su valor mínimo (0%)");

                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        /**
         * Método toString
         *
         * @return Cadena con los valores de los atributos
         *
         */
    public String toString() {
        return ""
                + VentanillaVagon.super.toString() + "\n"
                + "Ventanilla Vagon Tren" + "\n"
                + "   Opacidad: " + getOpacidadVentanilla() + "\n"
                + "   Ubicacion ventanilla: " + getUbicacionVentanilla() + "\n";
    }

}
