package cotidianocuatrodannysequeira.ejerciciouno;

import javax.swing.JOptionPane;
/**
 * @ Cuarto Trabajo Cotidiano
 * @ Estudiante
 * @Date: 4/4/2022
 * @Copyright: 2022 Danny Sequeira All rights reserved.
 */
public class Estudiante {
    private String name;
    private int id;
    private final float note;
    private final int nivel;

    public Estudiante(String name, int id, float note, int nivel) {
        this.name = name;
        this.id = id;
        this.note = note;
        this.nivel = nivel;
    }

    public int getNivel() {
        return this.nivel;
    }

    public float getNote() {
        return this.note;
    }

    public void Aprobado() {
        if(this.note >= 70) {
            JOptionPane.showMessageDialog(null, "Estudiante aprobado");
        } else if (this.note < 70 && this.note >= 50) {
            JOptionPane.showMessageDialog(null, "Estudiante aplazado");
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante reprobado");
        }
    }

}
