package trenes.controladores;

/**
 * Interfaz Modificable.
 *
 * Esta interfaz representa a la funcionalidad de elementos que se puedan
 * cambiar o modificar su estado aumentando o disminuyendo algún parámetro, es
 * decir, subir o bajar el volumen, aumentar o disminuir la intensidad,
 * opacidad, etc. A los elementos que puedan presentar variaciones de valor en
 * algún parámetro.
 *
 * @author David - IES Trassierra
 * @version 1.0
 */
public interface Modificable {

    /**
     * Mínimo valor posible para el estado del control de servicio:
     **/
    final public int minvalor=0;
    
    /**
     * Máxima valor posible para el estado del control de servicio:
     **/
    final public int maxvalor=100;
    
     /**
     * Definición del método para aumentar un parámetro
     * @throws java.lang.Exception
     **/
   void aumentar () throws Exception;
    
    /**
     * Definición del método para disminuir un parámetro
     * @throws java.lang.Exception
     **/
    void disminuir () throws Exception;
    
}
