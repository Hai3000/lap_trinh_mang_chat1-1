import javax.swing.*;
import java.awt.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author hailo
 */
public class mainform extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(mainform.class.getName());

    /**
     * Creates new form mainform
     */
    public mainform() {
        initComponents();
         // Load ảnh logo
    ImageIcon logo = new ImageIcon(getClass().getResource("/image/logo.png"));
    JLabel lblLogo = new JLabel(logo);
    
    // Đặt vị trí và kích thước ảnh
    lblLogo.setBounds(20, 20, logo.getIconWidth(), logo.getIconHeight());
    
    // Thêm ảnh vào form (giả sử bạn có JPanel tên là jPanel1)


    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        Opensever = new javax.swing.JMenuItem();
        Opencilent = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.png"))); // NOI18N

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-who-24.png"))); // NOI18N
        jMenu2.setText("???");
        jMenu2.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 18)); // NOI18N

        Opensever.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 14)); // NOI18N
        Opensever.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-group-24.png"))); // NOI18N
        Opensever.setText("Sever");
        Opensever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenseverActionPerformed(evt);
            }
        });
        jMenu2.add(Opensever);

        Opencilent.setFont(new java.awt.Font("Apple SD Gothic Neo", 1, 14)); // NOI18N
        Opencilent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-user-24.png"))); // NOI18N
        Opencilent.setText("Cilent");
        Opencilent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpencilentActionPerformed(evt);
            }
        });
        jMenu2.add(Opencilent);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpencilentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpencilentActionPerformed
        client cl = new client();   // Tạo đối tượng form client
        cl.setVisible(true);        // Hiện form client
        cl.setLocationRelativeTo(null);
    }//GEN-LAST:event_OpencilentActionPerformed

    private void OpenseverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenseverActionPerformed
        sever sv = new sever();   // Tạo đối tượng form sever
        sv.setVisible(true);      // Hiện form sever
        sv.setLocationRelativeTo(null); // (tùy chọn) hiển thị giữa màn hình
        
    }//GEN-LAST:event_OpenseverActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new mainform().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Opencilent;
    private javax.swing.JMenuItem Opensever;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
