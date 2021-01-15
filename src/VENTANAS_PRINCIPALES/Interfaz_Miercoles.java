
package VENTANAS_PRINCIPALES;

import ESTRUCTURA_GENERAL_DE_CLASES.Estructura_Miercoles;
import METODOS_DE_FUNCIONAMIENTO.Metodos_Miercoles;
import java.io.*;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSPanelsSlider;

public class Interfaz_Miercoles extends javax.swing.JDialog {
    
    Estructura_Miercoles esMi = new Estructura_Miercoles();
    Metodos_Miercoles metMie = new Metodos_Miercoles();
    Vector vCabeceras = new Vector();
    DefaultTableModel tabla;
    String tareasMiercoles = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Tareas"
                    +File.separator+"Miercoles.txt";
    
    public Interfaz_Miercoles(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/mochila1.png")).getImage());
        this.panelRegistroMaterias.setVisible(false);
        this.tblMiercoles.setModel(metMie.listaMaterias());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1HORARIO = new javax.swing.JPanel();
        jPanel2TABLAMATERIAS = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMiercoles = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panelRegistroMaterias = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtMateria = new javax.swing.JTextField();
        btnGuardarRegistroMat = new rojerusan.RSButtonHover();
        btnActualizarTabla = new rojerusan.RSButtonHover();
        btnCerrarRegistro = new rojerusan.RSButtonHover();
        rSPanelImage1COMPU = new rojerusan.RSPanelImage();
        rSbotonRegTareas = new rojerusan.RSButtonHover();
        btnRegMateria = new rojerusan.RSButtonHover();
        btnBorrarRegMat3 = new rojeru_san.complementos.RSButtonHover();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        jPanel1RegistroTareas = new javax.swing.JPanel();
        rSPanelImage1ICONOITTG = new rojerusan.RSPanelImage();
        jLabel2 = new javax.swing.JLabel();
        rSPanelImageContenido = new rojerusan.RSPanelImage();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaContenido = new javax.swing.JTextArea();
        rSbotonBloqVista = new rojerusan.RSButtonMetro();
        rSbotonEditContenido = new rojerusan.RSButtonMetro();
        rSbotonGuardarCambios = new rojerusan.RSButtonMetro();
        rSbotonVerOActualizar = new rojerusan.RSButtonMetro();
        rsbotonCancel = new rojerusan.RSButtonMetro();
        rsFecha3 = new rojeru_san.componentes.RSDateChooser();
        btnAgregarFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Miércoles - JELNBackpack");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1HORARIO.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1HORARIO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2TABLAMATERIAS.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2TABLAMATERIAS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMiercoles.setBackground(new java.awt.Color(255, 255, 0));
        tblMiercoles.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        tblMiercoles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"15:00|16:00", "TALLER DE BASES DE DATOS"},
                {"16:00|17:00", "TALLER DE BASES DE DATOS"},
                {"17:00|18:00", "GRAFICACIÓN"},
                {"18:00|19:00", "ARQUITECTURA DE COMPUTADORAS"},
                {"19:00|20:00", "*************"},
                {"20:00|21:00", "*************"}
            },
            new String [] {
                "Hora", "Miércoles"
            }
        ));
        tblMiercoles.setRowHeight(30);
        jScrollPane1.setViewportView(tblMiercoles);
        if (tblMiercoles.getColumnModel().getColumnCount() > 0) {
            tblMiercoles.getColumnModel().getColumn(0).setPreferredWidth(0);
        }

        jPanel2TABLAMATERIAS.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 530, 209));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MIÉRCOLES");
        jPanel2TABLAMATERIAS.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 300, 50));

        jPanel1HORARIO.add(jPanel2TABLAMATERIAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 50, 550, 285));

        panelRegistroMaterias.setBackground(new java.awt.Color(0, 102, 0));
        panelRegistroMaterias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hora");
        panelRegistroMaterias.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 2, 40, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Materia");
        panelRegistroMaterias.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 2, 50, -1));

        txtHora.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        panelRegistroMaterias.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 22, 105, 33));

        txtMateria.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        panelRegistroMaterias.add(txtMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 22, 300, 33));

        btnGuardarRegistroMat.setBackground(new java.awt.Color(255, 0, 0));
        btnGuardarRegistroMat.setText("Guardar");
        btnGuardarRegistroMat.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnGuardarRegistroMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegistroMatActionPerformed(evt);
            }
        });
        panelRegistroMaterias.add(btnGuardarRegistroMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 63, 85, 20));

        btnActualizarTabla.setBackground(new java.awt.Color(255, 0, 0));
        btnActualizarTabla.setText("Actualizar tabla");
        btnActualizarTabla.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnActualizarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaActionPerformed(evt);
            }
        });
        panelRegistroMaterias.add(btnActualizarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 63, 135, 20));

        btnCerrarRegistro.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrarRegistro.setText("Cerrar registro");
        btnCerrarRegistro.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCerrarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarRegistroActionPerformed(evt);
            }
        });
        panelRegistroMaterias.add(btnCerrarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 63, 130, 20));

        jPanel1HORARIO.add(panelRegistroMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 420, 90));

        rSPanelImage1COMPU.setImagen(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/compu.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1COMPULayout = new javax.swing.GroupLayout(rSPanelImage1COMPU);
        rSPanelImage1COMPU.setLayout(rSPanelImage1COMPULayout);
        rSPanelImage1COMPULayout.setHorizontalGroup(
            rSPanelImage1COMPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        rSPanelImage1COMPULayout.setVerticalGroup(
            rSPanelImage1COMPULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jPanel1HORARIO.add(rSPanelImage1COMPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 560, 470));

        rSbotonRegTareas.setBackground(new java.awt.Color(255, 0, 0));
        rSbotonRegTareas.setText("Registrar tareas");
        rSbotonRegTareas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rSbotonRegTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbotonRegTareasActionPerformed(evt);
            }
        });
        jPanel1HORARIO.add(rSbotonRegTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 150, 30));

        btnRegMateria.setBackground(new java.awt.Color(255, 0, 0));
        btnRegMateria.setText("Registrar materia");
        btnRegMateria.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRegMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegMateriaActionPerformed(evt);
            }
        });
        jPanel1HORARIO.add(btnRegMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 150, 30));

        btnBorrarRegMat3.setBackground(new java.awt.Color(255, 0, 0));
        btnBorrarRegMat3.setText("Borrar registro materias");
        btnBorrarRegMat3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBorrarRegMat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarRegMat3ActionPerformed(evt);
            }
        });
        jPanel1HORARIO.add(btnBorrarRegMat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 510, 190, 30));

        getContentPane().add(jPanel1HORARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 540));

        rSPanelsSlider1.setBackground(new java.awt.Color(0, 255, 0));
        rSPanelsSlider1.setName("rSPanelsSlider1"); // NOI18N

        jPanel1RegistroTareas.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1RegistroTareas.setName("jPanel1RegistroTareas"); // NOI18N
        jPanel1RegistroTareas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage1ICONOITTG.setImagen(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/ITTG_trans.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1ICONOITTGLayout = new javax.swing.GroupLayout(rSPanelImage1ICONOITTG);
        rSPanelImage1ICONOITTG.setLayout(rSPanelImage1ICONOITTGLayout);
        rSPanelImage1ICONOITTGLayout.setHorizontalGroup(
            rSPanelImage1ICONOITTGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        rSPanelImage1ICONOITTGLayout.setVerticalGroup(
            rSPanelImage1ICONOITTGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jPanel1RegistroTareas.add(rSPanelImage1ICONOITTG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 330, 310));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REALIDAD A LO IMAGINARIO");
        jPanel1RegistroTareas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        rSPanelsSlider1.add(jPanel1RegistroTareas, "card2");

        rSPanelImageContenido.setImagen(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/libreta2.jpg"))); // NOI18N
        rSPanelImageContenido.setName("rSPanelImageContenido"); // NOI18N
        rSPanelImageContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel3.setText("Fecha:");
        rSPanelImageContenido.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 15, 40, -1));

        jScrollPane2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jTextAreaContenido.setColumns(20);
        jTextAreaContenido.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jTextAreaContenido.setRows(5);
        jTextAreaContenido.setToolTipText("Escribe tus apuntes aquí");
        jScrollPane2.setViewportView(jTextAreaContenido);

        rSPanelImageContenido.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 227, 417));

        rSbotonBloqVista.setBackground(new java.awt.Color(255, 204, 102));
        rSbotonBloqVista.setForeground(new java.awt.Color(0, 0, 0));
        rSbotonBloqVista.setText("Bloquear vista");
        rSbotonBloqVista.setToolTipText("Esconde este panel para mostrar el panel de presentación");
        rSbotonBloqVista.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rSbotonBloqVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbotonBloqVistaActionPerformed(evt);
            }
        });
        rSPanelImageContenido.add(rSbotonBloqVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 100, 30));

        rSbotonEditContenido.setBackground(new java.awt.Color(255, 204, 102));
        rSbotonEditContenido.setForeground(new java.awt.Color(0, 0, 0));
        rSbotonEditContenido.setText("Editar contenido");
        rSbotonEditContenido.setToolTipText("Edita el contenido del cuaderno");
        rSbotonEditContenido.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rSbotonEditContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbotonEditContenidoActionPerformed(evt);
            }
        });
        rSPanelImageContenido.add(rSbotonEditContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 75, 100, 30));

        rSbotonGuardarCambios.setBackground(new java.awt.Color(255, 204, 102));
        rSbotonGuardarCambios.setForeground(new java.awt.Color(0, 0, 0));
        rSbotonGuardarCambios.setText("Guardar cambios");
        rSbotonGuardarCambios.setToolTipText("Guarda los cambios que hayas realizado en el cuaderno");
        rSbotonGuardarCambios.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rSbotonGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbotonGuardarCambiosActionPerformed(evt);
            }
        });
        rSPanelImageContenido.add(rSbotonGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 100, 30));

        rSbotonVerOActualizar.setBackground(new java.awt.Color(255, 204, 102));
        rSbotonVerOActualizar.setForeground(new java.awt.Color(0, 0, 0));
        rSbotonVerOActualizar.setText("Ver o actualizar");
        rSbotonVerOActualizar.setToolTipText("Visualiza el contenido del cuaderno o actualiza la vista");
        rSbotonVerOActualizar.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rSbotonVerOActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbotonVerOActualizarActionPerformed(evt);
            }
        });
        rSPanelImageContenido.add(rSbotonVerOActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 145, 100, 30));

        rsbotonCancel.setBackground(new java.awt.Color(255, 204, 102));
        rsbotonCancel.setForeground(new java.awt.Color(0, 0, 0));
        rsbotonCancel.setText("Cancelar");
        rsbotonCancel.setToolTipText("Cancela los cambios que hayas realizado ahora");
        rsbotonCancel.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rsbotonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbotonCancelActionPerformed(evt);
            }
        });
        rSPanelImageContenido.add(rsbotonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 215, 75, 30));

        rsFecha3.setFormatoFecha("dd/MM/yyyy");
        rsFecha3.setFuente(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        rSPanelImageContenido.add(rsFecha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 5, -1, -1));

        btnAgregarFecha.setBackground(new java.awt.Color(255, 204, 102));
        btnAgregarFecha.setFont(new java.awt.Font("Segoe Print", 1, 9)); // NOI18N
        btnAgregarFecha.setText("Agregar fecha al cuaderno");
        btnAgregarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFechaActionPerformed(evt);
            }
        });
        rSPanelImageContenido.add(btnAgregarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 47, 155, 20));

        rSPanelsSlider1.add(rSPanelImageContenido, "card3");

        getContentPane().add(rSPanelsSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 360, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSbotonGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbotonGuardarCambiosActionPerformed
        File f=new File(tareasMiercoles);
        
        try{
            
        FileWriter fw=new FileWriter(f);
        PrintWriter pw=new PrintWriter(fw);
            
            String contenido = this.jTextAreaContenido.getText();
            
            pw.print("\n");
            pw.print(contenido);

            fw.close();
            JOptionPane.showMessageDialog(null, "Se han guardado los cambios...");
            this.jTextAreaContenido.setText("");
            
            this.rsFecha3.setEnabled(false);
            this.jTextAreaContenido.setEnabled(false);
            this.rSbotonGuardarCambios.setEnabled(false);
            this.rSbotonEditContenido.setEnabled(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error con el archivo"+e);
        }

    }//GEN-LAST:event_rSbotonGuardarCambiosActionPerformed

    private void rSbotonVerOActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbotonVerOActualizarActionPerformed
        File archivo=new File(tareasMiercoles);
        
        try{
            
           FileReader fr=new FileReader(archivo);
           BufferedReader br=new BufferedReader(fr);
            
            String linea=br.readLine();
            if(!(this.jTextAreaContenido.getText().isEmpty())){
                this.jTextAreaContenido.setText("");
                while(linea!=null){
                linea = br.readLine();
                this.jTextAreaContenido.append(linea+"\n");
                
            }
            }else{
            while(linea!=null){
                linea = br.readLine();
                this.jTextAreaContenido.append(linea+"\n");
                
            }
            }
            fr.close();
            br.close();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al leer el archivo"+e);
        }

    }//GEN-LAST:event_rSbotonVerOActualizarActionPerformed

    private void rSbotonEditContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbotonEditContenidoActionPerformed
        this.rsFecha3.setEnabled(true);
        this.jTextAreaContenido.setEnabled(true);
        this.rSbotonGuardarCambios.setEnabled(true);
        this.rSbotonEditContenido.setEnabled(false);
    }//GEN-LAST:event_rSbotonEditContenidoActionPerformed

    private void rSbotonRegTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbotonRegTareasActionPerformed
        this.rSPanelsSlider1.setPanelSlider(30, rSPanelImageContenido, RSPanelsSlider.DIRECT.RIGHT);
        this.rsFecha3.setEnabled(false);
        this.jTextAreaContenido.setEnabled(false);
        this.rSbotonGuardarCambios.setEnabled(false);
        this.rSbotonEditContenido.setEnabled(true);
    }//GEN-LAST:event_rSbotonRegTareasActionPerformed

    private void rSbotonBloqVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbotonBloqVistaActionPerformed
        this.rSPanelsSlider1.setPanelSlider(30, jPanel1RegistroTareas, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_rSbotonBloqVistaActionPerformed

    private void rsbotonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbotonCancelActionPerformed
        this.rsFecha3.setEnabled(false);
        this.jTextAreaContenido.setText("");
        this.jTextAreaContenido.setEnabled(false);
        this.rSbotonGuardarCambios.setEnabled(false);
        this.rSbotonEditContenido.setEnabled(true);
    }//GEN-LAST:event_rsbotonCancelActionPerformed

    private void btnAgregarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFechaActionPerformed
        String fecha = this.rsFecha3.getDatoFecha().toString();
        this.jTextAreaContenido.setText(fecha+"\n\n");
    }//GEN-LAST:event_btnAgregarFechaActionPerformed

    private void btnRegMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegMateriaActionPerformed
        this.panelRegistroMaterias.setVisible(true);
    }//GEN-LAST:event_btnRegMateriaActionPerformed

    private void btnCerrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRegistroActionPerformed
        this.panelRegistroMaterias.setVisible(false);
    }//GEN-LAST:event_btnCerrarRegistroActionPerformed

    private void btnGuardarRegistroMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegistroMatActionPerformed
        try {
            tabla = new DefaultTableModel();
            String hora = this.txtHora.getText();
            String materia = this.txtMateria.getText();
            
            esMi.setHora_miercoles(hora);
            esMi.setMateria_miercoles(materia);
            
            //metMie.guardarMiercoles(esMi);
            metMie.guardarArchivoMiercoles(esMi);
            JOptionPane.showMessageDialog(null, "¡Registro guardado correctamente!");
            this.txtHora.setText("");
            this.txtMateria.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar con éxito el registro... "+e);
        }
    }//GEN-LAST:event_btnGuardarRegistroMatActionPerformed

    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
        this.tblMiercoles.setModel(metMie.listaMaterias());
    }//GEN-LAST:event_btnActualizarTablaActionPerformed

    private void btnBorrarRegMat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarRegMat3ActionPerformed
        metMie.borrarRegMatMi();
        JOptionPane.showMessageDialog(this, "Los registros de materias han sido borrados", "Miercoles", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnBorrarRegMat3ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_Miercoles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Miercoles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Miercoles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Miercoles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interfaz_Miercoles dialog = new Interfaz_Miercoles(new javax.swing.JFrame(), true);
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
    private rojerusan.RSButtonHover btnActualizarTabla;
    private javax.swing.JButton btnAgregarFecha;
    private rojeru_san.complementos.RSButtonHover btnBorrarRegMat3;
    private rojerusan.RSButtonHover btnCerrarRegistro;
    private rojerusan.RSButtonHover btnGuardarRegistroMat;
    private rojerusan.RSButtonHover btnRegMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1HORARIO;
    private javax.swing.JPanel jPanel1RegistroTareas;
    private javax.swing.JPanel jPanel2TABLAMATERIAS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaContenido;
    private javax.swing.JPanel panelRegistroMaterias;
    private rojerusan.RSPanelImage rSPanelImage1COMPU;
    private rojerusan.RSPanelImage rSPanelImage1ICONOITTG;
    private rojerusan.RSPanelImage rSPanelImageContenido;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private rojerusan.RSButtonMetro rSbotonBloqVista;
    private rojerusan.RSButtonMetro rSbotonEditContenido;
    private rojerusan.RSButtonMetro rSbotonGuardarCambios;
    private rojerusan.RSButtonHover rSbotonRegTareas;
    private rojerusan.RSButtonMetro rSbotonVerOActualizar;
    private rojeru_san.componentes.RSDateChooser rsFecha3;
    private rojerusan.RSButtonMetro rsbotonCancel;
    private javax.swing.JTable tblMiercoles;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMateria;
    // End of variables declaration//GEN-END:variables
}
