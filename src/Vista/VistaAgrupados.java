/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ControladorAgrupados;
import Modelo.ModeloAgrupados;

/**
 *
 * @author Cindy Ruano
 */
public class VistaAgrupados extends javax.swing.JFrame {

    /**
     * Creates new form VistaAgrupados
     */
    public VistaAgrupados() {
        initComponents();
//        
//        Modelo.ModeloAgrupados modelo = new ModeloAgrupados(this);
//        Controlador.ControladorAgrupados controlador = new ControladorAgrupados(modelo);
//        setControlador(controlador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanel = new javax.swing.JPanel();
        letTituloAgrupados = new javax.swing.JLabel();
        letLimSuperiores = new javax.swing.JLabel();
        letLimInferiores = new javax.swing.JLabel();
        letFrecuencias = new javax.swing.JLabel();
        tablaAgrupados = new javax.swing.JScrollPane();
        tblAgrupados = new javax.swing.JTable();
        txtLimSuperiores = new javax.swing.JTextField();
        txtLimInferiores = new javax.swing.JTextField();
        txtFrecuencias = new javax.swing.JTextField();
        btnCalcularAgrupados = new javax.swing.JButton();
        btnLimpiarAgrupados = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        letVarianza = new javax.swing.JLabel();
        letMarcaClase = new javax.swing.JLabel();
        letDesviacionMedia = new javax.swing.JLabel();
        letDesviacionTipica = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        letFondoAgrupados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fondoPanel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fondoPanel.setMinimumSize(new java.awt.Dimension(600, 530));
        fondoPanel.setPreferredSize(new java.awt.Dimension(600, 530));
        fondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letTituloAgrupados.setFont(new java.awt.Font("Arial Unicode MS", 0, 24)); // NOI18N
        letTituloAgrupados.setForeground(new java.awt.Color(255, 255, 255));
        letTituloAgrupados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letTituloAgrupados.setText("DATOS AGRUPADOS");
        fondoPanel.add(letTituloAgrupados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 600, 22));

        letLimSuperiores.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letLimSuperiores.setForeground(new java.awt.Color(57, 54, 54));
        letLimSuperiores.setText("Limites Superiores:");
        fondoPanel.add(letLimSuperiores, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 125, -1, -1));

        letLimInferiores.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letLimInferiores.setForeground(new java.awt.Color(57, 54, 54));
        letLimInferiores.setText("Limites Inferiores:");
        fondoPanel.add(letLimInferiores, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 159, -1, -1));

        letFrecuencias.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letFrecuencias.setForeground(new java.awt.Color(57, 54, 54));
        letFrecuencias.setText("Frecuencias:");
        fondoPanel.add(letFrecuencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 187, -1, -1));

        tblAgrupados.setFont(new java.awt.Font("Arial Unicode MS", 0, 12)); // NOI18N
        tblAgrupados.setForeground(new java.awt.Color(57, 54, 54));
        tblAgrupados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Variables", "f", "x", "f  *  x", "|x - x̅|", "|x - x̅| 2", "f * |x - x̅|", "f * |x - x̅| 2"
            }
        ));
        tblAgrupados.setGridColor(new java.awt.Color(202, 183, 183));
        tblAgrupados.setSelectionForeground(new java.awt.Color(57, 54, 54));
        tablaAgrupados.setViewportView(tblAgrupados);

        fondoPanel.add(tablaAgrupados, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 236, 530, 147));
        fondoPanel.add(txtLimSuperiores, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 124, 250, -1));
        fondoPanel.add(txtLimInferiores, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 158, 250, -1));
        fondoPanel.add(txtFrecuencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 186, 250, -1));

        btnCalcularAgrupados.setBackground(new java.awt.Color(202, 183, 183));
        btnCalcularAgrupados.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btnCalcularAgrupados.setForeground(new java.awt.Color(57, 54, 54));
        btnCalcularAgrupados.setText("Calcular");
        btnCalcularAgrupados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray));
        btnCalcularAgrupados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularAgrupadosActionPerformed(evt);
            }
        });
        fondoPanel.add(btnCalcularAgrupados, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 80, -1));

        btnLimpiarAgrupados.setBackground(new java.awt.Color(202, 183, 183));
        btnLimpiarAgrupados.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btnLimpiarAgrupados.setForeground(new java.awt.Color(57, 54, 54));
        btnLimpiarAgrupados.setText("Limpiar");
        btnLimpiarAgrupados.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray));
        fondoPanel.add(btnLimpiarAgrupados, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 80, -1));

        separador.setForeground(new java.awt.Color(255, 255, 255));
        separador.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        separador.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        fondoPanel.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 82, 270, 11));

        letVarianza.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letVarianza.setForeground(new java.awt.Color(57, 54, 54));
        letVarianza.setText("Varianza:");
        fondoPanel.add(letVarianza, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, -1));

        letMarcaClase.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letMarcaClase.setForeground(new java.awt.Color(57, 54, 54));
        letMarcaClase.setText("Marca de clase:");
        fondoPanel.add(letMarcaClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, -1, -1));

        letDesviacionMedia.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letDesviacionMedia.setForeground(new java.awt.Color(57, 54, 54));
        letDesviacionMedia.setText("Desviación media:");
        fondoPanel.add(letDesviacionMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        letDesviacionTipica.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        letDesviacionTipica.setForeground(new java.awt.Color(57, 54, 54));
        letDesviacionTipica.setText("Desviación típica:");
        fondoPanel.add(letDesviacionTipica, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        btnImprimir.setBackground(new java.awt.Color(202, 183, 183));
        btnImprimir.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btnImprimir.setForeground(new java.awt.Color(57, 54, 54));
        btnImprimir.setText("Imprimir");
        btnImprimir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray));
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        fondoPanel.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/3.png"))); // NOI18N
        fondoPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 60));

        letFondoAgrupados.setBackground(new java.awt.Color(235, 200, 200));
        letFondoAgrupados.setOpaque(true);
        fondoPanel.add(letFondoAgrupados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularAgrupadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularAgrupadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularAgrupadosActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAgrupados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAgrupados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAgrupados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAgrupados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAgrupados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCalcularAgrupados;
    private javax.swing.JButton btnImprimir;
    public javax.swing.JButton btnLimpiarAgrupados;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel letDesviacionMedia;
    private javax.swing.JLabel letDesviacionTipica;
    private javax.swing.JLabel letFondoAgrupados;
    private javax.swing.JLabel letFrecuencias;
    private javax.swing.JLabel letLimInferiores;
    private javax.swing.JLabel letLimSuperiores;
    private javax.swing.JLabel letMarcaClase;
    private javax.swing.JLabel letTituloAgrupados;
    private javax.swing.JLabel letVarianza;
    private javax.swing.JSeparator separador;
    private javax.swing.JScrollPane tablaAgrupados;
    public javax.swing.JTable tblAgrupados;
    public javax.swing.JTextField txtFrecuencias;
    public javax.swing.JTextField txtLimInferiores;
    public javax.swing.JTextField txtLimSuperiores;
    // End of variables declaration//GEN-END:variables

    public void setControlador (ControladorAgrupados controlador){
//        btnCalcularAgrupados.addMouseListener(controlador);
    }

}

