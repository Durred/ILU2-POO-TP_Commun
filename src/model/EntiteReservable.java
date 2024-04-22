package model;

public class EntiteReservable <T extends Formulaire>{
	private CalendrierAnnuel calendrier;
	private int numero;
	private T formulaire;
	
	public EntiteReservable(int numero, T formulaire) {
		this.numero = numero;
		this.calendrier = new CalendrierAnnuel();
		this.formulaire = formulaire;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Boolean estLibre() {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public Boolean compatible() {
		return true; //TO-DO
	}
	
	public Reservation reserver() {
		//do nothing
		return null;
	}
}
