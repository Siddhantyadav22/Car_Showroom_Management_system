import java.util.Scanner;

public class Cars extends Showroom implements utility{
    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_type;
    String car_transmission;

    public void get_details(){
        System.out.println("Name: " + car_name);
        System.out.println("Color: " + car_color);
        System.out.println("Fuel Type: " + car_fuel_type);
        System.out.println("Price: " + car_price);
        System.out.println("Type: " + car_type);
        System.out.println("Transmission: " + car_transmission);
    }

    public void set_details(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("================ +++ Enter car details +++ ================");
        System.out.println();
        System.out.println("car name: ");
        car_name = scanner.nextLine();
        System.out.println("car color: ");
        car_color = scanner.nextLine();
        System.out.println("car fuel type(petrol/Diesel): ");
        car_fuel_type = scanner.nextLine();
        System.out.println("car price: ");
        car_price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("car type(Sedan/Suv/Hatchback): ");
        car_type = scanner.nextLine();
        System.out.println("car transmission(Manual/Automatic): ");
        car_transmission = scanner.nextLine();
        total_cars_int_stock++;
    }

}