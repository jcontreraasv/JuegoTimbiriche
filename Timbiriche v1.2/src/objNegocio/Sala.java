/**
 * Paquete objNegocio
 */
package objNegocio;

import java.util.List;

/**
 * Clase Sala.java
 *
 * EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class Sala {

    /**
     * Atributos que utilizaremos en esta clase. Tenemos los atributos de tipo
     * entero tamaño de la sala y voto. Tenemos una instancia de la clase
     * Tablero y otra de la clase Marcador. Por último tenermos una Lista de la
     * clase Jugador la cual nos servirá para obtener la lista de los jugadores.
     *
     */
    private int tam;
    private Tablero tab;
    private Marcador marc;
    private List<Jugador> jgdrs;

    /**
     * Constructor de la clase Sala la cual recibe como parámetros una instancia
     * de la clase Marcador y el tamaño de la sala. Se inicializan con los
     * atributos de la clase.
     *
     * @param marc Marcador del tablero.
     * @param tam Tamaño de la sala.
     */
    public Sala(Marcador marc, int tam) {
        this.tab = new Tablero(tam);
        this.marc = marc;
        this.tam = tam;
        this.jgdrs = this.marc.getJgdrs();
    }

    /**
     * Método de la clase Tablero el cual obtiene el tablero del juego.
     *
     * @return Regresa el tablero del juego.
     */
    public Tablero getTab() {
        return tab;
    }

    /**
     * Método que recibe como parametro una instancia de la clase Tablero, la
     * cual asigna el valor al tablero.
     *
     * @param tab Tablero del juego.
     */
    public void setTab(Tablero tab) {
        this.tab = tab;
    }

    /**
     * Método de la clase Marcador el cual obtiene el marcador del juego.
     *
     * @return Regresa el marcador del juego.
     */
    public Marcador getMarc() {
        return marc;
    }

    /**
     * Método que recibe como parámetro una instancia de la clase Marcador, la
     * cual asigna el valor del tablero.
     *
     * @param marc Marcador del juego.
     */
    public void setMarc(Marcador marc) {
        this.marc = marc;
    }

    /**
     * Método de tipo entero el cual asigna el tamaño de la sala de los
     * jugadores.
     *
     * @return El tamaño de la sala de juego.
     */
    public int getTam() {
        return tam;
    }

    /**
     * Método de tipo void que recibe como parámetro un atributo de tipo entero,
     * el cual asigna el valor del tamaño de la sala de los jugadores.
     *
     * @param tam Tamaño de la sala.
     */
    public void setTam(int tam) {
        this.tam = tam;
    }

    /**
     * Método de tipo Jugador el cual nos regresa en una lista los jugadores que
     * hay en la sala.
     *
     * @return Nos regresa una lista con los jugadores.
     */
    public List<Jugador> getJgdrs() {
        return jgdrs;
    }

    /**
     * Método de tipo void que recibe como parámetro una lista de la clase
     * Jugador, la cual asignará la lista con los jugadores correspondientes.
     *
     * @param jgdrs La lista de los jugadores.
     */
    public void setJgdrs(List<Jugador> jgdrs) {
        this.jgdrs = jgdrs;
    }

    /**
     * Método de tipo void que recibe como parámetro una instancia de la clase
     * Jugador que sirve para agregar un Jugador a la lista de los jugadores.
     *
     * @param j Jugador a agregar.
     */
    public void agregaJugador(Jugador j) {
        if (this.jgdrs.size() < this.tam) {
            this.jgdrs.add(j);
            this.marc.setJgdrs(this.jgdrs);
        }
    }
}
