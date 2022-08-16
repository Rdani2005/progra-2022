package windows;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import paquete.ControlNumeros;

public class ControlNumerosForm extends javax.swing.JFrame {

    ControlNumeros cn = new ControlNumeros();
    
    public ControlNumerosForm() {
        initComponents();
        setSize(650, 350);
        setResizable(false);
        setLocationRelativeTo(null);

        setTitle("Control de Numeros");
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
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleLbl = new javax.swing.JLabel();
        NumbersControlButton = new javax.swing.JButton();
        Num1Lbl = new javax.swing.JLabel();
        Num2Lbl = new javax.swing.JLabel();
        Num3Lbl = new javax.swing.JLabel();
        Num1Txt = new javax.swing.JTextField();
        Num2Txt = new javax.swing.JTextField();
        Num3Txt = new javax.swing.JTextField();
        CalculateLbl = new javax.swing.JLabel();
        CopyrightLbl = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        TitleLbl.setText("Cotidiano 3 Danny Sequeira");
        getContentPane().add(TitleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        NumbersControlButton.setBackground(new java.awt.Color(255, 255, 255));
        NumbersControlButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mathematics.png"))); // NOI18N
        NumbersControlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumbersControlButtonActionPerformed(evt);
            }
        });
        getContentPane().add(NumbersControlButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 120, 120));

        Num1Lbl.setForeground(new java.awt.Color(255, 255, 255));
        Num1Lbl.setText("Ingrese un numero:");
        getContentPane().add(Num1Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        Num2Lbl.setForeground(new java.awt.Color(255, 255, 255));
        Num2Lbl.setText("Ingrese un numero:");
        getContentPane().add(Num2Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        Num3Lbl.setForeground(new java.awt.Color(255, 255, 255));
        Num3Lbl.setText("Ingrese un numero:");
        getContentPane().add(Num3Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        Num1Txt.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Num1Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 200, -1));

        Num2Txt.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Num2Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 200, -1));

        Num3Txt.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Num3Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 200, -1));

        CalculateLbl.setForeground(new java.awt.Color(255, 255, 255));
        CalculateLbl.setText("Calculate");
        getContentPane().add(CalculateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        CopyrightLbl.setForeground(new java.awt.Color(255, 255, 255));
        CopyrightLbl.setText("<html>\nCopyright &copy; Danny Sequeira 2022\n</html>");
        getContentPane().add(CopyrightLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumbersControlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumbersControlButtonActionPerformed
        String n1_string, n2_string, n3_string;
        int n1, n2, n3, validator = 0;

        n1_string = Num1Txt.getText().trim();
        n2_string = Num2Txt.getText().trim();
        n3_string = Num3Txt.getText().trim();

        if (n1_string.equals("")) {
            validator++;
            Num1Txt.setBackground(Color.red);
        }

        if (n2_string.equals("")) {
            validator++;
            Num2Txt.setBackground(Color.red);
        }

        if (n3_string.equals("")) {
            validator++;
            Num3Txt.setBackground(Color.red);
        }

        if (validator == 0) {

            n1 = Integer.parseInt(n1_string);
            n2 = Integer.parseInt(n2_string);
            n3 = Integer.parseInt(n3_string);

            JOptionPane.showMessageDialog(
                    null,
                    "Resultados!\n"
                            + "El numero mayor es: " + cn.mayor(n1, n2, n3) +
                            "\nEl numero menor es: " + cn.menor(n1, n2, n3)
            );
            cn.TriangleType(n1, n2, n3);

        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }


    }//GEN-LAST:event_NumbersControlButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ControlNumerosForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CalculateLbl;
    private javax.swing.JLabel CopyrightLbl;
    private javax.swing.JLabel Num1Lbl;
    private javax.swing.JTextField Num1Txt;
    private javax.swing.JLabel Num2Lbl;
    private javax.swing.JTextField Num2Txt;
    private javax.swing.JLabel Num3Lbl;
    private javax.swing.JTextField Num3Txt;
    private javax.swing.JButton NumbersControlButton;
    private javax.swing.JLabel TitleLbl;
    private javax.swing.JLabel Wallpaper;
    // End of variables declaration//GEN-END:variables
}
