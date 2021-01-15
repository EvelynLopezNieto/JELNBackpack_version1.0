
package VENTANAS_PRINCIPALES;

import ESTRUCTURA_GENERAL_DE_CLASES.Estructura_Viernes;
import METODOS_DE_FUNCIONAMIENTO.Metodos_Viernes;
import java.io.*;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSPanelsSlider;


public class Interfaz_Viernes extends javax.swing.JDialog {

    Estructura_Viernes esVi = new Estructura_Viernes();
    Metodos_Viernes metVie = new Metodos_Viernes();
    Vector vCabeceras = new Vector();
    DefaultTableModel tabla;
    String tareasViernes = "C:"+File.separator+"JELNBackpack"+File.separator+"Registro_Tareas"
                    +File.separator+"Viernes.txt";

    public Interfaz_Viernes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/mochila1.png")).getImage());
        this.panelRegistroMaterias.setVisible(false);
        
        this.tblViernes.setModel(metVie.listaMaterias());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanHORARIO = new javax.swing.JPanel();
        jPanTabMATERIAS = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViernes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        panelRegistroMaterias = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtMateria = new javax.swing.JTextField();
        btnGuardarReg = new rojerusan.RSButtonHover();
        btnActualizarTabla = new rojerusan.RSButtonHover();
        btnCerrarRegistro = new rojerusan.RSButtonHover();
        rSPanImgCOMPU = new rojerusan.RSPanelImage();
        rsbtnRegistrarTareas = new rojerusan.RSButtonHover();
        btnRegistrarMate = new rojerusan.RSButtonHover();
        btnBorrarRegMat5 = new rojeru_san.complementos.RSButtonHover();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        jPanREGISTROtareas = new javax.swing.JPanel();
        rSPanImgLOGOittg = new rojerusan.RSPanelImage();
        jLabel2 = new javax.swing.JLabel();
        rSPanelImgCONTENIDO = new rojerusan.RSPanelImage();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaTareas = new javax.swing.JTextArea();
        rsbtnCancelar = new rojerusan.RSButtonMetro();
        rsbtnEditarContenido = new rojerusan.RSButtonMetro();
        rsbtnGuardarCambios = new rojerusan.RSButtonMetro();
        rsbtnVerActualizar = new rojerusan.RSButtonMetro();
        rsbtnBloqVista = new rojerusan.RSButtonMetro();
        rsFecha5 = new rojeru_san.componentes.RSDateChooser();
        btnAgregarFecha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Viernes - JELNBackpack");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanHORARIO.setBackground(new java.awt.Color(0, 51, 51));
        jPanHORARIO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanTabMATERIAS.setBackground(new java.awt.Color(0, 153, 153));
        jPanTabMATERIAS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tblViernes.setBackground(new java.awt.Color(255, 255, 0));
        tblViernes.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        tblViernes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"15:00|16:00", "SISTEMAS OPERATIVOS"},
                {"16:00|17:00", "ARQUITECTURA DE COMPUTADORAS"},
                {"17:00|18:00", "GRAFICACIÓN"},
                {"18:00|19:00", "FUNDAMENTOS DE TELECOMUNICACIONES"},
                {"19:00|20:00", "*********"},
                {"20:00|21:00", "*********"}
            },
            new String [] {
                "Hora", "Clase"
            }
        ));
        tblViernes.setRowHeight(30);
        jScrollPane1.setViewportView(tblViernes);
        if (tblViernes.getColumnModel().getColumnCount() > 0) {
            tblViernes.getColumnModel().getColumn(0).setPreferredWidth(0);
        }

        jPanTabMATERIAS.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 530, 209));

        jLabel1.setFont(new java.awt.Font("Stencil", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIERNES");
        jPanTabMATERIAS.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 230, 50));

        jPanHORARIO.add(jPanTabMATERIAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 50, 550, 285));

        panelRegistroMaterias.setBackground(new java.awt.Color(0, 153, 153));
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

        btnGuardarReg.setBackground(new java.awt.Color(255, 0, 0));
        btnGuardarReg.setText("Guardar");
        btnGuardarReg.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnGuardarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarRegActionPerformed(evt);
            }
        });
        panelRegistroMaterias.add(btnGuardarReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 63, 85, 20));

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

        jPanHORARIO.add(panelRegistroMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 420, 90));

        rSPanImgCOMPU.setImagen(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/compu.png"))); // NOI18N
        jPanHORARIO.add(rSPanImgCOMPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 560, 470));

        rsbtnRegistrarTareas.setBackground(new java.awt.Color(255, 0, 0));
        rsbtnRegistrarTareas.setText("Registrar tareas");
        rsbtnRegistrarTareas.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        rsbtnRegistrarTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbtnRegistrarTareasActionPerformed(evt);
            }
        });
        jPanHORARIO.add(rsbtnRegistrarTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 150, 30));

        btnRegistrarMate.setBackground(new java.awt.Color(255, 0, 0));
        btnRegistrarMate.setText("Registrar materia");
        btnRegistrarMate.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnRegistrarMate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMateActionPerformed(evt);
            }
        });
        jPanHORARIO.add(btnRegistrarMate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 150, 30));

        btnBorrarRegMat5.setBackground(new java.awt.Color(255, 0, 0));
        btnBorrarRegMat5.setText("Borrar registro materias");
        btnBorrarRegMat5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnBorrarRegMat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarRegMat5ActionPerformed(evt);
            }
        });
        jPanHORARIO.add(btnBorrarRegMat5, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 510, 190, 30));

        getContentPane().add(jPanHORARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 540));

        rSPanelsSlider1.setBackground(new java.awt.Color(102, 255, 255));
        rSPanelsSlider1.setName("rSPanelsSlider1"); // NOI18N

        jPanREGISTROtareas.setBackground(new java.awt.Color(0, 51, 51));
        jPanREGISTROtareas.setName("jPanREGISTROtareas"); // NOI18N
        jPanREGISTROtareas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanImgLOGOittg.setImagen(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/ITTG_trans.png"))); // NOI18N
        jPanREGISTROtareas.add(rSPanImgLOGOittg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 330, 310));

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REALIDAD A LO IMAGINARIO");
        jPanREGISTROtareas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        rSPanelsSlider1.add(jPanREGISTROtareas, "card2");

        rSPanelImgCONTENIDO.setImagen(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/libreta2.jpg"))); // NOI18N
        rSPanelImgCONTENIDO.setName("rSPanelImgCONTENIDO"); // NOI18N
        rSPanelImgCONTENIDO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel3.setText("Fecha:");
        rSPanelImgCONTENIDO.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 15, 40, -1));

        jScrollPane2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        txtAreaTareas.setColumns(20);
        txtAreaTareas.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        txtAreaTareas.setRows(5);
        txtAreaTareas.setToolTipText("Escribe tus apuntes aquí");
        jScrollPane2.setViewportView(txtAreaTareas);

        rSPanelImgCONTENIDO.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 227, 417));

        rsbtnCancelar.setBackground(new java.awt.Color(255, 204, 102));
        rsbtnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        rsbtnCancelar.setText("Cancelar");
        rsbtnCancelar.setToolTipText("Cancela los cambios realizados del cuaderno");
        rsbtnCancelar.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rsbtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbtnCancelarActionPerformed(evt);
            }
        });
        rSPanelImgCONTENIDO.add(rsbtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 215, 75, 30));

        rsbtnEditarContenido.setBackground(new java.awt.Color(255, 204, 102));
        rsbtnEditarContenido.setForeground(new java.awt.Color(0, 0, 0));
        rsbtnEditarContenido.setText("Editar contenido");
        rsbtnEditarContenido.setToolTipText("Edita el contenido del cuaderno");
        rsbtnEditarContenido.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rsbtnEditarContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbtnEditarContenidoActionPerformed(evt);
            }
        });
        rSPanelImgCONTENIDO.add(rsbtnEditarContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 75, 100, 30));

        rsbtnGuardarCambios.setBackground(new java.awt.Color(255, 204, 102));
        rsbtnGuardarCambios.setForeground(new java.awt.Color(0, 0, 0));
        rsbtnGuardarCambios.setText("Guardar cambios");
        rsbtnGuardarCambios.setToolTipText("Guarda los cambios realizados en el cuaderno");
        rsbtnGuardarCambios.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rsbtnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbtnGuardarCambiosActionPerformed(evt);
            }
        });
        rSPanelImgCONTENIDO.add(rsbtnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 100, 30));

        rsbtnVerActualizar.setBackground(new java.awt.Color(255, 204, 102));
        rsbtnVerActualizar.setForeground(new java.awt.Color(0, 0, 0));
        rsbtnVerActualizar.setText("Ver o actualizar");
        rsbtnVerActualizar.setToolTipText("Visualiza el contenido del cuaderno o actualiza la vista del contenido");
        rsbtnVerActualizar.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rsbtnVerActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbtnVerActualizarActionPerformed(evt);
            }
        });
        rSPanelImgCONTENIDO.add(rsbtnVerActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 145, 100, 30));

        rsbtnBloqVista.setBackground(new java.awt.Color(255, 204, 102));
        rsbtnBloqVista.setForeground(new java.awt.Color(0, 0, 0));
        rsbtnBloqVista.setText("Bloquear vista");
        rsbtnBloqVista.setToolTipText("Esconde este panel para mostrar la presentación");
        rsbtnBloqVista.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        rsbtnBloqVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rsbtnBloqVistaActionPerformed(evt);
            }
        });
        rSPanelImgCONTENIDO.add(rsbtnBloqVista, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 100, 30));

        rsFecha5.setFormatoFecha("dd/MM/yyyy");
        rsFecha5.setFuente(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        rSPanelImgCONTENIDO.add(rsFecha5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 5, -1, -1));

        btnAgregarFecha.setBackground(new java.awt.Color(255, 204, 102));
        btnAgregarFecha.setFont(new java.awt.Font("Segoe Print", 1, 9)); // NOI18N
        btnAgregarFecha.setText("Agregar fecha al cuaderno");
        btnAgregarFecha.setToolTipText("Agrega la fecha seleccionada al cuaderno");
        btnAgregarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFechaActionPerformed(evt);
            }
        });
        rSPanelImgCONTENIDO.add(btnAgregarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 47, 155, 20));

        rSPanelsSlider1.add(rSPanelImgCONTENIDO, "card3");

        getContentPane().add(rSPanelsSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 360, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rsbtnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbtnGuardarCambiosActionPerformed
        File f=new File(tareasViernes);
        
        try{
            
        FileWriter fw=new FileWriter(f);
        PrintWriter pw=new PrintWriter(fw);
            
            String contenido = this.txtAreaTareas.getText();
            
            pw.print("\n");
            pw.print(contenido);

            fw.close();
            JOptionPane.showMessageDialog(null, "Se han guardado los cambios...");
            this.txtAreaTareas.setText("");
            
            this.rsFecha5.setEnabled(false);
            this.txtAreaTareas.setEnabled(false);
            this.rsbtnGuardarCambios.setEnabled(false);
            this.rsbtnEditarContenido.setEnabled(true);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error con el archivo"+e);
        }

    }//GEN-LAST:event_rsbtnGuardarCambiosActionPerformed

    private void rsbtnVerActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbtnVerActualizarActionPerformed
        File archivo=new File(tareasViernes);
        
        try{
            
           FileReader fr=new FileReader(archivo);
           BufferedReader br=new BufferedReader(fr);
            
            String linea=br.readLine();
            if(!(this.txtAreaTareas.getText().isEmpty())){
                this.txtAreaTareas.setText("");
                while(linea!=null){
                linea = br.readLine();
                this.txtAreaTareas.append(linea+"\n");
                
            }
            }else{
            while(linea!=null){
                linea = br.readLine();
                this.txtAreaTareas.append(linea+"\n");
                
            }
            }
            fr.close();
            br.close();
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al leer el archivo"+e);
        }

    }//GEN-LAST:event_rsbtnVerActualizarActionPerformed

    private void rsbtnEditarContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbtnEditarContenidoActionPerformed
        this.rsFecha5.setEnabled(true);
        this.txtAreaTareas.setEnabled(true);
        this.rsbtnGuardarCambios.setEnabled(true);
        this.rsbtnEditarContenido.setEnabled(false);
    }//GEN-LAST:event_rsbtnEditarContenidoActionPerformed

    private void rsbtnRegistrarTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbtnRegistrarTareasActionPerformed
        this.rSPanelsSlider1.setPanelSlider(30, rSPanelImgCONTENIDO, RSPanelsSlider.DIRECT.RIGHT);
        this.rsFecha5.setEnabled(false);
        this.txtAreaTareas.setEnabled(false);
        this.rsbtnGuardarCambios.setEnabled(false);
        this.rsbtnEditarContenido.setEnabled(true);
    }//GEN-LAST:event_rsbtnRegistrarTareasActionPerformed

    private void rsbtnBloqVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbtnBloqVistaActionPerformed
        this.rSPanelsSlider1.setPanelSlider(30, jPanREGISTROtareas, RSPanelsSlider.DIRECT.RIGHT);
    }//GEN-LAST:event_rsbtnBloqVistaActionPerformed

    private void rsbtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rsbtnCancelarActionPerformed
        this.rsFecha5.setEnabled(false);
        this.txtAreaTareas.setText("");
        this.txtAreaTareas.setEnabled(false);
        this.rsbtnGuardarCambios.setEnabled(false);
        this.rsbtnEditarContenido.setEnabled(true);
    }//GEN-LAST:event_rsbtnCancelarActionPerformed

    private void btnAgregarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFechaActionPerformed
        String fecha = this.rsFecha5.getDatoFecha().toString();
        this.txtAreaTareas.setText(fecha+"\n\n");
    }//GEN-LAST:event_btnAgregarFechaActionPerformed

    private void btnRegistrarMateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMateActionPerformed
        this.panelRegistroMaterias.setVisible(true);
    }//GEN-LAST:event_btnRegistrarMateActionPerformed

    private void btnCerrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRegistroActionPerformed
        this.panelRegistroMaterias.setVisible(false);
    }//GEN-LAST:event_btnCerrarRegistroActionPerformed

    private void btnGuardarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRegActionPerformed
        try {
            tabla = new DefaultTableModel();
            String hora = this.txtHora.getText();
            String materia = this.txtMateria.getText();
            
            esVi.setHora_viernes(hora);
            esVi.setMateria_viernes(materia);
            
            //metVie.guardarViernes(esVi);
            metVie.guardarArchivoViernes(esVi);
            JOptionPane.showMessageDialog(null, "¡Registro guardado correctamente!");
            this.txtHora.setText("");
            this.txtMateria.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar con éxito el registro... "+e);
        }
    }//GEN-LAST:event_btnGuardarRegActionPerformed

    private void btnActualizarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaActionPerformed
        this.tblViernes.setModel(metVie.listaMaterias());
    }//GEN-LAST:event_btnActualizarTablaActionPerformed

    private void btnBorrarRegMat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarRegMat5ActionPerformed
       metVie.borrarRegMatVi();
       JOptionPane.showMessageDialog(this, "Los registros de materias han sido borrados...", "Viernes", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnBorrarRegMat5ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_Viernes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Viernes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Viernes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Viernes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Interfaz_Viernes dialog = new Interfaz_Viernes(new javax.swing.JFrame(), true);
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
    private rojeru_san.complementos.RSButtonHover btnBorrarRegMat5;
    private rojerusan.RSButtonHover btnCerrarRegistro;
    private rojerusan.RSButtonHover btnGuardarReg;
    private rojerusan.RSButtonHover btnRegistrarMate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanHORARIO;
    private javax.swing.JPanel jPanREGISTROtareas;
    private javax.swing.JPanel jPanTabMATERIAS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelRegistroMaterias;
    private rojerusan.RSPanelImage rSPanImgCOMPU;
    private rojerusan.RSPanelImage rSPanImgLOGOittg;
    private rojerusan.RSPanelImage rSPanelImgCONTENIDO;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private rojeru_san.componentes.RSDateChooser rsFecha5;
    private rojerusan.RSButtonMetro rsbtnBloqVista;
    private rojerusan.RSButtonMetro rsbtnCancelar;
    private rojerusan.RSButtonMetro rsbtnEditarContenido;
    private rojerusan.RSButtonMetro rsbtnGuardarCambios;
    private rojerusan.RSButtonHover rsbtnRegistrarTareas;
    private rojerusan.RSButtonMetro rsbtnVerActualizar;
    private javax.swing.JTable tblViernes;
    private javax.swing.JTextArea txtAreaTareas;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMateria;
    // End of variables declaration//GEN-END:variables
}
