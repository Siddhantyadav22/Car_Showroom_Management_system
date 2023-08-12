import java.sql.SQLOutput;
import java.util.Scanner;

public class Showroom implements utility{
    String showroom_name;
    String showroom_address;
    String total_employees;
    int total_cars_int_stock=0;
    String manager_name;

    public void get_details(){
        System.out.println("showroom Name:" +showroom_name);
        System.out.println("showroom Address"+ showroom_address);
        System.out.println("Manager_Name"+ manager_name);
        System.out.println("total_employees: "+total_employees);
        System.out.println("Total cars in stock" +total_cars_int_stock);
    }
    public void set_details(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================+++ Enteer showroom details +++================");
        System.out.println();
        System.out.println("showroom Name:");
        showroom_name = scanner.nextLine();
        System.out.println("showroom Address:");
        showroom_address = scanner.nextLine();
        System.out.println("Manager_Name:");
        manager_name = scanner.nextLine();
        System.out.println("total_employees:");
        total_employees = scanner.nextLine();
        System.out.println("Total cars in stock:");
        total_cars_int_stock = scanner.nextInt();
    }
}
