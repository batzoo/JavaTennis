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
<<<<<<< HEAD

    boolean etat=true;
    public Spectateur(String nomNaissance, String prenom, char genre, DateTennis dateNaissance, String lieuNaissance, DateTennis dateDeces, String nationalite, int taille, float poids) {
=======
    
    boolean etat;
    public Spectateur(String nomNaissance, String prenom, char genre, Date dateNaissance, String lieuNaissance, Date dateDeces, String nationalite, int taille, float poids) {
>>>>>>> osef
        super(nomNaissance, prenom, genre, dateNaissance, lieuNaissance, dateDeces, nationalite, taille, poids);
        this.etat=true;
    }
    public Spectateur(char genre){
        super(genre);
        this.etat=true;
    }
<<<<<<< HEAD
    
=======
    // fonction qui permet au spectateur de crier
>>>>>>> osef
    public void crier(){
        if(this.etat==true){
        System.out.println("LET'S GOOOOOO !!!!!!!!!");
        }
        else{
            System.out.println("Impossible,"
                    + this.prenom+" dort !!");
        }
    }
<<<<<<< HEAD
    
=======
    // Idem pour huer
>>>>>>> osef
    public void huer(){
        if(this.etat==true){
        System.out.println("BOUUUUUUUUUUH");
        }
        else{
            System.out.println("Impossible,"
                    + this.prenom+" dort !!");
        }
    }
<<<<<<< HEAD
    
=======
    // Deux méthdoes permettant de changer l'état du spectateur : endormi ou réveillé
>>>>>>> osef
    public void dormir(){
        this.etat=false;
    }
    public void reveil(){
        this.etat=true;
    }
}
