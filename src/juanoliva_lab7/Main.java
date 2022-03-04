/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package juanoliva_lab7;

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
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Posiciones = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bt_AgregarEquipo = new javax.swing.JButton();
        bt_CargarDatos = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        cbox_Equipo1 = new javax.swing.JComboBox<>();
        cbox_Equipo2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bt_SimularPartido = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        bt_EliminarEquipo = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        cBox_ModificarEquipo = new javax.swing.JComboBox<>();
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

        jButton1.setText("Cerrar");
        d_SimulacionPartido.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));
        d_SimulacionPartido.getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 370, 50));
        d_SimulacionPartido.getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 80, 10));
        d_SimulacionPartido.getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 123, 80, 10));
        d_SimulacionPartido.getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 183, 370, 10));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_Posiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipo", "PJ", "PG", "PE", "PP", "GF", "GC", "DIF", "PTS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_Posiciones);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tabla de Posiciones");

        bt_AgregarEquipo.setText("Agregar Equipo");

        bt_CargarDatos.setText("Cargar Datos");

        jLabel2.setText("Agregar Equipos");

        jLabel3.setText("Simulacion de Partidos");

        bt_SimularPartido.setText("Simular Partido");

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
                            .addComponent(jTextField1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_SimularPartido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_EliminarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator3)
                            .addComponent(cBox_ModificarEquipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_AgregarEquipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_EliminarEquipo)
                        .addGap(17, 17, 17)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cBox_ModificarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_ModificarDatosEquipo)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_CargarDatos)
                .addGap(38, 38, 38))
        );

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
    private javax.swing.JButton bt_AgregarEquipo;
    private javax.swing.JButton bt_CargarDatos;
    private javax.swing.JButton bt_EliminarEquipo;
    private javax.swing.JButton bt_ModificarDatosEquipo;
    private javax.swing.JButton bt_SimularPartido;
    private javax.swing.JComboBox<String> cBox_ModificarEquipo;
    private javax.swing.JComboBox<String> cbox_Equipo1;
    private javax.swing.JComboBox<String> cbox_Equipo2;
    private javax.swing.JDialog d_SimulacionPartido;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb_Equipo1_Simulacion;
    private javax.swing.JLabel lb_Equipo2_Simulacion;
    private javax.swing.JLabel lb_ResultadoEquipo1_Simulacion;
    private javax.swing.JLabel lb_ResultadoEquipo2_Simulacion;
    private javax.swing.JTable table_Posiciones;
    // End of variables declaration//GEN-END:variables
}
