import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.io.BufferedReader;

public class Test{
	public static void show(String[] computerPlayDeck,String[] computerBoard,String[] userBoard,String[] userPlayDeck){
			System.out.println(" ---------------------------------------------------------");
			String str1="                                          ";
			String str2="";
			int x=0;
			for(int i=0;i<4;++i){
				if(computerPlayDeck[i]!=null){
					str2="x ";
					str1=str2+str1.substring(0,str1.length()-2);
				}
			}
			System.out.print("|Computer Hand :");
		
			System.out.print(str1+"|");
			
			System.out.println("");
			System.out.print("|Computer Board:");
			int count=0;
			str1="                                          ";
			str2="";
			while(computerBoard[count] != null){
				str2 +=computerBoard[count]+" ";
				str1=str1.substring(computerBoard[count].length()+1);
				count++;
			}
			count=0;
			System.out.println(str2+str1+"|");
			System.out.print("|Player Board  :");
			str1="                                          ";
			str2="";
			while(userBoard[count]!=null){
				str2 +=userBoard[count]+" ";
				str1=str1.substring(userBoard[count].length()+1);
				count++;
			}
			count=0;
			System.out.println(str2+str1+"|");
			System.out.print("|Player Hand   :");
			str1="                                          ";
			str2="";
			while(count<4){
				str2 +=userPlayDeck[count]+" ";
				str1=str1.substring(userPlayDeck[count].length()+1);
				count++;
			}
			System.out.println(str2+str1+"|");
			System.out.println(" ---------------------------------------------------------");
	}
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String cont="";
		String str1="                       ";
		String str2="";
		
		System.out.println("Hello,it is BlueJack Game!");
		
		System.out.println("What is your name?");
		String name=sc.nextLine();
		
		System.out.println("This game includes 3 decks and the game deck contains 4 sets,computer's deck and user's deck");
		
		do{
			System.out.println("");
			System.out.print("Here is the deck!");
			System.out.println("");
			cont=sc.nextLine();
		}while(!cont.equals("")); 
		
		
		ShuffleCards shuffleCards = new ShuffleCards();
		String[] shuffledDeck1=shuffleCards.shuffleDeck();
		
		ExtraCard extraCard= new ExtraCard(shuffledDeck1);
		String[] userDeck= extraCard.extraCardUser();
		String[] computerDeck=extraCard.extraCardComputer();
		
		System.out.println("First cards go to computer's deck and then you can take extra cards.");
		System.out.println("");
		
		System.out.println(" --------------------------------------");
		System.out.println("|Computer Hand :x x x x x x x x x x    |");
		System.out.println("|Computer Board:Empty                  |");
		System.out.println("|Player Board  :Empty                  |");
		System.out.print("|Player Hand   :");
		
		for(int i=0;i<5;++i){
			str2 +=userDeck[i]+" ";
			str1=str1.substring(userDeck[i].length()+1);
		}
		
		System.out.println(str2+str1+"|");
		
		System.out.println(" --------------------------------------");
		System.out.println(" ");
		
		System.out.println("Your turn to take cards!");
		
		do{
			System.out.println("");
			System.out.print("Please, push the enter to take extra cards!");
			System.out.println("");
			cont=sc.nextLine();
		}while(!cont.equals("")); 
		
		System.out.println(" --------------------------------------------------------------");
		
		System.out.println("|Computer Hand :x x x x x x x x x x                            |");
		System.out.println("|Computer Board:Empty                                          |");
		System.out.println("|Player Board  :Empty                                          |");
		System.out.print("|Player Hand   :");
		
		str1="                                               ";
		str2="";
		
		for(int i=0;i<10;++i){
			str2 +=userDeck[i]+" ";
			str1=str1.substring(userDeck[i].length()+1);
		}
		
		System.out.println(str2+str1+"|");
		
		System.out.println(" --------------------------------------------------------------");
		
		System.out.println("");
			
		System.out.println("It is time to create gamer's decks to play.");
		System.out.println("We are selected 4 cards from your decks and you will play with these cards :)");
		
		do{
			System.out.println("");
			System.out.print("Please, push the enter to see game deck:");
			System.out.println("");
			cont=sc.nextLine();
		}while(!cont.equals("")); 
		
		System.out.println("");
		
		CreatePlayerDecks createPlayerDecks= new CreatePlayerDecks(computerDeck,userDeck);
		String[] computerPlayDeck= createPlayerDecks.createComputerPlayDeck();
		String[] userPlayDeck= createPlayerDecks.createUserPlayDeck();
		
