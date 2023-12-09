import java.util.Random;

public class CreatePlayerDecks{
private String[] userPlayDeck;
private String[] computerPlayDeck;
private String[] userDeck;
private String[] computerDeck;

public CreatePlayerDecks(String[] computerDeck,String[] userDeck){
	this.computerDeck=computerDeck;
	this.userDeck=userDeck;
	computerPlayDeck= new String[4];
	userPlayDeck= new String[4];
}

public String[] getUserPlayDeck(){
	return userPlayDeck;
}

public String[] getComputerPlayDeck(){
	return computerPlayDeck;
}

public String[] createUserPlayDeck(){
	Random r = new Random();
	for(int i=0;i<4;++i){
		userPlayDeck[i]=userDeck[r.nextInt(userDeck.length)];
	}
	return userPlayDeck;
}

public String[] createComputerPlayDeck(){
	Random r = new Random();
	for(int i=0;i<4;++i){
		computerPlayDeck[i]=computerDeck[r.nextInt(computerDeck.length)];
	}
	return computerPlayDeck;
}
}
