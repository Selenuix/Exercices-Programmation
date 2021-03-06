package Exercice11;

/**
 *
 * @author ACISZEK1
 */
public class Client {
	// Définition des attributs
	private String reference, nom, ville, resultat;
	private float chiffreAffaires;

	// Constructeur
	public Client(String r, String n, String v) {
		this.reference = r;
		this.nom = n;
		this.ville = v;
		this.chiffreAffaires = 0;
	}

	// Constructeur alternatif
	public Client(String r) {
		this.reference = r;
		this.nom = "Anonyme";
		this.ville = "Inconnue";
		this.chiffreAffaires = 0;
	}

	/*
	 * Définition des accesseurs
	 * Lecture
	 */

	// Lecture de référence
	public String getReference() {
		return this.reference;
	}

	// Lecture du nom
	public String getNom() {
		return this.nom;
	}

	// Lecture de la ville
	public String getVille() {
		return this.ville;
	}

	// Lecture du chiffre d'affaire
	public float getChiffreAffaires() {
		return this.chiffreAffaires;
	}

	// Ecriture

	// Ecriture de la ville
	public void setVille(String v) {
		this.ville = v;
	}

	// Ecriture du nom
	public void setNom(String nomClient) {
		this.nom = nomClient;
	}

	// Renvoi des information en String
	public String toString() {
		resultat = "----------------------------------------";
		resultat += "\nRéférence : " + this.reference;
		resultat += "\nNom : " + this.nom;
		resultat += "\nVille : " + this.ville;
		resultat += "\nChiffre d'affaires : " + this.chiffreAffaires + " €";
		resultat += "\n----------------------------------------";
		return resultat;
	}

	// Cumuler le chiffre d'affaire
	public void cumulerCa(float ca) {
		this.chiffreAffaires = this.chiffreAffaires + ca;
	}
}