		System.out.println(" --------------------------------------");
		
		System.out.println("|Computer Hand :x x x x                |");
		System.out.println("|Computer Board:Empty                  |");
		System.out.println("|Player Board  :Empty                  |");
		System.out.print("|Player Hand   :");
		
		str1="                       ";
		str2="";
		
		for(int i=0;i<userPlayDeck.length;++i){
			str2 +=userPlayDeck[i]+" ";
			str1=str1.substring(userPlayDeck[i].length()+1);
		}
		
		System.out.println(str2+str1+"|");
		
		System.out.println(" --------------------------------------");
		System.out.println("");
		
		System.out.println("The game is begining!!!");
		System.out.println("");
		
		System.out.println("To win the game, you need to make the total of the cards in your hand 3 times to 20. If you make 20 by using only the blue card once, you win the game directly.");
		System.out.println("The game includes 2 special cards: +/- and x2.");
		System.out.println("+/-: changes the sign of the last card on the board.");
		System.out.println("x2: doubles the last card on the board.");
		System.out.println("");
		
		do{
			System.out.println("");
			System.out.print("Please push the enter to start. Since the computer deals the hands, You start the game.");
			System.out.println("");
			cont=sc.nextLine();
		}while(!cont.equals("")); 
		
		System.out.println("");
		
		String[] computerBoard=new String[9];
	    String[] userBoard=new String[9];
		
		String[] shuffledDeck=new String[30];
		
		for(int i=0;i<30;++i){
			shuffledDeck[i]=shuffledDeck1[i+5];
		}
		
		/*for (int i = 0; i < 4; ++i) {
            System.out.println(computerPlayDeck[i]);
        }
		*/
		System.out.println(" ------------------------------- ");
		
