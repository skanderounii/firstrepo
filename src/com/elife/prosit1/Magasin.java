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
public class Magasin {
    
    public static int nbrProdAllMagasin = 0;
    
    private int id, nbrProd = 0, nbrEmp=0;
    private String nom, address;
    private final int CAPACITE = 50 ;
    private final int CAPACITE_EMP = 20 ;
    private ProduitAlimentaire[] listProduits ;
    private Employer[] listEmployees ;
    
    public Magasin(){
        listProduits = new ProduitAlimentaire[CAPACITE];
        listEmployees = new Employer[CAPACITE_EMP];
    }
    
    public Magasin(int id, String nom, String address){
        this.id= id;
        this.address = address;
        this.nom = nom;
        listProduits = new ProduitAlimentaire[CAPACITE];
        listEmployees = new Employer[CAPACITE_EMP];
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNom(){
        return nom;
    }
    
    public void setNom(String nom){
        this.nom = nom;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    } 
    
    @Override
    public String toString(){
        String message = "id: "+id+" - nom: "+nom+" - address: "+address+"\nListProduits :\n";
        
        for (int i = 0; i < nbrProd; i++) {
            message += listProduits[i].toString()+"\n";            
        }
        
        message += "*********\nListEmployer :\n";
        for(int i = 0; i < nbrEmp; i++){
            message += listEmployees[i].toString()+"\n";
        }
        
        return message;
    }
    
    public void ajouterProduit(ProduitAlimentaire p){
        
        if (rechercherProduit(p)) {
            System.out.println("Le produit existe dans le magasin !");
            return;
        }
        
        if (nbrProd < CAPACITE ) {
            listProduits[nbrProd] = p;
            nbrProdAllMagasin++;
            nbrProd++;
        }else{
            System.out.println("Le magasin est plein !");
        }
    }  
    
    public boolean rechercherProduit(ProduitAlimentaire p){
        
        for (int i = 0; i < nbrProd; i++) {
            if (p.comparerProduit(listProduits[i])) {
                return true;
            }
        }
        
        return false;
    }
    
    public void supprimerProduitnbrProd(ProduitAlimentaire p){
        for (int i = 0; i < nbrProd; i++) {
            if (p.comparerProduit(listProduits[i])) {
                listProduits[i] = listProduits[nbrProd-1];
                listProduits[nbrProd-1] = null;
                nbrProd--;
                return;
            }
        }
    }
    
    public Magasin comparerProduitMagasin(Magasin m){
        
        if ( this.nbrProd > m.nbrProd ) {
            return this;
        }else if(this.nbrProd < m.nbrProd ){
            return m;
        }else{
            return null;
        }
        
    }
    
    public static boolean comparerProduit(ProduitAlimentaire p1, ProduitAlimentaire p2){
        
        if (p1.getIdentifiant() == p2.getIdentifiant()
                && p1.getLibelle().equals(p2.getLibelle()) && p1.getPrix() == p2.getPrix()) {
            return true;
        }
        
        return false;
    }
    
    public void ajouterEmployer(Employer e){
        if (nbrEmp < CAPACITE_EMP) {
            listEmployees[nbrEmp] = e;
            nbrEmp++;
        }else {
            System.out.println("Le magasin ne peut pas avoir un autre employer !");
        }
    }
    
    public void afficherSalaireEmployer(){
        for (int i = 0; i < nbrEmp; i++) {
            System.out.println("Employer "+listEmployees[i].getId()
                        + " a le salaire = "+listEmployees[i].calculerSalaire());
        }
    }
    
    public void afficherPrimeResponsable(){
        for (int i = 0; i < nbrEmp; i++) {
            if (listEmployees[i] instanceof Responsable) {
                System.out.println("Le prime est =" + ( (Responsable) listEmployees[i]).getPrime());
            }
        }
    }
    
    public void afficherNombreEmployerParType(){
        
        int nbrResponsable=0, nbrVendeur=0, nbrCaissier =0;
        
        for (int i = 0; i < nbrEmp; i++) {
            if (listEmployees[i] instanceof Responsable) {
                nbrResponsable++;
            }else if (listEmployees[i] instanceof Vendeur) {
                nbrVendeur++;
            }else{
                nbrCaissier++;
            }
        }
        
        System.out.println("Le nombre de vendeur est "+nbrVendeur);
        System.out.println("Le nombre de responsable est "+nbrResponsable);
        System.out.println("Le nombre de caissier est "+nbrCaissier);
    }
}
