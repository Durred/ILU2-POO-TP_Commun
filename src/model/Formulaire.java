package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	private int numeroReservation;

	
	protected Formulaire(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}

	public int getIdentificationEntite() {
		return numeroReservation;
	}

	public void setIdentificationEntite(int numeroReservation) {
		this.numeroReservation = numeroReservation;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}
	
}
