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
    /**
     * 
     * @param nomNaissance 
     *          nom de famille de naissance
     * @param prenom
     * @param genre
     * @param dateNaissance
     * @param lieuNaissance
     * @param dateDeces
     *          la date de décès est prédéfinie lors de la création de la personne
     * @param nationalite
     * @param taille
     * @param poids 
     */
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
    
    /* Accesseurs */
    public String getNomNaissance()
    {
        return this.nomNaissance;
    }
    
    public String getNomCourant()
    {
        return this.nomCourant;
    }
    
    public String getPrenom()
    {
        return this.prenom;
    }
    
    public char getGenre()
    {
        return this.genre;
    }
    
    public  Date getDateNaissance()
    {
        return this.dateNaissance;
    }
    
    public  String getLieuNaissance()
    {
        return this.lieuNaissance;
    }
    
    public  Date getDateDeces()
    {
        return this.dateDeces;
    }
    
    public  String getNationalite()
    {
        return this.nationalite;
    }
    
    public  int getTaille()
    {
        return this.taille;
    }
    
    public  float getPoids()
    {
        return this.poids;
    }
    
    /** Pas besoin de mutators étant donné qu'on n'a pas a changé les informations des personnes, juste les lires ! */
}