/*
 * Copyright (C) 2022 Daniel Ricardo Sequeira Campos
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

package graficas;

import ejercicios.Second;

public class EjercicioDos extends javax.swing.JFrame {

    private final Second procedimientos = new Second();

    public EjercicioDos() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        ExitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        SalesButton = new javax.swing.JButton();
        SalesConsultBtn = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        EstadisticsButton = new javax.swing.JButton();
        RangeButton = new javax.swing.JButton();
        TypeButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ZoneButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jLabel9.setText("<html>\n\t&copy; Danny Sequeira 2022 &copy;\n</html>");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        titleLabel.setText("Ejercicio Dos");
        getContentPane().add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        ExitButton.setText("Salir");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jLabel1.setText("Añadir Datos a la Lista");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel2.setText("Reporte de todas las ventas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 190, -1));

        jLabel3.setText("Consultar venta por numero de venta");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel4.setText("Eliminar Venta de cabecera");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel5.setText("Reporte de Estadisticas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        jLabel6.setText("Reporte de ventas por rango");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jLabel7.setText("Reporte de ventas por tipo de venta");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        AddButton.setText("Añadir");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        SalesButton.setText("Reportar");
        SalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SalesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        SalesConsultBtn.setText("Consultar");
        SalesConsultBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesConsultBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SalesConsultBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        DeleteButton.setText("Eliminar");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        EstadisticsButton.setText("Reportar");
        EstadisticsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadisticsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EstadisticsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, -1));

        RangeButton.setText("Reportar");
        RangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RangeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(RangeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, -1, -1));

        TypeButton.setText("Reportar");
        TypeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TypeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, -1));

        jLabel8.setText("Reporte de ventas por Zona de Venta");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        ZoneButton.setText("Reportar");
        ZoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZoneButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ZoneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, -1, -1));

        jLabel10.setText("<html>\n\t&copy; Danny Sequeira 2022 &copy;\n</html>");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.setVisible(false);
        Main main = new Main();
        main.setVisible(true);
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        this.setVisible(false);
        procedimientos.Datos();
        this.setVisible(true);
    }//GEN-LAST:event_AddButtonActionPerformed

    private void SalesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesButtonActionPerformed
        this.setVisible(false);
        procedimientos.ReporteVentas();
        this.setVisible(true);
    }//GEN-LAST:event_SalesButtonActionPerformed

    private void SalesConsultBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesConsultBtnActionPerformed
        this.setVisible(false);
        procedimientos.Buscar();
        this.setVisible(true);
    }//GEN-LAST:event_SalesConsultBtnActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        this.setVisible(false);
        procedimientos.EliminarDato();
        this.setVisible(true);
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void EstadisticsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadisticsButtonActionPerformed
        this.setVisible(false);
        procedimientos.Estadisticas();
        this.setVisible(true);
    }//GEN-LAST:event_EstadisticsButtonActionPerformed

    private void RangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RangeButtonActionPerformed
        this.setVisible(false);
        procedimientos.Rangos();
        this.setVisible(true);
    }//GEN-LAST:event_RangeButtonActionPerformed

    private void TypeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeButtonActionPerformed
        this.setVisible(false);
        procedimientos.TipoVenta();
        this.setVisible(true);
    }//GEN-LAST:event_TypeButtonActionPerformed

    private void ZoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZoneButtonActionPerformed
        this.setVisible(false);
        procedimientos.Zona();
        this.setVisible(true);
    }//GEN-LAST:event_ZoneButtonActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioDos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EstadisticsButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton RangeButton;
    private javax.swing.JButton SalesButton;
    private javax.swing.JButton SalesConsultBtn;
    private javax.swing.JButton TypeButton;
    private javax.swing.JButton ZoneButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
