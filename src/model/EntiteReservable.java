package model;

public abstract class EntiteReservable <T extends Formulaire>{
	protected CalendrierAnnuel calendrier = new CalendrierAnnuel();
	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean estLibre(T formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public abstract boolean compatible();
	
	public abstract Reservation reserver();
}
