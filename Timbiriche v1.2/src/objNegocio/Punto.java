/**
 * Paquete objNegocio
 */
package objNegocio;

/**
 * Clase Punto.java que hereda de la clase Forma.
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class Punto extends Forma {

    /**
     * Constructor que recibe como parametros los atributos de la clas forma,
     * los cuales son la anchura, la altura, el ejeX y el ejeY de los puntos del
     * tablero.
     *
     * @param anchura Anchura del tablero.
     * @param altura Altura del tablero.
     * @param ejeX EjeX del tablero.
     * @param ejeY EjeY del tablero.
     */
    public Punto(int anchura, int altura, int ejeX, int ejeY) {
        super(anchura, altura, ejeX, ejeY);
    }
}
