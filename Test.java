import java.util.Scanner;

public class Test{
	public static void main(String [] args){
	    String cont=" "; 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hello,it is BlueJack Game!");
		System.out.println("Here is the deck!");
		System.out.println("This deck is made up of four sets of cards that range between 1 and 10. The sets are colored blue-B, yellow-Y, red-R, and green-G.");
		
		do{
			System.out.println("");
			System.out.print("Please,push the enter to see the deck");
			System.out.println("");
			cont=sc.nextLine();
		}while(!cont.equals("")); 
		
		Spread spreadCards=new Spread();
		String[] playCards=spreadCards.spreadCards();
		
	}
}