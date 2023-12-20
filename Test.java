import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.io.BufferedReader;

public class Test{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hello,it is BlueJack Game!");
		
		System.out.println("What is your name?");
		String name=sc.nextLine();
		
		System.out.println("This game includes 3 decks and the game deck contains 4 sets,computer's deck and user's deck");
		
		Enter enter = new Enter("Here is the deck!");
        enter.enter(); 
		
		ShuffleCards shuffleCards = new ShuffleCards();
		String[] shuffledDeck1=shuffleCards.shuffleDeck();
		
		ExtraCard extraCard= new ExtraCard(shuffledDeck1);
		String[] userDeck= extraCard.extraCardUser();
		String[] computerDeck=extraCard.extraCardComputer();
		
		System.out.println("First cards go to computer's deck and then you can take extra cards.");
		System.out.println("");
		
		
		System.out.println("Computer Hand :x x x x x x x x x x");
		System.out.println("Computer Board:Empty");
		System.out.println("Player Board  :Empty");
		System.out.print("Player Hand   :");
		
		for(int i=0;i<5;++i){
			System.out.print(userDeck[i]);
			System.out.print(" ");
		}
		
		System.out.println("");
		System.out.println(" ");
		
		System.out.println("Your turn to take cards!");
		
		Enter enter1 = new Enter("Please, push the enter to take extra cards!");
        enter.enter(); 
		
		System.out.println("Computer Hand :x x x x x x x x x x");
		System.out.println("Computer Board:Empty");
		System.out.println("Player Board  :Empty");
		System.out.print("Player Hand   :");
		
		for(int i=0;i<10;++i){
			System.out.print(userDeck[i]);
			System.out.print(" ");
		}
		System.out.println("");
		
		System.out.println("It is time to create gamer's decks to play.");
		System.out.println("We are selected 4 cards from your decks and you will play with these cards :)");
		
		Enter enter2 = new Enter("Please, push the enter to see game deck:");
        enter2.enter(); 
		
		CreatePlayerDecks createPlayerDecks= new CreatePlayerDecks(computerDeck,userDeck);
		String[] computerPlayDeck= createPlayerDecks.createComputerPlayDeck();
		String[] userPlayDeck= createPlayerDecks.createUserPlayDeck();
		
		System.out.println("Computer Hand :x x x x");
		System.out.println("Computer Board:Empty");
		System.out.println("Player Board  :Empty");
		System.out.print("Player Hand   :");
		
		for(int i=0;i<userPlayDeck.length;++i){
			System.out.print(userPlayDeck[i]+" ");
		}
		System.out.println("");
		System.out.println("");
		
		System.out.println("The game is begining!!!");
		
		Enter enter3 = new Enter("please push the enter to start");
        enter3.enter(); 
		
		System.out.println("");
		
		//Game game=new Game(computerPlayDeck,userPlayDeck,shuffledDeck);
		
		//game.game();
		
		String[] computerBoard=new String[9];
	    String[] userBoard=new String[9];
		
		String[] shuffledDeck=new String[30];
		
		for(int i=0;i<30;++i){
			shuffledDeck[i]=shuffledDeck1[i+5];
		}
		
		for (int i = 0; i < 4; ++i) {
            System.out.println(computerPlayDeck[i]);
        }
		
