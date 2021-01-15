
package OTRAS_FUNCIONES;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Ficheros_Directorios extends javax.swing.JDialog {

    Crear_Ficheros_Directorios c = new Crear_Ficheros_Directorios();
    private Timer t;
    private ActionListener al;
    
    public Ficheros_Directorios(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.lblIndicacion.setText("<html><p>Si es la primera vez que tu abres el programa,"
                + " puedes dar clic en el botón para crear los directorios y ficheros que contendran"
                + " los registros. Si no es la primera vez, te recomendamos no volver a crearlos"
                + " ya que podrías perder los registros y tendras que volver a registrar tus materias y"
                + " tareas.</p></html>");
        cursoCreacionFD();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pbCreandoFichDir = new javax.swing.JProgressBar();
        btnCrearFDir = new javax.swing.JButton();
        lblIndicacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(pbCreandoFichDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 400, 25));

        btnCrearFDir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCrearFDir.setText("Crear ficheros y directorios");
        btnCrearFDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFDirActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearFDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        lblIndicacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblIndicacion.setForeground(new java.awt.Color(255, 255, 255));
        lblIndicacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIndicacion.setText("Indicacion");
        jPanel1.add(lblIndicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 400, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void cursoCreacionFD(){
        
            al = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (pbCreandoFichDir.getValue() < 100) {
                    pbCreandoFichDir.setValue(pbCreandoFichDir.getValue()+1);
                    
                } else {
                    t.stop();
                    c.crearDirectorios();
                    c.crearFicherosRegTareas();
                    c.crearFicherosRegMaterias();
                    JOptionPane.showMessageDialog(null,"Directorios y ficheros creados exitosamente!!");
                }
            }
        };
        t = new Timer(95, al);      
    }
    
    private void btnCrearFDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFDirActionPerformed
        if(!t.isRunning()){
            t.start();           
        }        
    }//GEN-LAST:event_btnCrearFDirActionPerformed


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
            java.util.logging.Logger.getLogger(Ficheros_Directorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ficheros_Directorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ficheros_Directorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ficheros_Directorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ficheros_Directorios dialog = new Ficheros_Directorios(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCrearFDir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIndicacion;
    public javax.swing.JProgressBar pbCreandoFichDir;
    // End of variables declaration//GEN-END:variables
}
