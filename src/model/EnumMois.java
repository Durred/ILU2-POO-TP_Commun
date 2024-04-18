package model;

public enum EnumMois {
	JANVIER("Janvier",31), FEVRIER("Février",28), MARS("Mars", 31), AVRIL("Avril", 30), MAI("Mai", 31), JUIN("Juin", 30), JUILLET("Juillet", 31), AOUT("Août", 31), SEPTEMBRE("Septembre", 30), OCTOBRE("Octobre", 31), NOVEMBRE("Novembre", 30), DECEMBRE("Décembre", 31);
	
	private int nbJours;
	private String nom;
	private EnumMois(final String nom, final int nbJours) {
		this.nbJours = nbJours;
		this.nom = nom;
	}
	
	public int valeurJours() {
		return this.nbJours;
	}
	
	public String valeurNom() {
		return this.nom;
	}
}
