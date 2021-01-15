package VENTANAS_PRINCIPALES;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewJDialog extends javax.swing.JDialog {

    Objetos objetos = new Objetos();
    Metodos metodos = new Metodos();
    DefaultTableModel mdlTabla;
    Vector vCabeceras = new Vector();
    //DefaultTableModel tabla;

    public NewJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);

        this.tblTabla.setModel(metodos.listaObjetos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuItEditar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDato1 = new javax.swing.JTextField();
        txtDato2 = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        menuItEditar.setText("Editar");
        menuItEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItEditarActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuItEditar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 80, -1));

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 70, -1));

        tblTabla.setBackground(new java.awt.Color(255, 0, 0));
        tblTabla.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblTabla.setForeground(new java.awt.Color(255, 255, 255));
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Objeto 1", "Objeto 2"
            }
        ));
        tblTabla.setComponentPopupMenu(jPopupMenu1);
        tblTabla.setRowHeight(30);
        jScrollPane1.setViewportView(tblTabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 470, 180));

        jLabel1.setText("Dato 1:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 50, -1));

        jLabel2.setText("Dato 2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 50, -1));
        jPanel1.add(txtDato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 190, 30));
        jPanel1.add(txtDato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 190, 30));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jButton1.setText("Formatear contenido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        try {
            mdlTabla = new DefaultTableModel();
            String obj1 = txtDato1.getText();
            String obj2 = txtDato2.getText();

            objetos.setOb1(obj1);
            objetos.setOb2(obj2);

            //metodos.guardar(objetos);
            metodos.guardarArchivo(objetos);
            JOptionPane.showMessageDialog(null, "Información guardada correctamente!");
            this.txtDato1.setText("");
            this.txtDato2.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la operación...");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        this.tblTabla.setModel(metodos.listaObjetos());
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void menuItEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItEditarActionPerformed
        int f = this.tblTabla.getSelectedRow();
        this.txtDato1.setText(this.tblTabla.getValueAt(f, 0).toString());
        this.txtDato2.setText(this.tblTabla.getValueAt(f, 1).toString());
        
        String Ob1 = this.tblTabla.getValueAt(f, 0).toString();
        String Ob2 = this.tblTabla.getValueAt(f, 1).toString();
        String linea = Ob1+"|"+Ob2;
        metodos.buscarLinea(linea);
    }//GEN-LAST:event_menuItEditarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            mdlTabla = new DefaultTableModel();
            String obj1 = txtDato1.getText();
            String obj2 = txtDato2.getText();

            objetos.setOb1(obj1);
            objetos.setOb2(obj2);
            
            metodos.actualizarLinea(objetos);
            JOptionPane.showMessageDialog(null, "Información actualizada correctamente!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la operación...");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        metodos.borrarContenido();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJDialog dialog = new NewJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuItEditar;
    public javax.swing.JTable tblTabla;
    public javax.swing.JTextField txtDato1;
    public javax.swing.JTextField txtDato2;
    // End of variables declaration//GEN-END:variables
}