		int totalComputer=0;
		int totalUser=0;
		int counter=0;
		int totalGame=1;
		int[] computerControl=new int[4];
		do{
			int counterB=0;
			int cardCounterC=0;
			int cardCounterU=0;
			int counterBoardC=0;
			int counterBoardU=0;
			int sumComputer=0;
			int sumUser=0;
			boolean controler1=true;
			int x;
			String string="";
			String string1="";
			int count;
			int counterC=0;
			int counterU=0;
			int keepOn=1;
			int keepOn1=1;
			int keepOn0=1;
			int controlSum=0;
			boolean useCard=false;
			boolean swapped;
			
			System.out.println("The set number is: "+totalGame);
			System.out.println("");
			System.out.println("Your score is: "+ totalUser);
			System.out.println("Computer's score is: "+ totalComputer);
			System.out.println("");
		
		do{
			if(keepOn0==1){
			computerBoard[counterC]=shuffledDeck[counter];
			if(!("+/-".equals(computerBoard[counterC])) || !("x2".equals(computerBoard[counterC]))){
				if (computerBoard[counterC] != null){
				string=computerBoard[counterC].substring(1, computerBoard[counterC].length()-1);
				sumComputer=sumComputer+ Integer.parseInt(string);
				}
			}
			counter++;
			counterC++;
			x=0;
			
			for(int i=0;i<4;++i){
				if(computerPlayDeck[i]!=null){
					x++;
				}
			}
			
			System.out.print("Computer Hand :");
			for(int i=0;i<x;++i){
				System.out.print("x ");
			}
			System.out.println("");
			System.out.print("Computer Board:");
			controler1=true;
			count=0;
			while(controler1){
				System.out.print(computerBoard[count]+" ");
				count++;
				if(computerBoard[count]==null){
					controler1=false;
				}
			}
			controler1=true;
			count=0;
			System.out.println("");
			System.out.print("Player Board  :");
			while(controler1){
				System.out.print(userBoard[count]+" ");
				count++;
				if(userBoard[count]==null){
					controler1=false;
				}
			}
			controler1=true;
			count=0;
			System.out.println("");
			System.out.print("Player Hand   :");
			while(controler1){
				System.out.print(userPlayDeck[count]+" ");
				count++;
				if(count==4){
					controler1=false;
				}
			}
			System.out.println("");
			System.out.println("");
			
			for(int i=0;i<computerPlayDeck.length;++i){
				
				if(computerPlayDeck[i]=="+/-"){
					string=computerBoard[counterC-1].substring(0, computerBoard[counterC-1].length()-1);
					controlSum=sumUser-2*Integer.parseInt(string);
				}
				else if(computerPlayDeck[i]=="x2"){
					string=computerBoard[counterC-1].substring(0, computerBoard[counterC-1].length()-1);
					controlSum=sumUser+ Integer.parseInt(string);
				}
				else{
					if (computerPlayDeck[i] != null){
						string=computerPlayDeck[i].substring(0, computerPlayDeck[i].length()-1);
						controlSum=sumComputer+ Integer.parseInt(string);
					}
				}
				
				computerControl[i]=20-controlSum;
				//System.out.println(controlSum);
			}
			/*
			for(int i=0;i<computerControl.length;++i){
				System.out.println(computerControl[i]);
			}
			*/
			for(int i=0;i<computerControl.length;++i){
				if(computerControl[i]==0){
					string=computerPlayDeck[i].substring(computerPlayDeck[i].length()-1);
					if(string=="B"){
						keepOn0=0;
						System.out.println("Computer decided to use a card from its hand and stand.");
						System.out.println("");
						computerBoard[counterC]=computerPlayDeck[i];
						computerPlayDeck[i]=null;
						sumComputer=20-computerControl[i];
						useCard=true;
					}break;
				}
			}
			if(!useCard){
				for(int i=0;i<computerControl.length;++i){
					if(computerControl[i]==0){
						keepOn0=0;
						System.out.println("Computer decided to use a card from its hand and stand.");
						System.out.println("");
						computerBoard[counterC]=computerPlayDeck[i];
						computerPlayDeck[i]=null;
						sumComputer=20-computerControl[i];
						useCard=true;
						}break;
				}
			}
			if(useCard==false){
				
				do {
					swapped = false;
					for (int i = 1; i < computerControl.length; i++) {
						if (computerControl[i - 1] > computerControl[i]) {
							int temp = computerControl[i - 1];
							computerControl[i - 1] = computerControl[i];
							computerControl[i] = temp;
							swapped = true;
						}
					}
				} while (swapped);
				
				for(int i=0;i<computerControl.length;++i){
				//	System.out.println("computer concider this 1.");
					if(computerControl[i]<3 && computerControl[i]>0){
						//System.out.println("computer concider this.");
						keepOn0=0;
						System.out.println("Computer decided to use a card from its hand and stand.");
						System.out.println("");
						computerBoard[counterC]=computerPlayDeck[i];
						computerPlayDeck[i]=null;
						sumComputer=20-computerControl[i];
						useCard=true;
						break;
					}
				}
			}
			if(keepOn1!=1){
				if(sumComputer>sumUser){
					keepOn0=0;
					System.out.println("Computer decided to stand.");
					System.out.println("");
				}
				else{
					//büyük yapan varsa kullanısın!!!
				}
			}
			if(sumComputer>16){
				keepOn0=0;
				System.out.println("Computer decided to stand.");
				System.out.println("");
			}
			for(int i=0;i<4;++i){
				computerControl[i]=20;
			}
		
		if(counter==31){
			break;
		}
		
		useCard=false;
		
		}
			
			if(keepOn1==1){
			userBoard[counterU]=shuffledDeck[counter];
			
			if(!"+/-".equals(userBoard[counterU]) || !"x2".equals(userBoard[counterU])){
				if (userBoard[counterU] != null){
					string1=userBoard[counterU].substring(1, userBoard[counterU].length()-1);
					sumUser+=Integer.parseInt(string1);
				}
			}
			x=0;
			for(int i=0;i<4;++i){
				if(computerPlayDeck[i]!=null){
					x++;
				}
			}
			System.out.print("Computer Hand :");
			for(int i=0;i<x;++i){
				System.out.print("x ");
			}
			System.out.println("");
			System.out.print("Computer Board:");
			count=0;
			controler1=true;
			while(controler1){
				System.out.print(computerBoard[count]+" ");
				count++;
				if(computerBoard[count]==null){
					controler1=false;
				}
			}
			controler1=true;
			count=0;
			System.out.println("");
			System.out.print("Player Board  :");
			while(controler1){
				System.out.print(userBoard[count]+" ");
				count++;
				if(userBoard[count]==null){
					controler1=false;
				}
			}
			controler1=true;
			count=0;
			System.out.println("");
			System.out.print("Player Hand   :");
			while(controler1){
				System.out.print(userPlayDeck[count]+" ");
				count++;
				if(count==4){
					controler1=false;
			}
			}
			System.out.println("");
			System.out.println("");
			
			do{
				System.out.println("");
				System.out.print("Do you want to use any card from your hand? please push 1 to use any card from your hand or push 2 to keep on.");
				System.out.println("");
				keepOn=sc.nextInt();
			}while(keepOn!=1 && keepOn!=2);
			
			if(keepOn==1){
				do{
				System.out.println("");
				System.out.print("Please, enter the number of the card that you want to use.1-2-3-4");
				System.out.println("");
				keepOn=sc.nextInt();
				}while((keepOn!=1 && keepOn!=2)&&(keepOn!=3 && keepOn!=4));
			counterU++;
			userBoard[counterU]=userPlayDeck[keepOn-1];
			
			if(userPlayDeck[keepOn-1]=="+/-"){
				if(userBoard[counterU-1].substring(0,0)=="-"){
					string=userBoard[counterU-1].substring(0, userBoard[counterU-1].length()-1);
					sumUser=sumUser+2*Integer.parseInt(string);
				}
				if(userBoard[counterU-1].substring(0,0)=="+"){
					string=userBoard[counterU-1].substring(0, userBoard[counterU-1].length()-1);
					sumUser=sumUser-2*Integer.parseInt(string);
				}
			}else if(userPlayDeck[keepOn-1]=="x2"){
				string=userBoard[counterU-1].substring(0, userBoard[counterU-1].length()-1);
				sumUser=sumUser+ Integer.parseInt(string);
			}else{
				if (userPlayDeck[keepOn-1] != null){
				string=userPlayDeck[keepOn-1].substring(0, userPlayDeck[keepOn-1].length()-1);
				sumUser=sumUser+ Integer.parseInt(string);
				}else{
					System.out.println("Sorry, you already used this card.");
				}
			}
			userPlayDeck[keepOn-1]=null;
			}
			do{
				System.out.println("");
				System.out.print("Do you want to stand or keep on? please push 2 for stand or push 1 to keep on.");
				System.out.println("");
				keepOn1=sc.nextInt();
			}while(keepOn1!=1 && keepOn1!=2);
			}
			
			System.out.println("Computer Score:"+sumComputer);
			System.out.println("Your Score:"+sumUser);
	
			cardCounterC++;
			cardCounterU++;
			controler1=true;
			count=0;
			counter++;
			counterU++;
			
			if(counter==31){
				break;
			}
			
			if((keepOn1==1 || keepOn0==1)==false){
				break;
			}
		}while((sumComputer<20 && sumUser<20) && (cardCounterC!=9 && cardCounterU!=9));
		
		if(sumComputer==20){
			totalComputer++;
			for(int i=0;i<computerBoard.length;++i){
				if (computerBoard[i] != null){
					counterBoardC++;
					if(!("+/-".equals(computerBoard[i])) || !("x2".equals(computerBoard[i]))){
						string=computerBoard[i].substring(computerBoard[i].length()-2, computerBoard[i].length()-1);
					}else{
						break;
					}
					if(string.equals("B")){
						counterB++;
					}
				}
			}
			if(counterB==counterBoardC){
				totalComputer=3;
			}
		}
		if(sumUser==20){
			totalUser++;
			for(int i=0;i<userBoard.length;++i){
				if (userBoard[i] != null){
					counterBoardU++;
					if(!("+/-".equals(userBoard[i])) || !("x2".equals(userBoard[i]))){
							string=userBoard[i].substring(userBoard[i].length()-2, userBoard[i].length()-1);
					}else{
						break;
					}
					if(string.equals("B")){
						counterB++;
					}
				}
			}
			if(counterB==counterBoardU){
				totalUser=3;
			}
		}
		if(sumUser<20 && sumComputer<20){
			if(sumUser>sumComputer){
				totalUser++;
			}else if(sumUser<sumComputer){
				totalComputer++;
			}else{
				System.out.println("It is tied game.");
			}
		}
		
		if(sumUser>20 || sumComputer>20){
			if(sumUser>20){
				totalComputer++;
			}else{
				totalUser++;
			}
		}
		for(int i=0;i<9;++i){
			computerBoard[i]=null;
			userBoard[i]=null;
		}
		
		if(counter==31){
			break;
		}
		
		totalGame++;
		}while(totalUser!=3 && totalComputer!=3);
		
