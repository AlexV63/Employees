import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Database {
    LinkedList<Employee> employeesList = new LinkedList<Employee>();

    List<Employee> employeeList1 = new ArrayList<Employee>();

    public void addEmp(Employee employee) {
        employeesList.add(employee);
    }

    public void removeEmp(Employee employee) {
        employeesList.remove(employee);
    }

    public void clearEmp(Employee employee) {
        employeesList.clear();
    }

    public void showEmployees(){
        for (int i = 0; i < employeesList.size(); i++) {
            System.out.println("Employee : " + employeesList.toString());
        }
    }
}
