
package VENTANAS_PRINCIPALES;

import OTRAS_FUNCIONES.Ficheros_Directorios;
import METODOS_DE_FUNCIONAMIENTO.*;
import OTRAS_FUNCIONES.Acerca_De;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rojerusan.RSPanelsSlider;

public class Interfaz_MenuPrincipal extends javax.swing.JFrame {
    
    Metodos_Lunes m = new Metodos_Lunes();
    Metodos_Martes m2 = new Metodos_Martes();
    Metodos_Miercoles m3 = new Metodos_Miercoles();
    Metodos_Jueves m4 = new Metodos_Jueves();
    Metodos_Viernes m5 = new Metodos_Viernes();
    
    public Interfaz_MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/mochila1.png")).getImage());
        this.lblIndicacionHorarios.setText("<html><p>Si es la primera vez que abres el programa,"
                + " es necesario que primero registres tus materias cuando ingreses a las ventanas"
                + " de los horarios, ya que al principio las tablas no mostrarán nada y habrá un mensaje"
                + " de error.</p></html>");
        this.btnInicio.setEnabled(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        panelInicio = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        panelBTNHorarios = new javax.swing.JPanel();
        btnLunes = new javax.swing.JButton();
        btnMartes = new javax.swing.JButton();
        btnMiercoles = new javax.swing.JButton();
        btnJueves = new javax.swing.JButton();
        btnViernes = new javax.swing.JButton();
        lblIndicacionHorarios = new javax.swing.JLabel();
        panelCalendar = new javax.swing.JPanel();
        rSCalendar1 = new rojeru_san.componentes.RSCalendar();
        panelTitulo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelBTNOpciones = new javax.swing.JPanel();
        btnInicio = new rojerusan.RSButtonHover();
        btnHorarios = new rojerusan.RSButtonHover();
        btnCalendario = new rojerusan.RSButtonHover();
        btnCerrar = new rojerusan.RSButtonHover();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItCrearFD = new javax.swing.JMenuItem();
        MenuItBorrarReg = new javax.swing.JMenuItem();
        MenuItSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuItem3L = new javax.swing.JMenuItem();
        MenuItem4M = new javax.swing.JMenuItem();
        MenuItem5Mi = new javax.swing.JMenuItem();
        MenuItem6J = new javax.swing.JMenuItem();
        MenuItem7V = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuItManual = new javax.swing.JMenuItem();
        MenuItAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú principal - JELNBackpack");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelsSlider1.setName("rSPanelsSlider1"); // NOI18N

        panelInicio.setBackground(new java.awt.Color(0, 0, 51));
        panelInicio.setName("panelInicio"); // NOI18N
        panelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Todos los derechos reservados para ISCELN Dev. 2019");
        panelInicio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 375, -1, -1));

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/mochila1.png"))); // NOI18N
        panelInicio.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 370, 320));

        rSPanelsSlider1.add(panelInicio, "card3");

        panelBTNHorarios.setBackground(new java.awt.Color(102, 0, 0));
        panelBTNHorarios.setName("panelBTNHorarios"); // NOI18N
        panelBTNHorarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLunes.setBackground(new java.awt.Color(204, 0, 0));
        btnLunes.setFont(new java.awt.Font("Snap ITC", 1, 30)); // NOI18N
        btnLunes.setForeground(new java.awt.Color(255, 255, 255));
        btnLunes.setText("LUNES");
        btnLunes.setBorder(null);
        btnLunes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnLunesMouseMoved(evt);
            }
        });
        btnLunes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLunesMouseExited(evt);
            }
        });
        btnLunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLunesActionPerformed(evt);
            }
        });
        panelBTNHorarios.add(btnLunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 170, 170));

        btnMartes.setBackground(new java.awt.Color(204, 0, 0));
        btnMartes.setFont(new java.awt.Font("Snap ITC", 1, 29)); // NOI18N
        btnMartes.setForeground(new java.awt.Color(255, 255, 255));
        btnMartes.setText("MARTES");
        btnMartes.setBorder(null);
        btnMartes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnMartesMouseMoved(evt);
            }
        });
        btnMartes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMartesMouseExited(evt);
            }
        });
        btnMartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMartesActionPerformed(evt);
            }
        });
        panelBTNHorarios.add(btnMartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 20, 170, 170));

        btnMiercoles.setBackground(new java.awt.Color(204, 0, 0));
        btnMiercoles.setFont(new java.awt.Font("Snap ITC", 1, 20)); // NOI18N
        btnMiercoles.setForeground(new java.awt.Color(255, 255, 255));
        btnMiercoles.setText("MIÉRCOLES");
        btnMiercoles.setBorder(null);
        btnMiercoles.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnMiercolesMouseMoved(evt);
            }
        });
        btnMiercoles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMiercolesMouseExited(evt);
            }
        });
        btnMiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiercolesActionPerformed(evt);
            }
        });
        panelBTNHorarios.add(btnMiercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 170, 170));

        btnJueves.setBackground(new java.awt.Color(204, 0, 0));
        btnJueves.setFont(new java.awt.Font("Snap ITC", 1, 30)); // NOI18N
        btnJueves.setForeground(new java.awt.Color(255, 255, 255));
        btnJueves.setText("JUEVES");
        btnJueves.setBorder(null);
        btnJueves.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnJuevesMouseMoved(evt);
            }
        });
        btnJueves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnJuevesMouseExited(evt);
            }
        });
        btnJueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuevesActionPerformed(evt);
            }
        });
        panelBTNHorarios.add(btnJueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 170, 170));

        btnViernes.setBackground(new java.awt.Color(204, 0, 0));
        btnViernes.setFont(new java.awt.Font("Snap ITC", 1, 27)); // NOI18N
        btnViernes.setForeground(new java.awt.Color(255, 255, 255));
        btnViernes.setText("VIERNES");
        btnViernes.setBorder(null);
        btnViernes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnViernesMouseMoved(evt);
            }
        });
        btnViernes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViernesMouseExited(evt);
            }
        });
        btnViernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViernesActionPerformed(evt);
            }
        });
        panelBTNHorarios.add(btnViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 210, 170, 170));

        lblIndicacionHorarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lblIndicacionHorarios.setForeground(new java.awt.Color(255, 255, 255));
        lblIndicacionHorarios.setText("Indicaciones");
        panelBTNHorarios.add(lblIndicacionHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 200, 190));

        rSPanelsSlider1.add(panelBTNHorarios, "card2");

        panelCalendar.setBackground(new java.awt.Color(51, 0, 51));
        panelCalendar.setName("panelCalendar"); // NOI18N
        panelCalendar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSCalendar1.setBackground(new java.awt.Color(204, 204, 255));
        rSCalendar1.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        rSCalendar1.setFuenteFilas(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        rSCalendar1.setFuenteHead(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        panelCalendar.add(rSCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 380));

        rSPanelsSlider1.add(panelCalendar, "card4");

        getContentPane().add(rSPanelsSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 600, 400));

        panelTitulo.setBackground(new java.awt.Color(204, 0, 0));
        panelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Ravie", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡TU AGENDA ESCOLAR!");
        panelTitulo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        getContentPane().add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        panelBTNOpciones.setBackground(new java.awt.Color(255, 255, 255));
        panelBTNOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio.setBackground(new java.awt.Color(102, 102, 102));
        btnInicio.setText("Inicio");
        btnInicio.setColorHover(new java.awt.Color(255, 204, 0));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        panelBTNOpciones.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 50));

        btnHorarios.setBackground(new java.awt.Color(102, 102, 102));
        btnHorarios.setText("Horarios");
        btnHorarios.setColorHover(new java.awt.Color(255, 204, 0));
        btnHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorariosActionPerformed(evt);
            }
        });
        panelBTNOpciones.add(btnHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 50));

        btnCalendario.setBackground(new java.awt.Color(102, 102, 102));
        btnCalendario.setText("Calendario");
        btnCalendario.setColorHover(new java.awt.Color(255, 204, 0));
        btnCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalendarioActionPerformed(evt);
            }
        });
        panelBTNOpciones.add(btnCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, 50));

        btnCerrar.setBackground(new java.awt.Color(102, 102, 102));
        btnCerrar.setText("Salir");
        btnCerrar.setColorHover(new java.awt.Color(255, 204, 0));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        panelBTNOpciones.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES_PARA_DISEÑO_DE_INTERFACES/robot.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panelBTNOpciones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 400));

        getContentPane().add(panelBTNOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 400));

        jMenu1.setText("Menú");

        MenuItCrearFD.setText("Crear ficheros y directorios");
        MenuItCrearFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItCrearFDActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItCrearFD);

        MenuItBorrarReg.setText("Borrar registro de materias");
        MenuItBorrarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItBorrarRegActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItBorrarReg);

        MenuItSalir.setText("Salir");
        MenuItSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItSalirActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Horarios");

        MenuItem3L.setText("Lunes");
        MenuItem3L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem3LActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItem3L);

        MenuItem4M.setText("Martes");
        MenuItem4M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem4MActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItem4M);

        MenuItem5Mi.setText("Miércoles");
        MenuItem5Mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem5MiActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItem5Mi);

        MenuItem6J.setText("Jueves");
        MenuItem6J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem6JActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItem6J);

        MenuItem7V.setText("Viernes");
        MenuItem7V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem7VActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItem7V);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        MenuItManual.setText("Ver manual");
        jMenu3.add(MenuItManual);

        MenuItAcercaDe.setText("Acerca de");
        MenuItAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItAcercaDeActionPerformed(evt);
            }
        });
        jMenu3.add(MenuItAcercaDe);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLunesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLunesMouseExited
        this.btnLunes.setBackground(Color.red);
        this.btnLunes.setForeground(Color.white);
        this.btnLunes.setSize(170, 170);
    }//GEN-LAST:event_btnLunesMouseExited

    private void btnLunesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLunesMouseMoved
        this.btnLunes.setBackground(Color.orange);
        this.btnLunes.setForeground(Color.blue);
        this.btnLunes.setSize(190, 190);
    }//GEN-LAST:event_btnLunesMouseMoved

    private void btnMartesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMartesMouseExited
        this.btnMartes.setBackground(Color.red);
        this.btnMartes.setForeground(Color.white);
        this.btnMartes.setSize(170, 170);
    }//GEN-LAST:event_btnMartesMouseExited

    private void btnMartesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMartesMouseMoved
        this.btnMartes.setBackground(Color.orange);
        this.btnMartes.setForeground(Color.blue);
        this.btnMartes.setSize(190, 190);
    }//GEN-LAST:event_btnMartesMouseMoved

    private void btnMiercolesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMiercolesMouseExited
        this.btnMiercoles.setBackground(Color.red);
        this.btnMiercoles.setForeground(Color.white);
        this.btnMiercoles.setSize(170, 170);
    }//GEN-LAST:event_btnMiercolesMouseExited

    private void btnMiercolesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMiercolesMouseMoved
        this.btnMiercoles.setBackground(Color.orange);
        this.btnMiercoles.setForeground(Color.blue);
        this.btnMiercoles.setSize(190, 190);
    }//GEN-LAST:event_btnMiercolesMouseMoved

    private void btnJuevesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJuevesMouseExited
        this.btnJueves.setBackground(Color.red);
        this.btnJueves.setForeground(Color.white);
        this.btnJueves.setSize(170, 170);
    }//GEN-LAST:event_btnJuevesMouseExited

    private void btnJuevesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJuevesMouseMoved
        this.btnJueves.setBackground(Color.orange);
        this.btnJueves.setForeground(Color.blue);
        this.btnJueves.setSize(190, 190);
    }//GEN-LAST:event_btnJuevesMouseMoved

    private void btnViernesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViernesMouseExited
        this.btnViernes.setBackground(Color.red);
        this.btnViernes.setForeground(Color.white);
        this.btnViernes.setSize(170, 170);
    }//GEN-LAST:event_btnViernesMouseExited

    private void btnViernesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViernesMouseMoved
        this.btnViernes.setBackground(Color.orange);
        this.btnViernes.setForeground(Color.blue);
        this.btnViernes.setSize(190, 190);
    }//GEN-LAST:event_btnViernesMouseMoved

    private void btnLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLunesActionPerformed
        Interfaz_Lunes l = new Interfaz_Lunes(new javax.swing.JFrame(), true);
        
        l.setVisible(true);
    }//GEN-LAST:event_btnLunesActionPerformed

    private void btnMartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMartesActionPerformed
        Interfaz_Martes m = new Interfaz_Martes(new javax.swing.JFrame(), true);
        
        m.setVisible(true);
    }//GEN-LAST:event_btnMartesActionPerformed

    private void btnMiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiercolesActionPerformed
        Interfaz_Miercoles mi = new Interfaz_Miercoles(new javax.swing.JFrame(), true);
        
        mi.setVisible(true);
    }//GEN-LAST:event_btnMiercolesActionPerformed

    private void btnJuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuevesActionPerformed
        Interfaz_Jueves j = new Interfaz_Jueves(new javax.swing.JFrame(), true);
        
        j.setVisible(true);
    }//GEN-LAST:event_btnJuevesActionPerformed

    private void btnViernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViernesActionPerformed
        Interfaz_Viernes v = new Interfaz_Viernes(new javax.swing.JFrame(), true);
        
        v.setVisible(true);
    }//GEN-LAST:event_btnViernesActionPerformed

    private void btnHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorariosActionPerformed
        this.rSPanelsSlider1.setPanelSlider(30, panelBTNHorarios, RSPanelsSlider.DIRECT.RIGHT);
        this.btnInicio.setEnabled(true);
        this.btnCalendario.setEnabled(true);
        this.btnHorarios.setEnabled(false);
    }//GEN-LAST:event_btnHorariosActionPerformed

    private void btnCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalendarioActionPerformed
        this.rSPanelsSlider1.setPanelSlider(30, panelCalendar, RSPanelsSlider.DIRECT.RIGHT);
        this.btnInicio.setEnabled(true);
        this.btnHorarios.setEnabled(true);
        this.btnCalendario.setEnabled(false);
    }//GEN-LAST:event_btnCalendarioActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.rSPanelsSlider1.setPanelSlider(30, panelInicio, RSPanelsSlider.DIRECT.RIGHT);
        this.btnHorarios.setEnabled(true);
        this.btnCalendario.setEnabled(true);
        this.btnInicio.setEnabled(false);
        
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void MenuItem3LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem3LActionPerformed
        Interfaz_Lunes l = new Interfaz_Lunes(new javax.swing.JFrame(), true);
        l.setVisible(true);
    }//GEN-LAST:event_MenuItem3LActionPerformed

    private void MenuItem4MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem4MActionPerformed
        Interfaz_Martes m = new Interfaz_Martes(new javax.swing.JFrame(), true);
        m.setVisible(true);
    }//GEN-LAST:event_MenuItem4MActionPerformed

    private void MenuItem5MiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem5MiActionPerformed
        Interfaz_Miercoles mi = new Interfaz_Miercoles(new javax.swing.JFrame(), true);
        mi.setVisible(true);
    }//GEN-LAST:event_MenuItem5MiActionPerformed

    private void MenuItem6JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem6JActionPerformed
        Interfaz_Jueves j = new Interfaz_Jueves(new javax.swing.JFrame(), true);
        j.setVisible(true);
    }//GEN-LAST:event_MenuItem6JActionPerformed

    private void MenuItem7VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem7VActionPerformed
        Interfaz_Viernes v = new Interfaz_Viernes(new javax.swing.JFrame(), true);
        v.setVisible(true);
    }//GEN-LAST:event_MenuItem7VActionPerformed

    private void MenuItCrearFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItCrearFDActionPerformed
        Ficheros_Directorios fd = new Ficheros_Directorios(new javax.swing.JFrame(), true);
        fd.setVisible(true);
    }//GEN-LAST:event_MenuItCrearFDActionPerformed

    private void MenuItSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuItSalirActionPerformed

    private void MenuItBorrarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItBorrarRegActionPerformed
        m.borrarRegMatLun();
        m2.borrarRegMatMar();
        m3.borrarRegMatMi();
        m4.borrarRegMatJu();
        m5.borrarRegMatVi();
        JOptionPane.showMessageDialog(null, "Los registros de las materias han sido\n"
                + "borrados con éxito de los ficheros,\n"
                + "lo que significa que tienes que volver\n"
                + "a registrar tus materias...", "Registros eliminados", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_MenuItBorrarRegActionPerformed

    private void MenuItAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItAcercaDeActionPerformed
        Acerca_De ac = new Acerca_De(new javax.swing.JFrame(), true);
        ac.setVisible(true);
    }//GEN-LAST:event_MenuItAcercaDeActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItAcercaDe;
    private javax.swing.JMenuItem MenuItBorrarReg;
    private javax.swing.JMenuItem MenuItCrearFD;
    private javax.swing.JMenuItem MenuItManual;
    private javax.swing.JMenuItem MenuItSalir;
    private javax.swing.JMenuItem MenuItem3L;
    private javax.swing.JMenuItem MenuItem4M;
    private javax.swing.JMenuItem MenuItem5Mi;
    private javax.swing.JMenuItem MenuItem6J;
    private javax.swing.JMenuItem MenuItem7V;
    private rojerusan.RSButtonHover btnCalendario;
    private rojerusan.RSButtonHover btnCerrar;
    private rojerusan.RSButtonHover btnHorarios;
    private rojerusan.RSButtonHover btnInicio;
    private javax.swing.JButton btnJueves;
    private javax.swing.JButton btnLunes;
    private javax.swing.JButton btnMartes;
    private javax.swing.JButton btnMiercoles;
    private javax.swing.JButton btnViernes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblIndicacionHorarios;
    private javax.swing.JPanel panelBTNHorarios;
    private javax.swing.JPanel panelBTNOpciones;
    private javax.swing.JPanel panelCalendar;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelTitulo;
    private rojeru_san.componentes.RSCalendar rSCalendar1;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    // End of variables declaration//GEN-END:variables
}
