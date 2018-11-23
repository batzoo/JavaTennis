/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;

/**
 *
 * @author Baptiste Delpierre/Giovanni Haddadi
 */
public class Joueur_Homme extends Joueur {
    private String tenue;
     /*
    Constructor pour Joueur Homme en entrant les différents attributs
    */
    public Joueur_Homme(String nomNaissance, String prenom, char genre, DateTennis dateNaissance, String lieuNaissance, DateTennis dateDeces, String nationalite, int taille, float poids, char main, String sponsor, int classement, String entraineur,String couleur) {
        super(nomNaissance, prenom, genre, dateNaissance, lieuNaissance, dateDeces, nationalite, taille, poids, main, sponsor, classement, entraineur,couleur);
        this.tenue="Short"+this.getCouleur();
        PresentationJoueur_H();
    }
    /*
    Constructor pour Joueur Homme aléatoire
    */
    public Joueur_Homme(char genre,int classement){
        super(genre,classement);
        this.tenue="Short"+this.getCouleur();
        //PresentationJoueur_H();
    }
    
    /**
     * 
     * @param couleur Couleur du short le changement de couleur du short du joueur
     * 
     */
    @Override
    public void changementCouleur(String couleur){
        super.setCouleur(couleur);
        System.out.println("Mon short a changé de couleur, il est "+couleur+" maintenant ! :)");
    }
    /** 
     * Présente le joueur dans la console : 
     * Prenom, nom, date et lieu de naissance, couleur du short et classement
     */
    public void PresentationJoueur_H(){
        System.out.print("Bonjour je suis "+this.prenom+" "+this.nomNaissance+" né à "+this.lieuNaissance+" en ");
        dateNaissance.afficherDate();
        
        System.out.println("Ma nationalité est "+this.nationalite+" et mon short est "+this.getCouleur());
        System.out.println("je suis n°"+this.getClassement()+" mondial");
    }
   
}
