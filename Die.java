import java.util.Random;

public class Die{
	private int max= 6;
	private int min= 1;
	private int firstDice, secondDice = 1;
	private String nickName;

	//Pre:None
	//Post:Add a random integer to the dices
	public Die(){
		Random rand = new Random();
		this.firstDice = rand.nextInt(max-min+1)+min;
		this.secondDice = rand.nextInt(max-min+1)+min;
	}

	//Pre: having a random number as a feed
	//Post: fetch the name of the common dice calls
	public String DieCall(){
		this.nickName ="";
		switch(this.firstDice){
		case 1: switch(this.secondDice){
					case 1: nickName = "SNAKE EYES";
							break;
					case 2: nickName = "AUSTRALIAN YO";
							break;
					case 3: nickName = "LITTLE JOE FROM KOKOMO";
							break;
					case 4: nickName = "NO FIELD FIVE";
							break;
					case 5: nickName = "EASY SIX";
							break;
					case 6: nickName = "SIX ONE YOU'RE DONE";
							break;
				}
				break;
		case 2: switch(this.secondDice){
					case 1: nickName = "ACE CAUGHT A DEUCE";
							break;
					case 2: nickName = "BALLERINA";
						   break;
					case 3: nickName = "THE FEVER";
							break;
					case 4: nickName = "JIMMIE HICKS";
							break;
					case 5: nickName = "BENNY BLUE";
							break;
					case 6: nickName = "EASY EIGHT";
							break;
				}
				break;
		case 3: switch(this.secondDice){
					case 1: nickName = "EASY FOUR";
							break;
					case 2: nickName = "OJ";
							break;
					case 3: nickName = "BOOKLYN FOREST";
							break;
					case 4: nickName = "BIG RED";
							break;
					case 5: nickName = "EIGHTER FROM DECATUR";
							break;
					case 6: nickName = "NINA FROM PASADENA";
							break;
				}
				break;
		case 4: switch(this.secondDice){
					case 1: nickName = "LITTLE PHOEBE";
							break;
					case 2: nickName = "EASY SIX";
							break;
					case 3: nickName = "SKINNY McKINNEY";
							break;
					case 4: nickName = "SQUARE PAIR";
							break;
					case 5: nickName = "RAILROAD NINE";
							break;
					case 6: nickName = "BIG ONE ON THE END";
							break;
				}
				break;
		case 5: switch(this.secondDice){
					case 1: nickName = "SIXIE FROM DIXIE";
							break;
					case 2: nickName = "SKINNY DUGAN";
							break;
					case 3: nickName = "EASY EIGHT";
							break;
					case 4: nickName = "JESSE JAMES";
							break;
					case 5: nickName = "PUPPY PAWS";
							break;
					case 6: nickName = "YO";
							break;
				}
				break;
		case 6: switch(this.secondDice){
					case 1: nickName = "THE DEVIL";
							break;
					case 2: nickName = "EASY EIGHT";
							break;
					case 3: nickName = "LOU BROWN";
							break;
					case 4: nickName = "TENNESSEE";
							break;
					case 5: nickName = "SIX FIVE NO JIVE";
							break;
					case 6: nickName = "BOX CARS";
							break;
				}
				break;
		}
		return nickName;
	}

	//pre:None
	//Post:give the value of the first dice thrown
	public int getFirstDice() {
		return this.firstDice;
	}

	//Pre:to throw again the dice in order to generate a random number
	//Post:New random number for the first dice
	public void setFirstDice(int firstDice) {
		if(firstDice>6 || firstDice<1){
			this.firstDice = 1;
		}else{
			this.firstDice = firstDice;
		}
	}

	//Pre:None
	//Post:give the value of the second dice thrown
	public int getSecondDice() {
		return this.secondDice;
	}

	//Pre:to throw again the dice in order to generate a random number
	//Post:New random number for the second dice
	public void setSecondDice(int secondDice) {
		if(secondDice>6 || secondDice<1){
			this.secondDice = 1;
		}else{
			this.secondDice = secondDice;
		}
	}

	//Pre:None
	//Post:Return nickName
	public String getNickName() {
		return this.nickName;
	}

}
