/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;

import java.util.InputMismatchException;

/**
 *
 * @author ISEN
 */
public class Joueur extends Personne
{
    char main;
    String sponsor;
    int classement;
    String entraineur;
    public Joueur(String nomNaissance,String prenom ,
                  char genre,DateTennis dateNaissance,String lieuNaissance,
                  DateTennis dateDeces,String nationalite,int taille,float poids,
                  char main,String sponsor,int classement,String entraineur){
        super(nomNaissance,prenom,genre,dateNaissance,lieuNaissance,dateDeces,nationalite,taille,poids);
        this.main=main;
        this.sponsor=sponsor;
        this.classement=classement;
        this.entraineur=entraineur;
    }
    public String nom_Prenom(){
        return this.prenom+" "+this.nomNaissance;
    }
}
