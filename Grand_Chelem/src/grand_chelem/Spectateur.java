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
    
    boolean etat=true;
    public Spectateur(String nomNaissance, String prenom, char genre, Date dateNaissance, String lieuNaissance, Date dateDeces, String nationalite, int taille, float poids) {
        super(nomNaissance, prenom, genre, dateNaissance, lieuNaissance, dateDeces, nationalite, taille, poids);
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
    // Deux méthdoes permettant de changer l'état du spectateur : endormi ou réveillé
    public void dormir(){
        this.etat=false;
    }
    public void reveil(){
        this.etat=true;
    }
}
