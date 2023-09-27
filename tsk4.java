import java.util.*;
public class tsk4 {
    public static void main(String[] args) {
        Scanner newscan = new Scanner(System.in);
        int age = 0;
		System.out.println("How old are you?");
        if(newscan.hasNextInt()){
		    age = newscan.nextInt();
        }else{
            System.exit(0);
        }
		if(age >= 21){
			System.out.println("You get a wristband.");
		}
        newscan.close();

    }
}
