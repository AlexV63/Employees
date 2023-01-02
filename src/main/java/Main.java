import javax.swing.text.Position;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Service service = new Service();


        Employee employee1 = new Manager("Mikle", "Egorov", 35);
        Employee employee2 = new TOP("Alex", "Waldorf", 45);

        System.out.println(employee1);

        service.changePosition(employee1, PositionType.EMPLOYEE);

        System.out.println(employee1);
   }
}
