import java.util.Random;

public class GameDeck{

private char[] colour;
private char[] number;
private String[] deck;


public GameDeck(){
    colour= new char[]{'B','R','G','Y'};
	number= new char[10];
	
}

public String[] createDeck(){
	String[] deck=new String[40];
	int row=0;
	String card="";
	int k=1;
		
	for (char c : colour) {
        for (char n : number) {
            card = k + String.valueOf(c);
            deck[row] = card;
            row++;
            k++;
        }k=1;	
	}
		String out = "";  
		String out1= "";
		String out2= "";
		String out3= "";
		for (String card1 : deck) {
		    if(card1.charAt(1)=='B'){
				 out += card1 + "-";
			}
			if(card1.charAt(1)=='R'){
				 out1 += card1 + "-";
			}
			if(card1.charAt(1)=='G'){
				 out2 += card1 + "-";
			}
			if(card1.charAt(1)=='Y'){
				 out3 += card1 + "-";
			}
		}
		System.out.print("These are Blue cards  :");
		System.out.println(out+"10B");
		System.out.print("These are Red cards   :");
		System.out.println(out1+"10R");
		System.out.print("These are Green cards :");
		System.out.println(out2+"10G");
		System.out.print("These are Yellow cards:");
		System.out.println(out3+"10Y");
		
	
		return deck;
}
}

