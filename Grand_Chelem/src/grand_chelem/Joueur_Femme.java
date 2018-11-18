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
public class Joueur_Femme extends Joueur{
    
    String tenue;
    /*
     *Constructeur pour joueur en entrant les différents attributs 
     */
    public Joueur_Femme(String nomNaissance, String prenom, char genre, DateTennis dateNaissance, String lieuNaissance, DateTennis dateDeces, String nationalite, int taille, float poids, char main, String sponsor, int classement, String entraineur,String couleur) {
        super(nomNaissance, prenom, genre, dateNaissance, lieuNaissance, dateDeces, nationalite, taille, poids, main, sponsor, classement, entraineur,couleur);
        this.tenue="Jupe"+super.couleur;
        //resentationJoueur_F();
    }
    /*
    Constructor pour Joueur Femme aléatoire
    */
    public Joueur_Femme(char genre, int classement){
        super(genre,classement);
    }
    /**
     * 
     * @param couleur Couleur de la jupe de la joueuse 
     */
    
    @Override
    public void changementCouleur(String couleur){
        super.couleur=couleur;
        System.out.println("Ma jupe a changé de couleur, elle est "+couleur+" maintenant ! :)");
    }
    /**
     * Fonction présentant la joueuse dans la console
     * avec le nom, prenom, date de naissance, lieu de naissance ,
     * la couleur de la jupe,et le classement
     */
    public void PresentationJoueur_F(){
        System.out.print("Bonjour je suis "+this.prenom+" "+this.nomNaissance+" née à "+this.lieuNaissance+" en ");
        dateNaissance.afficherDate();
        System.out.println("Ma nationalité est"+this.nationalite+"Ma jupe est "+this.couleur);
        System.out.println("je suis n°"+this.classement+" mondial");
    }
}
