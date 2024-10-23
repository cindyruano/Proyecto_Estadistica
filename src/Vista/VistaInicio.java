
package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaInicio extends javax.swing.JFrame {

    public VistaInicio() {
        initComponents();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
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
        letTituloInicio = new javax.swing.JLabel();
        letPregundaInicio = new javax.swing.JLabel();
        btnSiInicio = new javax.swing.JButton();
        btnNoInicio = new javax.swing.JButton();
        separadorInicio = new javax.swing.JSeparator();
        imagen = new javax.swing.JLabel();
        letFondoInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondoPanel.setMinimumSize(new java.awt.Dimension(600, 530));
        fondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        letTituloInicio.setFont(new java.awt.Font("Arial Unicode MS", 1, 24)); // NOI18N
        letTituloInicio.setForeground(new java.awt.Color(255, 255, 255));
        letTituloInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letTituloInicio.setText("MEDIDAS DE DISPERSIÓN");
        fondoPanel.add(letTituloInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 600, -1));

        letPregundaInicio.setFont(new java.awt.Font("Arial Unicode MS", 0, 16)); // NOI18N
        letPregundaInicio.setForeground(new java.awt.Color(57, 54, 54));
        letPregundaInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letPregundaInicio.setText("¿Los datos a ingresar son más de 15 digitos? ");
        fondoPanel.add(letPregundaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 600, -1));

        btnSiInicio.setBackground(new java.awt.Color(202, 183, 183));
        btnSiInicio.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btnSiInicio.setForeground(new java.awt.Color(57, 54, 54));
        btnSiInicio.setText("SI");
        btnSiInicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray));
        btnSiInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiInicioActionPerformed(evt);
            }
        });
        fondoPanel.add(btnSiInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 80, -1));

        btnNoInicio.setBackground(new java.awt.Color(202, 183, 183));
        btnNoInicio.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btnNoInicio.setForeground(new java.awt.Color(57, 54, 54));
        btnNoInicio.setText("NO");
        btnNoInicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.lightGray));
        btnNoInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNoInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoInicioActionPerformed(evt);
            }
        });
        fondoPanel.add(btnNoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 80, -1));

        separadorInicio.setForeground(new java.awt.Color(255, 255, 255));
        fondoPanel.add(separadorInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 360, 20));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/2.png"))); // NOI18N
        fondoPanel.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 270, 130));

        letFondoInicio.setBackground(new java.awt.Color(235, 200, 200));
        letFondoInicio.setOpaque(true);
        fondoPanel.add(letFondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiInicioActionPerformed
     
//        VistaAgrupados va = new VistaAgrupados();
//        va.setVisible(true);
//        this.setVisible(false);
    }//GEN-LAST:event_btnSiInicioActionPerformed

    private void btnNoInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoInicioActionPerformed
        
        VistaNoAgrupados vna = new VistaNoAgrupados();
        vna.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNoInicioActionPerformed

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
            java.util.logging.Logger.getLogger(VistaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnNoInicio;
    public javax.swing.JButton btnSiInicio;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel letFondoInicio;
    private javax.swing.JLabel letPregundaInicio;
    private javax.swing.JLabel letTituloInicio;
    private javax.swing.JSeparator separadorInicio;
    // End of variables declaration//GEN-END:variables
}
