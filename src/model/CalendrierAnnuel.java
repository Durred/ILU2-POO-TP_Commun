package model;

public class CalendrierAnnuel {
	private Mois[] calendrier = new Mois[12];
	
	private static class Mois {
		private String nom;
		private Boolean[] jours;
		
		private Mois(String nom, int nbJours) {
			this.nom = nom;
			jours = new Boolean[nbJours];
			for(int i = 0; i<nbJours;i++) {
				jours[i] = false;
			}
		}
		
		private Boolean estLibre(int jour) {
			return !jours[jour];
		}
		
		private void reserver(int jour) throws IllegalStateException {
			if(!estLibre(jour)) {
				throw new IllegalStateException("Jour pas libre\n");
			}
			else {
				jours[jour] = true;
			}
		}
	}
	
	public CalendrierAnnuel() {
		int i = 0;
		for (EnumMois itMois : EnumMois.values()) {
			calendrier[i] = new Mois(itMois.valeurNom(), itMois.valeurJours());
			i++;
		}
	}
	
	public Boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].estLibre(jour-1);
	}
	
	public Boolean reserver(int jour, int mois) {
		if(estLibre(jour, mois)) {
			calendrier[mois-1].reserver(jour-1);
			return !estLibre(jour, mois);
		}
		else {
			return false;
		}
	}
}
