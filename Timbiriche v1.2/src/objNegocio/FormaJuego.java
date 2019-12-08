/**
 * Paquete objNegocio
 */
package objNegocio;

/**
 * Clase FormaJuego.java la cual hereda de la clase Forma.java
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class FormaJuego extends Forma {

    /**
     * Definimos la instancia de la clase Jugador.
     */
    private Jugador jgdr;

    /**
     * Constructor que recibe las dimensiones del juego. Recibe la
     * anchura,altura, eje X y eje Y.
     *
     * @param anchura Anchura del cuadro.
     * @param altura Altura del cuadro.
     * @param ejeX Eje X del cuadro.
     * @param ejeY Eje Y del cuadro.
     */
    public FormaJuego(int anchura, int altura, int ejeX, int ejeY) {
        super(anchura, altura, ejeX, ejeY);
    }

    /**
     * Constructor que recibe las dimensiones del juego y el jugador. Recibe los
     * atributos del constructor anterior y tambien inicializa el parametro con
     * el atributo jugador.
     *
     * @param anchura
     * @param altura
     * @param ejeX
     * @param ejeY
     * @param jgdr
     */
    public FormaJuego(int anchura, int altura, int ejeX, int ejeY, Jugador jgdr) {
        super(anchura, altura, ejeX, ejeY);
        this.jgdr = jgdr;
    }

    /**
     * Método de tipo Jugador el cual nos regresa al Jugador.
     *
     * @return Nos regresa al jugador del juego.
     */
    public Jugador getJgdr() {
        return jgdr;
    }

    /**
     * Método de tipo void que recibe un parámetro de tipo jugador, el cual lo
     * asigna al Jgdr.
     *
     * @param jgdr Parámetro jugador.
     */
    public void setJgdr(Jugador jgdr) {
        this.jgdr = jgdr;
    }
}
