
package VENTANAS_PRINCIPALES;

import ESTRUCTURA_GENERAL_DE_CLASES.Estructura_Lunes;
import METODOS_DE_FUNCIONAMIENTO.Metodos_Lunes;
import java.io.*;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSPanelsSlider;

public class Interfaz_Lunes extends javax.swing.JDialog {

    Estructura_Lunes esLu = new Estructura_Lunes();
    Metodos_Lunes metLun = new Metodos_Lunes();
    Vector vCabeceras = new Vector();
    DefaultTableModel tabla;
    String tareasLunes = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Tareas"
                    +File.separator+"Lunes.txt";

    public Interfaz_Lunes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/mochila1.png")).getImage());
        this.panelRegistroMaterias.setVisible(false);
        
        this.tblLunes.setModel(metLun.listaMaterias());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHORARIO = new javax.swing.JPanel();
        jPanelTABLAMATERIAS = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLunes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panelRegistroMaterias = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtMateria = new javax.swing.JTextField();
        btnGuardarMateria = new rojerusan.RSButtonHover();
        btnActualizarTablaMat = new rojerusan.RSButtonHover();
        btnCerrarRegistroMat = new rojerusan.RSButtonHover();
        rSPanelImage1COMPU = new rojerusan.RSPanelImage();
        rsbotonREGISTRARtareas = new rojerusan.RSButtonHover();
        rSBotonRegistrarMateria = new rojerusan.RSButtonHover();
        btnBorrarRegMat1 = new rojeru_san.complementos.RSButtonHover();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        jpanelIRAREGISTROtareas = new javax.swing.JPanel();
        rSPanelImage3LOGITTG = new rojerusan.RSPanelImage();
        jLabel3 = new javax.swing.JLabel();
        rSPanelImage2CONTENIDO = new rojerusan.RSPanelImage();
        jLabel2 = new javax.swing.JLabel();
        rsFecha = new rojeru_san.componentes.RSDateChooser();
        rsbotonBLOQUEARvista1 = new rojerusan.RSButtonMetro();
        rsbotonEDITAR = new rojerusan.RSButtonMetro();
        rsbotonGUARDARCAMBIOS = new rojerusan.RSButtonMetro();
        rsbotonVERactualizar1 = new rojerusan.RSButtonMetro();
        rsbotonCancelar = new rojerusan.RSButtonMetro();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaCONTENIDO = new javax.swing.JTextArea();
        btnAgregarFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lunes - JELNBackpack");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelHORARIO.setBackground(new java.awt.Color(0, 0, 51));
        jPanelHORARIO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTABLAMATERIAS.setBackground(new java.awt.Color(0, 0, 153));
        jPanelTABLAMATERIAS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tblLunes.setBackground(new java.awt.Color(255, 255, 0));
        tblLunes.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        tblLunes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"15:00|16:00", "FUNDAMENTOS DE ING. DE SOFTWARE"},
                {"16:00|17:00", "SISTEMAS OPERATIVOS"},
                {"17:00|18:00", "FUNDAMENTOS DE TELECOMUNICACIONES"},
                {"18:00|19:00", "ARQUITECTURA DE COMPUTADORAS"},
                {"19:00|20:00", "TALLER DE BASES DE DATOS"},
                {"20:00|21:00", "*********"}
            },
            new String [] {
                "Hora", "Lunes"
            }
        ));
        tblLunes.setRowHeight(30);
        jScrollPane1.setViewportView(tblLunes);
        if (tblLunes.getColumnModel().getColumnCount() > 0) {
            tblLunes.getColumnModel().getColumn(0).setPreferredWidth(0);
        }

        jPanelTABLAMATERIAS.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 530, 209));

        jLabel1.setFont(new java.awt.Font("Stencil", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LUNES");
        jPanelTABLAMATERIAS.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 180, 50));

        jPanelHORARIO.add(jPanelTABLAMATERIAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 50, 550, 285));

        panelRegistroMaterias.setBackground(new java.awt.Color(0, 0, 153));
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

        btnGuardarMateria.setBackground(new java.awt.Color(255, 0, 0));
        btnGuardarMateria.setText("Guardar");
        btnGuardarMateria.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnGuardarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarMateriaActionPerformed(evt);
            }
        });
        panelRegistroMaterias.add(btnGuardarMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 63, 85, 20));

        btnActualizarTablaMat.setBackground(new java.awt.Color(255, 0, 0));
        btnActualizarTablaMat.setText("Actualizar tabla");
        btnActualizarTablaMat.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnActualizarTablaMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaMatActionPerformed(evt);
            }
        });
        panelRegistroMaterias.add(btnActualizarTablaMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 63, 135, 20));

        btnCerrarRegistroMat.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrarRegistroMat.setText("Cerrar registro");
        btnCerrarRegistroMat.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCerrarRegistroMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarRegistroMatActionPerformed(evt);
            }
        });
        panelRegistroMaterias.add(btnCerrarRegistroMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 63, 130, 20));

        jPanelHORARIO.add(panelRegistroMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 420, 90));

        rSPanelImage1COMPU.setImagen(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/compu.png"))); // NOI18N
        jPanelHORARIO.add(rSPanelImage1COMPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 560, 470));

        rsbotonREGISTRARtareas.setBackground(new java.awt.Color(255, 0, 0));
        rsbotonREGISTRARtareas.setText("Registrar tareas");
        rsbotonREGISTRARtareas.setToolTipText("Visualiza el panel del cuaderno");
        rsbotonREGISTRARtareas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rsbotonREGISTRARtareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbotonREGISTRARtareasActionPerformed(evt);
            }
        });
        jPanelHORARIO.add(rsbotonREGISTRARtareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 150, 30));

        rSBotonRegistrarMateria.setBackground(new java.awt.Color(255, 0, 0));
        rSBotonRegistrarMateria.setText("Registrar materia");
        rSBotonRegistrarMateria.setToolTipText("Permite registrar una materia");
        rSBotonRegistrarMateria.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rSBotonRegistrarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSBotonRegistrarMateriaActionPerformed(evt);
            }
        });
        jPanelHORARIO.add(rSBotonRegistrarMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 150, 30));

        btnBorrarRegMat1.setBackground(new java.awt.Color(255, 0, 0));
        btnBorrarRegMat1.setText("Borrar registro materias");
        btnBorrarRegMat1.setToolTipText("");
        btnBorrarRegMat1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBorrarRegMat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarRegMat1ActionPerformed(evt);
            }
        });
        jPanelHORARIO.add(btnBorrarRegMat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 510, 190, 30));

        getContentPane().add(jPanelHORARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 540));

        rSPanelsSlider1.setBackground(new java.awt.Color(51, 102, 255));
        rSPanelsSlider1.setName("rSPanelsSlider1"); // NOI18N

        jpanelIRAREGISTROtareas.setBackground(new java.awt.Color(0, 0, 51));
        jpanelIRAREGISTROtareas.setName("jpanelIRAREGISTROtareas"); // NOI18N
        jpanelIRAREGISTROtareas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage3LOGITTG.setImagen(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/ITTG_trans.png"))); // NOI18N
        jpanelIRAREGISTROtareas.add(rSPanelImage3LOGITTG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 330, 310));

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Realidad a lo imaginario");
        jpanelIRAREGISTROtareas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        rSPanelsSlider1.add(jpanelIRAREGISTROtareas, "card3");

        rSPanelImage2CONTENIDO.setImagen(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/libreta2.jpg"))); // NOI18N
        rSPanelImage2CONTENIDO.setName("rSPanelImage2CONTENIDO"); // NOI18N
        rSPanelImage2CONTENIDO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel2.setText("Fecha:");
        rSPanelImage2CONTENIDO.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 15, 45, -1));

        rsFecha.setToolTipText("Da clic en el ícono de calendario y da clic en el día del calendario para colocar la fecha en el campo");
        rsFecha.setFormatoFecha("dd/MM/yyyy");
        rsFecha.setFuente(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        rSPanelImage2CONTENIDO.add(rsFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 5, -1, -1));

        rsbotonBLOQUEARvista1.setBackground(new java.awt.Color(255, 204, 102));
        rsbotonBLOQUEARvista1.setForeground(new java.awt.Color(0, 0, 0));
        rsbotonBLOQUEARvista1.setText("Bloquear vista");
        rsbotonBLOQUEARvista1.setToolTipText("Con este botón bloqueas la vista de este panel para colocar el panel de presentación");
        rsbotonBLOQUEARvista1.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rsbotonBLOQUEARvista1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbotonBLOQUEARvista1ActionPerformed(evt);
            }
        });
        rSPanelImage2CONTENIDO.add(rsbotonBLOQUEARvista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 100, 30));

        rsbotonEDITAR.setBackground(new java.awt.Color(255, 204, 102));
        rsbotonEDITAR.setForeground(new java.awt.Color(0, 0, 0));
        rsbotonEDITAR.setText("Editar contenido");
        rsbotonEDITAR.setToolTipText("Con este botón puedes editar el contenido de tu cuaderno de apuntes");
        rsbotonEDITAR.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rsbotonEDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbotonEDITARActionPerformed(evt);
            }
        });
        rSPanelImage2CONTENIDO.add(rsbotonEDITAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 75, 100, 30));

        rsbotonGUARDARCAMBIOS.setBackground(new java.awt.Color(255, 204, 102));
        rsbotonGUARDARCAMBIOS.setForeground(new java.awt.Color(0, 0, 0));
        rsbotonGUARDARCAMBIOS.setText("Guardar cambios");
        rsbotonGUARDARCAMBIOS.setToolTipText("Con este botón guardas los cambios realizados en el cuaderno");
        rsbotonGUARDARCAMBIOS.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rsbotonGUARDARCAMBIOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbotonGUARDARCAMBIOSActionPerformed(evt);
            }
        });
        rSPanelImage2CONTENIDO.add(rsbotonGUARDARCAMBIOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 100, 30));

        rsbotonVERactualizar1.setBackground(new java.awt.Color(255, 204, 102));
        rsbotonVERactualizar1.setForeground(new java.awt.Color(0, 0, 0));
        rsbotonVERactualizar1.setText("Ver o actualizar");
        rsbotonVERactualizar1.setToolTipText("Con este botón puedes ver lo que has escrito en el cuaderno o actualizar la vista de ese contenido si has modificado algo");
        rsbotonVERactualizar1.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rsbotonVERactualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbotonVERactualizar1ActionPerformed(evt);
            }
        });
        rSPanelImage2CONTENIDO.add(rsbotonVERactualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 145, 100, 30));

        rsbotonCancelar.setBackground(new java.awt.Color(255, 204, 102));
        rsbotonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        rsbotonCancelar.setText("Cancelar");
        rsbotonCancelar.setToolTipText("Con este botón cancelas cuaquier cambio que estés realizando en el cuaderno en esos momentos");
        rsbotonCancelar.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rsbotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbotonCancelarActionPerformed(evt);
            }
        });
        rSPanelImage2CONTENIDO.add(rsbotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 215, 75, 25));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 153));
        jScrollPane2.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N

        jtaCONTENIDO.setColumns(20);
        jtaCONTENIDO.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jtaCONTENIDO.setRows(5);
        jtaCONTENIDO.setToolTipText("Aquí puedes ingresar tus apuntes");
        jtaCONTENIDO.setBorder(null);
        jScrollPane2.setViewportView(jtaCONTENIDO);

        rSPanelImage2CONTENIDO.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 227, 417));

        btnAgregarFecha.setBackground(new java.awt.Color(255, 204, 102));
        btnAgregarFecha.setFont(new java.awt.Font("Segoe Print", 1, 9)); // NOI18N
        btnAgregarFecha.setText("Agregar fecha al cuaderno");
        btnAgregarFecha.setToolTipText("Da clic en este botón para colocar la fecha, que seleccionaste, en el cuaderno");
        btnAgregarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFechaActionPerformed(evt);
            }
        });
        rSPanelImage2CONTENIDO.add(btnAgregarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 47, 155, 20));

        rSPanelsSlider1.add(rSPanelImage2CONTENIDO, "card2");

        getContentPane().add(rSPanelsSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 360, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rsbotonGUARDARCAMBIOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbotonGUARDARCAMBIOSActionPerformed
        
        File f=new File(tareasLunes);
        
        try{
            
        FileWriter fw=new FileWriter(f);
        PrintWriter pw=new PrintWriter(fw);
            
            String contenido = this.jtaCONTENIDO.getText();
            
            pw.print("\n");
            pw.print(contenido);

            fw.close();
            JOptionPane.showMessageDialog(null, "Se han guardado los cambios...");
            this.jtaCONTENIDO.setText("");
            
            this.rsFecha.setEnabled(false);
            this.jtaCONTENIDO.setEnabled(false);
            this.rsbotonGUARDARCAMBIOS.setEnabled(false);
            this.rsbotonEDITAR.setEnabled(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error con el archivo "+e);
        }
    }//GEN-LAST:event_rsbotonGUARDARCAMBIOSActionPerformed

    private void rsbotonVERactualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbotonVERactualizar1ActionPerformed
        
        File archivo=new File(tareasLunes);
        
        try{
            
           FileReader fr=new FileReader(archivo);
           BufferedReader br=new BufferedReader(fr);
            
            String linea=br.readLine();
            if(!(this.jtaCONTENIDO.getText().isEmpty())){
                this.jtaCONTENIDO.setText("");
                while(linea!=null){
                linea = br.readLine();
                this.jtaCONTENIDO.append(linea+"\n");
                
            }
            }else{
            while(linea!=null){
                linea = br.readLine();
                this.jtaCONTENIDO.append(linea+"\n");
                
            }
            }
            fr.close();
            br.close();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al leer el archivo. "+e);
        }
    }//GEN-LAST:event_rsbotonVERactualizar1ActionPerformed

    private void rsbotonEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbotonEDITARActionPerformed
            this.rsFecha.setEnabled(true);
            this.jtaCONTENIDO.setEnabled(true);
            this.rsbotonGUARDARCAMBIOS.setEnabled(true);
            this.rsbotonEDITAR.setEnabled(false);
    }//GEN-LAST:event_rsbotonEDITARActionPerformed

    private void rsbotonREGISTRARtareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbotonREGISTRARtareasActionPerformed
        this.rSPanelsSlider1.setPanelSlider(30, rSPanelImage2CONTENIDO, RSPanelsSlider.DIRECT.RIGHT);
        this.rsFecha.setEnabled(false);
        this.jtaCONTENIDO.setEnabled(false);
        this.rsbotonGUARDARCAMBIOS.setEnabled(false);
        this.rsbotonEDITAR.setEnabled(true);
    }//GEN-LAST:event_rsbotonREGISTRARtareasActionPerformed

    private void rsbotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbotonCancelarActionPerformed
        
        this.rsFecha.setEnabled(false);
        this.jtaCONTENIDO.setText("");
        this.jtaCONTENIDO.setEnabled(false);
        this.rsbotonGUARDARCAMBIOS.setEnabled(false);
        this.rsbotonEDITAR.setEnabled(true);
    }//GEN-LAST:event_rsbotonCancelarActionPerformed

    private void rsbotonBLOQUEARvista1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbotonBLOQUEARvista1ActionPerformed
        this.rSPanelsSlider1.setPanelSlider(30, jpanelIRAREGISTROtareas, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_rsbotonBLOQUEARvista1ActionPerformed

    private void btnAgregarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFechaActionPerformed
        String fecha = this.rsFecha.getDatoFecha().toString();
        this.jtaCONTENIDO.setText(fecha+"\n\n");
    }//GEN-LAST:event_btnAgregarFechaActionPerformed

    private void rSBotonRegistrarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSBotonRegistrarMateriaActionPerformed
        this.panelRegistroMaterias.setVisible(true);
    }//GEN-LAST:event_rSBotonRegistrarMateriaActionPerformed

    private void btnCerrarRegistroMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRegistroMatActionPerformed
        this.panelRegistroMaterias.setVisible(false);
    }//GEN-LAST:event_btnCerrarRegistroMatActionPerformed

    private void btnGuardarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarMateriaActionPerformed
        try {
            tabla = new DefaultTableModel();
            String hora = this.txtHora.getText();
            String materia = this.txtMateria.getText();
            
            esLu.setHora_lunes(hora);
            esLu.setMateria_lunes(materia);
            
            //metLun.guardarLunes(esLu);
            metLun.guardarArchivoLunes(esLu);
            JOptionPane.showMessageDialog(null, "¡Registro guardado correctamente!");
            this.txtHora.setText("");
            this.txtMateria.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar con éxito el registro... "+e);
        }
    }//GEN-LAST:event_btnGuardarMateriaActionPerformed

    private void btnActualizarTablaMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaMatActionPerformed
        this.tblLunes.setModel(metLun.listaMaterias());
    }//GEN-LAST:event_btnActualizarTablaMatActionPerformed

    private void btnBorrarRegMat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarRegMat1ActionPerformed
        metLun.borrarRegMatLun();
        JOptionPane.showMessageDialog(this, "Los registros de materias han sido borrados...", "Lunes", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnBorrarRegMat1ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_Lunes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Lunes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Lunes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Lunes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interfaz_Lunes dialog = new Interfaz_Lunes(new javax.swing.JFrame(), true);
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
    private rojerusan.RSButtonHover btnActualizarTablaMat;
    private javax.swing.JButton btnAgregarFecha;
    private rojeru_san.complementos.RSButtonHover btnBorrarRegMat1;
    private rojerusan.RSButtonHover btnCerrarRegistroMat;
    private rojerusan.RSButtonHover btnGuardarMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanelHORARIO;
    private javax.swing.JPanel jPanelTABLAMATERIAS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpanelIRAREGISTROtareas;
    private javax.swing.JTextArea jtaCONTENIDO;
    private javax.swing.JPanel panelRegistroMaterias;
    private rojerusan.RSButtonHover rSBotonRegistrarMateria;
    private rojerusan.RSPanelImage rSPanelImage1COMPU;
    private rojerusan.RSPanelImage rSPanelImage2CONTENIDO;
    private rojerusan.RSPanelImage rSPanelImage3LOGITTG;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private rojeru_san.componentes.RSDateChooser rsFecha;
    private rojerusan.RSButtonMetro rsbotonBLOQUEARvista1;
    private rojerusan.RSButtonMetro rsbotonCancelar;
    private rojerusan.RSButtonMetro rsbotonEDITAR;
    private rojerusan.RSButtonMetro rsbotonGUARDARCAMBIOS;
    private rojerusan.RSButtonHover rsbotonREGISTRARtareas;
    private rojerusan.RSButtonMetro rsbotonVERactualizar1;
    private javax.swing.JTable tblLunes;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMateria;
    // End of variables declaration//GEN-END:variables
}
