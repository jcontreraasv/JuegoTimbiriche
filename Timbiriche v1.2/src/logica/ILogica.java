/**
 * Paquete logica
 */
package logica;

import objNegocio.*;
import java.util.List;

/**
 * Interfaz ILogica.java
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public interface ILogica {

    /**
     * Método de tipo Sala que recibe como parámetro una instancia de la clase
     * Marcador y un atributo entero. El objetivo de este método es crear una
     * sala de juego.
     *
     * @param marc Marcador de juego.
     * @param tam Tamaño.
     * @return Nos regresa la sala de juego.
     */
    public Sala creaSala(Marcador marc, int tam);

    /**
     * Método de tipo Sala el cual recibe como parámetro una instancia de la
     * clase Sala. Su objetivo es regresarnos la sala de juego actualizada.
     *
     * @param s Sala de juego.
     * @return Sala de juego actualizada.
     */
    public Sala actualizaSala(Sala s);

    /**
     * Método de tipo Jugador[] el cual recibe como parámetro una instancia de
     * la clase Sala. Su objetivo es buscar jugadores que hay dentro de la sala.
     *
     * @param s Sala de juego.
     * @return Regresa a los jugadores encontrados.
     */
    public Jugador[] buscaJugadores(Sala s);

    /**
     * Método de tipo String que recibe como parámetro una instancia de la clase
     * Línea y otra de la clase Jugador. El objetivo de este método es poder
     * agregar una línea en el tablero del juego.
     *
     * @param form Línea del juego.
     * @param jgdr Jugador que dibuja la línea.
     * @return El jugador dibuja la línea en el tablero.
     */
    public String agregaLinea(Linea form, Jugador jgdr);

    /**
     * Método de tipo void que recibe como parámetros una lista de la clase
     * Cuadro, una instancia de la clase Linea y otra de la clase Jugador. Tiene
     * como función verificar si hay algún movimiento por parte de cualquier
     * jugador que esté en el juego.
     *
     * @param cuadros Cuadro de juego.
     * @param line Línea del jugador.
     * @param jgdr Jugador en la partida.
     */
    public void verficaMovimiento(List<Cuadro> cuadros, Linea line, Jugador jgdr);

    /**
     * Método de tipo void que recibe como parámetros una instancia de la clase
     * Linea, otra de la clase Marcador y un atributo entero que representa el
     * turno. El objetivo de este método es detectar movimiento por parte de los
     * otros jugadores.
     *
     * @param tab Tablero de juego.
     * @param marc Marcador de la partida.
     * @param turn Turno del jugador.
     */
    public void buscaMovimiento(Tablero tab, Marcador marc, int turn);

    /**
     * Método de tipo entero que recibe como parámetro una instancia de la clase
     * Tablero, la cual tiene como función contar todas las lineas que el
     * jugador ha dibujado en el tablero. Todas las lineas las suma y nos arroja
     * el resultado.
     *
     * @param tab Tablero de juego.
     * @return Nos regresa el total de lineas.
     */
    public int cantidadLineasJugador(Tablero tab);

    /**
     * Método de tipo void que recibe una instancia de la clase Marcador, la
     * cual tiene como función iterar en la lista de jugadores para poder
     * indicar al jugador que es su turno.
     *
     * @param marc Marcador del juego.
     */
    public void turnoJugador(Marcador marc);
}
