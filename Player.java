package com.dagnachew.assignment6;

import java.util.ArrayList;
import java.util.List;

public class Player{

	private static List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
	
	public void describe() {
		System.out.println("Name: " + name + "\nScore: " + score);
		System.out.println("Cards in hand:");
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() throws Exception {
		Card flippedCard = hand.get(hand.size()-1);
		hand.remove(hand.size()-1);
		return flippedCard;
	}
	
	public void draw(Deck cardDeck) {
		Card drawnCard = cardDeck.draw();
		hand.add(drawnCard);
		
	}
	
	public void incrementScore() {
		score++;
	}
	
}
