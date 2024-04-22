package model;

public class ReservationRestaurant extends Reservation{
	private int numService;
	private int numTable;
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		this.numService = numService;
		this.numTable = numTable;
	}
	
	private String getSerivce() {
		if(numService == 1) {
			  return "premier";
		}
		else{
			return "deuxième";
		}
	}

	@Override
	public String toString() {
		return "Le "+ getJour() +"/" + getMois()+"\nTable "+ numTable + " pour le " + getSerivce() + " service.";
	}
}
