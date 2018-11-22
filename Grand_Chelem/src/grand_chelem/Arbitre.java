/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;

/**
 *
 * @author Giovanni Haddadi/Baptiste Delpierre
 */
public class Arbitre extends Personne {
    /**
     * Constructor
     * @param nomNaissance Nom de naissance de l'arbitre
     * @param prenom prenom de l'arbitre
     * @param genre sexe de l'arbitre
     * @param dateNaissance date de naissance de l'arbitre
     * @param lieuNaissance lieu de naissance de l'arbitre
     * @param dateDeces date de décès de l'arbitre
     * @param nationalite nationalité de l'arbitre
     * @param taille taille de l'arbitre
     * @param poids poids de l'arbitre
     */
    public Arbitre(String nomNaissance, String prenom, char genre, DateTennis dateNaissance, String lieuNaissance, DateTennis dateDeces, String nationalite, int taille, float poids) {
        
        super(nomNaissance, prenom, genre, dateNaissance, lieuNaissance, dateDeces, nationalite, taille, poids);
    } 
    /**
     * Constructor d'arbitre aléatoire
     * @param genre  sexe de l'arbitre
     */
    public Arbitre(char genre){
        super(genre);
    }
    /**
     * Fonction permettant de donner le score du jeu en cours
     * @param j Jeu dans lequel est contenu le score du jeu 
     */
    public void annonceScore(Jeu j){
        System.out.println("Score : "+j.score(j.ptsJ1)+"/"+j.score(j.ptsJ2));
    }
    /**
     * Fonction faisnat dire à l'arbitre "faute" lorsqu'il y a faute
     * @param e Echange en cours
     */
    public void faute(Echange e){
        if(e.faute==true){
            System.out.println("Mr "+this.nomNaissance+" : FAUTE !");
        }
    }
    
}
