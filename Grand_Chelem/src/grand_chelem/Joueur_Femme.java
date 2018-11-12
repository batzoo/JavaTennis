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
public class Joueur_Femme extends Joueur{
    String couleur;
    String tenue;
    public Joueur_Femme(String nomNaissance, String prenom, char genre, DateTennis dateNaissance, String lieuNaissance, DateTennis dateDeces, String nationalite, int taille, float poids, char main, String sponsor, int classement, String entraineur,String couleur) {
        super(nomNaissance, prenom, genre, dateNaissance, lieuNaissance, dateDeces, nationalite, taille, poids, main, sponsor, classement, entraineur);
        this.couleur=couleur;
        this.tenue="Jupe"+this.couleur;
        PresentationJoueur_F();
    }
    public void changementCouleur(String couleur){
        this.couleur=couleur;
        System.out.println("Ma jupe a changé de couleur, elle est "+couleur+" maintenant ! :)");
    }
    public void PresentationJoueur_F(){
        System.out.print("Bonjour je suis "+this.prenom+" "+this.nomNaissance+" née à "+this.lieuNaissance+" en");
        dateNaissance.afficherDate();
        System.out.println("Ma jupe est "+this.couleur);
        System.out.println("je suis n°"+this.classement+" mondial");
    }
}
