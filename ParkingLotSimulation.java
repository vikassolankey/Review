import javax.sound.sampled.EnumControl;
import java.util.*;

public class ParkingLotSimulation {
    public static void Choice(){


    }
    public static ArrayList<String> AddCarToPark(int n, ArrayList<String> arr){
        Scanner s = new Scanner(System.in);
        if (arr.size() >= n) {
            System.out.println("Parking Lot Full! No more space available.");
        } else {
            System.out.print("Enter car name to park: ");
            String carName = s.nextLine();
            arr.add(carName);
            System.out.println("Car parked successfully.");
        }
        return arr;
    }
    public  static void deleteCar(ArrayList<String> arr){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter name of the car to unpark: ");
        String delCar = s.nextLine();
        if (arr.contains(delCar)) {
            arr.remove(delCar);
            System.out.println("Car removed from the parking lot.");
        } else {
            System.out.println("Car not found in the parking lot.");
        }
    }
    public static void showStatus(int maxSpaces, ArrayList<String> parkedCars) {
        System.out.println("Total Parking Spaces: " + maxSpaces);
        System.out.println("Occupied Spaces: " + parkedCars.size());
        System.out.println("Available Spaces: " + (maxSpaces - parkedCars.size()));
        System.out.println("Currently Parked Cars: " + parkedCars);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();

        System.out.print("Enter number of parking spaces: ");
        int n = s.nextInt();
        s.nextLine();

        String choice;
        do {
            System.out.println("\nChoose a service:");
            System.out.println("1. Park your car");
            System.out.println("2. Remove your car");
            System.out.println("3. Show parking lot status");
            System.out.println("Press 'q' to exit.");
            System.out.print("Enter your choice: ");
            choice = s.nextLine();

            switch (choice) {
                case "1":
                    AddCarToPark(n, arr);
                    break;
                case "2":
                    deleteCar(arr);
                    break;
                case "3":
                    showStatus(n, arr);
                    break;
                case "q":
                    System.out.println("Exiting the Parking Lot System. Thank you!");
                    break;
                default:
                    System.out.println("Invalid input. Please choose 1, 2, 3, or q.");
            }
        } while (!choice.equals("q"));

    }
}
