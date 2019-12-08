/**
 * Paquete logica
 */
package logica;

import objNegocio.*;

/**
 * Clase ControlLogica.java
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
class ControlLogica {

    /**
     * Método de tipo Sala que recibe como parámetro una instancia de la clase
     * Marcador y un atributo entero. El objetivo de este método es crear una
     * sala de juego.
     *
     * @param marc Marcador de juego.
     * @param tam Tamaño.
     * @return Nos regresa la sala de juego.
     */
    public Sala creaSala(Marcador marc, int tam) {
        Sala s = new Sala(marc, tam);
        return s;
    }

    /**
     * Método de tipo Sala el cual recibe como parámetro una instancia de la
     * clase Sala. Su objetivo es regresarnos la sala de juego actualizada.
     *
     * @param s Sala de juego.
     * @return Sala de juego actualizada.
     */
    public Sala actualizaSala(Sala s) {
        return s;
    }

    /**
     * Método de tipo Jugador[] el cual recibe como parámetro una instancia de
     * la clase Sala. Su objetivo es buscar jugadores que hay dentro de la sala.
     *
     * @param s Sala de juego.
     * @return Regresa a los jugadores encontrados.
     */
    public Jugador[] buscaJugadores(Sala s) {
        int numJugadores = (int) (Math.random() * 4 + 1);
        Jugador[] jugadores = new Jugador[1];

        Jugador jugador = new Jugador("Jugador :" + numJugadores);
        jugadores[0] = jugador;

        return jugadores;
    }
}
