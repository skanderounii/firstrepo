package com.elife.prosit1.test;

import com.elife.prosit1.Caissier;
import com.elife.prosit1.Employer;
import com.elife.prosit1.Magasin;
import com.elife.prosit1.ProduitAlimentaire;
import com.elife.prosit1.Responsable;
import com.elife.prosit1.Vendeur;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FGH
 */
public class MainTest {
    
    public static void main(String[] args) {
        ProduitAlimentaire p1 = new ProduitAlimentaire();
        ProduitAlimentaire p2 = new ProduitAlimentaire(1021, "Lait" , "Delice");
        ProduitAlimentaire p3 = new ProduitAlimentaire(2510, "Yaourt" , "Vitalait");
        ProduitAlimentaire p4 = new ProduitAlimentaire(3250, "Tomate" , "Sicam", 1.2f);
        
        p1.setIdentifiant(5555); 
        p2.attribuerPrix(0.7f);
        p2.afficher();
        
        p1.setIdentifiant(5069);
        p1.setLibelle("Chocolat");
        p1.setMarque("Said");
        p1.setPrix(3.5f);
        
        p3.attribuerPrix(4.5f);
        
//        p1.afficher();
//        System.out.println("-----------------------");
//        p2.afficher();
//        System.out.println("-----------------------");
//        p3.afficher();
//        System.out.println("-----------------------");
//        p4.afficher();
        
//        p2.prix= 0.7f;
        
        
        
//        p1.afficher();
//        p2.afficher();
//        p3.afficher();
//        p4.afficher();
//        
//        System.out.println("*********************************");
//        System.out.println(p1.toString());
//        System.out.println(p2.toString());
//        System.out.println(p3.toString());
//        System.out.println(p4.toString());
//        
//        Magasin m1 = new Magasin(1, "Monoprix Siliana", "Siliana");
//        Magasin m2 = new Magasin(2, "Monoprix Kef", "Kef");
//        
//        ProduitAlimentaire p11 = new ProduitAlimentaire(1021, "Lait" , "Delice",0.7f);
//               
//        m1.ajouterProduit(p1);
//        m1.ajouterProduit(p1);
//        m1.ajouterProduit(p3);
//        
//        m2.ajouterProduit(p4);
//        m2.ajouterProduit(p3);
//                
////        System.out.println(m1.toString());
//        
//        System.out.println("Le nombre total de produit dans tous les magasins est : " + Magasin.nbrProdAllMagasin);
//        
//        System.out.println("------------------  Prosit 3 -------------------------------");
//        System.out.println(p1.comparerProduit(p4));
//        System.out.println(p1.comparerProduit(p1));
//        System.out.println(p2.comparerProduit(p11));
//        System.out.println(p4.comparerProduit(p11));
//        System.out.println(Magasin.comparerProduit(p2, p11));
//        
//        System.out.println("------------ Rechercher ------------------");
//        System.out.println(m1.rechercherProduit(p4));
//        System.out.println(m1.rechercherProduit(p1));
//       
//        
//        Magasin mX = m1.comparerProduitMagasin(m2);
//        
//        if (mX == null) {
//            System.out.println("Les 2 magasins ont le meme nombre de produits !");
//        }else{
//            System.out.println("Le magasin "+mX.getNom()+" a un nombre superieur de produits" );
//        }


        Magasin m1 = new Magasin(1, "Carrefour" , "Centre Ville");
        Magasin m2 = new Magasin(2, "Monoprix", "Menzah 6");
        
        Employer c1 = new Caissier(1, "Wassim", "Siliana", 48, 1);
        Employer c2 = new Caissier(2, "Skander", "Jerba", 36, 2);
        Employer c3 = new Caissier(5, "Chawki", "Siliana", 500, 3);
        Employer v1 = new Vendeur(3, "Seif", "Kairouen", 12, 2.5f);
        Employer v2 = new Vendeur(6, "Oussama", "Kairouan", 24, 1.5f);
        Employer v3 = new Vendeur(7, "Amal", "Tunis", 48, 3.5f);
        Employer v4 = new Vendeur(8, "Oumaima", "Tatawin", 1, 0.5f);
        
        Employer r1 = new Responsable(4, "Kamel", "Soussa", 120, 1000);
        Responsable r2 = new Responsable(9, "Sonia", "Kairouan", 320, 3000);
                
        m1.ajouterEmployer(c1);
        m1.ajouterEmployer(c2);
        m1.ajouterEmployer(v1);
        m1.ajouterEmployer(r1);
        
        m2.ajouterEmployer(c3);
        m2.ajouterEmployer(v2);
        m2.ajouterEmployer(v3);
        m2.ajouterEmployer(v4);
        m2.ajouterEmployer(r2);
        
        System.out.println(c1.toString());
        System.out.println(v1.toString());
        System.out.println(r1.toString());
        
        m1.ajouterProduit(p1);
        m1.ajouterProduit(p2);
        m2.ajouterProduit(p3);
        m2.ajouterProduit(p4);
        System.out.println("***********************");
        System.out.println(m1.toString());
        System.out.println("***********************");
        System.out.println(m2.toString());
        
        m1.afficherSalaireEmployer();
        
        System.out.println(r2.getPrime());
        System.out.println(((Responsable) r1).getPrime());
       
        System.out.println("---------------------------------");
        m1.afficherNombreEmployerParType();
        System.out.println("---------------------------------");
        m2.afficherNombreEmployerParType();
    }
}
