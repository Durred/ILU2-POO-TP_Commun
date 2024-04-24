package model;

public class Table extends EntiteReservable<FormulaireRestaurant> {
	private int nbChaises;
	private CalendrierAnnuel calendrierDeuxiemeService;
	
	public Table(int nbChaises) {
		this.nbChaises = nbChaises;
	}
	
	public Reservation reserver(FormulaireRestaurant formulaireRestaurant) {
		ReservationRestaurant res;
		if(formulaireRestaurant.getNumService() == 1) {
			calendrier.reserver(formulaireRestaurant.getJour(), formulaireRestaurant.getMois());
			return ( res = new ReservationRestaurant(formulaireRestaurant.getJour(), formulaireRestaurant.getMois(), 1, nbChaises));
		}
		else {
			
		}
	}
	
	public boolean compatible(FormulaireRestaurant formulaireRestaurant) {
		return (nbChaises == formulaireRestaurant.getNombrePersonnes()+1 || nbChaises == formulaireRestaurant.getNombrePersonnes()) && estLibre(formulaireRestaurant);
	}
}
