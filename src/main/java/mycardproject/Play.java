package mycardproject;

public class Play {

	public static void main(String[] args) {
		Jeu j = new Jeu(3);
		
		Card r1 = new Ressources(TypeRessources.BOIS);
		Card b1 = new Batiments("Bat7", 50);
		Card e1 = new Equipements("Arc de feu", 100, "Cet arc est très utile pour immoler vos ennemis avec le feu !");
		
		Card r2 = new Ressources(TypeRessources.PIERRE);
		Card b2 = new Batiments("Cristallerie", 70);
		Card e2 = new Equipements("Grappin d'escalade", 150, "Ce grappin est très pratique pour s'accrocher aux parois de falaises.");
		
		j.piocher(r1);
		j.jouer();
		
		j.piocher(b1);
		j.jouer();
		
		j.piocher(e1);
		j.jouer();
		
		j.piocher(r2);
		j.jouer();
		
		j.piocher(b2);
		j.jouer();
		
		j.piocher(e2);
		j.jouer();
	}

}