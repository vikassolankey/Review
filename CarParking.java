
import java.util.ArrayList;
import java.util.Scanner;



public class CarParking {

    public static void displayMenu(int capacity) {
        System.out.println("Press 1 for car park");
        System.out.println("Press 2 for car exit");
        System.out.println("Press 3 for car list");
        System.out.println("Press 4 to exit");
        System.out.println("Current available parking spots: " + capacity);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> carList = new ArrayList<>();
        int capacity=6;

        System.out.println("Welcome to the Car Parking System");
        System.out.println("Parking lot capacity: " + capacity);
    
        while (true) {
            displayMenu(capacity);
            int choice = input.nextInt();
            input.nextLine(); 
            switch (choice) {
                case 1:
                    if (carList.size() >= 6) {
                        System.out.println("Parking lot is full. Cannot park more cars.");
                        break;
                    }
                    System.out.print("Enter car number: ");
                    String carNumber = input.nextLine();
                    if (carList.contains(carNumber)) {
                        System.out.println("Car is already parked.");
                    } else {
                        carList.add(carNumber);
                        System.out.println("Car parked successfully.");
                        capacity--;
                    }
                    break;
                case 2:
                    System.out.print("Enter car number to exit: ");
                    String exitCarNumber = input.nextLine();
                    if (carList.remove(exitCarNumber)) {
                        System.out.println("Car exited successfully.");
                        capacity++;
                    } else {
                        System.out.println("Car not found in the parking lot.");
                    }
                    break;
                case 3:
                    System.out.println("Cars in the parking lot:");
                    for (String car : carList) {
                        System.out.println(car);
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
        }
    }

}