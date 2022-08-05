package week_12_abstraction.task1;

import week_12_abstraction.Employee;
import week_12_abstraction.Manager;

public class TestMemberObjects {
    public static void main(String[] args) {


        Manager manager = new Manager("Can", " 1111 Germany", 27, 136000, 571366256, "DevOp");

        Employee employee = new Employee("Ermek", "2325 Arlington", 36, 129000, 571987654,"Developer");


        System.out.println(manager);
        System.out.println(employee);

        manager.printSalary();
        employee.printSalary();


    }
}
