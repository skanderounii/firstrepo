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
public class Caissier extends Employer{
    
    private int numCaisse;

    public Caissier() {
    }

    public Caissier(int id, String nom, String address, int nbrHeurs, int numCaisse) {
        super(id, nom, address, nbrHeurs);
        this.numCaisse = numCaisse;
    }

    public int getNumCaisse() {
        return numCaisse;
    }

    public void setNumCaisse(int numCaisse) {
        this.numCaisse = numCaisse;
    }

    @Override
    public String toString() {
        return "Caissier{id="+super.id+" nom="+ nom + " addresse="+ getAddress() + " nbrHeurs="+ super.getNbrHeurs()+ " numCaisse=" + numCaisse + '}';
    }

    @Override
    public float calculerSalaire() {
        float salaire = 0.0f;
        
        float heurSupp = nbrHeurs - 180;
        
        if (nbrHeurs <= 180) {
            salaire = nbrHeurs * 5;
        }else{
            salaire = nbrHeurs * 5 + heurSupp * 5.75f;
        }
        
        return salaire;
    }
    
    
    
}
