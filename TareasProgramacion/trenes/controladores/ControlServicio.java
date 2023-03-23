package trenes.controladores;

/**
 * Clase abstracta ControlServicio. Servirá para agrupar todas las
 * características comunes a los diferentes controles que pueda presentar cada
 * vagón del tren.
 *
 * @author Lorena Barea - IES Trassierra
 * @version 1.0
 */
public abstract class ControlServicio {


    /*
	 * Atributo de clase numControlesConfigurados. 
     */
    private int numControlesConfigurados;

    /*
	 * Atributo inmutable idControlServicio. 
     */
    private static int idControlServicios;

    /*
	 * Atributo nombreControlServicio.
     */
    private String nombreControlServicios;

    /*
	 * Atributo tipoControlServicio. 
     */
    private String tipoControlServicios;


    /*
	 * Constructor con un parámetro de ControlServicio. //getter
     */
    /**
     *
     */
    public ControlServicio() {
    }

    /**
     * Constructor sin parámetros de ControlServicio.
     *
     * @param numControlesConfigurados -Numero de Controladores Configurados
     * @param idControlServicios -Identificador numero de los Servicios
     * @param nombreControlServicios -Nombre del Servicio
     * @param tipoControlServicios -Tipo de Control
     */
    public ControlServicio(int numControlesConfigurados, int idControlServicios, String nombreControlServicios, String tipoControlServicios) {
        this.numControlesConfigurados = numControlesConfigurados;
        this.idControlServicios = idControlServicios;
        this.nombreControlServicios = nombreControlServicios;
        this.tipoControlServicios = tipoControlServicios;
    }

    /**
     * Método estático observador (getter) el número de controles configurados
     *
     * @return numControlesConfigurados -Numero de controles configurados 
     *
     */
    public int getnumControlesConfigurados() {
        return numControlesConfigurados;
    }

    /**
     * Método estático modificador (setter) para el número de controles
     * actualmente configurados.
     *
     * @param numControlesConfigurados - Modificador numero de Controles
     * Congifurados.
     *
     */
    public void setnumControlServicios(int numControlesConfigurados) {
        this.numControlesConfigurados = numControlesConfigurados;
    }

    /**
     * Método estático observador (getter) el identificador
     *
     * @return idControlServicios - Muestra el identificador del Control
     */
    public int getidControlServicios() {
        return idControlServicios;
    }

    /**
     * Método estático observador (setter) el identificador
     *
     * @param idControlServicios - Modifica el identificador del control
     *
     */
    public void setidControlServicio(int idControlServicios) {

        this.idControlServicios = idControlServicios;

    }

    /**
     * Método estático observador (getter) nombre de control
     *
     * @return nombreControlServicios -Muestra el nombre del Control
     *
     */
    public String getNombreControlServicios() {
        return nombreControlServicios;
    }

    /**
     * Método modificador (setter) nombre de control de
     *
     * @param nombreControlServicios -Modificador del nombre del Control
     *
     *
     */
    public void setNombreControlServicios(String nombreControlServicios) {
        this.nombreControlServicios = nombreControlServicios;
    }

    /**
     * Método observador (getter) tipo de control
     *
     * @return tipoControlServicios - Muestra el tipo de Control
     *
     */
    public String getTipoControlServicios() {
        return tipoControlServicios;
    }

    /**
     * Método modificador (setter) que asigna el tipo de control
     *
     * @param tipoControlServicios - Modifica el tipo de Control
     */
    public void setTipoControlServicio(String tipoControlServicios) {

        if (tipoControlServicios.equalsIgnoreCase("Puerta") || tipoControlServicios.equalsIgnoreCase("TiraLuz")
                || tipoControlServicios.equalsIgnoreCase("Ventanilla Vagon")
                || tipoControlServicios.equalsIgnoreCase("Altavoz")) {

            this.tipoControlServicios = tipoControlServicios;

        } else {

            this.nombreControlServicios = "Desconocido";

        }

    }

    /**
     * Método toString
     *
     * @return Cadena con los valores de los atributos
     */
    public String toString() {
        return "-------------------------------------------------------------------\n"
                + "ControlServicio:\n"
                + "  Identificador: " + idControlServicios + "\n"
                + "  Nombre Servicio: " + nombreControlServicios + "\n"
                + "  Tipo de Servicio: " + tipoControlServicios;
    }

}
