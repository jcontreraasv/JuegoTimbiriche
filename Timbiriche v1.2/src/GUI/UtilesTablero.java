/**
 * Paquete GUI
 */
package GUI;

import objNegocio.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase UtilesTablero.java
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class UtilesTablero {

    /**
     * Método de tipo Punto el cual recibe los parametros las dimensiones del
     * cuadro de juego. La función de este método es el crear los puntos que
     * estarán en el tablero o lienzo del juego, que es donde el jugador podrá
     * dibujar lineas.
     *
     * @param altura Altura del cuadro.
     * @param anchura Anchura del cuadro.
     * @param tam Tamaño del cuadro.
     * @param esp Espacio entre los puntos.
     * @return Puntos en el tablero.
     */
    public static List<Punto> crearPts(double altura, double anchura, double tam, double esp) {
        List<Punto> pts = new ArrayList<>();

        for (double i = (altura * .03); i <= (altura * .97); i += esp) {
            for (double j = (anchura * .03); j <= (anchura * .97); j += esp) {
                pts.add(new Punto((int) tam, (int) tam, (int) i, (int) j));
            }
        }
        return pts;
    }

    /**
     * Método de tipo Línea e cual recibe como parámetro las dimensiones del
     * cuadro de juego. La función de este método es el poder crear lineas
     * horizontales en los puntos que hay en el tablero.
     *
     * @param alto Altura del cuadro.
     * @param ancho Anchura del cuadro.
     * @param tam Tamaño del cuadro.
     * @param esp Espacio entre los puntos.
     * @param cantPts Cantidad de puntos.
     * @return
     */
    public static List<Linea> crearLsHorizontales(double alto, double ancho, double tam, double esp, int cantPts) {
        List<Linea> lineasVerticales = new ArrayList<>();

        double alt = (alto * .03);
        for (int i = 0; i < cantPts; i++) {
            for (double j = (ancho * .03); j < ((ancho * .97) - esp);
                    j += esp) {
                lineasVerticales.add(new Linea((int) (esp - tam), (int) tam, (int) (j + tam), (int) alt));
            }
            alt += esp;
        }
        return lineasVerticales;
    }

    /**
     * Método de tipo Línea e cual recibe como parámetro las dimensiones del
     * cuadro de juego. La función de este método es el poder crear lineas
     * verticales en los puntos que hay en el tablero.
     *
     * @param alto Altura del cuadro.
     * @param ancho Anchura del cuadro.
     * @param tam Tamaño del cuadro.
     * @param esp Espacio entre los puntos.
     * @param cantPts Cantidad de puntos.
     * @return
     */
    public static List<Linea> crearLsVerticales(double alto, double ancho, double tam, double esp, int cantPts) {
        List<Linea> lHorizontales = new ArrayList<>();
        double anchura = (ancho * .03);
        for (int i = 0; i < cantPts; i++) {
            for (double j = (alto * .03); j < ((alto * .97) - esp);
                    j += esp) {
                lHorizontales.add(new Linea((int) tam,
                        (int) (esp - tam), (int) anchura, (int) (j + tam)));
            }
            anchura += esp;
        }
        return lHorizontales;
    }

    /**
     * Método de tipo Cuadro el cual recibe como parametros las lineas en listas
     * de la clase línea horizontales, verticales, atributos como el tamaño,
     * espacio entre puntos y cantidad. La función de este método es el poder
     * crear cuadros una vez que el jugador haya dibujado cuatro lineas a su
     * favor en el lienzo.
     *
     * @param lHorizontales Lineas horizontales.
     * @param lVerticales Lineas verticales.
     * @param tam Tamaño del cuadro o lienzo.
     * @param esp Espaciado entre los puntos.
     * @param cant Cantidad de puntos.
     * @return Nos regresa el cuadro del jugador en el lienzo.
     */
    public static List<Cuadro> crearCuadros(List<Linea> lHorizontales, List<Linea> lVerticales, double tam, double esp,
            int cant) {
        List<Cuadro> cuadro = new ArrayList<>();

        for (int i = 0; i < cant - 1; i++) {
            int ind = i;
            for (int j = i * (cant - 1); j < i * (cant - 1) + (cant - 1); j++) {
                cuadro.add(new Cuadro(lHorizontales.get(j),
                        lHorizontales.get(j + (cant - 1)),
                        lVerticales.get(ind),
                        lVerticales.get(ind + (cant - 1)),
                        (int) (esp - tam), (int) (esp - tam),
                        (int) (lHorizontales.get(j).getEjeX()),
                        (int) (lHorizontales.get(j).getEjeY() + tam)));
                ind += (cant - 1);
            }
        }
        return cuadro;
    }

    /**
     * Método de tipo doble que recibe como parametros un atributo de tipo
     * entero que representa la cantidad de puntos y otro atributo de tipo doble
     * que representa la altura. La función de este método es el poder calcular
     * el espaciado entre los puntos del tablero, dependiendo del lienzo que
     * escoja el Host.
     *
     * @param cantPts Cantidad de puntos en el tablero.
     * @param altura Altura del tablero.
     * @return Nos regresa el espacio entre puntos.
     */
    public static double espaciadoPuntosTab(int cantPts, double altura) {
        switch (cantPts) {
            case 10:
                return (altura * .92) / 9;
            case 20:
                return (altura * .92) / 19;
            case 40:
                return (altura * .92) / 39;
            default:
                return 0;
        }
    }

    /**
     * Método de tipo línea el cual recibe como parámetro el eje x, el eje y,
     * instancias de la clase Linea,Jugador y atributos de tipo doble, los
     * cuales representan el espaciado y el tamaño. La función de este método es
     * buscar alguna línea que hay dentro del polígono.
     *
     * @param ejeX Eje X.
     * @param ejeY Eje Y.
     * @param lHorizontales Lineas horizontales del tablero.
     * @param lVerticales Lineas verticales del tablero.
     * @param jugador Jugador.
     * @param esp Espaciado.
     * @param tam Tamaño del tablero.
     * @return La línea dentro del polígono.
     */
    public static Linea buscaLinea(int ejeX, int ejeY, List<Linea> lHorizontales, List<Linea> lVerticales, Jugador jugador,
            double esp, double tam) {
        for (int i = 0; i < (lHorizontales.size() + lVerticales.size()) / 2; i++) {

            Linea lHorizontal = lHorizontales.get(i);
            Linea lVertical = lVerticales.get(i);

            Color clr = Color.decode(jugador.getJgdrColorPref().getClrs().get(0));

            Figura frmPVertical = new Figura(lVertical, clr);
            Figura frmPHorizontal = new Figura(lHorizontal, clr);

            if (dentroPoligono(frmPHorizontal, ejeX, ejeY, esp, tam)) {
                return lHorizontal;
            }

            if (dentroPoligono(frmPVertical, ejeX, ejeY, esp, tam)) {
                return lVertical;
            }
        }
        return null;
    }

    /**
     * Método de tipo booleano el cual recibe como parámetro una instancia de la
     * clase Figura, los ejes X y Y, el espaciado y el tamaño. El objetivo de
     * este método es el recibir las coordenadas.
     *
     * @param frm Forma de la figura.
     * @param ejeX Eje X.
     * @param ejeY Eje Y.
     * @param esp Espaciado.
     * @param tam Tamaño.
     * @return Nos regresa las coordenadas.
     */
    private static boolean dentroPoligono(Figura frm, int ejeX, int ejeY, double esp, double tam) {
        int x1 = frm.getFrm().getEjeX();
        int y1 = frm.getFrm().getEjeY();

        int x2 = 0, y2 = 0;

        if (frm.getFrm().getAltura() < frm.getFrm().getAnchura()) {
            x2 = frm.getFrm().getEjeX() + (int) esp;
            y2 = frm.getFrm().getEjeY() + (int) tam;
        } else {
            x2 = frm.getFrm().getEjeX() + (int) tam;
            y2 = frm.getFrm().getEjeY() + (int) esp;
        }

        return ((ejeX > x1 && ejeX < x2) && (ejeY > y1 && ejeY < y2));
    }
}
