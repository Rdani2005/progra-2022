package interfaces;

import procedimientos.ProEjercicioDos;

public class EjercicioDos extends javax.swing.JFrame {

    ProEjercicioDos funciones = new ProEjercicioDos();

    public EjercicioDos() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLabel = new javax.swing.JLabel();
        SubtitleLabel = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        AddLabel = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        ReportLabel = new javax.swing.JLabel();
        ReportButton = new javax.swing.JButton();
        AskListLabel = new javax.swing.JLabel();
        AskListButton = new javax.swing.JButton();
        DeleteElementLabel = new javax.swing.JLabel();
        DeleteElementButton = new javax.swing.JButton();
        EstadisticasLabel = new javax.swing.JLabel();
        EstadisticasButton = new javax.swing.JButton();
        RangeLabel = new javax.swing.JLabel();
        RangeButton = new javax.swing.JButton();
        ContadoLabel = new javax.swing.JLabel();
        ContadoButton = new javax.swing.JButton();
        CreditoLabel = new javax.swing.JLabel();
        CreditoButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLabel.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        TitleLabel.setText("Ejercicio Dos");
        getContentPane().add(TitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 6, -1, -1));

        SubtitleLabel.setText("Cotidiano 8");
        getContentPane().add(SubtitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 74, -1, -1));

        ExitButton.setText("Salir");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        AddLabel.setText("Agregar Datos");
        getContentPane().add(AddLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        AddButton.setText("Agregar");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        ReportLabel.setText("Reportar Ventas");
        getContentPane().add(ReportLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 30));

        ReportButton.setText("Reportar");
        ReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ReportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        AskListLabel.setText("Consultar Venta");
        getContentPane().add(AskListLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        AskListButton.setText("Consultar");
        AskListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AskListButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AskListButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        DeleteElementLabel.setText("Eliminar Ultima Venta");
        getContentPane().add(DeleteElementLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        DeleteElementButton.setText("Eliminar");
        DeleteElementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteElementButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteElementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        EstadisticasLabel.setText("Reportar Estadisticas");
        getContentPane().add(EstadisticasLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        EstadisticasButton.setText("Estadisticas");
        EstadisticasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadisticasButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EstadisticasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        RangeLabel.setText("Reportar Por Rango");
        getContentPane().add(RangeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        RangeButton.setText("Rango");
        RangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RangeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RangeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, -1));

        ContadoLabel.setText("Reporte de Ventas de Contado");
        getContentPane().add(ContadoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        ContadoButton.setText("Contado");
        ContadoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContadoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ContadoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        CreditoLabel.setText("Reporte de Ventas de Crédito");
        getContentPane().add(CreditoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        CreditoButton.setText("Crédito");
        CreditoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CreditoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        jLabel1.setText("<html> &#169 Danny Sequeira 2022  </html>");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        Principal a = new Principal();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void DeleteElementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteElementButtonActionPerformed
        this.setVisible(false);
        funciones.EliminarUltimo();
        this.setVisible(true);
    }//GEN-LAST:event_DeleteElementButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        this.setVisible(false);
        funciones.datosUsuario();
        this.setVisible(true);
    }//GEN-LAST:event_AddButtonActionPerformed

    private void ReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportButtonActionPerformed
        this.setVisible(false);
        funciones.ReportarLista();
        this.setVisible(true);
    }//GEN-LAST:event_ReportButtonActionPerformed

    private void AskListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AskListButtonActionPerformed
        this.setVisible(false);
        funciones.consultarNum();
        this.setVisible(true);
    }//GEN-LAST:event_AskListButtonActionPerformed

    private void EstadisticasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadisticasButtonActionPerformed
        this.setVisible(false);
        funciones.Estadisticas();
        this.setVisible(true);
    }//GEN-LAST:event_EstadisticasButtonActionPerformed

    private void RangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RangeButtonActionPerformed
        this.setVisible(false);
        funciones.Rango();
        this.setVisible(true);
    }//GEN-LAST:event_RangeButtonActionPerformed

    private void ContadoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContadoButtonActionPerformed
        this.setVisible(false);
        funciones.Contado();
        this.setVisible(true);
    }//GEN-LAST:event_ContadoButtonActionPerformed

    private void CreditoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditoButtonActionPerformed
        this.setVisible(false);
        funciones.Credito();
        this.setVisible(true);

    }//GEN-LAST:event_CreditoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EjercicioDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjercicioDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjercicioDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjercicioDos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioDos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel AddLabel;
    private javax.swing.JButton AskListButton;
    private javax.swing.JLabel AskListLabel;
    private javax.swing.JButton ContadoButton;
    private javax.swing.JLabel ContadoLabel;
    private javax.swing.JButton CreditoButton;
    private javax.swing.JLabel CreditoLabel;
    private javax.swing.JButton DeleteElementButton;
    private javax.swing.JLabel DeleteElementLabel;
    private javax.swing.JButton EstadisticasButton;
    private javax.swing.JLabel EstadisticasLabel;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton RangeButton;
    private javax.swing.JLabel RangeLabel;
    private javax.swing.JButton ReportButton;
    private javax.swing.JLabel ReportLabel;
    private javax.swing.JLabel SubtitleLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
