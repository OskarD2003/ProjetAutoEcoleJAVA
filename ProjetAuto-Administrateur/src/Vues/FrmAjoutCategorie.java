/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlCategorie;
import Controlers.CtrlVehicule;
import Controlers.CtrlCategorie;
import Controlers.CtrlVehicule;
import Tools.ConnexionBDD;


/**
 *
 * @author Rosca
 */
public class FrmAjoutCategorie extends javax.swing.JFrame {

    ConnexionBDD maCnx;
    CtrlCategorie ctrlCategorie;
    /**
     * Creates new form FrmAjoutCategorie
     */
    public FrmAjoutCategorie() {
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

        lblTitreAjoutCategorie = new javax.swing.JLabel();
        lblLibelleAjoutCategorie = new javax.swing.JLabel();
        lblPrixAjoutCategorie = new javax.swing.JLabel();
        txtLibelleAjoutCategorie = new javax.swing.JTextField();
        sprPrixAjoutCategorie = new javax.swing.JSpinner();
        btnAjouterAjoutCategorie = new javax.swing.JButton();
        btnAnnulerAjoutCategorie = new javax.swing.JButton();
        lblCodeCategorie = new javax.swing.JLabel();
        txtCodeCategorieAjoutCategorie = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTitreAjoutCategorie.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblTitreAjoutCategorie.setText("Ajout Catégorie");

        lblLibelleAjoutCategorie.setText("Libelle :");

        lblPrixAjoutCategorie.setText("Prix :");

        btnAjouterAjoutCategorie.setText("Ajouter");
        btnAjouterAjoutCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterAjoutCategorieActionPerformed(evt);
            }
        });

        btnAnnulerAjoutCategorie.setText("Annuler");

        lblCodeCategorie.setText("Code Categorie :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(lblTitreAjoutCategorie))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLibelleAjoutCategorie)
                            .addComponent(lblPrixAjoutCategorie)
                            .addComponent(lblCodeCategorie))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sprPrixAjoutCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLibelleAjoutCategorie, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(txtCodeCategorieAjoutCategorie)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(btnAjouterAjoutCategorie)
                        .addGap(18, 18, 18)
                        .addComponent(btnAnnulerAjoutCategorie)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitreAjoutCategorie)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodeCategorie)
                    .addComponent(txtCodeCategorieAjoutCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLibelleAjoutCategorie)
                    .addComponent(txtLibelleAjoutCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrixAjoutCategorie)
                    .addComponent(sprPrixAjoutCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouterAjoutCategorie)
                    .addComponent(btnAnnulerAjoutCategorie))
                .addGap(0, 104, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formComponentHidden

    private void btnAjouterAjoutCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterAjoutCategorieActionPerformed
        // TODO add your handling code here:
        int codeCategorie = Integer.parseInt(txtCodeCategorieAjoutCategorie.getText());
        String libelle = txtLibelleAjoutCategorie.getText();
        double prix = Integer.parseInt(String.valueOf(sprPrixAjoutCategorie.getValue()));
       
        
        ctrlCategorie = new CtrlCategorie();
        ctrlCategorie.AjoutCategorie(codeCategorie, libelle, prix);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAjouterAjoutCategorieActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        maCnx = new ConnexionBDD();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmAjoutCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAjoutCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAjoutCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAjoutCategorie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAjoutCategorie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouterAjoutCategorie;
    private javax.swing.JButton btnAnnulerAjoutCategorie;
    private javax.swing.JLabel lblCodeCategorie;
    private javax.swing.JLabel lblLibelleAjoutCategorie;
    private javax.swing.JLabel lblPrixAjoutCategorie;
    private javax.swing.JLabel lblTitreAjoutCategorie;
    private javax.swing.JSpinner sprPrixAjoutCategorie;
    private javax.swing.JTextField txtCodeCategorieAjoutCategorie;
    private javax.swing.JTextField txtLibelleAjoutCategorie;
    // End of variables declaration//GEN-END:variables
}
