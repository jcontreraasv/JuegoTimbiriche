/**
 * Paquete GUI
 */
package GUI;

import objNegocio.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 * Clase Figura.java
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class Figura {

    /**
     * Instancias de las clases Forma,Color y Polygon que utilizaremos.
     */
    private Forma frm;
    private Color clr;
    private Polygon forma;

    /**
     * Constructor que recibe como parámetro una instancia de la clase Forma y
     * Color, donde los inicializamos con el valor de sus instancias de clase.
     * Tambien inicializamos la instancia de la clase forma. Nos sirve para
     * tener las coordenadas de la figura.
     *
     * @param frm Instancia de la clase Forma.
     * @param clr Instancia de la clase Color.
     */
    public Figura(Forma frm, Color clr) {
        this.clr = clr;
        this.frm = frm;
        this.forma = new Polygon();

        this.forma.addPoint((int) -frm.getAnchura() / 2, (int) -frm.getAltura() / 2);
        this.forma.addPoint((int) -frm.getAnchura() / 2, (int) frm.getAltura() / 2);
        this.forma.addPoint((int) frm.getAnchura() / 2, (int) frm.getAltura() / 2);
        this.forma.addPoint((int) frm.getAnchura() / 2, (int) -frm.getAltura() / 2);
    }

    /**
     * Método de tipo void el cual tiene como parámetro una instancia de la
     * clase Graphics. Este método tiene como función renderizar los cuadros y
     * colorear el cuadro del usuario con su color correspondiente.
     *
     * @param graficos Graficos del juego.
     */
    public void render(Graphics graficos) {
        graficos.setColor(clr);

        Polygon renderizado = new Polygon();

        for (int i = 0; i < forma.npoints; i++) {
            int renderedx = (int) (forma.xpoints[i] + frm.getEjeX() + frm.getAnchura() / 2);
            int renderedy = (int) (forma.ypoints[i] + frm.getEjeY() + frm.getAltura() / 2);
            renderizado.addPoint(renderedx, renderedy);
        }

        graficos.fillPolygon(renderizado);
    }

    /**
     * Método de tipo booleano el cual recibe como parametros las coordenadas X
     * y Y. Nos regresa los puntos del juego.
     *
     * @param x Coordenadas X.
     * @param y Coordenadas Y.
     * @return Nos regresa los puntos del juego.
     */
    public boolean puntosJ(int x, int y) {
        return forma.contains(x - this.frm.getEjeX() - this.frm.getAnchura() / 2,
                y - this.frm.getEjeY() - this.frm.getAltura() / 2);
    }

    /**
     * Método de la clase Forma el cual nos regresa la forma de las coordenadas.
     *
     * @return Nos regresa forma y sus coordenadsa.
     */
    public Forma getFrm() {
        return frm;
    }

    /**
     * Método de tipo Color el cual nos regresa el color del usuario.
     *
     * @return Nos regresa el color del usuario.
     */
    public Color getClr() {
        return clr;
    }

    /**
     * Método de tipo void que recibe como parámetro una instancia de la clase
     * Color la cual asigna un valor al color del usuario.
     *
     * @param clr Color del usuario.
     */
    public void setClr(Color clr) {
        this.clr = clr;
    }

    /**
     * Método de la clase Polygon el cual nos regresa la forma de la figura.
     *
     * @return Nos regresa la forma.
     */
    public Polygon getForma() {
        return forma;
    }
}
