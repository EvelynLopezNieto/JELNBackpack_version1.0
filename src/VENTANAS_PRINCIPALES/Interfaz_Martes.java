
package VENTANAS_PRINCIPALES;

import ESTRUCTURA_GENERAL_DE_CLASES.Estructura_Martes;
import METODOS_DE_FUNCIONAMIENTO.Metodos_Martes;
import java.io.*;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSPanelsSlider;

public class Interfaz_Martes extends javax.swing.JDialog {

    Estructura_Martes esMa = new Estructura_Martes();
    Metodos_Martes metMar = new Metodos_Martes();
    Vector vCabeceras = new Vector();
    DefaultTableModel tabla;
    String tareasMartes = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Tareas"
                    +File.separator+"Martes.txt";
    
    public Interfaz_Martes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/mochila1.png")).getImage());
        this.panelRegMaterias.setVisible(false);

        this.tblMartes.setModel(metMar.listaMaterias());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1HORARIO = new javax.swing.JPanel();
        jPanel2TABLAMATERIAS = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMartes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panelRegMaterias = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtMateria = new javax.swing.JTextField();
        btnGuardarRegMateria = new rojerusan.RSButtonHover();
        btnActualizarTab = new rojerusan.RSButtonHover();
        btnCerrarReg = new rojerusan.RSButtonHover();
        rSPanelImage1COMPU = new rojerusan.RSPanelImage();
        rSbotonREGISTRARtareas = new rojerusan.RSButtonHover();
        btnRegMateria = new rojerusan.RSButtonHover();
        btnBorrarRegMat2 = new rojeru_san.complementos.RSButtonHover();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        jPanel1REGISTROTAREAS = new javax.swing.JPanel();
        rSPanelImage1LOGOittg = new rojerusan.RSPanelImage();
        jLabel2 = new javax.swing.JLabel();
        rSPanelImage1Contenido = new rojerusan.RSPanelImage();
        jLabel3 = new javax.swing.JLabel();
        rSbotonBLOQUEARvista = new rojerusan.RSButtonMetro();
        rSbotonEditarCONTENIDO = new rojerusan.RSButtonMetro();
        rSbotonGuardarCAMBIOS = new rojerusan.RSButtonMetro();
        rSbotonVERoACTUALIZAR = new rojerusan.RSButtonMetro();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaContenido = new javax.swing.JTextArea();
        rsbotonCancelar = new rojerusan.RSButtonMetro();
        rsFecha2 = new rojeru_san.componentes.RSDateChooser();
        btnAgregarFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Martes - JELNBackpack");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1HORARIO.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1HORARIO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2TABLAMATERIAS.setBackground(new java.awt.Color(153, 0, 153));
        jPanel2TABLAMATERIAS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMartes.setBackground(new java.awt.Color(255, 255, 0));
        tblMartes.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        tblMartes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"15:00|16:00", "TALLER DE BASES DE DATOS"},
                {"16:00|17:00", "SISTEMAS OPERATIVOS"},
                {"17:00|18:00", "ARQUITECTURA DE COMPUTADORAS"},
                {"18:00|19:00", "FUNDAMENTOS DE ING. DE SOFTWARE"},
                {"19:00|20:00", "GRAFICACIÓN"},
                {"20:00|21:00", "FUNDAMENTOS DE TELECOMUNICACIONES"}
            },
            new String [] {
                "Hora", "Martes"
            }
        ));
        tblMartes.setRowHeight(30);
        jScrollPane1.setViewportView(tblMartes);
        if (tblMartes.getColumnModel().getColumnCount() > 0) {
            tblMartes.getColumnModel().getColumn(0).setPreferredWidth(0);
        }

        jPanel2TABLAMATERIAS.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 530, 209));

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText("MARTES");
        jPanel2TABLAMATERIAS.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 50));

        jPanel1HORARIO.add(jPanel2TABLAMATERIAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 50, 550, 285));

        panelRegMaterias.setBackground(new java.awt.Color(153, 0, 153));
        panelRegMaterias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Hora");
        panelRegMaterias.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 2, 40, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Materia");
        panelRegMaterias.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 2, 50, -1));

        txtHora.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        panelRegMaterias.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 22, 105, 33));

        txtMateria.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        panelRegMaterias.add(txtMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 22, 300, 33));

        btnGuardarRegMateria.setBackground(new java.awt.Color(255, 0, 0));
        btnGuardarRegMateria.setText("Guardar");
        btnGuardarRegMateria.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnGuardarRegMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegMateriaActionPerformed(evt);
            }
        });
        panelRegMaterias.add(btnGuardarRegMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 63, 85, 20));

        btnActualizarTab.setBackground(new java.awt.Color(255, 0, 0));
        btnActualizarTab.setText("Actualizar tabla");
        btnActualizarTab.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnActualizarTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTabActionPerformed(evt);
            }
        });
        panelRegMaterias.add(btnActualizarTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 63, 135, 20));

        btnCerrarReg.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrarReg.setText("Cerrar registro");
        btnCerrarReg.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCerrarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarRegActionPerformed(evt);
            }
        });
        panelRegMaterias.add(btnCerrarReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 63, 130, 20));

        jPanel1HORARIO.add(panelRegMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 420, 90));

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

        rSbotonREGISTRARtareas.setBackground(new java.awt.Color(255, 0, 0));
        rSbotonREGISTRARtareas.setText("Registrar tareas");
        rSbotonREGISTRARtareas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rSbotonREGISTRARtareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbotonREGISTRARtareasActionPerformed(evt);
            }
        });
        jPanel1HORARIO.add(rSbotonREGISTRARtareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 150, 30));

        btnRegMateria.setBackground(new java.awt.Color(255, 0, 0));
        btnRegMateria.setText("Registrar materia");
        btnRegMateria.setToolTipText("Permite registrar una materia");
        btnRegMateria.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRegMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegMateriaActionPerformed(evt);
            }
        });
        jPanel1HORARIO.add(btnRegMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 150, 30));

        btnBorrarRegMat2.setBackground(new java.awt.Color(255, 0, 0));
        btnBorrarRegMat2.setText("Borrar registro materias");
        btnBorrarRegMat2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBorrarRegMat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarRegMat2ActionPerformed(evt);
            }
        });
        jPanel1HORARIO.add(btnBorrarRegMat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 510, 190, 30));

        getContentPane().add(jPanel1HORARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 540));

        rSPanelsSlider1.setBackground(new java.awt.Color(255, 51, 255));
        rSPanelsSlider1.setName("rSPanelsSlider1"); // NOI18N

        jPanel1REGISTROTAREAS.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1REGISTROTAREAS.setName("jPanel1REGISTROTAREAS"); // NOI18N
        jPanel1REGISTROTAREAS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage1LOGOittg.setImagen(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/ITTG_trans.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1LOGOittgLayout = new javax.swing.GroupLayout(rSPanelImage1LOGOittg);
        rSPanelImage1LOGOittg.setLayout(rSPanelImage1LOGOittgLayout);
        rSPanelImage1LOGOittgLayout.setHorizontalGroup(
            rSPanelImage1LOGOittgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        rSPanelImage1LOGOittgLayout.setVerticalGroup(
            rSPanelImage1LOGOittgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        jPanel1REGISTROTAREAS.add(rSPanelImage1LOGOittg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 330, 310));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REALIDAD A LO IMAGINARIO");
        jPanel1REGISTROTAREAS.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        rSPanelsSlider1.add(jPanel1REGISTROTAREAS, "card2");

        rSPanelImage1Contenido.setImagen(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/libreta2.jpg"))); // NOI18N
        rSPanelImage1Contenido.setName("rSPanelImage1Contenido"); // NOI18N
        rSPanelImage1Contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel3.setText("Fecha:");
        rSPanelImage1Contenido.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 15, 40, -1));

        rSbotonBLOQUEARvista.setBackground(new java.awt.Color(255, 204, 102));
        rSbotonBLOQUEARvista.setForeground(new java.awt.Color(0, 0, 0));
        rSbotonBLOQUEARvista.setText("Bloquear vista");
        rSbotonBLOQUEARvista.setToolTipText("Esconde este panel para mostrar el panel de presentación");
        rSbotonBLOQUEARvista.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rSbotonBLOQUEARvista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbotonBLOQUEARvistaActionPerformed(evt);
            }
        });
        rSPanelImage1Contenido.add(rSbotonBLOQUEARvista, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 100, 30));

        rSbotonEditarCONTENIDO.setBackground(new java.awt.Color(255, 204, 102));
        rSbotonEditarCONTENIDO.setForeground(new java.awt.Color(0, 0, 0));
        rSbotonEditarCONTENIDO.setText("Editar contenido");
        rSbotonEditarCONTENIDO.setToolTipText("Edita el contenido del cuaderno");
        rSbotonEditarCONTENIDO.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rSbotonEditarCONTENIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbotonEditarCONTENIDOActionPerformed(evt);
            }
        });
        rSPanelImage1Contenido.add(rSbotonEditarCONTENIDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 75, 100, 30));

        rSbotonGuardarCAMBIOS.setBackground(new java.awt.Color(255, 204, 102));
        rSbotonGuardarCAMBIOS.setForeground(new java.awt.Color(0, 0, 0));
        rSbotonGuardarCAMBIOS.setText("Guardar cambios");
        rSbotonGuardarCAMBIOS.setToolTipText("Guarda los cambios que hayas realizado en el cuaderno");
        rSbotonGuardarCAMBIOS.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rSbotonGuardarCAMBIOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbotonGuardarCAMBIOSActionPerformed(evt);
            }
        });
        rSPanelImage1Contenido.add(rSbotonGuardarCAMBIOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 100, 30));

        rSbotonVERoACTUALIZAR.setBackground(new java.awt.Color(255, 204, 102));
        rSbotonVERoACTUALIZAR.setForeground(new java.awt.Color(0, 0, 0));
        rSbotonVERoACTUALIZAR.setText("Ver o actualizar");
        rSbotonVERoACTUALIZAR.setToolTipText("Observa lo que tienes guardado en el cuaderno o actualiza la vista del contenido");
        rSbotonVERoACTUALIZAR.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rSbotonVERoACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSbotonVERoACTUALIZARActionPerformed(evt);
            }
        });
        rSPanelImage1Contenido.add(rSbotonVERoACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 145, 100, 30));

        jtaContenido.setColumns(20);
        jtaContenido.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jtaContenido.setRows(5);
        jtaContenido.setToolTipText("Escribe tus apuntes en el cuaderno");
        jScrollPane2.setViewportView(jtaContenido);

        rSPanelImage1Contenido.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 227, 417));

        rsbotonCancelar.setBackground(new java.awt.Color(255, 204, 102));
        rsbotonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        rsbotonCancelar.setText("Cancelar");
        rsbotonCancelar.setToolTipText("Cancela los cambios");
        rsbotonCancelar.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rsbotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbotonCancelarActionPerformed(evt);
            }
        });
        rSPanelImage1Contenido.add(rsbotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 215, 75, 30));

        rsFecha2.setToolTipText("");
        rsFecha2.setFormatoFecha("dd/MM/yyyy");
        rsFecha2.setFuente(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        rSPanelImage1Contenido.add(rsFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 5, -1, -1));

        btnAgregarFecha.setBackground(new java.awt.Color(255, 204, 102));
        btnAgregarFecha.setFont(new java.awt.Font("Segoe Print", 1, 9)); // NOI18N
        btnAgregarFecha.setText("Agregar fecha al cuaderno");
        btnAgregarFecha.setToolTipText("Agrega la fecha que seleccionado al cuaderno");
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

    private void rSbotonGuardarCAMBIOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbotonGuardarCAMBIOSActionPerformed
        File f=new File(tareasMartes);
        
        try{
            
        FileWriter fw=new FileWriter(f);
        PrintWriter pw=new PrintWriter(fw);
            
            String contenido = this.jtaContenido.getText();
            
            pw.print("\n");
            pw.print(contenido);

            fw.close();
            JOptionPane.showMessageDialog(null, "Se han guardado los cambios...");
            this.jtaContenido.setText("");
            
            this.rsFecha2.setEnabled(false);
            this.jtaContenido.setEnabled(false);
            this.rSbotonGuardarCAMBIOS.setEnabled(false);
            this.rSbotonEditarCONTENIDO.setEnabled(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error con el archivo"+e);
        }

    }//GEN-LAST:event_rSbotonGuardarCAMBIOSActionPerformed

    private void rSbotonVERoACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbotonVERoACTUALIZARActionPerformed
                
        File archivo=new File(tareasMartes);
        
        try{
            
           FileReader fr=new FileReader(archivo);
           BufferedReader br=new BufferedReader(fr);
            
            String linea=br.readLine();
            if(!(this.jtaContenido.getText().isEmpty())){
                this.jtaContenido.setText("");
                while(linea!=null){
                linea = br.readLine();
                this.jtaContenido.append(linea+"\n");
                
            }
            }else{
            while(linea!=null){
                linea = br.readLine();
                this.jtaContenido.append(linea+"\n");
                
            }
            }
            fr.close();
            br.close();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al leer el archivo"+e);
        }

    }//GEN-LAST:event_rSbotonVERoACTUALIZARActionPerformed

    private void rSbotonEditarCONTENIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbotonEditarCONTENIDOActionPerformed
        this.rsFecha2.setEnabled(true);
        this.jtaContenido.setEnabled(true);
        this.rSbotonGuardarCAMBIOS.setEnabled(true);
        this.rSbotonEditarCONTENIDO.setEnabled(false);
    }//GEN-LAST:event_rSbotonEditarCONTENIDOActionPerformed

    private void rSbotonREGISTRARtareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbotonREGISTRARtareasActionPerformed
        this.rSPanelsSlider1.setPanelSlider(30, rSPanelImage1Contenido, RSPanelsSlider.DIRECT.RIGHT);
        this.rsFecha2.setEnabled(false);
        this.jtaContenido.setEnabled(false);
        this.rSbotonGuardarCAMBIOS.setEnabled(false);
        this.rSbotonEditarCONTENIDO.setEnabled(true);
    }//GEN-LAST:event_rSbotonREGISTRARtareasActionPerformed

    private void rSbotonBLOQUEARvistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSbotonBLOQUEARvistaActionPerformed
        this.rSPanelsSlider1.setPanelSlider(30, jPanel1REGISTROTAREAS, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_rSbotonBLOQUEARvistaActionPerformed

    private void rsbotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbotonCancelarActionPerformed
        this.rsFecha2.setEnabled(false);
        this.jtaContenido.setText("");
        this.jtaContenido.setEnabled(false);
        this.rSbotonGuardarCAMBIOS.setEnabled(false);
        this.rSbotonEditarCONTENIDO.setEnabled(true);
    }//GEN-LAST:event_rsbotonCancelarActionPerformed

    private void btnAgregarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFechaActionPerformed
        String fecha = this.rsFecha2.getDatoFecha().toString();
        this.jtaContenido.setText(fecha+"\n\n");
    }//GEN-LAST:event_btnAgregarFechaActionPerformed

    private void btnRegMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegMateriaActionPerformed
        this.panelRegMaterias.setVisible(true);
    }//GEN-LAST:event_btnRegMateriaActionPerformed

    private void btnCerrarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRegActionPerformed
        this.panelRegMaterias.setVisible(false);
    }//GEN-LAST:event_btnCerrarRegActionPerformed

    private void btnGuardarRegMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegMateriaActionPerformed
        try {
            tabla = new DefaultTableModel();
            String hora = this.txtHora.getText();
            String materia = this.txtMateria.getText();
            
            esMa.setHora_martes(hora);
            esMa.setMateria_martes(materia);
            
            //metMar.guardarMartes(esMa);
            metMar.guardarArchivoMartes(esMa);
            JOptionPane.showMessageDialog(null, "¡Registro guardado correctamente!");
            this.txtHora.setText("");
            this.txtMateria.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar con éxito el registro... "+e);
        }
    }//GEN-LAST:event_btnGuardarRegMateriaActionPerformed

    private void btnActualizarTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTabActionPerformed
        this.tblMartes.setModel(metMar.listaMaterias());
    }//GEN-LAST:event_btnActualizarTabActionPerformed

    private void btnBorrarRegMat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarRegMat2ActionPerformed
        metMar.borrarRegMatMar();
        JOptionPane.showMessageDialog(this, "Los registros de materias han sido borrados...", "Martes", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnBorrarRegMat2ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_Martes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Martes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Martes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Martes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interfaz_Martes dialog = new Interfaz_Martes(new javax.swing.JFrame(), true);
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
    private rojeru_san.complementos.RSButtonHover btnBorrarRegMat2;
    private rojerusan.RSButtonHover btnCerrarReg;
    private rojerusan.RSButtonHover btnGuardarRegMateria;
    private rojerusan.RSButtonHover btnRegMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1HORARIO;
    private javax.swing.JPanel jPanel1REGISTROTAREAS;
    private javax.swing.JPanel jPanel2TABLAMATERIAS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jtaContenido;
    private javax.swing.JPanel panelRegMaterias;
    private rojerusan.RSPanelImage rSPanelImage1COMPU;
    private rojerusan.RSPanelImage rSPanelImage1Contenido;
    private rojerusan.RSPanelImage rSPanelImage1LOGOittg;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private rojerusan.RSButtonMetro rSbotonBLOQUEARvista;
    private rojerusan.RSButtonMetro rSbotonEditarCONTENIDO;
    private rojerusan.RSButtonMetro rSbotonGuardarCAMBIOS;
    private rojerusan.RSButtonHover rSbotonREGISTRARtareas;
    private rojerusan.RSButtonMetro rSbotonVERoACTUALIZAR;
    private rojeru_san.componentes.RSDateChooser rsFecha2;
    private rojerusan.RSButtonMetro rsbotonCancelar;
    private javax.swing.JTable tblMartes;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMateria;
    // End of variables declaration//GEN-END:variables
}
