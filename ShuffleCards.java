import java.util.Random;
import java.util.Scanner;

public class ShuffleCards{

private String[] deck;
private String[] shuffledDeck;

public ShuffleCards(){
	GameDeck gameDeck = new GameDeck();
	deck=gameDeck.createDeck();
	shuffledDeck=new String[40];
}

public String[] shuffleDeck() {
        Random r = new Random();
		Scanner sc=new Scanner(System.in);
		String cont="";
		String out="";
		
		for(int j=0;j<deck.length;++j){
			shuffledDeck[j]=deck[j];
		}
		
		for (int i = deck.length - 1; i > 0; i--) {
			int j = r.nextInt(i+1);

			String temp = shuffledDeck[i];
			shuffledDeck[i] = shuffledDeck[j];
			shuffledDeck[j] = temp;
		 }
		
		do{
			System.out.println("");
			System.out.print("Please,push the enter to shuffled the deck!");
			System.out.println("");
			cont=sc.nextLine();
		}while(!cont.equals("")); 
		
		System.out.print("Shuffled Deck:");
        
		for(String arg : shuffledDeck) {
            out += arg + "/"; 
		}
		System.out.println(out.substring(0, out.length()-1));

		System.out.println(" ");
		return shuffledDeck;
	}
}