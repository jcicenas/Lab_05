import java.util.*;
public class tsk5 {
    public static void main(String[] args) {
        Scanner newscan = new Scanner(System.in);
        int num1 = 0;
		int num2 = 0;
		System.out.println("Whats your first number?");
		if(newscan.hasNextInt()){
            num1 = newscan.nextInt();
        }else{
            System.exit(0);
        }
		System.out.println("Whats your second number?");
		if(newscan.hasNextInt()){
            num2 = newscan.nextInt();
        }else{
            System.exit(0);
        }

		if(num1 == num2){
			System.out.println("These numbers are equal.");
		}else if(num1 < num2){
			System.out.println("Number 2 is greater than number 1.");
		}else if(num2 < num1){
			System.out.println("Number 1 is greater than number 2.");
		}
        newscan.close();
    }
}
