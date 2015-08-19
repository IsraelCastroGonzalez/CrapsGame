import java.io.Console;
import java.util.Scanner;

/*
 * Professor: Dr. Bill Cupp.
 * Authors: Israel Castro Gonzalez
 * 			Edgar Alfredo Brice�o Gonzalez
 *
 * 			Laboratory Practice: 1.
 */

 //Pre: Die.java class
 //Post: Dice1,dice2,firstThrow and scanner
public class Craps {
	public Die die;
	private int dice1, dice2;
	private int sumOfDice=0;
	private int firstThrow;
	private int throwNum = 0;
	private Scanner scanIn;

	private gameStatus game;

	//Pre:None
	//Post:Enum data types WON, LOST and CONTINUE
	public enum gameStatus{
		WON, LOST,CONTINUE
	}

	//Pre: Class constructor
	//Post: ScanIn opened
	public Craps(){
		System.out.println("Feeling lucky punk?.. here, throw em'... ");
		System.out.println("...");
		System.out.println("-THROW DICE? (YES/NO) ");
		this.scanIn = new Scanner(System.in);
		String input = this.scanIn.nextLine();
		if(input.equalsIgnoreCase("YES")||input.equalsIgnoreCase("Y")){
			System.out.println("Let's see what you got...");
			playCraps();
		}
		else if(input.equalsIgnoreCase("NO")||input.equalsIgnoreCase("N")){
			System.out.println("Haha!.. get outta' here!");
		}
		else{
			System.out.println("I did not get the joke... Throw the dice already!..");
			playCraps();
		}
	}
	//Pre: Method Craps
	//Post: Recursive data flow
	public void playCraps(){
		die = new Die();
		this.dice1=this.die.getFirstDice();
		this.dice2=this.die.getSecondDice();
		this.sumOfDice = this.dice1 + this.dice2;
		System.out.println("("+this.dice1+","+this.dice2+") - "+this.die.DieCall());

		checkResult();
		throwNum=1;

		switch(this.game){
			case WON: System.out.println("THE ODDS ARE IN YO' FAVOR MAN!.. CONGRATS, YOU WIN!");
					  this.scanIn.close();
					  break;
			case LOST: System.out.println("AWWH GOD!..BETTER LUCK NEXT TIME... YOU LOST!");
				      this.scanIn.close();
			  		  break;
			case CONTINUE: System.out.println("HERE... MAKE YOUR POINT...");
						   System.out.println("-THROW DICE? (YES/NO) ");
						   this.scanIn = new Scanner(System.in);
						   String input = scanIn.nextLine();
						   if(input.equalsIgnoreCase("YES")||input.equalsIgnoreCase("Y")){
								System.out.println("Let's see what you got...");
								playCraps();
							}
							else if(input.equalsIgnoreCase("NO")||input.equalsIgnoreCase("N")){
								System.out.println("Haha!.. get outta' here!");
							}
							else{
								System.out.println("I did not get the joke... Throw the dice already!..");
								playCraps();
							}
			  		  break;
		}

	}
	//Pre: PlayCraps Method
	//Post: GameStatus WON, LOST or CONTINUE
	public void checkResult(){
		if(throwNum == 0){
			this.firstThrow = this.sumOfDice;
		}

		if((this.sumOfDice == 7 || this.sumOfDice==11) && throwNum==0){
			this.game = gameStatus.WON;
		}
		else if(this.sumOfDice ==2 || this.sumOfDice== 3 ||this.sumOfDice==12){
			this.game = gameStatus.LOST;
		}
		else if((this.game == gameStatus.CONTINUE && this.sumOfDice == 7)){
			this.game = gameStatus.LOST;
		}
		else if((this.sumOfDice== this.firstThrow) && throwNum!=0){
			this.game = gameStatus.WON;
		}
		else{
			this.game = gameStatus.CONTINUE;
		}
	}

	//Pre: None
	//Post: None
	public static void main(String[] args) {
		Craps craps = new Craps();
	}

}
