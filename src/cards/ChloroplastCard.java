package cards;

import data.Organism;

public class ChloroplastCard extends BuilderCard{

	
	public ChloroplastCard(){
		
		super(0,4,1,5,2);
		
	}

	
	public void modifyOrganism(Organism o, int x, int y) {
		
	}


	public int getCardType() {
		return Card.PETRI_DISH;
	}


	public void killCard(Organism o, int x, int y) {
		
	}
	
	
}