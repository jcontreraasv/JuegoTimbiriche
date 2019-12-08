/**
 * Paquete objNegocio
 */
package objNegocio;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Colores.java
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class Color {

    /**
     * Lista de colores.
     */
    private List<String> clrs;

    /**
     * Constructor que recibe 3 parametros los cuales son colores, donde
     * inicializamos el arreglo colores.
     *
     * @param clr2 Color 1.
     * @param clr3 Color 2.
     * @param clr4 Color 3.
     */
    public Color(String clr2, String clr3, String clr4) {
        clrs = new ArrayList<>();
        clrs.add(clr2);
        clrs.add(clr3);
        clrs.add(clr4);
    }

    /**
     * Método de tipo Lista que nos regresa todos los colores.
     *
     * @return Nos regresa los 3 colores.
     */
    public List<String> getClrs() {
        return clrs;
    }

    /**
     * Método de tipo void el cual asigna los colores a nuestra Lista de
     * colores.
     *
     * @param clrs Parametro de tipo String el cual asigna los colores.
     */
    public void setClrs(List<String> clrs) {
        this.clrs = clrs;
    }
}
