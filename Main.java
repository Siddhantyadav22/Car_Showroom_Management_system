import java.util.*;
import java.lang.*;

interface utility{
    public void get_details();
    public void set_details();
}
public class Main {
    static void main_menu(){
        System.out.println();
        System.out.println("================== *** Welcome to showroom management system ***=================== ");
        System.out.println();
        System.out.println("================== *** Enter your choice ***================");
        System.out.println();
        System.out.println("1).Add Showroom \t\t\t 2).Add employees \t\t\t 3).Add Cars");
        System.out.println();
        System.out.println("4).Get Showroom \t\t\t 5).Get employees \t\t\t 6).Get Cars");
        System.out.println();
        System.out.println("===================*** Enter 0 to EXIT ***====================");

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Showroom[] showroom = new Showroom[5];
        Employees[] employee = new Employees[5];
        Cars[] car = new Cars[5];
        int car_count = 0;
        int employee_count = 0;
        int showroom_count = 0;
        int choice = 100;
        while(choice !=0){
            main_menu();
            choice = scanner.nextInt();

            while(choice !=9 && choice !=0){
                switch(choice) {
                    case 1:
                        showroom[showroom_count] = new Showroom();
                        showroom[showroom_count].set_details();
                        showroom_count++;
                        System.out.println();
                        System.out.println("1).Add new Showroom");
                        System.out.println("9).GO back to MAIN MENU");
                        choice = scanner.nextInt();
                        break;
                    case 2:
                        employee[employee_count] = new Employees();
                        employee[employee_count].set_details();
                        employee_count++;
                        System.out.println();
                        System.out.println("2).Add new Employee");
                        System.out.println("9).GO back to MAIN MENU");
                        choice = scanner.nextInt();
                        break;
                    case 3:
                        car[car_count] =  new Cars();
                        car[car_count].set_details();
                        car_count++;
                        System.out.println();
                        System.out.println("3].ADD NEW CAR");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = scanner.nextInt();
                        break;
                    case 4:
                        for(int i=0;i<showroom_count;i++){
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9).Go BACK TO MAIN MENU");
                        System.out.println("0).EXIT");
                        choice= scanner.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employee_count; i++) {
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice= scanner.nextInt();
                        break;
                    
                    case 6:
                        for(int i=0; i<car_count;i++){
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = scanner.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;

                }
            }    
        }
    }
}
