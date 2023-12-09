import java.util.Scanner;

public class Test{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hello,it is BlueJack Game!");
		
		System.out.println("This game includes 3 decks and the game deck contains 4 sets,computer's deck and user's deck");
		
		Enter enter = new Enter("Here is the deck!");
        enter.enter(); 
		
		ExtraCard extraCard= new ExtraCard();
		String[] userDeck= extraCard.extraCardUser();
		String[] computerDeck=extraCard.extraCardComputer();
		
		System.out.println("First cards go to computer's deck and then you can take extra cards.");
		System.out.println("");
		
		
		System.out.println("Computer Hand :x x x x x x x x x x");
		System.out.println("Computer Board:Empty");
		System.out.println("Player Board  :Empty");
		System.out.print("Player Hand   :");
		
		for(int i=0;i<5;++i){
			System.out.print(userDeck[i]);
		}
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Your turn to take cards!");
		
		Enter enter1 = new Enter("Please, push the enter to take extra cards!");
        enter.enter(); 
		
		System.out.println("Computer Hand :x x x x x x x x x x");
		System.out.println("Computer Board:Empty");
		System.out.println("Player Board  :Empty");
		System.out.print("Player Hand   :");
		
		for(int i=0;i<10;++i){
			System.out.print(userDeck[i]);
		}
		System.out.println("");
		
		System.out.println("It is time to create gamer's decks to play.");
		System.out.println("We are selected 4 cards from ypur decks and you will play with these cards :)");
		
		Enter enter2 = new Enter("Please, push the enter to see game deck:");
        enter.enter(); 
		
		CreatePlayerDecks createPlayerDecks= new CreatePlayerDecks(computerDeck,userDeck);
		String[] computerPlayDeck= createPlayerDecks.createComputerPlayDeck();
		String[] userPlayDeck= createPlayerDecks.createUserPlayDeck();
		
		System.out.println("Computer Hand :x x x x");
		System.out.println("Computer Board:Empty");
		System.out.println("Player Board  :Empty");
		System.out.print("Player Hand   :");
		
		for(int i=0;i<userPlayDeck.length;++i){
			System.out.print(userPlayDeck[i]+" ");
		}
	}
}