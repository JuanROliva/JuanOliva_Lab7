/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package juanoliva_lab7;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jr_02
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        crearModeloTabla();
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        d_SimulacionPartido = new javax.swing.JDialog();
        lb_Equipo2_Simulacion = new javax.swing.JLabel();
        lb_Equipo1_Simulacion = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lb_ResultadoEquipo1_Simulacion = new javax.swing.JLabel();
        lb_ResultadoEquipo2_Simulacion = new javax.swing.JLabel();
        bt_Cerrar_Simulacion = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        d_AgregarEquipo = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        bt_AceptacionAgregarEquipo = new javax.swing.JButton();
        bt_Cancelar_AgregarEquipo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jt_NombreEquipo_Agregar = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        d_ModificarEquipo = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        lb_NombreEquipo_Modificar = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        ff_PartidosJugados = new javax.swing.JFormattedTextField();
        ff_PartidosGanados = new javax.swing.JFormattedTextField();
        ff_PartidosEmpatados = new javax.swing.JFormattedTextField();
        ff_PartidosPerdidos = new javax.swing.JFormattedTextField();
        jSeparator10 = new javax.swing.JSeparator();
        ff_GolesFavor = new javax.swing.JFormattedTextField();
        ff_GolesContra = new javax.swing.JFormattedTextField();
        ff_DiferenciaGoles = new javax.swing.JFormattedTextField();
        ff_Puntos = new javax.swing.JFormattedTextField();
        bt_ModificarDatos = new javax.swing.JButton();
        bt_Cancelar_ModificarDatos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Posiciones = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bt_AgregarEquipo = new javax.swing.JButton();
        bt_CargarDatos = new javax.swing.JButton();
        cbox_Equipo1 = new javax.swing.JComboBox<>();
        cbox_Equipo2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bt_SimularPartido = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        cbox_EliminarEquipo = new javax.swing.JComboBox<>();
        bt_EliminarEquipo = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        cbox_ModificarEquipo = new javax.swing.JComboBox<>();
        bt_ModificarDatosEquipo = new javax.swing.JButton();

        d_SimulacionPartido.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_Equipo2_Simulacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_Equipo2_Simulacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Equipo2_Simulacion.setText("Equipo 2");
        d_SimulacionPartido.getContentPane().add(lb_Equipo2_Simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 155, 36));

        lb_Equipo1_Simulacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_Equipo1_Simulacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Equipo1_Simulacion.setText("Equipo 1");
        d_SimulacionPartido.getContentPane().add(lb_Equipo1_Simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 155, 36));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Resultado Simulacion de Partido");
        d_SimulacionPartido.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 35, 391, -1));

        lb_ResultadoEquipo1_Simulacion.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lb_ResultadoEquipo1_Simulacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_ResultadoEquipo1_Simulacion.setText("#");
        d_SimulacionPartido.getContentPane().add(lb_ResultadoEquipo1_Simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 138, 37, -1));

        lb_ResultadoEquipo2_Simulacion.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lb_ResultadoEquipo2_Simulacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_ResultadoEquipo2_Simulacion.setText("#");
        d_SimulacionPartido.getContentPane().add(lb_ResultadoEquipo2_Simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 138, 37, -1));

        bt_Cerrar_Simulacion.setText("Cerrar");
        bt_Cerrar_Simulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cerrar_SimulacionActionPerformed(evt);
            }
        });
        d_SimulacionPartido.getContentPane().add(bt_Cerrar_Simulacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));
        d_SimulacionPartido.getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 370, 50));
        d_SimulacionPartido.getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 80, 10));
        d_SimulacionPartido.getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 123, 80, 10));
        d_SimulacionPartido.getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 183, 370, 10));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Agregar Equipo");

        bt_AceptacionAgregarEquipo.setText("Agregar");
        bt_AceptacionAgregarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AceptacionAgregarEquipoActionPerformed(evt);
            }
        });

        bt_Cancelar_AgregarEquipo.setText("Cancelar");
        bt_Cancelar_AgregarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Cancelar_AgregarEquipoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setText("Nombre del Equipo");

        javax.swing.GroupLayout d_AgregarEquipoLayout = new javax.swing.GroupLayout(d_AgregarEquipo.getContentPane());
        d_AgregarEquipo.getContentPane().setLayout(d_AgregarEquipoLayout);
        d_AgregarEquipoLayout.setHorizontalGroup(
            d_AgregarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_AgregarEquipoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(d_AgregarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(d_AgregarEquipoLayout.createSequentialGroup()
                        .addComponent(bt_Cancelar_AgregarEquipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                        .addComponent(bt_AceptacionAgregarEquipo))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt_NombreEquipo_Agregar)
                    .addComponent(jSeparator8))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        d_AgregarEquipoLayout.setVerticalGroup(
            d_AgregarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_AgregarEquipoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jt_NombreEquipo_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(d_AgregarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_AceptacionAgregarEquipo)
                    .addComponent(bt_Cancelar_AgregarEquipo))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        d_ModificarEquipo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Modificar Datos del Equipo");
        d_ModificarEquipo.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 30, 331, -1));

        lb_NombreEquipo_Modificar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lb_NombreEquipo_Modificar.setText("Nombre Equipo");
        d_ModificarEquipo.getContentPane().add(lb_NombreEquipo_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 84, 161, -1));

        jLabel11.setText("Partidos Jugados:");
        d_ModificarEquipo.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 118, 124, -1));

        jLabel12.setText("Partidos Ganados:");
        d_ModificarEquipo.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 152, 124, -1));

        jLabel13.setText("Partidos Empatados: ");
        d_ModificarEquipo.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 186, 124, -1));

        jLabel14.setText("Partidos Perdidos:");
        d_ModificarEquipo.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 220, 124, -1));

        jLabel15.setText("Goles a Favor:");
        d_ModificarEquipo.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 118, 86, -1));

        jLabel16.setText("Goles en Contra:");
        d_ModificarEquipo.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 152, -1, -1));

        jLabel17.setText("Difencia Goles: ");
        d_ModificarEquipo.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 186, 86, -1));

        jLabel18.setText("Puntos: ");
        d_ModificarEquipo.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 220, 86, -1));
        d_ModificarEquipo.getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 61, 321, 1));

        ff_PartidosJugados.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        d_ModificarEquipo.getContentPane().add(ff_PartidosJugados, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 115, 79, -1));

        ff_PartidosGanados.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        d_ModificarEquipo.getContentPane().add(ff_PartidosGanados, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 149, 79, -1));

        ff_PartidosEmpatados.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        d_ModificarEquipo.getContentPane().add(ff_PartidosEmpatados, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 183, 79, -1));

        ff_PartidosPerdidos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        d_ModificarEquipo.getContentPane().add(ff_PartidosPerdidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 217, 79, -1));
        d_ModificarEquipo.getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 68, 463, 10));

        ff_GolesFavor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        d_ModificarEquipo.getContentPane().add(ff_GolesFavor, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 115, 79, -1));

        ff_GolesContra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        d_ModificarEquipo.getContentPane().add(ff_GolesContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 149, 79, -1));

        ff_DiferenciaGoles.setEditable(false);
        ff_DiferenciaGoles.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        d_ModificarEquipo.getContentPane().add(ff_DiferenciaGoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 183, 79, -1));

        ff_Puntos.setEditable(false);
        ff_Puntos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        d_ModificarEquipo.getContentPane().add(ff_Puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 217, 79, -1));

        bt_ModificarDatos.setText("Modificar");
        bt_ModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ModificarDatosActionPerformed(evt);
            }
        });
        d_ModificarEquipo.getContentPane().add(bt_ModificarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        bt_Cancelar_ModificarDatos.setText("Cancelar");
        d_ModificarEquipo.getContentPane().add(bt_Cancelar_ModificarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla_Posiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipo", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF", "PTS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_Posiciones);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tabla de Posiciones");

        bt_AgregarEquipo.setText("Agregar Equipo");
        bt_AgregarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AgregarEquipoActionPerformed(evt);
            }
        });

        bt_CargarDatos.setText("Cargar Datos");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("Opciones");

        jLabel3.setText("Simulacion de Partidos");

        bt_SimularPartido.setText("Simular Partido");
        bt_SimularPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SimularPartidoActionPerformed(evt);
            }
        });

        jLabel4.setText("Eliminar Equipo");

        bt_EliminarEquipo.setText("Eliminar Equipo");

        jLabel5.setText("Modificar Datos Equipo");

        bt_ModificarDatosEquipo.setText("Modificar Datos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbox_Equipo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbox_Equipo2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_AgregarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_SimularPartido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbox_EliminarEquipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_EliminarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(cbox_ModificarEquipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_ModificarDatosEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_CargarDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_AgregarEquipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_Equipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_Equipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_SimularPartido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_EliminarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_EliminarEquipo)
                        .addGap(17, 17, 17)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbox_ModificarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_ModificarDatosEquipo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_CargarDatos)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_Cerrar_SimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cerrar_SimulacionActionPerformed
        d_SimulacionPartido.setVisible(false);
    }//GEN-LAST:event_bt_Cerrar_SimulacionActionPerformed

    private void bt_ModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ModificarDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_ModificarDatosActionPerformed

    private void bt_AgregarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AgregarEquipoActionPerformed
        d_AgregarEquipo.pack();
        d_AgregarEquipo.setLocationRelativeTo(this);
        d_AgregarEquipo.setVisible(true);
    }//GEN-LAST:event_bt_AgregarEquipoActionPerformed

    private void bt_Cancelar_AgregarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Cancelar_AgregarEquipoActionPerformed
        jt_NombreEquipo_Agregar.setText("");
        d_AgregarEquipo.setVisible(false);
    }//GEN-LAST:event_bt_Cancelar_AgregarEquipoActionPerformed

    private void bt_AceptacionAgregarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AceptacionAgregarEquipoActionPerformed
        String nombre = jt_NombreEquipo_Agregar.getText();
        if (nombre.equals("") ) {
            return;
        }
        boolean condicion = false;
        if (rootPaneCheckingEnabled) {
            for (Equipo e : ramEquipo) {
                if (e.getNombreEquipo().toLowerCase().equals(nombre)) {
                    condicion = true;
                    break;
                }
            }
        }
        if (!condicion) {
            Equipo nuevo = new Equipo();
            nuevo.setNombreEquipo(nombre);
            ramEquipo.add(nuevo);
            JOptionPane.showMessageDialog(d_AgregarEquipo, "Equipo Agregado Exitosamente");
            d_AgregarEquipo.setVisible(false);
            actulizarComboBoxYTabla();
        }
        
        System.out.println(ramEquipo);
        
    }//GEN-LAST:event_bt_AceptacionAgregarEquipoActionPerformed

    private void bt_SimularPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SimularPartidoActionPerformed
        if (ramEquipo.size()<=1) {
            JOptionPane.showMessageDialog(this, "No tiene tiene susfientes equipos registrados");
            return;
        }
        if (cbox_Equipo1.getSelectedItem() == cbox_Equipo2.getSelectedItem()) {
            JOptionPane.showMessageDialog(this, "Seleccione Equipos Diferentes");
            return;
        }
        
        d_SimulacionPartido.pack();
        d_SimulacionPartido.setLocationRelativeTo(this);
        d_SimulacionPartido.setVisible(true);
        lb_Equipo1_Simulacion.setText(cbox_Equipo1.getSelectedItem().toString());
        lb_Equipo2_Simulacion.setText(cbox_Equipo2.getSelectedItem().toString());
        int golEquipo1 = simulacionGoles();
        int golEquipo2 = simulacionGoles();
        lb_ResultadoEquipo1_Simulacion.setText(String.valueOf(golEquipo1));
        lb_ResultadoEquipo2_Simulacion.setText(String.valueOf(golEquipo2));
        
        
        
        
        
        
        
    }//GEN-LAST:event_bt_SimularPartidoActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_AceptacionAgregarEquipo;
    private javax.swing.JButton bt_AgregarEquipo;
    private javax.swing.JButton bt_Cancelar_AgregarEquipo;
    private javax.swing.JButton bt_Cancelar_ModificarDatos;
    private javax.swing.JButton bt_CargarDatos;
    private javax.swing.JButton bt_Cerrar_Simulacion;
    private javax.swing.JButton bt_EliminarEquipo;
    private javax.swing.JButton bt_ModificarDatos;
    private javax.swing.JButton bt_ModificarDatosEquipo;
    private javax.swing.JButton bt_SimularPartido;
    private javax.swing.JComboBox<String> cbox_EliminarEquipo;
    private javax.swing.JComboBox<String> cbox_Equipo1;
    private javax.swing.JComboBox<String> cbox_Equipo2;
    private javax.swing.JComboBox<String> cbox_ModificarEquipo;
    private javax.swing.JDialog d_AgregarEquipo;
    private javax.swing.JDialog d_ModificarEquipo;
    private javax.swing.JDialog d_SimulacionPartido;
    private javax.swing.JFormattedTextField ff_DiferenciaGoles;
    private javax.swing.JFormattedTextField ff_GolesContra;
    private javax.swing.JFormattedTextField ff_GolesFavor;
    private javax.swing.JFormattedTextField ff_PartidosEmpatados;
    private javax.swing.JFormattedTextField ff_PartidosGanados;
    private javax.swing.JFormattedTextField ff_PartidosJugados;
    private javax.swing.JFormattedTextField ff_PartidosPerdidos;
    private javax.swing.JFormattedTextField ff_Puntos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jt_NombreEquipo_Agregar;
    private javax.swing.JLabel lb_Equipo1_Simulacion;
    private javax.swing.JLabel lb_Equipo2_Simulacion;
    private javax.swing.JLabel lb_NombreEquipo_Modificar;
    private javax.swing.JLabel lb_ResultadoEquipo1_Simulacion;
    private javax.swing.JLabel lb_ResultadoEquipo2_Simulacion;
    private javax.swing.JTable tabla_Posiciones;
    // End of variables declaration//GEN-END:variables

    
    //Declaracion de objetos
    ArrayList<Equipo> ramEquipo = new ArrayList<>();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    DefaultComboBoxModel modelocbox_Equipo1 = new DefaultComboBoxModel();
    DefaultComboBoxModel modelocbox_Equipo2 = new DefaultComboBoxModel();
    DefaultComboBoxModel modelocbox_EliminarEquipo = new DefaultComboBoxModel();
    DefaultComboBoxModel modelocbox_ModificarEquipo = new DefaultComboBoxModel();
    
    
    
    //Metodos de Administracion
    public void crearModeloTabla(){
        String []encabezado = {"Equipo", "PJ", "PG","PE","PP","GF","GC","DG","PTS"}; 
        modeloTabla.setColumnIdentifiers(encabezado);
        tabla_Posiciones.setModel(modeloTabla);
    }
    
    
    //Metodos de Administracion
    public void cargarRamEnModelos(){
        if (ramEquipo.size()==0) {
            return;
        }
        modeloTabla.setRowCount(0);
        modelocbox_Equipo1 = new DefaultComboBoxModel();
        modelocbox_Equipo2 = new DefaultComboBoxModel();
        modelocbox_EliminarEquipo = new DefaultComboBoxModel();
        modelocbox_ModificarEquipo = new DefaultComboBoxModel();
        for (Equipo e : ramEquipo) {
            modeloTabla.addRow(e.obtenerArreglo());
            modelocbox_Equipo1.addElement(e);
            modelocbox_Equipo2.addElement(e);
            modelocbox_EliminarEquipo.addElement(e);
            modelocbox_ModificarEquipo.addElement(e);
        }
    }
    
    public void actulizarComboBoxYTabla(){
        cargarRamEnModelos();
        cbox_Equipo1.setModel(modelocbox_Equipo1);
        cbox_Equipo2.setModel(modelocbox_Equipo2);
        cbox_EliminarEquipo.setModel(modelocbox_EliminarEquipo);
        cbox_ModificarEquipo.setModel(modelocbox_ModificarEquipo);
        tabla_Posiciones.setModel(modeloTabla);
    }
    
    public int simulacionGoles(){
        Random aleatorio = new Random();
        return aleatorio.nextInt(5);
    }
    
}
