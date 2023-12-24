import java.util.Random;

public class CreatePlayerDecks{
private String[] userPlayDeck;
private String[] computerPlayDeck;
private String[] userDeck1;
private String[] computerDeck1;

public CreatePlayerDecks(String[] computerDeck,String[] userDeck){
	computerDeck1=computerDeck;
	userDeck1=userDeck;
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
	int k=r.nextInt(userDeck1.length);
	do{
		if (i == 4) {
                break;
            }
            k = r.nextInt(userDeck1.length);
            if (userDeck1[k] != null) {
                userPlayDeck[i] = userDeck1[k];
                userDeck1[k] = null;
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
	int k=r.nextInt(computerDeck1.length);
	do{
		if (i == 4) {
                break;
            }
            k = r.nextInt(computerDeck1.length);
            if (computerDeck1[k] != null) {
                computerPlayDeck[i] = computerDeck1[k];
                computerDeck1[k] = null;
                i++;
            }
	
	}while(true);
	return computerPlayDeck;
}
}
