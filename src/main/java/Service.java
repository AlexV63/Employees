import javax.swing.text.Position;
import java.util.ArrayList;

public class Service {

    public ArrayList<String> employeeList = new ArrayList<>();

    public Employee changePosition(Employee employee, PositionType position) {
        employee.setPosition(position);
        return employee;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(String.valueOf(employee));
    }

    public int getListSize() {
        return employeeList.size();
    }

    public void showEmployee() {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println("Employee: ");
            System.out.println(employeeList.get(i));
        }
    }

}
