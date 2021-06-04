package mycardproject;

public class Batiments extends Card{

	private String nom;
	private int resist;
	
	public Batiments(String nom, int resist) {
		super.setValeur(50);
		this.nom = nom;
		this.resist = resist;
		
		System.out.println("Carte B�timent");
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(TypeCard.BATIMENTS + " - co�t : " + super.getValeur() + " - Nom : " + nom + " - Points de r�sistance : " + resist);
		return sb.toString();
	}
}