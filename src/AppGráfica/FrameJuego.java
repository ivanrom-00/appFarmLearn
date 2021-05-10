/*

FrameJuego

Frame en el que se desarrolla la actividad principal de la aplicación, aquí se 
van mostrando las imágenes de los animales que se tienen que escribir y se va
avanzando en el juego

Creado por: Iván Romero Canaán

 */
package AppGráfica;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public final class FrameJuego extends javax.swing.JFrame {

    Animal array[];
    Animal actual;
    String root = "src\\Animales\\";
    String ext = ".png";
    int c = 0;

    public FrameJuego() {
        initComponents();

        array = new Animal[10];

        array[0] = new Animal("vaca", "^[Vv]aca$", "Va");
        array[1] = new Animal("burro", "^[Bb]urro$", "Bu");
        array[2] = new Animal("gallina", "^[Gg]allina$", "Ga");
        array[3] = new Animal("oveja", "^[Oo]veja$", "Ove");
        array[4] = new Animal("perro", "^[Pp]erro$", "Pe");
        array[5] = new Animal("caballo", "^[Cc]aballo$", "Ca");
        array[6] = new Animal("pato", "^[Pp]ato$", "Pa");
        array[7] = new Animal("cerdo", "^[Cc]erdo$", "Cer");
        array[8] = new Animal("gallo", "^[Gg]allo$", "Ga");
        array[9] = new Animal("ganzo", "^[Gg]anzo$", "Gan");

        jbtnContinuar.setVisible(false);
        preparar();
    }

//------------------------------------------------------------------------------    
    public void preparar() {

        if (c < 10) {
            actual = array[c++];

            ImageIcon img = new ImageIcon(root + actual.getNombre() + ext);
            jlblAnimal.setIcon(img);

            jbtnContinuar.setVisible(false);
        } else {
            FrameFinal frame = new FrameFinal();
            frame.setVisible(true);
            this.dispose();
        }

    }

    public void encabezado() {
        jlblEncabezado.setText("¿Qué animal es este?");
        jlblEncabezado.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        jlblEncabezado.setForeground(Color.BLACK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlblEncabezado = new javax.swing.JLabel();
        jlblAnimal = new javax.swing.JLabel();
        jbtnAceptar = new javax.swing.JButton();
        jtxtAnimal = new javax.swing.JTextField();
        jbtnPista = new javax.swing.JButton();
        jbtnSalir = new javax.swing.JButton();
        jbtnContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Farm Learn");
        setBackground(new java.awt.Color(153, 255, 153));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 730));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jlblEncabezado.setFont(new java.awt.Font("Comic Sans MS", 3, 48)); // NOI18N
        jlblEncabezado.setForeground(new java.awt.Color(0, 0, 0));
        jlblEncabezado.setText("¿Qué animal es este?");

        jbtnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/check icon.png"))); // NOI18N
        jbtnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAceptarActionPerformed(evt);
            }
        });

        jtxtAnimal.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jtxtAnimal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtAnimal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtAnimalFocusGained(evt);
            }
        });

        jbtnPista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/hint icon.png"))); // NOI18N
        jbtnPista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPistaActionPerformed(evt);
            }
        });

        jbtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cross icon.png"))); // NOI18N
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jbtnContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/arrow icon.png"))); // NOI18N
        jbtnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jlblEncabezado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jbtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(jbtnPista, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(jbtnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxtAnimal)
                            .addComponent(jlblAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblEncabezado)
                .addGap(18, 18, 18)
                .addComponent(jlblAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtxtAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnPista, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        FramePrincipal principal = new FramePrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAceptarActionPerformed

        String expresion = "";

        try {
            expresion = jtxtAnimal.getText();
        } catch (Exception ex) {
            JOptionPane mensaje = new JOptionPane("Error", ERROR, ERROR);
            mensaje.setVisible(true);
        }

        boolean coincidencia = ExpresionRegular.validar(actual.getRegex(), expresion);

        if (coincidencia) {
            jlblEncabezado.setText("Muy Bien!!!");
            jlblEncabezado.setHorizontalAlignment((int) CENTER_ALIGNMENT);
            jlblEncabezado.setForeground(Color.BLUE);
            jbtnContinuar.setVisible(true);
        } else {
            jlblEncabezado.setText("Inténtanlo de nuevo");
            jlblEncabezado.setHorizontalAlignment((int) CENTER_ALIGNMENT);
            jlblEncabezado.setForeground(Color.RED);
        }


    }//GEN-LAST:event_jbtnAceptarActionPerformed

    private void jbtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnContinuarActionPerformed
        preparar();
        encabezado();
        jtxtAnimal.setText("");
    }//GEN-LAST:event_jbtnContinuarActionPerformed

    private void jtxtAnimalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtAnimalFocusGained
        encabezado();
        jbtnContinuar.setVisible(false);
    }//GEN-LAST:event_jtxtAnimalFocusGained

    private void jbtnPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPistaActionPerformed
        jtxtAnimal.setText(actual.getPista());
        jtxtAnimal.requestFocus();
    }//GEN-LAST:event_jbtnPistaActionPerformed

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
            java.util.logging.Logger.getLogger(FrameJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAceptar;
    private javax.swing.JButton jbtnContinuar;
    private javax.swing.JButton jbtnPista;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JLabel jlblAnimal;
    private javax.swing.JLabel jlblEncabezado;
    private javax.swing.JTextField jtxtAnimal;
    // End of variables declaration//GEN-END:variables
}
