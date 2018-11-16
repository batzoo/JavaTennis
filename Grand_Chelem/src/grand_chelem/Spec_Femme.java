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
public class Spec_Femme extends Spectateur {
    String tenue;
    public Spec_Femme(String nomNaissance, String prenom, char genre, Date dateNaissance, String lieuNaissance, Date dateDeces, String nationalite, int taille, float poids) {
        super(nomNaissance, prenom, genre, dateNaissance, lieuNaissance, dateDeces, nationalite, taille, poids);
        this.tenue="Lunettes";
    }
    public Spec_Femme(char genre){
        super(genre);
        this.tenue="Lunettes";
    }
}
