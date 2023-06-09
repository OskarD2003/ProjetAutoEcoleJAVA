/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Entities.User;

/**
 *
 * @author khali
 */
public class FrmMoniteur extends javax.swing.JFrame {
    User user;
    /**
     * Creates new form FrmMoniteur
     */
    public FrmMoniteur() {
        initComponents();
    }
    public FrmMoniteur(User unUser) {
        user = unUser;
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

        btnModifInfoPerso = new javax.swing.JButton();
        btnVisualiserMonPlanning = new javax.swing.JButton();
        btnAjouterLicence = new javax.swing.JButton();
        lblMoniteur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnModifInfoPerso.setText("Modifier ses Informations Personnelles");
        btnModifInfoPerso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifInfoPersoActionPerformed(evt);
            }
        });

        btnVisualiserMonPlanning.setText("Visualiser mon planning");
        btnVisualiserMonPlanning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualiserMonPlanningActionPerformed(evt);
            }
        });

        btnAjouterLicence.setText("Ajouter une Licence");
        btnAjouterLicence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterLicenceActionPerformed(evt);
            }
        });

        lblMoniteur.setForeground(new java.awt.Color(51, 0, 255));
        lblMoniteur.setText("Moniteur");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAjouterLicence)
                    .addComponent(btnVisualiserMonPlanning)
                    .addComponent(btnModifInfoPerso))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMoniteur)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(btnModifInfoPerso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVisualiserMonPlanning)
                .addGap(18, 18, 18)
                .addComponent(btnAjouterLicence)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(lblMoniteur)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisualiserMonPlanningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualiserMonPlanningActionPerformed
       FrmMoniteurVisualiserPlanning frm = new FrmMoniteurVisualiserPlanning(user);
       frm.setVisible(true);
    }//GEN-LAST:event_btnVisualiserMonPlanningActionPerformed

    private void btnModifInfoPersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifInfoPersoActionPerformed
       FrmModifInfoPerso frm = new FrmModifInfoPerso (user);
       frm.setVisible(true);
    }//GEN-LAST:event_btnModifInfoPersoActionPerformed

    private void btnAjouterLicenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterLicenceActionPerformed
    FrmMoniteurAjoutLicence frm = new FrmMoniteurAjoutLicence(user);
     frm.setVisible(true);
    }//GEN-LAST:event_btnAjouterLicenceActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMoniteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMoniteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMoniteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMoniteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMoniteur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouterLicence;
    private javax.swing.JButton btnModifInfoPerso;
    private javax.swing.JButton btnVisualiserMonPlanning;
    private javax.swing.JLabel lblMoniteur;
    // End of variables declaration//GEN-END:variables
}
