import java.util.Random;
import java.util.Scanner;

public class ShuffleCards{

private String[] deck;
private String[] shuffledDeck;


public ShuffleCards(){
	GameDeck gameDeck = new GameDeck();
	deck=gameDeck.createDeck();
	
}

public String[] shuffleDeck() {
        Random r = new Random();
		Scanner sc=new Scanner(System.in);
		String cont="";
		
		String[] shuffledDeck=new String[40];
	
	for(int j=0;j<deck.length;++j){
		shuffledDeck[j]=deck[j];
	}
	
	for (int i = deck.length - 1; i > 0; i--) {
        int j = r.nextInt(i+1);

        String temp = shuffledDeck[i];
        shuffledDeck[i] = shuffledDeck[j];
        shuffledDeck[j] = temp;
        }
	
		Enter enter = new Enter("Please,push the enter to shuffled the deck!");
        enter.enter(); 
	
		System.out.println("Shuffled Deck:");
        
		for (String card : shuffledDeck) {
            System.out.println(card);
        }
		return shuffledDeck;
}
}