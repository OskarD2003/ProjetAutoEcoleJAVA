/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlCategorie;
import Controlers.CtrlVehicule;
import Entities.Vehicule;
import Tools.ConnexionBDD;

/**
 *
 * @author Rosca
 */
public class FrmAjoutVehicule extends javax.swing.JFrame {
    
    ConnexionBDD maCnx;
    CtrlCategorie ctrlCategorie;
    CtrlVehicule ctrlVehicule;
    public FrmAjoutVehicule() {
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

        lblAjoutVehicule = new javax.swing.JLabel();
        lblImmatriculationAjoutVehicule = new javax.swing.JLabel();
        lblMarqueAjoutVehicule = new javax.swing.JLabel();
        lblModeleAjoutVehicule = new javax.swing.JLabel();
        lblAnneeAjoutVehicule = new javax.swing.JLabel();
        lblLibCategorieAjoutVehicule = new javax.swing.JLabel();
        txtImmatriculationAjoutVehicule = new javax.swing.JTextField();
        txtMarqueAjoutVehicule = new javax.swing.JTextField();
        txtModeleAjoutVehicule = new javax.swing.JTextField();
        cboLibCategorieAjoutVehicule = new javax.swing.JComboBox<>();
        btnAjouterAjoutVehicule = new javax.swing.JButton();
        btnAnnulerAjoutVehicule = new javax.swing.JButton();
        sprAnneeAjoutVehicule = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblAjoutVehicule.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblAjoutVehicule.setText("Ajout Véhicule");

        lblImmatriculationAjoutVehicule.setText("Immatriculation :");

        lblMarqueAjoutVehicule.setText("Marque :");

        lblModeleAjoutVehicule.setText("Modèle :");

        lblAnneeAjoutVehicule.setText("Année :");

        lblLibCategorieAjoutVehicule.setText("Libelle Catégorie :");

        btnAjouterAjoutVehicule.setText("Ajouter");
        btnAjouterAjoutVehicule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterAjoutVehiculeActionPerformed(evt);
            }
        });

        btnAnnulerAjoutVehicule.setText("Annuler");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addComponent(lblAjoutVehicule)
                .addGap(313, 313, 313))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLibCategorieAjoutVehicule)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAjouterAjoutVehicule)
                                .addGap(18, 18, 18)
                                .addComponent(btnAnnulerAjoutVehicule))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboLibCategorieAjoutVehicule, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(76, 76, 76))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImmatriculationAjoutVehicule)
                            .addComponent(lblMarqueAjoutVehicule)
                            .addComponent(lblModeleAjoutVehicule)
                            .addComponent(lblAnneeAjoutVehicule))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtImmatriculationAjoutVehicule, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(txtMarqueAjoutVehicule)
                            .addComponent(txtModeleAjoutVehicule)
                            .addComponent(sprAnneeAjoutVehicule))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAjoutVehicule)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImmatriculationAjoutVehicule)
                    .addComponent(txtImmatriculationAjoutVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarqueAjoutVehicule)
                    .addComponent(txtMarqueAjoutVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModeleAjoutVehicule)
                    .addComponent(txtModeleAjoutVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnneeAjoutVehicule)
                    .addComponent(sprAnneeAjoutVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLibCategorieAjoutVehicule)
                    .addComponent(cboLibCategorieAjoutVehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouterAjoutVehicule)
                    .addComponent(btnAnnulerAjoutVehicule))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjouterAjoutVehiculeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterAjoutVehiculeActionPerformed
        // TODO add your handling code here:
        String immatriculation = txtImmatriculationAjoutVehicule.getText();
        String marque = txtMarqueAjoutVehicule.getText();
        String modele = txtModeleAjoutVehicule.getText();
        int annee = Integer.parseInt(String.valueOf(sprAnneeAjoutVehicule.getValue()));
        String libelle = String.valueOf(cboLibCategorieAjoutVehicule.getSelectedItem());
        ctrlCategorie = new CtrlCategorie();
        int idCategorie = ctrlCategorie.getIdCategorieByLibelle(libelle);
        ctrlVehicule = new CtrlVehicule();
        ctrlVehicule.AjoutVehicule(immatriculation, marque, modele, annee, idCategorie);
    }//GEN-LAST:event_btnAjouterAjoutVehiculeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        maCnx = new ConnexionBDD();
        ctrlCategorie = new CtrlCategorie();
        for(String categorie : ctrlCategorie.getAllLibelleCategorie()){
            cboLibCategorieAjoutVehicule.addItem(categorie);
        }
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
            java.util.logging.Logger.getLogger(FrmAjoutVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAjoutVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAjoutVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAjoutVehicule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAjoutVehicule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouterAjoutVehicule;
    private javax.swing.JButton btnAnnulerAjoutVehicule;
    private javax.swing.JComboBox<String> cboLibCategorieAjoutVehicule;
    private javax.swing.JLabel lblAjoutVehicule;
    private javax.swing.JLabel lblAnneeAjoutVehicule;
    private javax.swing.JLabel lblImmatriculationAjoutVehicule;
    private javax.swing.JLabel lblLibCategorieAjoutVehicule;
    private javax.swing.JLabel lblMarqueAjoutVehicule;
    private javax.swing.JLabel lblModeleAjoutVehicule;
    private javax.swing.JSpinner sprAnneeAjoutVehicule;
    private javax.swing.JTextField txtImmatriculationAjoutVehicule;
    private javax.swing.JTextField txtMarqueAjoutVehicule;
    private javax.swing.JTextField txtModeleAjoutVehicule;
    // End of variables declaration//GEN-END:variables
}