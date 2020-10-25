package com.dagnachew.assignment6;

public class App {

	public static void main(String[] args) {
		
		Deck cardsDeck = new Deck();
		Player playerOne = new Player("mrBlue");
		Player playerTwo = new Player("mrRed");
		cardsDeck.shuffle();
		
		for(int i = 0; i < 52; i++) {
			
			if (i%2 ==0) {
				playerOne.draw(cardsDeck);
			} else {
				playerTwo.draw(cardsDeck);
			}
		}
		
		for(int i = 0; i < 26; i++) {
			try {
				if(playerOne.flip().getValue() > playerTwo.flip().getValue()) {
					playerOne.incrementScore();
				}
			} catch (Exception e) {
				System.out.println("PlayerOne out of card." + e.toString());
			}
			try {
				if(playerOne.flip().getValue() < playerTwo.flip().getValue()) {
					playerTwo.incrementScore();
				}
			} catch (Exception e) {
				System.out.println("PlayerTwo out of card." + e.toString());
			}
		}
		
		if(playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("Player 1: " + playerOne.getName() + "\twon the Game." );
		} else if(playerOne.getScore() < playerTwo.getScore()) {
			System.out.println("Player 2: " + playerTwo.getName() + "\twon the Game." );
		} else {
			System.out.println("Draw");
		}		
	}
}
