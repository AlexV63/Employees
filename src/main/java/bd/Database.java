package bd;

import java.util.LinkedList;

public class Database {
    LinkedList<Employee> employeesList = new LinkedList<Employee>();

    public void addEmp(Employee employee) {
        employeesList.add(employee);
    }

    public void removeEmp(Employee employee) {
        employeesList.remove(employee);
    }

    public void clearEmp(Employee employee) {
        employeesList.clear();
    }

    public void showEmployees

    {
        for (int i = 0; i < employeesList.size(); i++) {
            System.out.println("Employee :" + employeesList(i).show);
        }
    }
}
