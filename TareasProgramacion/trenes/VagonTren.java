package trenes;

import trenes.controladores.ControlServicio;
import trenes.controladores.TiraLuz;

/**
 * Clase VagonTren.
 *
 * Esta clase representa un vagon de tren donde se tiene un conjunto de
 * Controles de Servicio para controlar dicho vagón. Para ello esta clase cuenta
 * con un array de objetos de tipo ControlServicio.
 *
 * @author David - IES Trassierra
 * @version 1.0
 */
public class VagonTren {

    /*
     * Atributo companyiaTrenes.
     */
    private String companyiaTrenes;

    /*
     * Atributo descripcion. 
     */
    private String descripcion;

    /*
     * Atributo servicios. 
     */
    ControlServicio[] servicios;

    private int numControles;

    private int numPuerta;

    private int numVentanilla;

    private int numAltavox;

    private int numTiraLuz;

    /**
     * Constructor con tres parámetros companyia, descripción y número de
     * controles de VagonTren.
     *
     * @param companyiaTrenes -Nombre de la Compañia de trenes
     * @param descripcion -Descripcion de la compañia
     * @param numControles -Numero de controles
     */
    public VagonTren(String companyiaTrenes, String descripcion, int numControles) {
        this.numControles = numControles;
        this.companyiaTrenes = companyiaTrenes;
        this.descripcion = descripcion;

    }

    /**
     * Constructor con tres parámetros companyia, descripción y array de objetos
     * de controles de VagonTren.
     *
     * @param companyia -Nombre de la Compañia de trenes
     * @param descripcion -Descripcion de la compañia
     * @param servicios - Nombre del servicio
     */
    public VagonTren(String companyia, String descripcion, ControlServicio[] servicios) {

        this.companyiaTrenes = companyia;
        this.descripcion = descripcion;
        this.servicios = servicios;

    }

    /**
     * Constructor por defecto
     *
     * @param controlesVagon -Array de servicios
     */
    public VagonTren(ControlServicio[] controlesVagon) {
        this("Renfe", "Compañia de Tren", 3);
    }

    /**
     * Método observador (getter) que devuelve el nombre de la compañía
     *
     * @return companyaTrenes- Muestra la compañia de trenes
     */
    public String getCompanyiaTrenes() {
        return companyiaTrenes;
    }

    /**
     * Método modificador (setter)  nombre de la compañía 
     * @param companyiaTrenes -Modifica la compañia de trenes
     */
    public void setCompanyiaTrenes(String companyiaTrenes) {
        this.companyiaTrenes = companyiaTrenes;
    }

   
    /**
     * Método observador (getter) que devuelve la descripción 
     * @return descripcion - Muestra la descripcion de la compañia de trenes
     */
    public String getDescripcion() {
        return descripcion;
    }

   
    /**
     * Método modificador (setter) que establece la descripción 
     * @param descripcion -Modifica la descripcion de la compañia de trenes
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

  
    /**
     * Método observador (getter) que devuelve el array 
     * @return servicios - Muestra valores de servicio
     */
    public ControlServicio[] getServicios() {
        return servicios;
    }


   
    /**
     * Método modificador (setter) que establece el array 
     * @param servicios -Modifica el servicio de la array
     */
    public void setServicios(ControlServicio[] servicios) {
        this.servicios = servicios;
    }

  
    /**
     * Método observador (getter)  número de elementos 
     * @return numControles -Muestra el numero de controles
     */
    public int getnumeroelementos() {
        return numControles;
    }

   

    /**
      /*
     * Método observador (getter)  numero de Controles Puerta
     * @return numPuerta -Muestra el numero de controles de Puerta
     */
    public int getnumPuerta() {
        if (servicios.equals("PuertaVagon")) {
            numPuerta++;
        }
        return numPuerta;
    }

  
    /**
     * Método observador (getter)  numero de Controles  Tira de Luz 
     * @return numtiraLuz -Muestra el numero de controles de TiraLuz
     */
    public int gettiraLuz() {
        if (servicios.equals("TiraLuz")) {
            numTiraLuz++;
        }
        return numTiraLuz;
    }

    /**
     * Método observador (getter) numero de Controles Ventanilla
     *
     * @return
     */
    public int getVentanilla() {
        if (servicios.equals("VentanillaVagon")) {
            numVentanilla++;
        }
        return numVentanilla;
    }

    /**
     * Método observador (getter) numero de Controles Conjunto Altavoces
     * @return numAltavoces -Muestra el numero de controles de TiraLuz
     */
    public int getnumAltavox() {
        if (servicios.equals("ConjuntoAltavoces")) {
            numAltavox++;
        }
        return numAltavox;
    }

    

    /**
     * Método cerrarPuertas 
     */
    public void cerrarPuertas() {

    }

  

    /**
     * Método activarTodosServicios 
     */
    public void activarTodosServicios() {

    }

  

    /**
     * Método toString 
      * @return Cadena con los valores de los atributos
     */
    public String toString() {
        return "El Vagón número 2314\n"
                + "Pertenece a: " + companyiaTrenes + " " + descripcion + "\n"
                + "Presenta los siguientes controles de servicios:";
    }
}
