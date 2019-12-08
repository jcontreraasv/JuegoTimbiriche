/**
 * Paquete GUI
 */
package GUI;

import objNegocio.*;
import logica.*;

/**
 * Clase ComponentesSala.java
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class ComponentesSala {

    /**
     * Definimos una instancia de la interfaz ILogica.
     */
    ILogica ctl = new InstanciasITM();

    /**
     * Método de tipo ISala el cual recibe como parámetro una instancia de la
     * clase Jugador y un atributo de tipo entero. El objetivo de este método es
     * el poder crear la sala de juego junto con sus componentes
     * correspondientes.
     *
     * @param jugadorLider Jugador que lidera la partida.
     * @param tam Tamaño de la sala.
     * @return Nos regresa la sala con sus componentes.
     */
    public ISala creaSala(Jugador jugadorLider, int tam) {
        Marcador marc = new Marcador(jugadorLider, tam);
        Sala s = ctl.creaSala(marc, tam);
        SalaGUI salaGUI = new SalaGUI(s);

        salaGUI.agregaComponentes(new Puntaje(s));
        salaGUI.agregaComponentes(new BotonTablero(s, jugadorLider));
        salaGUI.agregaComponentes(new BotonMenuSalir(jugadorLider, salaGUI));

        salaGUI.actualizaSala();

        return salaGUI;
    }
}
