import java.util.Random;

public class GetSignedCard{

private String[] signedCard;

public GetSignedCard(){
	signedCard= new String[2];
}

public String[] getSignedCard(){
	Random r = new Random();
	
	for(int i=0;i<2;++i){
		int type=r.nextInt(2);
		if(type==0){
			signedCard[i]="+/-";
		}else{
			signedCard[i]="x2";
		}
	}
	return signedCard;
}
}