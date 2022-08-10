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
public class Responsable extends Employer{
    
    private int prime;
   
    public Responsable() {
        
    }

    public Responsable(int id, String nom, String address, int nbrHeurs, int prime) {
        super(id, nom, address, nbrHeurs);
        this.prime = prime;
    }

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    @Override
    public String toString() {
        return super.toString()+"Responsable{" + "prime=" + prime + '}';
    }

    @Override
    public float calculerSalaire() {
        float salaire = 0.0f;
        
        float heurSupp = nbrHeurs - 160;
        
        if (nbrHeurs <= 160) {
            salaire = nbrHeurs * 10 + prime;
        }else{
            salaire = (nbrHeurs * 10) + prime + (heurSupp * 12);
        }
        
        return salaire;
    }
    
    
    
}
