package com.dagnachew.assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private static List<Card> cards = new ArrayList<Card>();
	
	public Deck() {

		StringBuilder suitBuilder = new StringBuilder();
		StringBuilder nameBuilder = new StringBuilder();
		for(int i = 0; i < 4; i++) {
				suitBuilder.setLength(0);
				switch(i) {
				case 0:
					suitBuilder.append("Hearts");
					break;
				case 1:
					suitBuilder.append("Diamonds");
					break;
				case 2:
					suitBuilder.append("Spades");
					break;
				case 3:
					suitBuilder.append("Clubs");
					break;
				}
				for(int j = 0; j < 13; j++) {
					nameBuilder.setLength(0);
					nameBuilder.append(suitBuilder.toString());
					switch(j) {
					case 0:
						nameBuilder.insert(0,"Two of ");
						cards.add(new Card(j+2, nameBuilder.toString()));
						break;
					case 1:
						nameBuilder.insert(0,"Three of ");
						cards.add(new Card(j+2, nameBuilder.toString()));
						break;
					case 2:
						nameBuilder.insert(0,"Four of ");
						cards.add(new Card(j+2, nameBuilder.toString()));
						break;
					case 3:
						nameBuilder.insert(0,"Five of ");
						cards.add(new Card(j+2, nameBuilder.toString()));
						break;
					case 4:
						nameBuilder.insert(0,"Six of ");
						cards.add(new Card(j+2, nameBuilder.toString()));
						break;
					case 5:
						nameBuilder.insert(0,"Seven of ");
						cards.add(new Card(j+2, nameBuilder.toString()));
						break;
					case 6:
						nameBuilder.insert(0,"Eight of ");
						cards.add(new Card(j+2, nameBuilder.toString()));
						break;
					case 7:
						nameBuilder.insert(0,"Nine of ");
						cards.add(new Card(j+2, nameBuilder.toString()));
						break;
					case 8:
						nameBuilder.insert(0,"Ten of ");
						cards.add(new Card(j+2, nameBuilder.toString()));
						break;
					case 9:
						nameBuilder.insert(0,"Jack of ");
						cards.add(new Card(j+2, nameBuilder.toString()));
						break;
					case 10:
						nameBuilder.insert(0,"Queen of ");
						cards.add(new Card(j+2, nameBuilder.toString()));
						break;
					case 11:
						nameBuilder.insert(0,"King of ");
						cards.add(new Card(j+2, nameBuilder.toString()));
						break;
					case 12:
						nameBuilder.insert(0,"Ace of ");
						cards.add(new Card(j+2, nameBuilder.toString()));
						break;
					}
				}
			}	
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		Card drawnCard = cards.get(cards.size()-1);
		cards.remove(cards.size()-1);
		return drawnCard;
	}

}