		int totalComputer=0;
		int totalUser=0;
		int counter=0;
		int totalGame=1;
		int[] computerControl=new int[4];
		do{
			int counterB=0;
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
			int loopUsedCard=0;
			int controlSum=0;
			int controlI=0;
			int useThisCard=1000;
			boolean useCard=false;
			boolean swapped;
			
			str1="           ";
			System.out.println("|                               |");
			System.out.print("|The set number is: ");
		
			str1=totalGame+" "+str1.substring(0,str1.length()-1);
			
			System.out.println(str1+"|");
			System.out.println("|                               |");
			System.out.print("|Your score is: ");
			
			str1="               ";
			
			str1= totalUser+" "+str1.substring(0,str1.length()-1);
			
			System.out.println(str1+"|");
			System.out.print("|Computer's score is: ");
			
			str1="         ";
			
			str1= totalComputer+" "+str1.substring(0,str1.length()-1);
			
			System.out.println(str1+"|");
			System.out.println("|                               |");
			System.out.println(" ------------------------------- ");
			
			
		do{
			if(keepOn1==1){
			userBoard[counterU]=shuffledDeck[counter];
			counter++;
			counterU++;
			if(!"+/-".equals(userBoard[counterU-1]) || !"x2".equals(userBoard[counterU-1])){
				if (userBoard[counterU-1] != null){
					string1=userBoard[counterU-1].substring(1, userBoard[counterU-1].length()-1);
					sumUser+=Integer.parseInt(string1);
				}
			}
			
			show(computerPlayDeck,computerBoard,userBoard,userPlayDeck);
			
			do{
				System.out.println("");
				System.out.print("Do you want to use any card from your hand? please push 1 to use any card from your hand or push 2 to keep on.");
				System.out.println("");
				keepOn=sc.nextInt();
			}while(keepOn!=1 && keepOn!=2);
			
			if(keepOn==1){
				do{
				do{
				System.out.println("");
				System.out.print("Please, enter the number of the card that you want to use.1-2-3-4");
				System.out.println("");
				keepOn=sc.nextInt();
				}while((keepOn!=1 && keepOn!=2)&&(keepOn!=3 && keepOn!=4));
			
			if(userPlayDeck[keepOn-1]!="used"){
				userBoard[counterU]=userPlayDeck[keepOn-1];
				counterU++;
			}
			
			if(userPlayDeck[keepOn-1].equals("+/-")){
				loopUsedCard=0;
				if(userBoard[counterU-1].substring(0,1).equals("-")){
					string=userBoard[counterU-2].substring(0, userBoard[counterU-2].length()-1);
					System.out.println(string);
					sumUser=sumUser+2*Integer.parseInt(string);
				}
				if(userBoard[counterU-2].substring(0,1).equals("+")){
					string=userBoard[counterU-2].substring(0, userBoard[counterU-2].length()-1);
					System.out.println(string);
					sumUser=sumUser-2*Integer.parseInt(string);
				}
			}else if(userPlayDeck[keepOn-1].equals("x2")){
				loopUsedCard=0;
				string=userBoard[counterU-2].substring(0, userBoard[counterU-2].length()-1);
				System.out.println("string");
				sumUser=sumUser+ Integer.parseInt(string);
			}else{
				if (userPlayDeck[keepOn-1] !="used"){
					loopUsedCard=0;
					string=userPlayDeck[keepOn-1].substring(0, userPlayDeck[keepOn-1].length()-1);
					sumUser=sumUser+ Integer.parseInt(string);
				}else{
					System.out.println("Sorry, you already used this card.");
					System.out.println("Do you stil want to use any card from your hand?(push 1 to use or push 2 to skip.)");
					loopUsedCard=sc.nextInt();
				}
			}
			}while(loopUsedCard==1);
			
			userPlayDeck[keepOn-1]="used";
			
			show(computerPlayDeck,computerBoard,userBoard,userPlayDeck);
			
			System.out.println("");
			}
			
			do{
				System.out.println("");
				System.out.print("Do you want to stand or keep on? please push 1 to keep on or push 2 for stand .");
				System.out.println("");
				System.out.println("");
				keepOn1=sc.nextInt();
			}while(keepOn1!=1 && keepOn1!=2);
			
			if(counter==30){
				System.out.println("The cards are finished.Soo, the game is over.");
				break;
			}
		
			}
			
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
		
			show(computerPlayDeck,computerBoard,userBoard,userPlayDeck);
			
			for(int i=0;i<computerPlayDeck.length;++i){
				if(computerPlayDeck[i] != null){
					if(computerPlayDeck[i].equals("+/-")){
						if(computerBoard[counterC-1].substring(0,1).equals("-")){
							string=computerBoard[counterC-1].substring(0, computerBoard[counterC-1].length()-1);
							//System.out.println(string);
							controlSum=sumComputer+2*Integer.parseInt(string);
						}
						if(computerBoard[counterC-1].substring(0,1).equals("+")){
							string=computerBoard[counterC-1].substring(0, computerBoard[counterC-1].length()-1);
							//System.out.println(string);
							controlSum=sumComputer-2*Integer.parseInt(string);
						}
					}
					else if(computerPlayDeck[i].equals("x2")){
						string=computerBoard[counterC-1].substring(0, computerBoard[counterC-1].length()-1);
						controlSum=sumUser+ Integer.parseInt(string);
					}
					else{
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
			
			for(int i=0;i<computerPlayDeck.length;++i){
				System.out.println(computerPlayDeck[i]);
			}
			*/
			for(int i=0;i<computerControl.length;++i){
				//System.out.println("computer concider this.");
				if(computerControl[i]==0){
					string=computerPlayDeck[i].substring(computerPlayDeck[i].length()-1);
					if(string=="B"){
						keepOn0=0;
						System.out.println("");
						System.out.println("Computer decided to use a card from its hand.");
						System.out.println("");
						computerBoard[counterC]=computerPlayDeck[i];
						counterC++;
						computerPlayDeck[i]=null;
						sumComputer=20-computerControl[i];
						useCard=true;
						
						show(computerPlayDeck,computerBoard,userBoard,userPlayDeck);
						System.out.println("");
						
						}break;
					}
				}
				
				if(!useCard){
					for(int i=0;i<computerControl.length;++i){
						if(computerControl[i]==0){
							keepOn0=0;
							computerBoard[counterC]=computerPlayDeck[i];
							counterC++;
							computerPlayDeck[i]=null;
							sumComputer=20-computerControl[i];
							useCard=true;
							System.out.println("");
							System.out.println("Computer decided to use a card from its hand.");
							System.out.println("");
							
							show(computerPlayDeck,computerBoard,userBoard,userPlayDeck);
							System.out.println("");
							
							}break;
					}
				}
				if(!useCard){
					for (int i = 0; i < computerControl.length; i++) {
						if (computerControl[i]>0 && computerControl[i]<3) {
							if(useThisCard>computerControl[i]){
								useThisCard=computerControl[i];
								controlI=i;
							}
						}
					}
					
					
					if(useThisCard!=1000){
						//System.out.println("computer concider this.");
						keepOn0=0;
						System.out.println("");
						System.out.println("Computer decided to use a card from its hand.");
						System.out.println("");
						x=0;
						computerBoard[counterC]=computerPlayDeck[controlI];
						counterC++;
						computerPlayDeck[controlI]=null;
						sumComputer=20-useThisCard;
						useCard=true;
						
						show(computerPlayDeck,computerBoard,userBoard,userPlayDeck);
						System.out.println("");
						//System.out.println(useThisCard);
					}
				}
				
				if(keepOn1!=1){
					if(sumComputer>sumUser){
						keepOn0=0;
						System.out.println("Computer decided to stand.");
						System.out.println("");
					}
					else{
						if(!useCard){
							for(int i=0;i<computerControl.length;++i){
								if(20-computerControl[i]>sumUser && computerControl[i]>0){
									keepOn0=0;
									System.out.println("");
									System.out.println("Computer decided to use a card from its hand.");
									System.out.println("");
									x=0;
									computerBoard[counterC]=computerPlayDeck[i];
									counterC++;
									computerPlayDeck[i]=null;
									sumComputer=20-computerControl[i];
									useCard=true;
									
									show(computerPlayDeck,computerBoard,userBoard,userPlayDeck);
									System.out.println("");
									
								}break;
							}
						}
					}
				}
				
				if(sumComputer>16 && sumComputer<21){
					keepOn0=0;
					System.out.println("Computer decided to stand.");
					System.out.println("");
				}
				
				for(int i=0;i<4;++i){
					computerControl[i]=20;
				}
			
				useCard=false;
			
				}
				
				System.out.println(" ------------------------------- ");
				
				System.out.print("|Computer Score:");
				str1="               ";
				String sumComputerStr = String.valueOf(sumComputer);
				if( sumComputerStr.length()==1){
					str1=sumComputerStr+" "+str1.substring(0,str1.length()-1);
				}else if(sumComputerStr.length()==2){
					str1=sumComputerStr+" "+str1.substring(0,str1.length()-2);
				}else if(sumComputerStr.length()==3){
					str1=sumComputerStr+" "+str1.substring(0,str1.length()-3);
				}
				System.out.println(str1+"|");
				System.out.print("|Your Score:");
				str1="                   ";
				String sumUserStr = String.valueOf(sumUser);
				if(sumUserStr.length()==1){
					str1=sumUserStr+" "+str1.substring(0,str1.length()-1);
				}else if(sumUserStr.length()==2){
					str1=sumUserStr+" "+str1.substring(0,str1.length()-2);
				}else if(sumUserStr.length()==3){
					str1=sumUserStr+" "+str1.substring(0,str1.length()-3);
				}
				System.out.println(str1+"|");
				System.out.println(" ------------------------------- ");
				
				//System.out.println(counter);
		
				controler1=true;
				count=0;
				
				useThisCard=1000;
				
				if(counter==30){
					System.out.println("The cards are finished.Soo, the game is over.");
					break;
				}
				
				if((keepOn1==1 || keepOn0==1)==false){
					break;
				}
				
				if(keepOn0!=1){
					if(counterC>=9 ){
						break;
					}
				}
				
				if(keepOn0!=1){
					if(counterU>=9){
						break;
					}
				}
				
		}while((sumComputer<20 && sumUser<20)&& (counterC != 9 && counterU != 9));
		
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
		
		if(sumUser<=20 && sumComputer<=20){
			if(sumUser>sumComputer){
				totalUser++;
			}else if(sumUser<sumComputer){
				totalComputer++;
			}else if(sumUser==20 && sumComputer==20){
				System.out.println("It is tied game. No one win.");
				totalUser--;
				totalComputer--;
			}else{
				System.out.println("It is tied game. No one win.");
			}
		}
		
		if(sumUser>20 && sumComputer<20){
			totalComputer++;
			System.out.println("You are busted.");
		}
		
		if(sumComputer>20 && sumUser<20){
			totalUser++;
			System.out.println("Computer is busted.");
		}
		
		for(int i=0;i<9;++i){
			computerBoard[i]=null;
			userBoard[i]=null;
		}
		
		if(counter==30){
			System.out.println("The cards are finished.Soo, the game is over.");
			break;
		}
		
		totalGame++;
		}while(totalUser!=3 && totalComputer!=3);
		
		System.out.println("");
		System.out.println("The game is over!!");
		System.out.println("");
		System.out.println("The final Scores: "+name+":"+totalUser+"- computer:"+totalComputer);
		System.out.println("");
		
		if(totalUser>totalComputer){
			System.out.println("You are the winner!!!");
		}else if(totalComputer>totalUser){
			System.out.println("You are the looser!!!");
		}else{
			System.out.println("The game tied:)");
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

