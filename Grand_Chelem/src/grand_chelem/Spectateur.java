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
public class Spectateur extends Personne{
    
    private boolean etat;
    public Spectateur(String nomNaissance, String prenom, char genre, DateTennis dateNaissance, String lieuNaissance, DateTennis dateDeces, String nationalite, int taille, float poids) {
        super(nomNaissance, prenom, genre, dateNaissance, lieuNaissance, dateDeces, nationalite, taille, poids);
        this.etat=true;
    }
    public Spectateur(char genre){
        super(genre);
        this.etat=true;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
    
    
    // fonction qui permet au spectateur de crier
    public void crier(){
        if(this.etat==true){
        System.out.println("LET'S GOOOOOO !!!!!!!!!");
        }
        else{
            System.out.println("Impossible,"
                    + this.prenom+" dort !!");
        }
    }
    // Idem pour huer
    public void huer(){
        if(this.etat==true){
        System.out.println("BOUUUUUUUUUUH");
        }
        else{
            System.out.println("Impossible,"
                    + this.prenom+" dort !!");
        }
    }
    /**
     * Méthode permettant d'endormir le spectateur
     * */
    public void dormir(){
        this.etat=false;
    }
    /**
     * Méthode permettant de réveiller le spectateur
     */
    public void reveil(){
        this.etat=true;
    }
}
