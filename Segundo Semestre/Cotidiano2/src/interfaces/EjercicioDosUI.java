/*
 * Copyright (C) 2022 Rdani2005
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package interfaces;

import procesos.EjercicioDos;

public class EjercicioDosUI extends javax.swing.JFrame {

    EjercicioDos ejercicio = new EjercicioDos();

    public EjercicioDosUI() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLabel = new javax.swing.JLabel();
        CpLabel = new javax.swing.JLabel();
        AddStackLbl = new javax.swing.JLabel();
        AddQueueLbl1 = new javax.swing.JLabel();
        CheckDataLbl = new javax.swing.JLabel();
        ModifyDataLbl = new javax.swing.JLabel();
        StatisticsLbl = new javax.swing.JLabel();
        DeleteElementLbl1 = new javax.swing.JLabel();
        GeneralReportsLbl = new javax.swing.JLabel();
        GeneralReportsLbl1 = new javax.swing.JLabel();
        StackButton = new javax.swing.JButton();
        QueueButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        CheckDataButton = new javax.swing.JButton();
        ModifyButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        StatisticsButton = new javax.swing.JButton();
        ReportsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleLabel.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        TitleLabel.setText("Ejercicio Dos");

        CpLabel.setText("<html>\n&copy; Danny Sequeira 2022 &copy;\n</html>");

        AddStackLbl.setText("Agregar en pila");

        AddQueueLbl1.setText("Agregar en cola");

        CheckDataLbl.setText("Consultar Datos de la lista");

        ModifyDataLbl.setText("Modificar datos de la lista por ID");

        StatisticsLbl.setText("Estadisticas de la lista");

        DeleteElementLbl1.setText("Eliminar primer dato de la lista");

        GeneralReportsLbl.setText("Salir");

        GeneralReportsLbl1.setText("Reportes generales de la lista");

        StackButton.setText("Agregar");
        StackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StackButtonActionPerformed(evt);
            }
        });

        QueueButton.setText("Agregar");
        QueueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueueButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Salir");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        CheckDataButton.setText("Consultar");
        CheckDataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckDataButtonActionPerformed(evt);
            }
        });

        ModifyButton.setText("Modificar");
        ModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Eliminar");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        StatisticsButton.setText("Estadisticas");
        StatisticsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticsButtonActionPerformed(evt);
            }
        });

        ReportsButton.setText("Reportar");
        ReportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TitleLabel)
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300))))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ModifyDataLbl)
                    .addComponent(CheckDataLbl)
                    .addComponent(AddQueueLbl1)
                    .addComponent(AddStackLbl))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CheckDataButton)
                    .addComponent(ModifyButton)
                    .addComponent(QueueButton, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StackButton, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(GeneralReportsLbl)
                                .addGap(166, 166, 166)
                                .addComponent(ExitButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(StatisticsLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DeleteButton)
                                    .addComponent(StatisticsButton))))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GeneralReportsLbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(ReportsButton)
                        .addGap(76, 76, 76))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(396, Short.MAX_VALUE)
                    .addComponent(DeleteElementLbl1)
                    .addGap(182, 182, 182)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(TitleLabel)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddStackLbl)
                    .addComponent(StackButton)
                    .addComponent(DeleteButton))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddQueueLbl1)
                    .addComponent(StatisticsLbl)
                    .addComponent(QueueButton)
                    .addComponent(StatisticsButton))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CheckDataLbl)
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ModifyDataLbl)
                            .addComponent(GeneralReportsLbl)
                            .addComponent(ExitButton)
                            .addComponent(ModifyButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(CpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ReportsButton)
                            .addComponent(CheckDataButton)
                            .addComponent(GeneralReportsLbl1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(165, 165, 165)
                    .addComponent(DeleteElementLbl1)
                    .addContainerGap(319, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QueueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QueueButtonActionPerformed
        this.setVisible(false);
        ejercicio.Insertar(2);
        this.setVisible(true);
    }//GEN-LAST:event_QueueButtonActionPerformed

    private void StackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StackButtonActionPerformed
        this.setVisible(false);
        ejercicio.Insertar(1);
        this.setVisible(true);
    }//GEN-LAST:event_StackButtonActionPerformed

    private void CheckDataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckDataButtonActionPerformed
        this.setVisible(false);
        ejercicio.Consultar();
        this.setVisible(true);
    }//GEN-LAST:event_CheckDataButtonActionPerformed

    private void ModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyButtonActionPerformed
        this.setVisible(false);
        ejercicio.Modificar();
        this.setVisible(true);
    }//GEN-LAST:event_ModifyButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        this.setVisible(false);
        ejercicio.Eliminar();
        this.setVisible(true);
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void StatisticsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticsButtonActionPerformed
        this.setVisible(false);
        ejercicio.Estadisticas();
        this.setVisible(true);
    }//GEN-LAST:event_StatisticsButtonActionPerformed

    private void ReportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportsButtonActionPerformed
        this.setVisible(false);
        ejercicio.Reporte();
        this.setVisible(true);
    }//GEN-LAST:event_ReportsButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EjercicioDosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjercicioDosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjercicioDosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjercicioDosUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioDosUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddQueueLbl1;
    private javax.swing.JLabel AddStackLbl;
    private javax.swing.JButton CheckDataButton;
    private javax.swing.JLabel CheckDataLbl;
    private javax.swing.JLabel CpLabel;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel DeleteElementLbl1;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel GeneralReportsLbl;
    private javax.swing.JLabel GeneralReportsLbl1;
    private javax.swing.JButton ModifyButton;
    private javax.swing.JLabel ModifyDataLbl;
    private javax.swing.JButton QueueButton;
    private javax.swing.JButton ReportsButton;
    private javax.swing.JButton StackButton;
    private javax.swing.JButton StatisticsButton;
    private javax.swing.JLabel StatisticsLbl;
    private javax.swing.JLabel TitleLabel;
    // End of variables declaration//GEN-END:variables
}
