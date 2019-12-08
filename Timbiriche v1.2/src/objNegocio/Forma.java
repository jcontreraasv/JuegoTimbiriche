/**
 * Paquete objNegocio
 */
package objNegocio;

/**
 * Clase Forma.java
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class Forma {

    /**
     * Definimos los atributos que utilizaremos en nuestra clase. Tenemos los
     * atributos de tipo entero anchura, altura , ejeX y ejeY.
     */
    private int anchura, altura, ejeX, ejeY;

    /**
     * Constructor de la clase el cual recibe como parámetros la anchura, altura
     * ,ejeX y el ejeY. Los igualamos con los atributos de nuestra clase.
     *
     * @param anchura La anchura de la forma del cuadro.
     * @param altura La altura de la forma del cuadro.
     * @param ejeX El ejeX de la forma del cuadro.
     * @param ejeY El ejeY de la forma del cuadro.
     */
    public Forma(int anchura, int altura, int ejeX, int ejeY) {
        this.anchura = anchura;
        this.altura = altura;
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }

    /**
     * Método de tipo entero que nos regresa la anchura.
     *
     * @return Nos regresa la anchura.
     */
    public int getAnchura() {
        return anchura;
    }

    /**
     * Método de tipo void que recibe un parámetro, el cual asigna la anchura a
     * la forma del cuadro.
     *
     * @param anchura Asigna la anchura de la forma.
     */
    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    /**
     * Método de tipo entero que nos regresa la altura.
     *
     * @return Nos regresa la altura.
     */
    public int getAltura() {
        return altura;
    }

    /**
     * Método de tipo void que recibe un parámetro, el cual asigna la altura a
     * la forma del cuadro.
     *
     * @param altura Asigna la altura de la forma.
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Método de tipo entero que nos regresa las dimensiones del eje X.
     *
     * @return Nos regresa el eje X.
     */
    public int getEjeX() {
        return ejeX;
    }

    /**
     * Método de tipo void que recibe un parámetro, el cual asigna el ejeX a la
     * forma del cuadro.
     *
     * @param ejeX Asigna el ejeX de la forma.
     */
    public void setEjeX(int ejeX) {
        this.ejeX = ejeX;
    }

    /**
     * Método de tipo entero que nos regresa las dimensiones del eje Y.
     *
     * @return Nos regresa el eje Y.
     */
    public int getEjeY() {
        return ejeY;
    }

    /**
     * Método de tipo void que recibe un parámetro, el cual asigna el ejeY a la
     * forma del cuadro.
     *
     * @param ejeY Asigna el ejeY de la forma.
     */
    public void setEjeY(int ejeY) {
        this.ejeY = ejeY;
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
        hash = 13 * hash + this.anchura;
        hash = 13 * hash + this.altura;
        hash = 13 * hash + this.ejeX;
        hash = 13 * hash + this.ejeY;
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
        final Forma other = (Forma) obj;
        if (this.anchura != other.anchura) {
            return false;
        }
        if (this.altura != other.altura) {
            return false;
        }
        if (this.ejeX != other.ejeX) {
            return false;
        }
        if (this.ejeY != other.ejeY) {
            return false;
        }
        return true;
    }
}
