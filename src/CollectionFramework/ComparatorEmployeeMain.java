package CollectionFramework;

import java.util.*;

// Employee class
class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

// Comparator class
class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.salary > e2.salary)
            return 1;
        else if (e1.salary < e2.salary)
            return -1;
        else
            return 0;
    }
}

// Main class
public class ComparatorEmployeeMain {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Ali", 40000));
        list.add(new Employee(2, "Rahul", 60000));
        list.add(new Employee(3, "Zoya", 50000));

        // Sorting using Comparator
        Collections.sort(list, new SalaryComparator());

        // Printing
        for (Employee e : list) {
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }
    }
}
