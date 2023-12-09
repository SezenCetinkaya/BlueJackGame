import java.util.Scanner;

public class Spread{
	
private String[] shuffledDeck;
private String[] playCards;
private String[] userDeck;
private String[] computerDeck;

public Spread(){
	ShuffleCards shuffleCards = new ShuffleCards();
	shuffledDeck=shuffleCards.shuffleDeck();
}

public String[] spreadCards(){
	String[] userDeck=new String[5];
	String[] computerDeck=new String[5];
	String[] playCards=new String[10];
	int i=0;
	int j=shuffledDeck.length-1;
	String x="";
	System.out.println("");
	System.out.print("It is time to pick up the cards!");
	Scanner sc=new Scanner(System.in);
	String cont="";
	
	Enter enter = new Enter("If you are ready push the enter!");
        enter.enter(); 
	
	do{
		computerDeck[i]=shuffledDeck[i];
		
		x=x+"x"+" ";
		
		System.out.println("This card goes to computer!");
		System.out.println("Computer Hand :"+x);
		System.out.println("Computer Board:Empty");
		System.out.println("Player Board  :Empty");
		System.out.print("Player Hand   :");
		
		for(int t=0;t<userDeck.length;t++) {
			System.out.print(userDeck[t]+" ");
		}System.out.println("");
		
		System.out.println("");
		
		Enter enter1 = new Enter("Please,push the enter to continue!");
        enter1.enter(); 
		
		userDeck[i]=shuffledDeck[j];
		
		System.out.println("This card goes to you!");
		System.out.println("Computer Hand :"+x);
		System.out.println("Computer Board:Empty");
		System.out.println("Player Board  :Empty");
		System.out.print("Player Hand   :");
		
		for(int k=0;k<userDeck.length;k++) {
			System.out.print(userDeck[k]+" ");
		}System.out.println("");
		
		System.out.println("");
		
		i++;
		j--;
		
		Enter enter2 = new Enter("Please,push the enter to continue!");
        enter2.enter(); 
		
		if(userDeck[4]!=null){
			break;
		}
		
	}while(cont.equals(""));
	
	System.out.println("This step is continued.Now, it is time to take special cards :)");
	
	for(int t=0;t<5;++t){
		playCards[t]=userDeck[t];
	}
	for(int k=0;k<5;++k){
		playCards[k+5]=computerDeck[k];
	}
	return playCards;
}
	
}
