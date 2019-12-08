/**
 * Paquete objNegocio
 */
package objNegocio;

import java.util.Objects;

/**
 * Clase Jugador.java
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class Jugador {

    /**
     * Definimos los atributos y las instancias que utilizaremos. Tenemos un
     * atributo entero el cual representará los puntos del jugador, dos
     * atributos de tipo cadena los cuales representan el nombre del jugador y
     * su color, y por último una instancia de la clase Color la cual
     * representará el color favorito del jugador.
     */
    private int jgdrPuntos;
    private String jgdrNombre, jgdrColor;
    private Color jgdrColorPref;

    /**
     * Constructor de la clase el cual recibe el parámetro del nombre del
     * jugador. Lo inicializa con el atributo de la clase.
     *
     * @param jgdrNombre El nombre del jugador.
     */
    public Jugador(String jgdrNombre) {
        this.jgdrNombre = jgdrNombre;
    }

    /**
     * Método de tipo entero el cual regresa los puntos que lleva el jugador.
     *
     * @return Regresa los puntos del jugador.
     */
    public int getJgdrPuntos() {
        return jgdrPuntos;
    }

    /**
     * Método de tipo void que recibe un parámetro, el cuál asigna el puntaje
     * que lleva el jugador dentro del juego.
     *
     * @param jgdrPuntos Los puntos del jugador.
     */
    public void setJgdrPuntos(int jgdrPuntos) {
        this.jgdrPuntos = jgdrPuntos;
    }

    /**
     * Método de tipo cadena el cual nos regresa el nombre del jugador.
     *
     * @return Nos regresa el nombre del jugador.
     */
    public String getJgdrNombre() {
        return jgdrNombre;
    }

    /**
     * Método de tipo void que recibe un parámetro, el cual asigna el nombre del
     * jugador que está dentro del juego.
     *
     * @param jgdrNombre El nombre del jugador.
     */
    public void setJgdrNombre(String jgdrNombre) {
        this.jgdrNombre = jgdrNombre;
    }

    /**
     * Método de la clase Color el cual regresa el color preferido que
     * seleccionó el jugador.
     *
     * @return El color preferido del jugador.
     */
    public Color getJgdrColorPref() {
        return jgdrColorPref;
    }

    /**
     * Método de tipo void que recibe un parámetro, el cual asigna el color que
     * utilizará el jugador en el tablero del juego.
     *
     * @param jgdrColorPref El color de las líneas del jugador.
     */
    public void setJgdrColorPref(Color jgdrColorPref) {
        this.jgdrColorPref = jgdrColorPref;
    }

    /**
     * Método de tipo cadena el cual regresa el color por defecto del jugador.
     *
     * @return El color por defecto de las líneas.
     */
    public String getJgdrColor() {
        return jgdrColor;
    }

    /**
     * Método de tipo void que recibe un parámetro, el cual asigna el color al
     * jugador.
     *
     * @param jgdrColor El color por defecto del jugador.
     */
    public void setJgdrColor(String jgdrColor) {
        this.jgdrColor = jgdrColor;
    }

    /**
     * Método de tipo entero el cual calcula el hash de cada uno de los
     * atributos.
     *
     * @return Nos regresa el hash calculado.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.jgdrNombre);
        hash = 43 * hash + Objects.hashCode(this.jgdrColor);
        hash = 43 * hash + this.jgdrPuntos;
        hash = 43 * hash + Objects.hashCode(this.jgdrColorPref);
        return hash;
    }

    /**
     * Método de tipo booleano el cual sirve para comparar cada uno de los
     * atributos que tenemos en la clase.
     *
     * @param obj El objeto comparador.
     * @return Nos regresa cierto si son iguales, falso si son diferentes.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (this.jgdrPuntos != other.jgdrPuntos) {
            return false;
        }
        if (!Objects.equals(this.jgdrNombre, other.jgdrNombre)) {
            return false;
        }
        if (!Objects.equals(this.jgdrColor, other.jgdrColor)) {
            return false;
        }
        if (!Objects.equals(this.jgdrColorPref, other.jgdrColorPref)) {
            return false;
        }
        return true;
    }

    /**
     * Método de tipo cadena el cual regresa el nombre del jugador.
     *
     * @return Regresa el nombre del jugador.
     */
    @Override
    public String toString() {
        return this.jgdrNombre;
    }
}
