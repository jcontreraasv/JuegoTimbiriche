/**
 * Paquete objNegocio
 */
package objNegocio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase Marcador.java
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class Marcador {

    /**
     * Definimos los atributos y las instancias que utilizaremos. Tenemos un
     * atributo de tipo entero el cual indicara el tamaño, una instancia de la
     * clase Jugador para indicar el lider de la partida y una Lista de la clase
     * Jugador para indicar los jugadores de la partida.
     */
    private int tam;
    private Jugador jgdrLider;
    private List<Jugador> jgdrs;

    /**
     * Constructor que recibe los parametros y los inicializa con los atributos jgdrLider y el tamaño del marcador.
     * 
     * @param jgdrLider El jugador que lidera la partida.
     * @param tam El tamaño del marcador.
     */
    public Marcador(Jugador jgdrLider, int tam) {
        this.jgdrLider = jgdrLider;
        this.tam = tam;
        this.jgdrs = new ArrayList<>();
        this.jgdrs.add(jgdrLider);
    }

    /**
     * Método de tipo entero el cual regresa el tamaño del marcador.
     * 
     * @return Nos regresa el marcador.
     */
    public int getTam() {
        return tam;
    }

    /**
     * Método de tipo void que recibe un parámetro de tipo entero, el cual asigna el tamaño del marcador de la partida.
     * 
     * @param tam Marcador de la partida.
     */
    public void setTam(int tam) {
        this.tam = tam;
    }

    /**
     * Método de tipo Jugador el cual nos regresa el jugador que lidera la partida.
     * 
     * @return Nos regresa el jugador líder.
     */
    public Jugador getJgdrLider() {
        return jgdrLider;
    }

    /**
     * Método de tipo void que recibe un parámetro de tipo Jugador, el cual asigna el jugador líder de la partida.
     * 
     * @param jgdrLider Jugador líder de la partida.
     */
    public void setJgdrLider(Jugador jgdrLider) {
        this.jgdrLider = jgdrLider;
    }

    /**
     * Método de tipo clase Jugador el cual nos regresa en una lista los jugadores que hay dentro de la partida.
     * 
     * @return Nos regresa los jugadores en una lista.
     */
    public List<Jugador> getJgdrs() {
        return jgdrs;
    }

    /**
     * Método de tipo void que recibe como parámetro una lista, la cual asigna la lista de jugadores que hay dentro
     * de la partida.
     * 
     * @param jgdrs Jugadores de la partida.
     */
    public void setJgdrs(List<Jugador> jgdrs) {
        this.jgdrs = jgdrs;
    }

    /**
     * Método de tipo void que sirve para indicar el turno del siguiente jugador, utilizando la clase de Java Collections
     * que sirve para poder iterar en la lista de los jugadores.
     */
    public void turnoSiguienteJugador() {
        Collections.shuffle(this.jgdrs);
    }
}
