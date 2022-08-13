package interfaces;

import procedimientos.ProEjercicioUno;

public class EjercicioUno extends javax.swing.JFrame {

    // Llamada a metodos de otra clase

    ProEjercicioUno ejercicio = new ProEjercicioUno();

    public EjercicioUno() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLabel = new javax.swing.JLabel();
        SubtitleLabel = new javax.swing.JLabel();
        CopyrightLabel = new javax.swing.JLabel();
        addLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        ReportNotes = new javax.swing.JButton();
        AskNote = new javax.swing.JButton();
        ModifyNote = new javax.swing.JButton();
        Estadistics = new javax.swing.JButton();
        Range = new javax.swing.JButton();
        Apla = new javax.swing.JButton();
        Apro = new javax.swing.JButton();
        Repro = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLabel.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        TitleLabel.setText("Ejercicio Uno");
        getContentPane().add(TitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 27, -1, -1));

        SubtitleLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        SubtitleLabel.setText("Cotidiano 8");
        getContentPane().add(SubtitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 95, -1, -1));

        CopyrightLabel.setText("<html> &#169 Danny Sequeira 2022  </html>");
        getContentPane().add(CopyrightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, -1, -1));

        addLabel.setText("Añadir Notas");
        getContentPane().add(addLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 134, -1, -1));

        jLabel1.setText("Reportar Notas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 178, -1, -1));

        jLabel2.setText("Consultar una nota");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 230, -1, -1));

        jLabel3.setText("Modificar una nota");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 280, -1, -1));

        jLabel4.setText("Reporte de Estadisticas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 324, -1, -1));

        jLabel5.setText("Notas brindadas por un rango del usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        jLabel6.setText("Reporte de Notas Aprobadas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        jLabel7.setText("Reporte de Notas Reprobadas");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jLabel8.setText("Reporte de Notas Aplazadas");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        AddButton.setText("Añadir");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 126, -1, -1));

        ReportNotes.setText("Reportar");
        ReportNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportNotesActionPerformed(evt);
            }
        });
        getContentPane().add(ReportNotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        AskNote.setText("Consultar");
        AskNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AskNoteActionPerformed(evt);
            }
        });
        getContentPane().add(AskNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 222, -1, -1));

        ModifyNote.setText("Modificar");
        ModifyNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyNoteActionPerformed(evt);
            }
        });
        getContentPane().add(ModifyNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 272, -1, -1));

        Estadistics.setText("Reportar");
        Estadistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadisticsActionPerformed(evt);
            }
        });
        getContentPane().add(Estadistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 316, -1, -1));

        Range.setText("Rango");
        Range.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RangeActionPerformed(evt);
            }
        });
        getContentPane().add(Range, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, -1, -1));

        Apla.setText("Reportar");
        Apla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AplaActionPerformed(evt);
            }
        });
        getContentPane().add(Apla, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, -1, -1));

        Apro.setText("Reportar");
        Apro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AproActionPerformed(evt);
            }
        });
        getContentPane().add(Apro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));

        Repro.setText("Reportar");
        Repro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReproActionPerformed(evt);
            }
        });
        getContentPane().add(Repro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, -1, -1));

        jButton9.setText("Salir");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Agregar notas a la lista
    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        this.setVisible(false);
        ejercicio.datosUsuario();
        this.setVisible(true);
    }//GEN-LAST:event_AddButtonActionPerformed

    // Reportar notas en la lista
    private void ReportNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportNotesActionPerformed
        this.setVisible(false);
        ejercicio.EnseñarLista();
        this.setVisible(true);
    }//GEN-LAST:event_ReportNotesActionPerformed

    // Pedir información de las notas
    private void AskNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AskNoteActionPerformed
        this.setVisible(false);
        ejercicio.ConsultarNota();
        this.setVisible(true);
    }//GEN-LAST:event_AskNoteActionPerformed

    // Modificar notas
    private void ModifyNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyNoteActionPerformed
        this.setVisible(false);
        ejercicio.ModificarNota();
        this.setVisible(true);
    }//GEN-LAST:event_ModifyNoteActionPerformed

    // Reportar Estadisticas
    private void EstadisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadisticsActionPerformed
        this.setVisible(false);
        ejercicio.Estadisticas();
        this.setVisible(true);
    }//GEN-LAST:event_EstadisticsActionPerformed

    // Reportar Rango dado por el usuario
    private void RangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RangeActionPerformed
        this.setVisible(false);
        ejercicio.ReporteRango();
        this.setVisible(true);
    }//GEN-LAST:event_RangeActionPerformed

    // Reportar notas Aprobadas
    private void AproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AproActionPerformed
        this.setVisible(false);
        ejercicio.Aprobadas();
        this.setVisible(true);
    }//GEN-LAST:event_AproActionPerformed

    // Reportar notas aplazadas
    private void AplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AplaActionPerformed
        this.setVisible(false);
        ejercicio.Aplazadas();
        this.setVisible(true);
    }//GEN-LAST:event_AplaActionPerformed

    // Reportar notas reprobadas
    private void ReproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReproActionPerformed
        this.setVisible(false);
        ejercicio.Reprobadas();
        this.setVisible(true);
    }//GEN-LAST:event_ReproActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Principal a = new Principal();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(EjercicioUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjercicioUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjercicioUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjercicioUno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioUno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton Apla;
    private javax.swing.JButton Apro;
    private javax.swing.JButton AskNote;
    private javax.swing.JLabel CopyrightLabel;
    private javax.swing.JButton Estadistics;
    private javax.swing.JButton ModifyNote;
    private javax.swing.JButton Range;
    private javax.swing.JButton ReportNotes;
    private javax.swing.JButton Repro;
    private javax.swing.JLabel SubtitleLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel addLabel;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
