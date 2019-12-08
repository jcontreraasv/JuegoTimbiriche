/**
 * Paquete GUI
 */
package GUI;

import objNegocio.*;

/**
 * Clase SalaRoomGUI.java
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class SalaRoomGUI extends javax.swing.JFrame {

    /**
     * Definimos nuestros atributos. Utilizaremos una instancia de esta clase,
     * otra de la clase Jugador y otra de tipo entero para el tamaño.
     */
    private static SalaRoomGUI ins;
    private Jugador jgdr;
    private int tam;

    /**
     * Constructor que recibe como parámetro una instancia de la clase Jugador.
     * Se inicializa el atributo jugador con la instancia.
     *
     * @param jgdr Instancia de la clase Jugador.
     */
    private SalaRoomGUI(Jugador jgdr) {
        initComponents();
        this.setTitle("Tamaño del lienzo");
        this.setLocationRelativeTo(null);

        this.jgdr = jgdr;
    }

    /**
     * Método de tipo SalaRoomGUI que recibe como parámetro una instancia de la
     * clase Jugador. El objetivo de este método es instanciar en esta misma
     * clase.
     *
     * @param jgdr Jugador.
     * @return Nos regresa la instancia de la clase Jugador.
     */
    public static SalaRoomGUI getInstancia(Jugador jgdr) {
        if (ins == null) {
            ins = new SalaRoomGUI(jgdr);
        }
        ins.jgdr = jgdr;
        return ins;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Btn2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Btn2.setText("2");
        Btn2.setMaximumSize(new java.awt.Dimension(120, 120));
        Btn2.setMinimumSize(new java.awt.Dimension(120, 120));
        Btn2.setPreferredSize(new java.awt.Dimension(120, 120));
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Btn3.setText("3");
        Btn3.setMaximumSize(new java.awt.Dimension(120, 120));
        Btn3.setMinimumSize(new java.awt.Dimension(120, 120));
        Btn3.setPreferredSize(new java.awt.Dimension(120, 120));
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn4.setText("4");
        Btn4.setMaximumSize(new java.awt.Dimension(120, 120));
        Btn4.setMinimumSize(new java.awt.Dimension(120, 120));
        Btn4.setPreferredSize(new java.awt.Dimension(120, 120));
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccione el número de jugadores (lienzo):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(BtnCancelar)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método de tipo void el cual tiene como objetivo cancelar y salir.
     *
     * @param evt Evento a realizar.
     */
    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        MenuPrincipal menuP = MenuPrincipal.getInstancia(jgdr);
        menuP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    /**
     * Método de tipo void el cual tiene como objetivo crear una partida para
     * dos jugadores.
     *
     * @param evt Evento a realizar.
     */
    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        this.tam = 2;
        creaSalaJuego();
    }//GEN-LAST:event_Btn2ActionPerformed

    /**
     * Método de tipo void el cual tiene como objetivo crear una partida para
     * tres jugadores.
     *
     * @param evt Evento a realizar.
     */
    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        this.tam = 3;
        creaSalaJuego();
    }//GEN-LAST:event_Btn3ActionPerformed

    /**
     * Método de tipo void el cual tiene como objetivo crear una partida para
     * cuatro jugadores.
     *
     * @param evt Evento a realizar.
     */
    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        this.tam = 4;
        creaSalaJuego();
    }//GEN-LAST:event_Btn4ActionPerformed

    /**
     * Método de tipo void el cual se encarga de crear la sala de juego.
     */
    private void creaSalaJuego() {
        ComponentesSala s = new ComponentesSala();
        SalaGUI salaGUI = (SalaGUI) s.creaSala(jgdr, tam);
        Thread hilo = new Thread(salaGUI);

        hilo.start();
        salaGUI.setVisible(true);
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}