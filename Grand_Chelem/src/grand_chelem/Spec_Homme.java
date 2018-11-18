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
public class Spec_Homme extends Spectateur {
    String tenue;
    public Spec_Homme(String nomNaissance, String prenom, char genre, DateTennis dateNaissance, String lieuNaissance, DateTennis dateDeces, String nationalite, int taille, float poids) {
        super(nomNaissance, prenom, genre, dateNaissance, lieuNaissance, dateDeces, nationalite, taille, poids);
        this.tenue="Chemise";
    }
    /**
     * Constructor de spectateur Homme aléatoire
     * @param genre 
     */
    public Spec_Homme(char genre){
        super(genre);
        this.tenue="Chemise";
    }
}
