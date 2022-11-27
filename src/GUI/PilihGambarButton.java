/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.CardLayout;

/**
 *
 * @author ACER
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
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

        buttonPanel = new javax.swing.JPanel();
        btnSejarah = new javax.swing.JButton();
        btnKesepuhan = new javax.swing.JButton();
        btnKorupsi = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSejarah.setText("Sejarah Dunia yang DiSembunyikam");
        btnSejarah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSejarahActionPerformed(evt);
            }
        });
        buttonPanel.add(btnSejarah);

        btnKesepuhan.setText("Kesepuhan Perdikan majan");
        btnKesepuhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKesepuhanActionPerformed(evt);
            }
        });
        buttonPanel.add(btnKesepuhan);

        btnKorupsi.setText("Korupsi");
        btnKorupsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKorupsiActionPerformed(evt);
            }
        });
        buttonPanel.add(btnKorupsi);

        btnkeluar.setText("Exit");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        buttonPanel.add(btnkeluar);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icon2.jpg"))); // NOI18N
        imagePanel.add(jLabel1, "0");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icon3.jpg"))); // NOI18N
        jLabel2.setToolTipText("");
        imagePanel.add(jLabel2, "1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/icon4.jpg"))); // NOI18N
        imagePanel.add(jLabel3, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
System.exit(0);
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnSejarahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSejarahActionPerformed
        CardLayout cl =(CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel,"0");
    }//GEN-LAST:event_btnSejarahActionPerformed

    private void btnKesepuhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKesepuhanActionPerformed
       CardLayout cl =(CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel,"1");
    }//GEN-LAST:event_btnKesepuhanActionPerformed

    private void btnKorupsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKorupsiActionPerformed
        CardLayout cl =(CardLayout) (imagePanel.getLayout());
        cl.show(imagePanel,"2");
    }//GEN-LAST:event_btnKorupsiActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKesepuhan;
    private javax.swing.JButton btnKorupsi;
    private javax.swing.JButton btnSejarah;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
