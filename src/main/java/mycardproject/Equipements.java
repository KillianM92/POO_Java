package mycardproject;

public class Equipements extends Card{
	
	private String nom;
	private int action;
	private String explication;

	public Equipements(String nom, int action, String explication) {
		super.setValeur(30);
		this.nom = nom;
		this.action = action;
		this.explication = explication;
		
		System.out.println("Carte Equipement");
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(TypeCard.EQUIPEMENTS + " - coût : " + super.getValeur() + " - Nom : " + nom + " - Points d'action : " + action + " - Description : " + explication);
		return sb.toString();
	}
}
