package mycardproject;

public class Jeu {
	
	private Card array[];
	
	public Jeu(int maxCard) {
		
		this.array = new Card[maxCard];
		
	}
	
	public Card[] getArray() {
		return array;
	}
	
	
	public void piocher(Card card) {
		
		for(int i = 0; i < array.length; i++ ) {
			
			if(array[i] == null) {
				array[i] = card;
				i = array.length;
			}
		}
	}
	
	public void jouer() {
		
		System.out.println("Je joue une carte ...");
		
		for(int i = 0; i < array.length; i ++) {
			
			if(array[i] != null) {
				
				System.out.println(array[i]);
				
				array[i].toString();
				array[i] = null;
				i = array.length;
			}
		}
	}

}
