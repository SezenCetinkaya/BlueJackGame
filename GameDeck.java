public class GameDeck{

private String[] colour;
private String[] number;
private String[] deck;

public GameDeck(){
    colour= new String[]{"B","R","G","Y"};
	number= new String[]{"1","2","3","4","5","6","7","8","9","10"};
	deck=new String[40];
	}

public String[] createDeck(){
	int row=0;
	String card="";
	
	for (String c : colour) {
        for (String n : number) {
            card = '+'+String.valueOf(n)+ String.valueOf(c);
            deck[row] = card;
            row++;
        }	
	}
	
	for (String c : colour) {
        String out = "";
        for (String card1 : deck) {
            if (card1.charAt(2)==c.charAt(0)) {
                out += card1 + "/";
			}
			if(card1.charAt(2)=='0' && card1.charAt(3)==c.charAt(0)){
				out += card1 ;
			}
        }
        System.out.println("These are " + c + " cards: " + out);
    }
	
	return deck;
}
}

