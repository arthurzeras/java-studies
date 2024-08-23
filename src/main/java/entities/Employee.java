package entities;

import java.util.Random;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.id = this.generateId();
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    private int generateId() {
        int min = 100;
        int max = 999;
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public void increaseSalary(double percent) {
        this.salary = this.salary + (this.salary * percent) / 100;
    }

    public String toString() {
        return String.format("#%d, %s, %.2f", this.id, this.name, this.salary);
    }
}
