/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.IU;

import java.util.logging.Level;
import java.util.logging.Logger;
import system_control.Controller;

/**
 *
 * @author gabri
 */
public class IURelatorioCompleto extends javax.swing.JFrame {

    private Controller control = new Controller();

    /**
     * Creates new form IURelatorioCompleto
     */
    public IURelatorioCompleto() {
        initComponents();
        this.setTitle("Relatórios Completos");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jTextField1 = new javax.swing.JTextField();
        labelRelatorios = new javax.swing.JLabel();
        ComboBoxOpRelatorio = new javax.swing.JComboBox<>();
        btnExibir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textRelatorios = new javax.swing.JTextArea();
        btnLimparRel = new javax.swing.JButton();
        btnVoltarRell = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labelRelatorios.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        labelRelatorios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRelatorios.setText("RELATÓRIOS");

        ComboBoxOpRelatorio.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        ComboBoxOpRelatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Docentes", "Docentes Efetivos", "Docentes Substitutos", "Funcionários", "Geral", "Técnicos" }));
        ComboBoxOpRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxOpRelatorioActionPerformed(evt);
            }
        });

        btnExibir.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
        btnExibir.setText("Exibir");
        btnExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExibirActionPerformed(evt);
            }
        });

        textRelatorios.setColumns(20);
        textRelatorios.setRows(5);
        jScrollPane1.setViewportView(textRelatorios);

        btnLimparRel.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
        btnLimparRel.setText("Limpar");
        btnLimparRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparRelActionPerformed(evt);
            }
        });

        btnVoltarRell.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
        btnVoltarRell.setText("Voltar");
        btnVoltarRell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarRellActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBoxOpRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnLimparRel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                        .addComponent(btnVoltarRell, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxOpRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparRel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltarRell, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxOpRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxOpRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxOpRelatorioActionPerformed

    private void btnLimparRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparRelActionPerformed
        // TODO add your handling code here:
        textRelatorios.setText("");
    }//GEN-LAST:event_btnLimparRelActionPerformed

    private void btnVoltarRellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarRellActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnVoltarRellActionPerformed

    private void btnExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExibirActionPerformed
        // TODO add your handling code here:
        if (ComboBoxOpRelatorio.getSelectedItem().equals("Geral")) {
            textRelatorios.setText(control.showGeneralDep());
        }
        if (ComboBoxOpRelatorio.getSelectedItem().equals("Docentes")) {
            try {
                textRelatorios.setText(control.showAllDocentes());
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(IURelatorioCompleto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (ComboBoxOpRelatorio.getSelectedItem().equals("Docentes Efetivos")) {
            try {
                textRelatorios.setText(control.showAllEfetivo());
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(IURelatorioCompleto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (ComboBoxOpRelatorio.getSelectedItem().equals("Docentes Substitutos")) {
            try {
                textRelatorios.setText(control.showAllSubs());
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(IURelatorioCompleto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (ComboBoxOpRelatorio.getSelectedItem().equals("Funcionários")) {
            try {
                textRelatorios.setText(control.showAllFunc());
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(IURelatorioCompleto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (ComboBoxOpRelatorio.getSelectedItem().equals("Técnicos")) {
            try {
                textRelatorios.setText(control.showAllTec());
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(IURelatorioCompleto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnExibirActionPerformed

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
            java.util.logging.Logger.getLogger(IURelatorioCompleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IURelatorioCompleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IURelatorioCompleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IURelatorioCompleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IURelatorioCompleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxOpRelatorio;
    private javax.swing.JButton btnExibir;
    private javax.swing.JButton btnLimparRel;
    private javax.swing.JButton btnVoltarRell;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelRelatorios;
    private javax.swing.JTextArea textRelatorios;
    // End of variables declaration//GEN-END:variables
}
