package SahilAndAllisonsExcellentAdventure;

import java.util.ArrayList;

import cards.Card;

public class AdventurePlayer {

	private int health;
	private int atp;
	private ArrayList<Card>Cards; 
	private Card selectedCard;
	
	
	public Card getSelectedCard(){
		
		return selectedCard;
	}
	
	public void changeHealth(int change){
		
		health+=change;
		
	}
	
	public void drawCard(Card c){
		
		Cards.add(c);
	}
	
	public void discardCard(Card c){
		
		Cards.remove(c);
	}
	
	
}
