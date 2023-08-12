import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility{
    String emp_id;
    String emp_name;
    int  emp_age;
    String emp_department;

    public void get_details(){
        System.out.println("ID: " + emp_id);
        System.out.println("Name: " + emp_name);
        System.out.println("Age: " + emp_age);
        System.out.println("Department: " + emp_department);
        System.out.println("Showroom: " + showroom_name);
    }
    public void set_details(){
        Scanner scanner = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("===============+++ Enter employee details =================");
        System.out.println();
        System.out.println("employee Name: ");
        emp_name = scanner.nextLine();
        System.out.println("employee Age: ");
        emp_age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("employee Department: ");
        emp_department = scanner.nextLine();
        System.out.println("showroom name: ");
        showroom_name = scanner.nextLine();

    }
    
}
