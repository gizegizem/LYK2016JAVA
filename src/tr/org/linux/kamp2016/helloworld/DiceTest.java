package tr.org.linux.kamp2016.helloworld;

public class DiceTest {

	
	public static void main(StringExample[] args) {
		Dice player1 =new Dice();
		Dice player2=new Dice();
		player1.roll();
		player2.roll();
		
		if(player1.getFaceValue() >player2.getFaceValue() ){
			System.out.println("First Player has " + player1.getFaceValue() +"\n" 
					+"Second Player has " + player2.getFaceValue() + "\n"
					+ "First Player wins with "+ player1.getFaceValue());
		}
		else if(player1.getFaceValue() <player2.getFaceValue() ){
			System.out.println("First Player has " + player1.getFaceValue() +"\n" 
					+"Second Player has " + player2.getFaceValue() + "\n"
					+ "Second Player wins with "+ player2.getFaceValue());
		}
		else{
			System.out.println("First Player has " + player1.getFaceValue() +"\n" 
					+"Second Player has " + player2.getFaceValue() + "\n"
					+ "Tie!Both Player has "+ player1.getFaceValue());
		}
	}

}
