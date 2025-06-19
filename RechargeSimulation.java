import java.util.*;
public class RechargeSimulation {

    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int amount=0;
        int rechargeAmount;
        String again="yes";
        System.out.print("do you want to rechage: ");
        String isWant=sc.next();
        while(again.equals("yes")){
        if(isWant.equals("yes")){
            System.out.print("Enter the amount you want to rechage:");
            rechargeAmount=sc.nextInt();
            if(rechargeAmount < 0) {
                System.out.println("Recharge amount cannot be negative.");
            } 
            else{
                amount += rechargeAmount;
                System.out.println("Recharge successful! Your new balance is: " + amount);
                System.out.print("do you want to rechage again: ");
                again=sc.next();
            
            }
        }}
    }
}