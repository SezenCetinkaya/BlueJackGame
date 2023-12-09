import java.util.Scanner;

public class Enter{

private String text;

public Enter(String text){
	this.text=text;
}

public String getText(){
	return text;
}

public void enter(){
	Scanner sc=new Scanner(System.in);
	String cont;
	
	do{
		System.out.println("");
		System.out.print(text);
		System.out.println("");
		cont=sc.nextLine();
	}while(!cont.equals("")); 
}

}