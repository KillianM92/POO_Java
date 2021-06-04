package mycardproject;

public abstract class Card {
	
	protected TypeCard type;
	private int valeur;
	
	public Card() {
		// TODO Auto-generated constructor stub
	}
	
	public TypeCard getType() {
		return type;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

}
