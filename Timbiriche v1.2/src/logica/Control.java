/**
 * Paquete logica
 */
package logica;

import objNegocio.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Control.java
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
class Control {

    /**
     * Método de tipo String que recibe como parámetro una instancia de la clase
     * Línea y otra de la clase Jugador. El objetivo de este método es poder
     * agregar una línea en el tablero del juego.
     *
     * @param line Línea del juego.
     * @param jgdr Jugador que dibuja la línea.
     * @return El jugador dibuja la línea en el tablero.
     */
    public String agregaLinea(Linea line, Jugador jgdr) {
        if (line.getJgdr() == null) {
            line.setJgdr(jgdr);
        } else {
            return "La línea seleccionada está ocupada.";
        }
        return "";
    }

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
    public void buscaMovimiento(Tablero tab, Marcador marc, int turn) {
        Linea lIndex = null;

        verificaMovimiento(tab.getCuadro(), lIndex, marc.getJgdrs().get(turn));
    }

    /**
     * Método de tipo entero que recibe como parámetro una instancia de la clase
     * Tablero, la cual tiene como función contar todas las lineas que el
     * jugador ha dibujado en el tablero. Todas las lineas las suma y nos arroja
     * el resultado.
     *
     * @param tablero Tablero de juego.
     * @return Nos regresa el total de lineas.
     */
    public int cantidadLineasJugador(Tablero tablero) {
        int lVerticales = 0, lHorizontales = 0;

        for (Linea lHorizontal : tablero.getlHorizontales()) {
            if (lHorizontal.getJgdr() != null) {
                lHorizontales = lHorizontales + 1;
            }
        }

        for (Linea lVertical : tablero.getlVerticales()) {
            if (lVertical.getJgdr() != null) {
                lVerticales = lVerticales + 1;
            }
        }
        return lVerticales + lHorizontales;
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
    public void verificaMovimiento(List<Cuadro> cuadro, Linea line, Jugador jgdr) {
        List<Cuadro> cuadroTemp = new ArrayList<>();

        for (Cuadro c : cuadro) {
            if (c.tieneLineaCuadro(line)) {
                if (c.getJgdr() == null) {
                    cuadroTemp.add(c);
                }
            }
        }

        for (Cuadro c : cuadroTemp) {
            if (c.cuadroCompleto()) {
                c.setJgdr(jgdr);
                jgdr.setJgdrPuntos(jgdr.getJgdrPuntos() + 1);
            }
        }
    }

    /**
     * Método de tipo void que recibe una instancia de la clase Marcador, la
     * cual tiene como función iterar en la lista de jugadores para poder
     * indicar al jugador que es su turno.
     *
     * @param marcador Marcador del juego.
     */
    public void turnoJugadores(Marcador marcador) {
        marcador.turnoSiguienteJugador();
    }
}
