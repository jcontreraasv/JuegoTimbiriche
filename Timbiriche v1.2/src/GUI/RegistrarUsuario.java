/**
 * Paquete GUI
 */
package GUI;

import objNegocio.*;
import javax.swing.JOptionPane;

/**
 * Clase RegistrarUsuario.java
 *
 * @author EQUIPO ARQUITECTURA INTEGRANTES: Jaime Sergio Efrain Jesus Ivan
 */
public class RegistrarUsuario extends javax.swing.JDialog {

    /**
     * Definimos la instancia de la clase MenuPrincipal.java
     */
    private MenuPrincipal m;
    private Jugador jgdr;
    private static RegistrarUsuario ins;

    /**
     * Constructor de la clase. Recibe como parámetro una instancia de la clase
     * MenuPrincipal y un atributo del tipo booleano.
     *
     * @param parent Instancia MenuPrincipal.
     * @param modal Atributo booleano.
     */
    public RegistrarUsuario(MenuPrincipal parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.m = parent;
        this.setLocationRelativeTo(m);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        this.setTitle("Nombre de usuario");
    }
    
        public RegistrarUsuario(MenuPrincipal parent) {
        super(parent);
        initComponents();
        this.m = parent;
        this.setLocationRelativeTo(m);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        this.setTitle("Nombre de usuario");
    }

    public static RegistrarUsuario getInstancia(MenuPrincipal m) {
        if (ins == null) {
            ins = new RegistrarUsuario(m);
        }
        ins.m = m;
        return ins;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nickname = new javax.swing.JTextField();
        Confirmar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre de usuario:");

        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nickname, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(Confirmar)
                .addGap(18, 18, 18)
                .addComponent(Salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirmar)
                    .addComponent(Salir))
                .addGap(41, 41, 41))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel3.setText("Por favor, introduzca:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método de tipo void el cual registra a un usuario con su nombre de
     * usuario y lo manda al menú principal.
     *
     * @param evt Evento a realizar.
     */
    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        String jgdrNombre = "";

        if (nickname.getText().equalsIgnoreCase("")) {
            jgdrNombre += "Nombre de usuario \r\n";
        }
        if (!jgdrNombre.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Jugador sin nombre, ingrese su username", "ERROR",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            Jugador jgdr = new Jugador(this.nickname.getText());
            Color clr = new Color("#1b1e23", "#1b1e23", "#1b1e23");
            jgdr.setJgdrColorPref(clr);
            jgdr.setJgdrColor("#1b1e23");
            m.setJgdr(jgdr);
            this.dispose();
        }
    }//GEN-LAST:event_ConfirmarActionPerformed

    /**
     * Método de tipo void el cual tiene como objetivo cancelar y salir.
     *
     * @param evt Evento a realizar.
     */
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Confirmar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nickname;
    // End of variables declaration//GEN-END:variables
}
