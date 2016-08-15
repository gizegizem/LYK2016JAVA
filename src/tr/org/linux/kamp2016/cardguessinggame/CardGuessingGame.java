package tr.org.linux.kamp2016.cardguessinggame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import tr.org.linux.kamp2016.random.RandomTest;

//
//In this question, your task is implementing a card guessing game. There are four card type
//such as “spade”, “heart”, “diamond” and “club”. Each card can have value 1 to 13. The
//program chooses a card from deck and asks player card type and value. The program informs
//player about whether his/her guess is correct or wrong. Program runs until player guess is
//correct.
public class CardGuessingGame {
	public static void main(String args[]) {
		// your code starts here
		// generates a card deck and picks a random card from the deck.
		
		System.out.println("Welcome to the card guessing game!\n");
		ArrayList<Card> ereyList = generateCardDeck();
		Card randomCard = ereyList.get(RandomTest.randomIntegerRandom(0, 51));
		System.out.println(randomCard.getCardType()+randomCard.getValue());
		
		Scanner input = new Scanner(System.in);
		

		// Takes cardType and value inputs from the user and creates a card from
		// inputs then checks if user has guessed the card correct or wrong.
		// Program asks new inputs from the user until the user guesses correct.
		
		while (true) {
			// ...
			System.out.println("Guess Card type: ");
			String strr = "";
			strr = input.next();
			System.out.println("Guess Value: ");
			int value  = input.nextInt();
			Card guessCard = new Card(strr, value);
			if (guessCard.equals(randomCard)) {
				System.out.println("Tebrikler!");
				break;
			} else {
				System.out.println("Tekrar deneyiniz...");

			}

		}
		// Your code ends here

	}

	/*
	 * Generates card deck which is an arrayList that holds all cards with all
	 * types and values. there must be 52 cards in deck with types "spade",
	 * "club", "diamond", "heart" and values between 1-13
	 */
	public static ArrayList<Card> generateCardDeck() {
		ArrayList<Card> ereyList = new ArrayList<Card>();
		String[] types = new String[]{"spade","club","diamond","heart"};
		for(String str: types){
			for(int i=1;i<=13;i++){
				Card kart = new Card(str,i);
				ereyList.add(kart);
			}
		}
		return ereyList;

	}

}