package windows;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
        setSize(650, 350);
        setResizable(false);
        setLocationRelativeTo(null);

        // Background image configuration
        ImageIcon wallpaper = new ImageIcon("src/images/wallpaper.jpg");
        Icon icon = new ImageIcon(
                wallpaper.getImage().getScaledInstance(
                        Wallpaper.getWidth(),
                        Wallpaper.getHeight(),
                        Image.SCALE_DEFAULT
                )
        );
        Wallpaper.setIcon(icon);
        this.repaint();
        
                // We don´t need the program to end
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLbl = new javax.swing.JLabel();
        NumberControlLbl = new javax.swing.JLabel();
        NumbersControlButton = new javax.swing.JButton();
        ProccessControlButton = new javax.swing.JButton();
        PowControlButton = new javax.swing.JButton();
        ProccessControlLbl = new javax.swing.JLabel();
        PowControlLbl = new javax.swing.JLabel();
        CopyrightLbl = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        TitleLbl.setText("Cotidiano 3 Danny Sequeira");
        getContentPane().add(TitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        NumberControlLbl.setForeground(new java.awt.Color(255, 255, 255));
        NumberControlLbl.setText("Control Numeros");
        getContentPane().add(NumberControlLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        NumbersControlButton.setBackground(new java.awt.Color(255, 255, 255));
        NumbersControlButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mathematics.png"))); // NOI18N
        NumbersControlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumbersControlButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NumbersControlButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 120, 120));

        ProccessControlButton.setBackground(new java.awt.Color(255, 255, 255));
        ProccessControlButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pow-icon.png"))); // NOI18N
        ProccessControlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProccessControlButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ProccessControlButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 120, 120));

        PowControlButton.setBackground(new java.awt.Color(255, 255, 255));
        PowControlButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ipad.png"))); // NOI18N
        PowControlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PowControlButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PowControlButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 120, 120));

        ProccessControlLbl.setForeground(new java.awt.Color(255, 255, 255));
        ProccessControlLbl.setText("Control Proceso");
        getContentPane().add(ProccessControlLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        PowControlLbl.setForeground(new java.awt.Color(255, 255, 255));
        PowControlLbl.setText("Control Potencia");
        getContentPane().add(PowControlLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        CopyrightLbl.setForeground(new java.awt.Color(255, 255, 255));
        CopyrightLbl.setText("<html>\nCopyright &copy; Danny Sequeira 2022\n</html>");
        getContentPane().add(CopyrightLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumbersControlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumbersControlButtonActionPerformed
        new ControlNumerosForm().setVisible(true);
    }//GEN-LAST:event_NumbersControlButtonActionPerformed

    private void ProccessControlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProccessControlButtonActionPerformed
        new ControlProcesosForm().setVisible(true);
    }//GEN-LAST:event_ProccessControlButtonActionPerformed

    private void PowControlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PowControlButtonActionPerformed
        new ControlPotenciaForm().setVisible(true);
    }//GEN-LAST:event_PowControlButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CopyrightLbl;
    private javax.swing.JLabel NumberControlLbl;
    private javax.swing.JButton NumbersControlButton;
    private javax.swing.JButton PowControlButton;
    private javax.swing.JLabel PowControlLbl;
    private javax.swing.JButton ProccessControlButton;
    private javax.swing.JLabel ProccessControlLbl;
    private javax.swing.JLabel TitleLbl;
    private javax.swing.JLabel Wallpaper;
    // End of variables declaration//GEN-END:variables
}
