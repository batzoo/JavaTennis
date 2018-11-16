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
     * @param nomNaissance
     * @param prenom
     * @param genre
     * @param dateNaissance
     * @param lieuNaissance
     * @param dateDeces
     * @param nationalite
     * @param taille
     * @param poids 
     */
    public Arbitre(String nomNaissance, String prenom, char genre, Date dateNaissance, String lieuNaissance, Date dateDeces, String nationalite, int taille, float poids) {
        super(nomNaissance, prenom, genre, dateNaissance, lieuNaissance, dateDeces, nationalite, taille, poids);
    } 
    
    public void annonceScore(){
        
    }
    
    public void faute(){
        
    }
    /** En cas de litige, fonction qui retourne la décision de l'arbitre
     * 
     */
    public void decision(){
        
    }
    
}
