
package VENTANAS_PRINCIPALES;

import ESTRUCTURA_GENERAL_DE_CLASES.Estructura_Jueves;
import METODOS_DE_FUNCIONAMIENTO.Metodos_Jueves;
import java.io.*;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSPanelsSlider;

public class Interfaz_Jueves extends javax.swing.JDialog {

    Estructura_Jueves esJu = new Estructura_Jueves();
    Metodos_Jueves metJue = new Metodos_Jueves();
    Vector vCabeceras = new Vector();
    DefaultTableModel tabla;
    String tareasJueves = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Tareas"
                    +File.separator+"Jueves.txt";
    
    public Interfaz_Jueves(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/mochila1.png")).getImage());
        this.panelRegistroMaterias.setVisible(false);
        
        this.tblJueves.setModel(metJue.listaMaterias());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1HORARIO = new javax.swing.JPanel();
        jPanel2TablaMaterias = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJueves = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panelRegistroMaterias = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtMateria = new javax.swing.JTextField();
        btnGuardarMat = new rojerusan.RSButtonHover();
        btnActualizarTab = new rojerusan.RSButtonHover();
        btnCerrarRegistro = new rojerusan.RSButtonHover();
        rSPanelImage1COMPU = new rojerusan.RSPanelImage();
        rsbotonRegistrarTAREAS = new rojerusan.RSButtonHover();
        btnRegistrarMateria = new rojerusan.RSButtonHover();
        btnBorrarRegMat4 = new rojeru_san.complementos.RSButtonHover();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        jPanel1RegistroTAREAS = new javax.swing.JPanel();
        rSPanelImage1ITTGICONO = new rojerusan.RSPanelImage();
        jLabel2 = new javax.swing.JLabel();
        rSPanelImage1Contenido = new rojerusan.RSPanelImage();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaCONTENIDO = new javax.swing.JTextArea();
        rSbotonBloquearVista = new rojerusan.RSButtonMetro();
        rSbotonEditContenido = new rojerusan.RSButtonMetro();
        rSbotonSaveCambios = new rojerusan.RSButtonMetro();
        rSbotonVerActualizar = new rojerusan.RSButtonMetro();
        rsbotonCANCELAR = new rojerusan.RSButtonMetro();
        rsFecha4 = new rojeru_san.componentes.RSDateChooser();
        btnAgregarFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Jueves - JELNBackpack");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1HORARIO.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1HORARIO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2TablaMaterias.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2TablaMaterias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tblJueves.setBackground(new java.awt.Color(255, 255, 0));
        tblJueves.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        tblJueves.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"15:00|16:00", "GRAFICACIÓN"},
                {"16:00|17:00", "ARQUITECTURA DE COMPUTADORAS"},
                {"17:00|18:00", "FUNDAMENTOS DE TELECOMUNICACIONES"},
                {"18:00|19:00", "SISTEMAS OPERATIVOS"},
                {"19:00|20:00", "FUNDAMENTOS DE ING. DE SOFTWARE"},
                {"20:00|21:00", "FUNDAMENTOS DE ING. DE SOFTWARE"}
            },
            new String [] {
                "Hora", "Clase"
            }
        ));
        tblJueves.setRowHeight(30);
        jScrollPane1.setViewportView(tblJueves);
        if (tblJueves.getColumnModel().getColumnCount() > 0) {
            tblJueves.getColumnModel().getColumn(0).setPreferredWidth(0);
        }

        jPanel2TablaMaterias.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 530, 209));

        jLabel1.setFont(new java.awt.Font("Stencil", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JUEVES");
        jPanel2TablaMaterias.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 200, 50));

        jPanel1HORARIO.add(jPanel2TablaMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 50, 550, 285));

        panelRegistroMaterias.setBackground(new java.awt.Color(255, 0, 0));
        panelRegistroMaterias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hora");
        panelRegistroMaterias.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 2, 40, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Materia");
        panelRegistroMaterias.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 2, 50, -1));

        txtHora.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        panelRegistroMaterias.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 22, 105, 33));

        txtMateria.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        panelRegistroMaterias.add(txtMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 22, 300, 33));

        btnGuardarMat.setBackground(new java.awt.Color(255, 0, 0));
        btnGuardarMat.setText("Guardar");
        btnGuardarMat.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnGuardarMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMatActionPerformed(evt);
            }
        });
        panelRegistroMaterias.add(btnGuardarMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 63, 85, 20));

        btnActualizarTab.setBackground(new java.awt.Color(255, 0, 0));
        btnActualizarTab.setText("Actualizar tabla");
        btnActualizarTab.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnActualizarTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTabActionPerformed(evt);
            }
        });
        panelRegistroMaterias.add(btnActualizarTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 63, 135, 20));

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
        jPanel1HORARIO.add(rSPanelImage1COMPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 560, 470));

        rsbotonRegistrarTAREAS.setBackground(new java.awt.Color(255, 0, 0));
        rsbotonRegistrarTAREAS.setText("Registrar tareas");
        rsbotonRegistrarTAREAS.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rsbotonRegistrarTAREAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbotonRegistrarTAREASActionPerformed(evt);
            }
        });
        jPanel1HORARIO.add(rsbotonRegistrarTAREAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 150, 30));

        btnRegistrarMateria.setBackground(new java.awt.Color(255, 0, 0));
        btnRegistrarMateria.setText("Registrar materia");
        btnRegistrarMateria.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRegistrarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMateriaActionPerformed(evt);
            }
        });
        jPanel1HORARIO.add(btnRegistrarMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 150, 30));

        btnBorrarRegMat4.setBackground(new java.awt.Color(255, 0, 0));
        btnBorrarRegMat4.setText("Borrar registro materias");
        btnBorrarRegMat4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBorrarRegMat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarRegMat4ActionPerformed(evt);
            }
        });
        jPanel1HORARIO.add(btnBorrarRegMat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 510, 190, 30));

        getContentPane().add(jPanel1HORARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 540));

        rSPanelsSlider1.setBackground(new java.awt.Color(255, 51, 51));
        rSPanelsSlider1.setName("rSPanelsSlider1"); // NOI18N

        jPanel1RegistroTAREAS.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1RegistroTAREAS.setName("jPanel1RegistroTAREAS"); // NOI18N
        jPanel1RegistroTAREAS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage1ITTGICONO.setImagen(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/ITTG_trans.png"))); // NOI18N
        jPanel1RegistroTAREAS.add(rSPanelImage1ITTGICONO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 330, 310));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REALIDAD A LO IMAGINARIO");
        jPanel1RegistroTAREAS.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        rSPanelsSlider1.add(jPanel1RegistroTAREAS, "card2");

        rSPanelImage1Contenido.setImagen(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/libreta2.jpg"))); // NOI18N
        rSPanelImage1Contenido.setName("rSPanelImage1Contenido"); // NOI18N
        rSPanelImage1Contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel3.setText("Fecha:");
        rSPanelImage1Contenido.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 15, 40, -1));

        jScrollPane2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jTextAreaCONTENIDO.setColumns(20);
        jTextAreaCONTENIDO.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jTextAreaCONTENIDO.setRows(5);
        jTextAreaCONTENIDO.setToolTipText("Escribe tus apuntes aquí");
        jScrollPane2.setViewportView(jTextAreaCONTENIDO);

        rSPanelImage1Contenido.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 227, 417));

        rSbotonBloquearVista.setBackground(new java.awt.Color(255, 204, 102));
        rSbotonBloquearVista.setForeground(new java.awt.Color(0, 0, 0));
        rSbotonBloquearVista.setText("Bloquear vista");
        rSbotonBloquearVista.setToolTipText("Esconde este panel para mostrar el panel de presentación");
        rSbotonBloquearVista.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rSbotonBloquearVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbotonBloquearVistaActionPerformed(evt);
            }
        });
        rSPanelImage1Contenido.add(rSbotonBloquearVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 100, 30));

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
        rSPanelImage1Contenido.add(rSbotonEditContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 75, 100, 30));

        rSbotonSaveCambios.setBackground(new java.awt.Color(255, 204, 102));
        rSbotonSaveCambios.setForeground(new java.awt.Color(0, 0, 0));
        rSbotonSaveCambios.setText("Guardar cambios");
        rSbotonSaveCambios.setToolTipText("Guarda los cambios realizados en el cuaderno");
        rSbotonSaveCambios.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rSbotonSaveCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbotonSaveCambiosActionPerformed(evt);
            }
        });
        rSPanelImage1Contenido.add(rSbotonSaveCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 100, 30));

        rSbotonVerActualizar.setBackground(new java.awt.Color(255, 204, 102));
        rSbotonVerActualizar.setForeground(new java.awt.Color(0, 0, 0));
        rSbotonVerActualizar.setText("Ver o actualizar");
        rSbotonVerActualizar.setToolTipText("Visualiza el contenido del cuaderno o actualiza la vista del contenido");
        rSbotonVerActualizar.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rSbotonVerActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbotonVerActualizarActionPerformed(evt);
            }
        });
        rSPanelImage1Contenido.add(rSbotonVerActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 145, 100, 30));

        rsbotonCANCELAR.setBackground(new java.awt.Color(255, 204, 102));
        rsbotonCANCELAR.setForeground(new java.awt.Color(0, 0, 0));
        rsbotonCANCELAR.setText("Cancelar");
        rsbotonCANCELAR.setToolTipText("Cancela los cambios que hayas realizado");
        rsbotonCANCELAR.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rsbotonCANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbotonCANCELARActionPerformed(evt);
            }
        });
        rSPanelImage1Contenido.add(rsbotonCANCELAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 215, 75, 30));

        rsFecha4.setFormatoFecha("dd/MM/yyyy");
        rsFecha4.setFuente(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        rSPanelImage1Contenido.add(rsFecha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 5, -1, -1));

        btnAgregarFecha.setBackground(new java.awt.Color(255, 204, 102));
        btnAgregarFecha.setFont(new java.awt.Font("Segoe Print", 1, 9)); // NOI18N
        btnAgregarFecha.setText("Agregar fecha al cuaderno");
        btnAgregarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFechaActionPerformed(evt);
            }
        });
        rSPanelImage1Contenido.add(btnAgregarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 47, 155, 20));

        rSPanelsSlider1.add(rSPanelImage1Contenido, "card3");

        getContentPane().add(rSPanelsSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 360, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSbotonSaveCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbotonSaveCambiosActionPerformed
        File f=new File(tareasJueves);
        
        try{
            
        FileWriter fw=new FileWriter(f);
        PrintWriter pw=new PrintWriter(fw);
            
            String contenido = this.jTextAreaCONTENIDO.getText();
            
            pw.print("\n");
            pw.print(contenido);

            fw.close();
            JOptionPane.showMessageDialog(null, "Se han guardado los cambios...");
            this.jTextAreaCONTENIDO.setText("");
            
            this.rsFecha4.setEnabled(false);
            this.jTextAreaCONTENIDO.setEnabled(false);
            this.rSbotonSaveCambios.setEnabled(false);
            this.rSbotonEditContenido.setEnabled(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error con el archivo"+e);
        }

    }//GEN-LAST:event_rSbotonSaveCambiosActionPerformed

    private void rSbotonVerActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbotonVerActualizarActionPerformed
        File archivo=new File(tareasJueves);
        
        try{
            
           FileReader fr=new FileReader(archivo);
           BufferedReader br=new BufferedReader(fr);
            
            String linea=br.readLine();
            if(!(this.jTextAreaCONTENIDO.getText().isEmpty())){
                this.jTextAreaCONTENIDO.setText("");
                while(linea!=null){
                linea = br.readLine();
                this.jTextAreaCONTENIDO.append(linea+"\n");
                
            }
            }else{
            while(linea!=null){
                linea = br.readLine();
                this.jTextAreaCONTENIDO.append(linea+"\n");
                
            }
            }
            fr.close();
            br.close();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al leer el archivo"+e);
        }

    }//GEN-LAST:event_rSbotonVerActualizarActionPerformed

    private void rSbotonEditContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbotonEditContenidoActionPerformed
        this.rsFecha4.setEnabled(true);
        this.jTextAreaCONTENIDO.setEnabled(true);
        this.rSbotonSaveCambios.setEnabled(true);
        this.rSbotonEditContenido.setEnabled(false);
    }//GEN-LAST:event_rSbotonEditContenidoActionPerformed

    private void rsbotonRegistrarTAREASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbotonRegistrarTAREASActionPerformed
        this.rSPanelsSlider1.setPanelSlider(30, rSPanelImage1Contenido, RSPanelsSlider.DIRECT.RIGHT);
        this.rsFecha4.setEnabled(false);
        this.jTextAreaCONTENIDO.setEnabled(false);
        this.rSbotonSaveCambios.setEnabled(false);
        this.rSbotonEditContenido.setEnabled(true);
    }//GEN-LAST:event_rsbotonRegistrarTAREASActionPerformed

    private void rSbotonBloquearVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbotonBloquearVistaActionPerformed
        this.rSPanelsSlider1.setPanelSlider(30, jPanel1RegistroTAREAS, RSPanelsSlider.DIRECT.RIGHT);

    }//GEN-LAST:event_rSbotonBloquearVistaActionPerformed

    private void rsbotonCANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbotonCANCELARActionPerformed
        this.rsFecha4.setEnabled(false);
        this.jTextAreaCONTENIDO.setText("");
        this.jTextAreaCONTENIDO.setEnabled(false);
        this.rSbotonSaveCambios.setEnabled(false);
        this.rSbotonEditContenido.setEnabled(true);
    }//GEN-LAST:event_rsbotonCANCELARActionPerformed

    private void btnAgregarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFechaActionPerformed
        String fecha = this.rsFecha4.getDatoFecha().toString();
        this.jTextAreaCONTENIDO.setText(fecha+"\n\n");
    }//GEN-LAST:event_btnAgregarFechaActionPerformed

    private void btnRegistrarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMateriaActionPerformed
        this.panelRegistroMaterias.setVisible(true);
    }//GEN-LAST:event_btnRegistrarMateriaActionPerformed

    private void btnCerrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRegistroActionPerformed
        this.panelRegistroMaterias.setVisible(false);
    }//GEN-LAST:event_btnCerrarRegistroActionPerformed

    private void btnGuardarMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMatActionPerformed
        try {
            tabla = new DefaultTableModel();
            String hora = this.txtHora.getText();
            String materia = this.txtMateria.getText();
            
            esJu.setHora_jueves(hora);
            esJu.setMateria_jueves(materia);
            
            //metJue.guardarJueves(esJu);
            metJue.guardarArchivoJueves(esJu);
            JOptionPane.showMessageDialog(null, "¡Registro guardado correctamente!");
            this.txtHora.setText("");
            this.txtMateria.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar con éxito el registro... "+e);
        }
    }//GEN-LAST:event_btnGuardarMatActionPerformed

    private void btnActualizarTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTabActionPerformed
        this.tblJueves.setModel(metJue.listaMaterias());
    }//GEN-LAST:event_btnActualizarTabActionPerformed

    private void btnBorrarRegMat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarRegMat4ActionPerformed
        metJue.borrarRegMatJu();
        JOptionPane.showMessageDialog(this, "Los registros de materias han sido borrados...", "Jueves", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnBorrarRegMat4ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_Jueves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Jueves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Jueves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Jueves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interfaz_Jueves dialog = new Interfaz_Jueves(new javax.swing.JFrame(), true);
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
    private rojerusan.RSButtonHover btnActualizarTab;
    private javax.swing.JButton btnAgregarFecha;
    private rojeru_san.complementos.RSButtonHover btnBorrarRegMat4;
    private rojerusan.RSButtonHover btnCerrarRegistro;
    private rojerusan.RSButtonHover btnGuardarMat;
    private rojerusan.RSButtonHover btnRegistrarMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1HORARIO;
    private javax.swing.JPanel jPanel1RegistroTAREAS;
    private javax.swing.JPanel jPanel2TablaMaterias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaCONTENIDO;
    private javax.swing.JPanel panelRegistroMaterias;
    private rojerusan.RSPanelImage rSPanelImage1COMPU;
    private rojerusan.RSPanelImage rSPanelImage1Contenido;
    private rojerusan.RSPanelImage rSPanelImage1ITTGICONO;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private rojerusan.RSButtonMetro rSbotonBloquearVista;
    private rojerusan.RSButtonMetro rSbotonEditContenido;
    private rojerusan.RSButtonMetro rSbotonSaveCambios;
    private rojerusan.RSButtonMetro rSbotonVerActualizar;
    private rojeru_san.componentes.RSDateChooser rsFecha4;
    private rojerusan.RSButtonMetro rsbotonCANCELAR;
    private rojerusan.RSButtonHover rsbotonRegistrarTAREAS;
    private javax.swing.JTable tblJueves;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMateria;
    // End of variables declaration//GEN-END:variables
}