		if(totalUser>totalComputer){
			System.out.println("You are the winner!!!");
		}else if(totalComputer>totalUser){
			System.out.println("You are the looser!!!");
		}else{
			System.out.println("There is no winner:)");
		}
	
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
		String date= dateFormat.format(new Date());
		
		String[] gameHistory= new String[10];
		
		 
		try  {
            BufferedReader reader = new BufferedReader(new FileReader("BlueJackScores.txt"));
			int index = 0;
            String line;
            while ((line = reader.readLine()) != null && index < 10) {
                gameHistory[index] = line;
                index++;
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: ");
        }
		
		
            String updatedHistory = name+totalUser + " - " +"computer:"+ totalComputer + ", Date: " + date;
            for (int i = 0; i < 9; ++i) {
                gameHistory[i] = gameHistory[i + 1];
            }
            gameHistory[9] = updatedHistory;
        
 
		Formatter f = null;
        FileWriter fw = null;
		
        try {
            fw = new FileWriter("BlueJackScores.txt", true);
            f = new Formatter(fw);
            for (String history : gameHistory) {
                if (history != null) {
                    f.format("%s%n", history);
                }
            }
			
        } catch (Exception e) {
            System.err.println("Something went wrong.");
        } finally {
           
                if (f != null) {
                    f.close(); 
           
        }
    }
		
	}
		
	}

