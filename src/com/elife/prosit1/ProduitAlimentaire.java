package com.elife.prosit1;

import java.time.LocalDate;

public class ProduitAlimentaire {

    private int identifiant;
    private String libelle, marque;
    private float prix;
    private LocalDate dateExpiration;

    public ProduitAlimentaire() {
        dateExpiration = LocalDate.of(2023, 12, 31);
    }

    public ProduitAlimentaire(int identifiant, String libelle, String marque) {
        this.identifiant = identifiant;
        this.marque = marque;
        this.libelle = libelle;
        dateExpiration = LocalDate.of(2023, 12, 31);
    }

    public ProduitAlimentaire(int identifiant, String libelle, String marque, float prix) {
        this.identifiant = identifiant;
        this.marque = marque;
        this.libelle = libelle;
        this.prix = prix;
        dateExpiration = LocalDate.of(2023, 12, 31);
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        if (prix > 0) {
            this.prix = prix;
        } else {
            System.out.println("Erreur ! Le prix doit etre positif !");
        }
    }

    public LocalDate getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;

    }

    @Override
    public String toString() {
        return "id: " + identifiant + " - libelle: " + libelle + " - marque: " + marque + " - prix; " + prix + " - date: " + dateExpiration;
    }

    @Override
    public boolean equals(Object obj){
        
        if (obj == null) {
            return false;
        }
        
        if (!(obj instanceof ProduitAlimentaire)) {
            return false;
        }
        
        ProduitAlimentaire pa = (ProduitAlimentaire) obj;
        
        if (this.identifiant != pa.identifiant 
                && !this.libelle.equals(pa.libelle) && this.prix != pa.prix) {
            return false;
        }
        
        return true;
    }
    
    public void afficher() {
        System.out.println("identifiant= " + this.identifiant + "\n");
        System.out.println("libelle= " + this.libelle + "\n");
        System.out.println("marque= " + this.marque + "\n");
        System.out.println("prix= " + this.prix + "\n");
    }

    public void attribuerPrix(float prix) {
        this.prix = prix;
    }

    public boolean comparerProduit(ProduitAlimentaire p){
        
        if (this.identifiant == p.identifiant 
                && this.libelle.equals(p.libelle) && this.prix == p.prix) {
            return true;
        }
        
        return false;
    }
    
}
