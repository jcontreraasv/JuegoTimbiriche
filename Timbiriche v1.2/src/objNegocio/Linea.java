/**
 * Paquete objNegocio
 */
package objNegocio;

/**
 * Clase Linea.java que hereda de la clase FormaJuego
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class Linea extends FormaJuego {

    /**
     * Constructor que recibe los parametros de la clase FormaJuego, los cuales
     * son la anchura, altura, ejeX y ejeY.
     *
     * @param anchura Anchura del tablero del juego.
     * @param altura Altura del tablero del juego.
     * @param ejeX EjeX del tablero del juego.
     * @param ejeY EjeY del tablero del juego.
     */
    public Linea(int anchura, int altura, int ejeX, int ejeY) {
        super(anchura, altura, ejeX, ejeY);
    }

    /**
     * Constructor que recibe los parametros de la clase FormaJuego, los cuales
     * son la anchura, altura, ejeX, ejeY y el jugador.
     *
     * @param anchura Anchura del tablero del juego.
     * @param altura Altura del tablero del juego.
     * @param ejeX EjeX del tablero del juego.
     * @param ejeY EjeY del tablero del juego.
     * @param jgdr El jugador.
     */
    public Linea(int anchura, int altura, int ejeX, int ejeY, Jugador jgdr) {
        super(anchura, altura, ejeX, ejeY, jgdr);
    }
}
