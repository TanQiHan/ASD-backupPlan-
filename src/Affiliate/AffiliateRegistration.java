
package Affiliate;

import java.util.Scanner;




public class AffiliateRegistration {

   
    
    public static void main(String[] args) {
       Scanner scanner= new Scanner(System.in);
      Affiliate affiliate=new Affiliate();
       String restaurantName,ownerName,restaurantContactNo,location,ownerContactNo;
       System.out.print("Do you want to register as an Affiliate?(Yes=Y,No=N) ");
       char ans=Character.toUpperCase(scanner.nextLine().charAt(0));
        if(ans=='Y'){
            do{
         
         System.out.println("Registration No. :"+affiliate.getAffiliateNo());
         System.out.print("Restaurant's Name :");
         restaurantName=scanner.nextLine();
         System.out.print("Owner's Name :");
         ownerName=scanner.nextLine();
         System.out.print("Owner's Contact Number :");
         ownerContactNo=scanner.nextLine();
         System.out.print("Restaurant's Contact Number :");
         restaurantContactNo=scanner.nextLine();
         System.out.print("Location :");
         location=scanner.nextLine();
         if(restaurantName.isEmpty()||ownerName.isEmpty()||ownerContactNo.isEmpty()||restaurantContactNo.isEmpty()||location.isEmpty()){
        System.out.println("Please fill up all the details.");
         }else{
             
         
        
             System.out.print("Are you confirm to register as an affiliate of Fastest Deliveryman?(Yes=Y,No=N)");
             char confirmans=Character.toUpperCase(scanner.nextLine().charAt(0));
             if(confirmans=='Y'){
                 affiliate.setRestaurant_Name(restaurantName);
                 affiliate.setOwner_Name(ownerName);
                 affiliate.setOwner_ContactNo(ownerContactNo);
                 affiliate.setRestaurant_ContactNo(restaurantContactNo);
                 affiliate.setLocation(location);
                 System.out.println(affiliate.tostring());
             
             }else{
                 System.out.println("Thank you for visit.");
             }
             
         
         }
            }while(restaurantName.isEmpty()||ownerName.isEmpty()||ownerContactNo.isEmpty()||restaurantContactNo.isEmpty()||location.isEmpty());
         }
             
        }
        
    
} 

