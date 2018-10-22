/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;

/**
 *
 * @author ISEN
 */
public class Joueur_Homme extends Joueur {
    String couleur;
    String tenue;
    public Joueur_Homme(String nomNaissance, String prenom, char genre, Date dateNaissance, String lieuNaissance, Date dateDeces, String nationalite, int taille, float poids, char main, String sponsor, int classement, String entraineur,String couleur) {
        super(nomNaissance, prenom, genre, dateNaissance, lieuNaissance, dateDeces, nationalite, taille, poids, main, sponsor, classement, entraineur);
        this.couleur=couleur;
        this.tenue="Short"+this.couleur;
        PresentationJoueur_H();
    }
    public void changementCouleur(String couleur){
        this.couleur=couleur;
        System.out.println("Mon short a changé de couleur, il est "+couleur+" maintenant ! :)");
    }
    public void PresentationJoueur_H(){
        System.out.print("Bonjour je suis "+super.prenom+" "+super.nomNaissance+" né à "+super.lieuNaissance+" en ");
        dateNaissance.afficherDate();
        System.out.println("Mon short est "+this.couleur);
        System.out.println("je suis n°"+super.classement+" mondial");
    }
    
}
