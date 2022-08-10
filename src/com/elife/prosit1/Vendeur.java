/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elife.prosit1;

/**
 *
 * @author ouni
 */
public class Vendeur extends Employer{
    
    private float tauxDeVente;

    public Vendeur() {
    }

    public Vendeur(int id, String nom, String address, int nbrHeurs, float tauxDeVente) {
        super(id, nom, address, nbrHeurs);
        this.tauxDeVente = tauxDeVente;
    }

    public float getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(float tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return "Vendeur{" + "tauxDeVente=" + tauxDeVente + "}" + super.toString();
    }
    
    @Override
    public float calculerSalaire() {
        return 450 + 450 * tauxDeVente;
    }
    
    
}
