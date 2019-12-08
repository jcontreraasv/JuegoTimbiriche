/**
 * Paquete GUI
 */
package GUI;

import objNegocio.*;
import logica.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 * Clase SalaGUI.java que hereda de la interfaz ISala.java
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class SalaGUI extends javax.swing.JFrame implements ISala, Runnable {

    /**
     * Definimos las instancias de la clase ILogica, una instancia volatil de
     * Sala, dos listas de JPanel y de ISala.
     */
    private ILogica juegazo = new InstanciasITM();
    private volatile Sala s;
    private List<JPanel> panel;
    private List<ISala> componentesSala;

    /**
     * Constructor de la clase que recibe como parámetro una instancia de la
     * clase Sala. Inicializa la lista componentesSala y agrega al panel lo que
     * habrá en la pantalla de juego.
     *
     * @param sala Instancia de la clase Sala.
     */
    public SalaGUI(Sala sala) {
        initComponents();
        this.setTitle("Sala de juego");
        this.setLocationRelativeTo(null);

        this.s = sala;
        this.componentesSala = new ArrayList<>();
        this.panel = new ArrayList<>();
        panelMarc.setVisible(false);

        this.panel.add(panelMarc);
        this.panel.add(panelTab);
        this.panel.add(panelFondo);
    }

    /**
     * Método de tipo void el cual recibe una instancia de la interfaz ISala.
     *
     * @param comps Componentes de la interfaz ISala.
     */
    public void agregaComponentes(ISala comps) {
        if (this.panel.size() > this.componentesSala.size()) {
            this.componentesSala.add(comps);
        }
    }

    /**
     * Método de tipo void el cual establece los componentes en el panel.
     */
    private void estableceComponentes() {
        for (int i = 0; i < this.panel.size(); i++) {
            JPanel pnlTemp = (JPanel) this.componentesSala.get(i);

            pnlTemp.setSize(this.panel.get(i).getSize());
            pnlTemp.setBorder(this.panel.get(i).getBorder());
            this.panel.get(i).add(pnlTemp);

            ((ISala) pnlTemp).actualizaSala();
            pnlTemp.setVisible(true);
            pnlTemp.repaint();
        }
    }

    /**
     * Método de tipo Sala el cual regresa una instancia de tipo Sala.
     *
     * @return Regresa una instancia de tipo Sala.
     */
    public Sala getS() {
        return s;
    }

    /**
     * Método de tipo void que recibe como parámetro una instancia de la clase
     * Sala. Asigna un valor a la instancia de sala.
     *
     * @param s Instancia de sala.
     */
    public void setS(Sala s) {
        this.s = s;
    }

    /**
     * Método de tipo void que actualiza todos los componentes de la sala.
     */
    @Override
    public void actualizaSala() {
        estableceComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMarc = new javax.swing.JPanel();
        panelTab = new javax.swing.JPanel();
        panelFondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMarc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelMarc.setPreferredSize(new java.awt.Dimension(300, 500));

        javax.swing.GroupLayout panelMarcLayout = new javax.swing.GroupLayout(panelMarc);
        panelMarc.setLayout(panelMarcLayout);
        panelMarcLayout.setHorizontalGroup(
            panelMarcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );
        panelMarcLayout.setVerticalGroup(
            panelMarcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        panelTab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTab.setMaximumSize(new java.awt.Dimension(650, 650));
        panelTab.setMinimumSize(new java.awt.Dimension(650, 650));
        panelTab.setPreferredSize(new java.awt.Dimension(650, 650));

        javax.swing.GroupLayout panelTabLayout = new javax.swing.GroupLayout(panelTab);
        panelTab.setLayout(panelTabLayout);
        panelTabLayout.setHorizontalGroup(
            panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        panelTabLayout.setVerticalGroup(
            panelTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        panelFondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(panelMarc, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(panelMarc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(panelTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelFondo;
    private javax.swing.JPanel panelMarc;
    private javax.swing.JPanel panelTab;
    // End of variables declaration//GEN-END:variables

    /**
     * Método voi run el cual corre el juego dentro del panel.
     */
    @Override
    public void run() {
        this.panelTab.getComponent(0).setVisible(false);

        Jugador[] jgdrs = null;
        while (this.s.getJgdrs().size() < this.s.getTam()) {

            jgdrs = this.juegazo.buscaJugadores(this.s);

            if (jgdrs != null) {
                this.s.agregaJugador(jgdrs[0]);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SalaGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        this.panelTab.getComponent(0).setVisible(true);

        juegazo.turnoJugador(this.s.getMarc());
        ((Puntaje) this.panelMarc.getComponent(0)).coloresPref();
        ((Puntaje) this.panelMarc.getComponent(0)).actualizaSala();
    }
}
