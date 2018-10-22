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
public abstract class Personne {
    protected String nomNaissance;
    protected String nomCourant;
    protected String prenom;
    protected char genre;
    protected Date dateNaissance;
    protected String lieuNaissance;
    protected Date dateDeces;
    protected String nationalite;
    protected int taille;
    protected float poids;
    Personne(String nomNaissance,String prenom,
    char genre,Date dateNaissance,String lieuNaissance,
    Date dateDeces,String nationalite, int taille,float poids){
        this.nomNaissance=nomNaissance;
        this.prenom=prenom;
        this.genre=genre;
        this.dateNaissance=dateNaissance;
        this.lieuNaissance=lieuNaissance;
        this.dateDeces=dateDeces;
        this.nationalite=nationalite;
        this.taille=taille;
        this.poids=poids;
    }
    
}
