package model;

public class CalendrierAnnuel {
	private Mois[] calendrier = new Mois[12];
	
	public CalendrierAnnuel() {
		int i = 0;
		for (EnumMois itMois : EnumMois.values()) {
			calendrier[i] = new Mois(itMois.valeurJours());
			i++;
		}
	}
	
	private static class Mois {
		private boolean[] jours;
		
		private Mois(int nbJours) {
			jours = new boolean[nbJours];
			for(int i = 0; i<nbJours;i++) {
				jours[i] = false;
			}
		}
		
		private boolean estLibre(int jour) {
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
	
	public boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].estLibre(jour-1);
	}
	
	public boolean reserver(int jour, int mois) {
		if(estLibre(jour, mois)) {
			calendrier[mois-1].reserver(jour-1);
			return !estLibre(jour, mois);
		}
		else {
			return false;
		}
	}
}
