import java.util.Scanner;

public class Spread{
	
private String[] shuffledDeck1;
private String[] playCards;
private String[] userDeck;
private String[] computerDeck;

public Spread(String[] shuffledDeck){
	shuffledDeck1=shuffledDeck;
}


public String[] spreadCards(){
	Scanner sc=new Scanner(System.in);
	
	String[] userDeck=new String[5];
	String[] computerDeck=new String[5];
	String[] playCards=new String[10];
	int i=0;
	int j=shuffledDeck1.length-1;
	String str="";
	String str2="";
	String str1="                    ";
	String str3="                     ";
	String str4="                     ";
	String cont="";
	System.out.println("");
	System.out.print("It is time to pick up the cards!");
		
	do{
		System.out.println("");
		System.out.print("If you are ready push the enter!");
		System.out.println("");
		cont=sc.nextLine();
	}while(!cont.equals("")); 
	
	do{
		computerDeck[i]=shuffledDeck1[i];
		
		str2="x ";
		str1=str2+str1.substring(0,str1.length()-2);
		
		System.out.println(" --------------------------------------");
		System.out.println("|This card goes to computer!           |");
		System.out.println("|                                      |");
		System.out.println("|Computer Hand :"+str1+"   |");
		System.out.println("|Computer Board:Empty                  |");
		System.out.println("|Player Board  :Empty                  |");
		System.out.print("|Player Hand   :");
		
		if(userDeck[i]!=null){
				str +=userDeck[i]+" ";
				str3=str3.substring(userDeck[i].length()+1);
		}
		
		
		System.out.print(str+str3);
		System.out.println("  |");
	
		System.out.println(" --------------------------------------");
	
		do{
			System.out.println("");
			System.out.print("Please,push the enter to continue!");
			System.out.println("");
			cont=sc.nextLine();
		}while(!cont.equals("")); 
	
		userDeck[i]=shuffledDeck1[j];
		
		System.out.println(" --------------------------------------");
		System.out.println("|This card goes to you!                |");
		System.out.println("|                                      |");
		System.out.println("|Computer Hand :"+str1+"   |");
		System.out.println("|Computer Board:Empty                  |");
		System.out.println("|Player Board  :Empty                  |");
		System.out.print("|Player Hand   :");
		
		
		if(userDeck[i]!=null){
				str +=userDeck[i]+" ";
				str3=str3.substring(userDeck[i].length()+1);
		}
		
		System.out.print(str+str3);
		System.out.println("  |");
		
		i++;
		j--;
		
		System.out.println(" --------------------------------------");
		
			
		do{
			System.out.println("");
			System.out.print("Please,push the enter to continue!    ");
			System.out.println("");
			cont=sc.nextLine();
		}while(!cont.equals("")); 
		
		if(userDeck[4]!=null){
			break;
		}
		
	}while(true);
	
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
