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
package datos;

import javax.swing.JOptionPane;

public class Estudiante {
    // Information about the student
    private final int id;
    private float note;
    private int level;
    // Conectors
    public Estudiante anterior;
    public Estudiante next;
    
    // Constructor, for assigning the values for the student
    public Estudiante(int id, float note, int level) {
        this.id = id;
        this.note = note;
        this.level = level;
    }
    
    // Get id
    public int getId() {
        return this.id;
    }
    
    // Get Note
    public float getNote() {
        return this.note;
    }
    
    // Get Level
    public int getLevel() {
        return this.level;
    }
    
    // set note
    public void setNote() {
        this.note = Float.parseFloat(JOptionPane.showInputDialog("Cual es la nueva nota?"));
    }
    
    // set level
    public void setLevel() {
        String levels[] = {"Decimo", "Undecimo", "Duodecimo"};
        this.level = JOptionPane.showOptionDialog(null,
                    "Cual es el nivel del estudiante?",
                    "Nivel",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    levels,
                    levels[0]
            );
    }
}
