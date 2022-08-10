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
public abstract class Employer {
    
    protected int id;
    protected String nom, address;
    protected int nbrHeurs;

    public Employer() {
    }

    public Employer(int id, String nom, String address, int nbrHeurs) {
        this.id = id;
        this.nom = nom;
        this.address = address;
        this.nbrHeurs = nbrHeurs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNbrHeurs() {
        return nbrHeurs;
    }

    public void setNbrHeurs(int nbrHeurs) {
        this.nbrHeurs = nbrHeurs;
    }

    @Override
    public String toString() {
        return "Employer{" + "id=" + id + ", nom=" + nom + ", address=" + address + ", nbrHeurs=" + nbrHeurs + '}';
    }

   public abstract float calculerSalaire();
    
    
}
