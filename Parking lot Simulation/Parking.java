/* 
parking lot simulation
park 
unpark 
and show
out of park
max = 6 
*/

import java.util.*;
public class Parking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int park[] = new int[n];
        int parking = 0;
        int unpark=0;

        for(int i=0;i<park.length;i++){
            if(i <= 5){
                System.out.println("park");
                parking++;
            }
            else if(i>=6){
                System.out.println("out of park");
            }
            if(i == 6){
                System.out.println("unpark");
                parking--;
                unpark++;
            }
            System.out.println("parking : "+parking);
            System.out.println("unpark : "+unpark);
        }
    }
}
