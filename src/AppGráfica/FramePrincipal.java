/*

FramePrincipal

Frame inicial de la aplicación, aquí el usuario decide si empezar a jugar, salir
del juego o abrir la ventana de acerca de

Creado por: Iván Romero Canaán

*/

package AppGráfica;

public class FramePrincipal extends javax.swing.JFrame {

    public FramePrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FarmLearn = new javax.swing.JLabel();
        jbtnSalir = new javax.swing.JButton();
        jbtnEmpezar = new javax.swing.JButton();
        jbtnAcercaDe = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farm Learn");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        FarmLearn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/farm learn.png"))); // NOI18N
        getContentPane().add(FarmLearn);
        FarmLearn.setBounds(425, 140, 450, 150);

        jbtnSalir.setBackground(new java.awt.Color(255, 102, 102));
        jbtnSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSalir);
        jbtnSalir.setBounds(420, 450, 450, 100);

        jbtnEmpezar.setBackground(new java.awt.Color(153, 255, 153));
        jbtnEmpezar.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jbtnEmpezar.setText("Empezar a Jugar");
        jbtnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEmpezarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEmpezar);
        jbtnEmpezar.setBounds(420, 340, 450, 100);

        jbtnAcercaDe.setBackground(new java.awt.Color(153, 204, 255));
        jbtnAcercaDe.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jbtnAcercaDe.setText("?");
        jbtnAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAcercaDeActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnAcercaDe);
        jbtnAcercaDe.setBounds(1210, 650, 60, 60);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/farm.jpg"))); // NOI18N
        getContentPane().add(Fondo);
        Fondo.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//------------------------------------------------------------------------------    
    
    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

//------------------------------------------------------------------------------
    
    private void jbtnAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAcercaDeActionPerformed
        AcercaDeDialog dialog = new AcercaDeDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_jbtnAcercaDeActionPerformed

    private void jbtnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEmpezarActionPerformed
        FrameJuego juego = new FrameJuego();
        juego.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnEmpezarActionPerformed

//------------------------------------------------------------------------------
    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FarmLearn;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jbtnAcercaDe;
    private javax.swing.JButton jbtnEmpezar;
    private javax.swing.JButton jbtnSalir;
    // End of variables declaration//GEN-END:variables
}
