/**
 * Paquete logica
 */
package logica;

import objNegocio.*;
import java.util.List;

/**
 * Clase InstanciasITM.java que hereda de la interfaz ILogica.java
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class InstanciasITM implements ILogica {

    /**
     * Definimos e inicializamos las instancias que utilizaremos, una de la
     * clase Control y otra de la clase ControlLogica.
     */
    private Control ctl = new Control();
    private ControlLogica ctlLogica = new ControlLogica();

    /**
     * Método de tipo Sala que recibe como parámetro una instancia de la clase
     * Marcador y un atributo entero. El objetivo de este método es crear una
     * sala de juego.
     *
     * @param marc Marcador de juego.
     * @param tam Tamaño.
     * @return Nos regresa la sala de juego.
     */
    @Override
    public Sala creaSala(Marcador marc, int tam) {
        return ctlLogica.creaSala(marc, tam);
    }

    /**
     * Método de tipo Sala el cual recibe como parámetro una instancia de la
     * clase Sala. Su objetivo es regresarnos la sala de juego actualizada.
     *
     * @param s Sala de juego.
     * @return Sala de juego actualizada.
     */
    @Override
    public Sala actualizaSala(Sala s) {
        return null;
    }

    /**
     * Método de tipo Jugador[] el cual recibe como parámetro una instancia de
     * la clase Sala. Su objetivo es buscar jugadores que hay dentro de la sala.
     *
     * @param s Sala de juego.
     * @return Regresa a los jugadores encontrados.
     */
    @Override
    public Jugador[] buscaJugadores(Sala s) {
        return ctlLogica.buscaJugadores(s);
    }

    /**
     * Método de tipo String que recibe como parámetro una instancia de la clase
     * Línea y otra de la clase Jugador. El objetivo de este método es poder
     * agregar una línea en el tablero del juego.
     *
     * @param l Línea del juego.
     * @param jgdr Jugador que dibuja la línea.
     * @return El jugador dibuja la línea en el tablero.
     */
    @Override
    public String agregaLinea(Linea l, Jugador jgdr) {
        return ctl.agregaLinea(l, jgdr);
    }

    /**
     * Método de tipo void que recibe como parámetros una instancia de la clase
     * Linea, otra de la clase Marcador y un atributo entero que representa el
     * turno. El objetivo de este método es detectar movimiento por parte de los
     * otros jugadores.
     *
     * @param tab Tablero de juego.
     * @param marc Marcador de la partida.
     * @param turnoJugador Turno del jugador.
     */
    @Override
    public void buscaMovimiento(Tablero tab, Marcador marc, int turnoJugador) {
        ctl.buscaMovimiento(tab, marc, turnoJugador);
    }

    /**
     * Método de tipo entero que recibe como parámetro una instancia de la clase
     * Tablero, la cual tiene como función contar todas las lineas que el
     * jugador ha dibujado en el tablero. Todas las lineas las suma y nos arroja
     * el resultado.
     *
     * @param tab Tablero de juego.
     * @return Nos regresa el total de lineas.
     */
    @Override
    public int cantidadLineasJugador(Tablero tab) {
        return ctl.cantidadLineasJugador(tab);
    }

    /**
     * Método de tipo void que recibe como parámetros una lista de la clase
     * Cuadro, una instancia de la clase Linea y otra de la clase Jugador. Tiene
     * como función verificar si hay algún movimiento por parte de cualquier
     * jugador que esté en el juego.
     *
     * @param cuadro Cuadro de juego.
     * @param line Línea del jugador.
     * @param jgdr Jugador en la partida.
     */
    @Override
    public void verficaMovimiento(List<Cuadro> cuadro, Linea line, Jugador jgdr) {
        ctl.verificaMovimiento(cuadro, line, jgdr);
    }

    /**
     * Método de tipo void que recibe una instancia de la clase Marcador, la
     * cual tiene como función iterar en la lista de jugadores para poder
     * indicar al jugador que es su turno.
     *
     * @param marc Marcador del juego.
     */
    @Override
    public void turnoJugador(Marcador marc) {
        ctl.turnoJugadores(marc);
    }
}
