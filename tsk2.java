import java.util.*;
public class tsk2 {
    public static void main(String[] args) {
        Scanner newscan = new Scanner(System.in);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int bmonth = 0;
	    System.out.println("Enter your birth month in integer form 1-12:");
		if(newscan.hasNextInt()){
            bmonth = newscan.nextInt();
        }else{
            System.exit(0);
        }
		if(bmonth <= 12 && bmonth >= 1){
			System.out.println("Your birth month is: " + months[bmonth-1]);
		}else{
			System.out.println("You entered an incorrect month value: " + bmonth);
		}
        newscan.close();
    }
}
