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
		
		ExtraCard extraCard= new ExtraCard();
		
		System.out.println("First cards go to computer's deck and then you can take extra cards.");
		
		String[] userDeck= extraCard.extraCardUser();
	
		System.out.println("Computer Hand :x x x x x x x x x x");
		System.out.println("Computer Board:Empty");
		System.out.println("Player Board  :Empty");
		System.out.print("Player Hand   :");
		
		for(int i=0;i<5;++i){
			System.out.print(userDeck[i]);
		}
		System.out.println("");
		
		String[] computerDeck=extraCard.extraCardComputer();
		System.out.println("These cards go to you!");
		
		System.out.println("Computer Hand :x x x x x x x x x x");
		System.out.println("Computer Board:Empty");
		System.out.println("Player Board  :Empty");
		System.out.print("Player Hand   :");
		
		for(int i=0;i<10;++i){
			System.out.print(userDeck[i]);
		}
		
	}
}