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
public class Spectateur extends Personne{

    boolean etat=true;
    public Spectateur(String nomNaissance, String prenom, char genre, Date dateNaissance, String lieuNaissance, Date dateDeces, String nationalite, int taille, float poids) {
        super(nomNaissance, prenom, genre, dateNaissance, lieuNaissance, dateDeces, nationalite, taille, poids);
    }
    public void crier(){
        if(this.etat==true){
        System.out.println("LET'S GO MA GUEUUUUUUUULE !!!!!!!!!");
        }
        else{
            System.out.println("Impossible,"
                    + this.prenom+" dort !!");
        }
    }
    public void huer(){
        if(this.etat==true){
        System.out.println("BOUUUUUUUUUUH TU PUUUUUES");
        }
        else{
            System.out.println("Impossible,"
                    + this.prenom+" dort !!");
        }
    }
    public void dormir(){
        this.etat=false;
    }
    public void reveil(){
        this.etat=true;
    }
}
