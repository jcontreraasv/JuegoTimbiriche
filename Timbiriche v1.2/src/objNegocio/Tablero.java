/**
 * Paquete objNegocio
 */
package objNegocio;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Tablero.java
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class Tablero {

    /**
     * Definimos el atributo entero para la dimensión del tablero y las listas
     * las cuales son instancias de las clases anteriores. Nos servirán para
     * hacer que el tablero funcione adecuadamente.
     */
    private int dim;
    private List<Cuadro> cuadro;
    private List<Punto> punto;
    private List<Linea> lHorizontales;
    private List<Linea> lVerticales;

    /**
     * Constructor que recibe como parámetro un atributo de tipo entero, el cual
     * indicará el tamaño del tablero, ya sea para 2,3 o 4 jugadores,
     * dependiendo de lo que seleccione el Host de la partida.
     *
     * @param tam Tamaño del tablero de la partida.
     */
    public Tablero(int tam) {
        cuadro = new ArrayList<>();
        punto = new ArrayList<>();
        lHorizontales = new ArrayList<>();
        lVerticales = new ArrayList<>();

        switch (tam) {
            case 2:
                this.dim = 10;
                break;
            case 3:
                this.dim = 20;
                break;
            case 4:
                this.dim = 40;
                break;
        }
    }

    /**
     * Constructor que recibe las dimensiones del tablero, las líneas, el cuadro
     * y los puntos que conformarán el tablero de juego.
     *
     * @param dim Dimensión del tablero.
     * @param lHorizontales Lineas Horizontales del tablero.
     * @param lVerticales Líneas Verticales del tablero.
     * @param cuadro Cuadros que realiza el jugador en el tablero.
     * @param punto Puntos que conforman el tablero.
     */
    public Tablero(int dim, List<Linea> lHorizontales, List<Linea> lVerticales, List<Cuadro> cuadro, List<Punto> punto) {
        this.dim = dim;
        this.lHorizontales = lHorizontales;
        this.lVerticales = lVerticales;
        this.cuadro = cuadro;
        this.punto = punto;
    }

    /**
     * Método de tipo entero que recibe las dimensiones del tablero.
     *
     * @return Regresa las dimensiones.
     */
    public int getDim() {
        return dim;
    }

    /**
     * Método de tipo void que recibe como parámetro las dimensiones del juego,
     * el cual sirve para asignar el valor absoluto de la dimension.
     *
     * @param dim Dimensión de juego.
     */
    public void setDim(int dim) {
        this.dim = dim;
    }

    /**
     * Método de tipo Cuadro el cual nos regresa en una lista el Cuadro del
     * juego.
     *
     * @return El cuadro de juego.
     */
    public List<Cuadro> getCuadro() {
        return cuadro;
    }

    /**
     * Método de tipo void que recibe como parámetro una lista de la clase
     * Cuadro, la cual asigna el valor de la lista cuadro.
     *
     * @param cuadro Cuadro de juego.
     */
    public void setCuadro(List<Cuadro> cuadro) {
        this.cuadro = cuadro;
    }

    /**
     * Método de tipo Punto el cual nos regresa en una lista los Puntos del
     * juego.
     *
     * @return Los puntos del juego.
     */
    public List<Punto> getPunto() {
        return punto;
    }

    /**
     * Método de tipo void que recibe como parámetro una lista de la clase
     * Punto, la cual asigna el valor de la lista punto.
     *
     * @param punto Punto de juego.
     */
    public void setPunto(List<Punto> punto) {
        this.punto = punto;
    }

    /**
     * Método de tipo Linea el cual nos regresa en una lista la línea que son
     * horizontales del juego.
     *
     * @return Las líeneas horizontales del tablero.
     */
    public List<Linea> getlHorizontales() {
        return lHorizontales;
    }

    /**
     * Método de tipo void que recibe como parámetro una lista de la clase
     * Linea, la cual asigna el valor de la lista de las lineas lHorizontales.
     *
     * @param lHorizontales Lista linea horizontal de juego.
     */
    public void setlHorizontales(List<Linea> lHorizontales) {
        this.lHorizontales = lHorizontales;
    }

    /**
     * Método de tipo Linea el cual nos regresa en una lista la línea que son
     * verticales del juego.
     *
     * @return Las líneas verticales del tablero.
     */
    public List<Linea> getlVerticales() {
        return lVerticales;
    }

    /**
     * Método de tipo void que recibe como parámetro una lista de la clase
     * Linea, la cual asigna el valor de la lista de las lineas lVerticales.
     *
     * @param lVerticales Lista linea Vertical de juego.
     */
    public void setlVerticales(List<Linea> lVerticales) {
        this.lVerticales = lVerticales;
    }
}
