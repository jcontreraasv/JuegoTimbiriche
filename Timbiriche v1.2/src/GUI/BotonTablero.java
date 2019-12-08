/**
 * paquete GUI
 */
package GUI;

import objNegocio.*;
import logica.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JOptionPane;

/**
 * Clase BotonTablero.java que hereda de la interfaz ISala, la clase
 * MouseListener y MouseMotionListener.
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class BotonTablero extends javax.swing.JPanel implements ISala, MouseListener, MouseMotionListener {

    /**
     * Definimos las instancias que utilizaremos e inicializamos la instancia
     * ILogica y Linea.
     */
    private Sala s;
    private ILogica ctl = new InstanciasITM();
    private Jugador jgdr;
    private Linea lTemp = null;
    //private Puntaje puntos;

    /**
     * Constructor que recibe como parámetro una instancia de la clase Sala y
     * otro de la clase Jugador.
     *
     * @param s Instancia de la clase Sala.
     * @param jgdr Instancia de la clase Jugador.
     */
    public BotonTablero(Sala s, Jugador jgdr) {
        initComponents();
        addMouseListener(this);
        addMouseMotionListener(this);
        this.s = s;
        this.jgdr = jgdr;
    }

    /**
     * Método de tipo void el cual se encarga de actualizar la sala de juego y
     * pintar si es que se necesita.
     */
    @Override
    public void actualizaSala() {
        establecerTab();
        this.repaint();
    }

    /**
     * Método void que tiene como parámetro una instancia de la clase Graphics y
     * tiene como objetivo pintar los de color negro las lineas horizontales o
     * verticales dentro del cuadro de juego.
     *
     * @param graficos Graficos del juego.
     */
    @Override
    public void paintComponent(Graphics graficos) {
        super.paintComponent(graficos);
        Graphics2D graphics = (Graphics2D) graficos;

        graphics.setBackground(Color.BLACK);

        for (Punto p : this.s.getTab().getPunto()) {
            Figura p1 = new Figura(p, Color.BLACK);
            p1.render(graficos);
        }

        for (Linea lHorizontal : this.s.getTab().getlHorizontales()) {
            if (lHorizontal.getJgdr() != null) {
                Figura p1 = new Figura(lHorizontal, Color.decode(lHorizontal.getJgdr().getJgdrColor()));
                p1.render(graficos);
            }
        }

        for (Linea lVertical : this.s.getTab().getlVerticales()) {
            if (lVertical.getJgdr() != null) {
                Figura p1 = new Figura(lVertical, Color.decode(lVertical.getJgdr().getJgdrColor()));
                p1.render(graficos);
            }
        }
        int tam = 200 / this.s.getTab().getDim();

        for (Cuadro c : this.s.getTab().getCuadro()) {
            if (c.getJgdr() != null) {
                Figura p1 = new Figura(c, Color.decode(c.getJgdr().getJgdrColor()));
                p1.render(graficos);

                graphics.setFont(new Font("Roboto", Font.BOLD, tam));
                graphics.setColor(Color.black);
                graphics.drawString(
                        String.valueOf(c.obtenerInicial()).toUpperCase(),
                        c.getEjeX() + c.getAnchura() / 2,
                        c.getEjeY() + c.getAltura() / 2);
            }
        }
        if (lTemp != null) {
            Figura p1 = new Figura(lTemp, Color.decode(this.jgdr.getJgdrColor()));
            p1.render(graficos);
        }
    }

    /**
     * Método de tipo void el cual establece el tablero de juego con sus
     * dimensiones (anchura,altura y ambos ejes).
     */
    public void establecerTab() {
        int cant = this.s.getTab().getDim();
        int tam = 200 / this.s.getTab().getDim();
        double esp = UtilesTablero.espaciadoPuntosTab(cant, this.getHeight());

        if (this.s.getTab().getPunto().isEmpty()) {
            this.s.getTab().setPunto(UtilesTablero.crearPts(this.getHeight(), this.getWidth(), tam, esp));
            this.s.getTab().setlHorizontales(UtilesTablero.crearLsHorizontales(this.getHeight(), this.getWidth(),
                    tam, esp, cant));
            this.s.getTab().setlVerticales(UtilesTablero.crearLsVerticales(this.getHeight(), this.getWidth(), tam, esp, cant));
            this.s.getTab().setCuadro(UtilesTablero.crearCuadros(this.s.getTab().getlHorizontales(), this.s.getTab().getlVerticales(),
                    tam, esp, cant));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método de tipo void el cual tiene como parámetro una instancia de la
     * clase MouseEvent la cual tiene como función realizar la línea una vez que
     * el jugador haya hecho click en el tablero y si es posible.
     *
     * @param me Instancia MouseEvent.
     */
    @Override
    public void mouseClicked(MouseEvent me) {
        int X = me.getX();
        int Y = me.getY();

        System.out.println(X + "/" + Y);

        int cant = this.s.getTab().getDim();
        int tam = 200 / this.s.getTab().getDim();
        double esp = UtilesTablero.espaciadoPuntosTab(cant, this.getHeight());

        Linea line = UtilesTablero.buscaLinea(X, Y, this.s.getTab().getlHorizontales(), this.s.getTab().getlVerticales(),
                jgdr, esp, tam);

        if (line != null) {
            String agregaLine = ctl.agregaLinea(line, jgdr);
            if (!agregaLine.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(this, "No puede dibujar sobre esta linea", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                ctl.verficaMovimiento(this.s.getTab().getCuadro(), line, jgdr);

                for (int i = 0; i < this.s.getMarc().getJgdrs().size(); i++) {
                    if (!this.s.getMarc().getJgdrs().get(i).equals(this.jgdr)) {
                        ctl.buscaMovimiento(this.s.getTab(), this.s.getMarc(), i);
                    }
                }
            }
        }
        repaint();
    }

    /**
     * Método de tipo void el cual tiene como parámetro una instancia de la
     * clase MouseEvent.
     *
     * @param me Instancia MouseEvent.
     */
    @Override
    public void mousePressed(MouseEvent me) {
    }

    /**
     * Método de tipo void el cual tiene como parámetro una instancia de la
     * clase MouseEvent.
     *
     * @param me Instancia MouseEvent.
     */
    @Override
    public void mouseReleased(MouseEvent me) {
    }

    /**
     * Método de tipo void el cual tiene como parámetro una instancia de la
     * clase MouseEvent.
     *
     * @param me Instancia MouseEvent.
     */
    @Override
    public void mouseEntered(MouseEvent me) {
    }

    /**
     * Método de tipo void el cual tiene como parámetro una instancia de la
     * clase MouseEvent.
     *
     * @param me Instancia MouseEvent.
     */
    @Override
    public void mouseExited(MouseEvent me) {
    }

    /**
     * Método de tipo void el cual tiene como parámetro una instancia de la
     * clase MouseEvent.
     *
     * @param me Instancia MouseEvent.
     */
    @Override
    public void mouseDragged(MouseEvent me) {
        mouseMoved(me);
    }

    /**
     * Método de tipo void el cual tiene como parámetro una instancia de la
     * clase MouseEvent la cual tiene como objetivo indicar que lineas podemos
     * dibujar en el tablero con el puro movimiento del cursor.
     *
     * @param me Instancia MouseEvent.
     */
    @Override
    public void mouseMoved(MouseEvent me) {
        int X = me.getX();
        int Y = me.getY();

        System.out.println(X + "/" + Y);

        int cant = this.s.getTab().getDim();
        int tam = 200 / this.s.getTab().getDim();
        double esp = UtilesTablero.espaciadoPuntosTab(cant, this.getHeight());

        lTemp = UtilesTablero.buscaLinea(X, Y, this.s.getTab().getlHorizontales(), this.s.getTab().getlVerticales(),
                jgdr, esp, tam);

        repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
