import java.util.*;
/**
 * tsk1
 */
public class tsk1 {
    public static void main(String[] args) {
        Scanner newscan = new Scanner(System.in);
        int iprice = 0;
        System.out.println("Enter the price of an item.");
        if(newscan.hasNextInt()){
            iprice = newscan.nextInt();
        }else{
            System.exit(0);
        }

        if(iprice >= 100){
            System.out.println("Shipping is: " + (iprice * 0.02));
            System.out.println("Total price is: " + (iprice + (iprice * 0.02)));
        }else{
            System.out.println("Shipping is: " + (iprice * 0));
            System.out.println("Total price is: " + (iprice + (iprice * 0)));  
        }
        newscan.close();
    }
}