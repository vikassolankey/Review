import java.util.*;
public class RechargeSimulation {

    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int amount=0;
        int rechargeAmount;
        int airtelAmount=0;
        int jioAmount=0;
        int viAmount=0;
        String again="yes";
        System.out.print("do you want to rechage: ");
        String isWant=sc.next();
        System.out.print("enter the operator : ");
        String operator=sc.next();
        switch (operator) {
            case "airtel":{
                 while(again.equals("yes")){
        if(isWant.equals("yes")){
            System.out.print("Enter the amount you want to rechage:");
            rechargeAmount=sc.nextInt();
            if(rechargeAmount < 0) {
                System.out.println("Recharge amount cannot be negative.");
            } 
            else{
                airtelAmount += rechargeAmount;
                System.out.println("Recharge successful! ");
                System.out.print("do you want to rechage again: ");
                again=sc.next();
            
            }
        }}
            }
            break;
            case "jio":{
                  while(again.equals("yes")){
        if(isWant.equals("yes")){
            System.out.print("Enter the amount you want to rechage:");
            rechargeAmount=sc.nextInt();
            if(rechargeAmount < 0) {
                System.out.println("Recharge amount cannot be negative.");
            } 
            else{
                jioAmount += rechargeAmount;
                System.out.println("Recharge successful! " );
                System.out.print("do you want to rechage again: ");
                again=sc.next();
            
            }
        }}
               
                    }      
                break;
             case "vi":{
                  while(again.equals("yes")){
        if(isWant.equals("yes")){
            System.out.print("Enter the amount you want to rechage:");
            rechargeAmount=sc.nextInt();
            if(rechargeAmount < 0) {
                System.out.println("Recharge amount cannot be negative.");
            } 
            else{
                viAmount += rechargeAmount;
                System.out.println("Recharge successful! " );
                System.out.print("do you want to rechage again: ");
                again=sc.next();
            
            }
        }}
               
                    }      
                break;
            default:{
                System.out.println("Invalid operator. Please enter airtel, jio, or vi.");
            }
       
    }
   
    System.out.print("Do you want to see the total recharge amount? (yes/no):") ;
     String seeAmount=sc.next();
     System.out.print("for which opertor: ");
        operator=sc.next();
       if(seeAmount.equals("yes")){
    switch (operator) {
        case "airtel":{
            System.out.println("Total recharge amount for Airtel: " + airtelAmount);}
            break;
    case "jio":
            System.out.println("Total recharge amount for Jio: " + jioAmount);
            break;
            case "vi":
            System.out.println("Total recharge amount for Vi: " + viAmount);   
            break; 
        default:
            System.out.println("No valid operator selected. No recharge amounts to display.");
            
    }
    }
    else{
    System.out.println("Thank you for using the recharge simulation");
    }

}}