
package OTRAS_FUNCIONES;

/**
 *
 * @author Evelyn
 */
public class Acerca_De extends javax.swing.JDialog {

    
    public Acerca_De(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.lblPresentacion.setText("<html><p>Este programa fue desarrollado por Evelyn López Nieto</p>"
                + "<p>Versión: 1.0</p>"
                + "<p>Fecha de desarrollo: Agosto de 2019</p>"
                + "<p>Lenguaje de desarrollo: JAVA</p>"
                + "<p>Idiomas: Español</p></html>");
        this.lblPresentacion2.setText("<html><p>Sistema operativo: Windows 7 y posterior</p>"
                + "<p>Versión del JDK: JAVA 8</p>"
                + "<p>Versión del JDK para ejecución: JAVA 8 y posteriores</p></html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblPresentacion = new javax.swing.JLabel();
        rSLabelImage2 = new rojerusan.RSLabelImage();
        jSeparator1 = new javax.swing.JSeparator();
        lblPresentacion2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Bernard MT Condensed", 1, 30)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("JELNBackpack");
        lblTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 5, 290, 30));

        lblPresentacion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblPresentacion.setForeground(new java.awt.Color(255, 255, 255));
        lblPresentacion.setText("jLabel2");
        jPanel1.add(lblPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 370, 100));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/mochila2.png"))); // NOI18N
        jPanel1.add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 140, 140));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 390, -1));

        lblPresentacion2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblPresentacion2.setForeground(new java.awt.Color(255, 255, 255));
        lblPresentacion2.setText("jLabel1");
        jPanel1.add(lblPresentacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 370, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Acerca_De.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acerca_De.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acerca_De.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acerca_De.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Acerca_De dialog = new Acerca_De(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPresentacion;
    private javax.swing.JLabel lblPresentacion2;
    private javax.swing.JLabel lblTitulo;
    private rojerusan.RSLabelImage rSLabelImage2;
    // End of variables declaration//GEN-END:variables
}
