package mycardproject;

public class Ressources extends Card{
	
	private TypeRessources typer;
	
	public Ressources(TypeRessources typer) {
		super.setValeur(10);
		this.typer = typer;
		
		System.out.println("Carte Ressource");
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(TypeCard.RESSOURCES + " - co�t : " + super.getValeur() + " - Cat�gorie : " + typer);
		return sb.toString();
	}
}
