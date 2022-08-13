package cotidianocuatrodannysequeira.ejerciciotres;
/**
 * @ Cuarto Trabajo Cotidiano
 * @ Empleado
 * @Date: 4/4/2022
 * @Copyright: 2022 Danny Sequeira All rights reserved.
 */
public class Empleado {
    private final int id;
    private final String name;
    private final float salary;
    private final int gender; // 1 == male, 2 == female
    private final int department;

    public Empleado(int id, String name, float salary, int gender, int department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.department = department;
    }

    public int getGender() {
        return this.gender;
    }

    public int getDepartment() {
        return this.department;
    }

    public float getSalary() {
        return this.salary;
    }
}
