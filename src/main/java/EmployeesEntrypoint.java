import entities.Employee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class EmployeesEntrypoint {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.printf("Employee %d \n", i+1);
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            Employee employee = new Employee(name, salary);
            employees.add(employee);
        }

        printEmployees(employees);

        System.out.print("Enter the employee id that will have its salary increase: ");
        int employeeId = sc.nextInt();

        Employee foundEmployee = employees
            .stream()
            .filter(employee -> employee.getId() == employeeId)
            .findFirst().orElse(null);

        if (foundEmployee == null) {
            System.out.printf("Employee with id %d not found", employeeId);
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            foundEmployee.increaseSalary(percentage);
        }

        printEmployees(employees);

        sc.close();
    }

    public static void printEmployees(ArrayList<Employee> employees) {
        System.out.println();

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();
    }
}
