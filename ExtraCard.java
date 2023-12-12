import java.util.Random;

public class ExtraCard{

private String[] userDeck;
private String[] computerDeck;
private String[] playCards;
private char[] colours;
private String[] signedCardU;
private String[] signedCardC;
private String[] shuffledDeck;

public ExtraCard(){
	shuffledDeck=new String[40];
	
	
}

public ExtraCard(String[] shuffledDeck){
	this.shuffledDeck=shuffledDeck;
	colours= new char[]{'B','R','G','Y'};
	userDeck=new String[10];
	computerDeck=new String[10];
	setPlayCards();
	GetSignedCard getSignedCard = new GetSignedCard();
	signedCardU=getSignedCard.getSignedCard();
	signedCardC=getSignedCard.getSignedCard();
}

public void setPlayCards(){
	Spread spread=new Spread(shuffledDeck);
	playCards=spread.spreadCards();
}

private int plus(){
	Random r= new Random();
	int percentage1=r.nextInt(5);
	int percentage2=r.nextInt(5);
	
	if(percentage1==0&&percentage2==0){
		return 0;
	}
	else if(percentage1==0 || percentage2==0){
		return 1;
	}
	else{
		return 2;
	}
}
public String[] extraCardUser(){
	Random r= new Random();
	int sign=0;
	int number=0;
	int colour=0;
	int plus=plus();
	
	for(int i=0;i<5;++i){
		userDeck[i]=playCards[i];
	}
	
	for(int j=5;j<8+plus;++j){
		
		sign=r.nextInt(2);
		if(sign==0){
			userDeck[j]="+";
		}else{
			userDeck[j]="-";
		}
		
		number=r.nextInt(6)+1;
		userDeck[j]+=number;
	
		colour=r.nextInt(4);
		userDeck[j]+=colours[colour];
	}
	switch(plus){
		case 0:
			userDeck[8]=signedCardU[0];
			userDeck[9]=signedCardU[1];
		case 1 :
			userDeck[9]=signedCardU[0];
		default:
			break;
	}
	/*
	for(int i=0;i<10;++i){
		System.out.println(userDeck[i]);
	}
	*/
	return userDeck;
	}
	
public String[] extraCardComputer(){
	Random r= new Random();
	int sign=0;
	int number=0;
	int colour=0;
	int row =0;
	int plus=plus();
	
	for(int i=5;i<10;++i){
		computerDeck[row]=playCards[i];
		row++;
	}
	
	for(int j=5;j<8+plus;++j){
		
		sign=r.nextInt(2);
		if(sign==0){
			computerDeck[j]="+";
		}else{
			computerDeck[j]="-";
		}
		
		number=r.nextInt(6)+1;
		computerDeck[j]+=number;
	
		colour=r.nextInt(4);
		computerDeck[j]+=colours[colour];
	}
	
	switch(plus){
		case 0:
			computerDeck[8]=signedCardC[0];
			computerDeck[9]=signedCardC[1];
		case 1 :
			computerDeck[9]=signedCardC[0];
		default:
			break;
	}
	/*
	for(int i=0;i<10;++i){
		System.out.println(computerDeck[i]);
	}
	*/
	return computerDeck;
}

}

     