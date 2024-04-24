package model;

public class Centrale <E, F extends Formulaire> {
	private EntiteReservable<F>[] Entites;
	private int nbEntites;
	
	public Centrale(EntiteReservable<F>[] Entites) {
		this.Entites = Entites;
		nbEntites = 0;
	}
	
	public int ajouterEntite(EntiteReservable<F> Entite) {
		Entites[nbEntites++] = Entite;
		return this.nbEntites;
	}
	
	public int[] donnerPossibilites(F formulaire) {
		int res[] = new int[nbEntites];
		int nbRes = 0;
		for(int i = 0; i<nbEntites;i++) {
			if(Entites[i].estLibre(formulaire)) {
				res[nbRes] = Entites[i].getNumero();
			}
		}
		return res;
	}
	
	public Reservation reserver(int numEntite ,F formulaire) {
		formulaire.setIdentificationEntite(numEntite);
		return Entites[numEntite].reserver();
	}
}