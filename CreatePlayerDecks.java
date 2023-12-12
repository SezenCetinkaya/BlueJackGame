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
	/*for(int i=0;i<10;++i){
		System.out.println(userDeck[i]);
	}
	*/
	Random r = new Random();
	int i=0;
	int k=r.nextInt(userDeck.length);
	do{
		if (i == 4) {
                break;
            }
            k = r.nextInt(userDeck.length);
            if (userDeck[k] != null) {
                userPlayDeck[i] = userDeck[k];
                userDeck[k] = null;
                i++;
            }
	
	}while(true);
	
	/*for(int i=0;i<4;++i){
		System.out.println(userPlayDeck[i]);
	}
	*/
	return userPlayDeck;
}

public String[] createComputerPlayDeck(){
	
	/*for(int i=0;i<10;++i){
		System.out.println(computerDeck[i]);
	}
	*/
	Random r = new Random();
	int i=0;
	int k=r.nextInt(computerDeck.length);
	do{
		if (i == 4) {
                break;
            }
            k = r.nextInt(computerDeck.length);
            if (computerDeck[k] != null) {
                computerPlayDeck[i] = computerDeck[k];
                computerDeck[k] = null;
                i++;
            }
	
	}while(true);
	return computerPlayDeck;
}
}
