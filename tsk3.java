import java.util.*;
public class tsk3 {
    public static void main(String[] args) {
        Scanner newscan = new Scanner(System.in);
        String[] parties = {"Democrat", "Republican" , "Independent", " Donkey", " Elephant", " Man"};
		String party;
		System.out.println("What party are you affiliated with?");
		party = newscan.nextLine();

		for(int i = 0; i < parties.length; i++){
			if(party.equals(parties[i])){
				System.out.println("You get a " + parties[i] + parties[i+3] + ".");
			}
            
		}
        newscan.close();
    }
}
