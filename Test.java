import java.util.Scanner;

public class Test{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hello,it is BlueJack Game!");
		
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
		
		//Game game=new Game(computerPlayDeck,userPlayDeck,shuffledDeck);
		
		//game.game();
		
		String[] computerBoard=new String[9];
	    String[] userBoard=new String[9];
		
		String[] shuffledDeck=new String[30];
		
		for(int i=0;i<30;++i){
			shuffledDeck[i]=shuffledDeck1[i+5];
		}
		
		for (int i = 0; i < 40; ++i) {
            System.out.println(shuffledDeck1[i]);
        }
		int counter=0;
		int counter1=0;
		int sumComputer=0;
		int sumUser=0;
		
		boolean controler1=true;
		int x;
		String string="";
		String string1="";
		int count;
		do{
			computerBoard[counter1]=shuffledDeck[counter];
			if(!("+/-".equals(computerBoard[counter1])) || !("x2".equals(computerBoard[counter1]))){
				if (computerBoard[counter1] != null){
				string=computerBoard[counter1].substring(1, computerBoard[counter1].length()-1);
				sumComputer=sumComputer+ Integer.parseInt(string);
				}
			}
			counter++;
			x=computerPlayDeck.length;
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
			
			userBoard[counter1]=shuffledDeck[counter];
			
			if(!"+/-".equals(userBoard[counter1]) || !"x2".equals(userBoard[counter1])){
				if (userBoard[counter1] != null){
				string1=userBoard[counter1].substring(1, userBoard[counter1].length()-1);
				sumUser+=Integer.parseInt(string1);
				}
			}
			counter++;
			counter1++;
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
			System.out.println("1:"+sumComputer);
			System.out.println("1:"+sumUser);
			
		}while(sumComputer<20 && sumUser<20);
    }
		
	}
