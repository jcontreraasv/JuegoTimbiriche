/**
 * Paquete objNegocio
 */
package objNegocio;

/**
 * Clase Cuadro.java la cual hereda de la clase FormaJuego.java
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class Cuadro extends FormaJuego {

    /**
     * Definimos las instancias de la clase Linea.
     */
    private Linea arriba, abajo, izq, der;

    /**
     * Constructor de la clase Cuadro el cual recibe como parametros las
     * coordenadas y las lineas.
     *
     * @param arriba Línea arriba.
     * @param abajo Línea abajo.
     * @param izq Línea izquierda.
     * @param der Línea derecha.
     * @param anchura Anchura del cuadro.
     * @param altura Altura del cuadro.
     * @param ejeX Eje X de nuestro cuadro.
     * @param ejeY Eje Y de nuestro cuadro.
     */
    public Cuadro(Linea arriba, Linea abajo, Linea izq, Linea der, int anchura, int altura, int ejeX, int ejeY) {
        super(anchura, altura, ejeX, ejeY);
        this.arriba = arriba;
        this.abajo = abajo;
        this.izq = izq;
        this.der = der;
    }

    /**
     * Método de tipo booleano el cual recibe como parámetro las lineas que son
     * requeridas.
     *
     * @param lineaBuscada La línea requerida.
     * @return Nos regresa las lineas buscadas, o sea de todos los lados que
     * requerimos(arriba o abajo o izquierda o derecha).
     */
    public boolean tieneLineaCuadro(Linea lineaBuscada) {
        return arriba.equals(lineaBuscada) || abajo.equals(lineaBuscada) || izq.equals(lineaBuscada) || der.equals(lineaBuscada);
    }

    /**
     * Método de tipo caracter el cual regresa la inicial del jugador.
     *
     * @return Nos regresa la primera letra del nombre del usuario dentro del
     * cuadro.
     */
    public char obtenerInicial() {
        return this.getJgdr().getJgdrNombre().charAt(0);
    }

    /**
     * Método de tipo booleano el cual especifica si un cuadro está completo en
     * todas sus dimensiones.
     *
     * @return El cuadro terminado.
     */
    public boolean cuadroCompleto() {
        return arriba.getJgdr() != null && abajo.getJgdr() != null && izq.getJgdr() != null && der.getJgdr() != null;
    }
}
