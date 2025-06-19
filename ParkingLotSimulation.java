import javax.sound.sampled.EnumControl;
import java.util.*;

public class ParkingLotSimulation {
    public static void Choice(){
        System.out.println("Choose the services: ");

    }
    public static ArrayList AddCarToPark(int n,int numCar, ArrayList arr){
        Scanner s=new Scanner(System.in);
        String str;
        for (int i = 0; i < n; i++) {
            if(arr.size()<n && i<numCar){
                System.out.print("enter car name: ");
                arr.add(str=s.next());
            }
        }
        return arr;
    }
    public  static void deleteCar(int n, ArrayList arr){
        Scanner s=new Scanner(System.in);
        System.out.println("enter name of the car to be deleted:");
        String DelCar=s.next();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).equals(DelCar)){
                System.out.println("Car deleted: "+arr.get(i));
                arr.remove(DelCar);
            }

        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        Choice();
        System.out.print("Enter number of parking space: ");
        int n=sc.nextInt();
        System.out.print("Enter num of car to be inserted: ");
        int numCar=sc.nextInt();
        AddCarToPark(n,numCar,arr);
        System.out.println(arr);
        deleteCar(n,arr);
        System.out.println(arr);
    }
}
