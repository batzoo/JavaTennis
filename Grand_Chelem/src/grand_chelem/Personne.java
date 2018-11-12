/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;
import java.util.Calendar;

/**
 *
 * @author ISEN
 */
public abstract class Personne {
    protected String nomNaissance;
    protected String nomCourant;
    protected String prenom;
    protected char genre;
    protected DateTennis dateNaissance;
    protected String lieuNaissance;
    protected DateTennis dateDeces;
    protected String nationalite;
    protected int taille;
    protected float poids;
    
    Personne(String nomNaissance,String prenom,
    char genre,DateTennis dateNaissance,String lieuNaissance,
    DateTennis dateDeces,String nationalite, int taille,float poids){
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
    
    /* Permet de savoir si la personne est en vie ou non */
    public boolean enVie()
    {
        int jour = this.dateDeces.getJour();
        if (jour == 00 /*|| this.dateDeces.mois == 00 || this.dateDeces.annee == 0000*/){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int age()
    {
        Calendar dateOrdi = Calendar.getInstance();
        int anneeOrdi = dateOrdi.get(Calendar.YEAR);
        int moisOrdi = dateOrdi.get(Calendar.MONTH) + 1; /* Les mois commencent à 0 donc il faut rajouter 1 pour obtenir le bon numéro */
        int jourOrdi = dateOrdi.get(Calendar.DATE);

        int age;
        if (enVie() == true){
            age = anneeOrdi - this.dateNaissance.annee;
            
            if (moisOrdi < this.dateNaissance.mois){
                age = age - 1;
                return age;
            }
            /* Si le mois de decés = au mois de naissance alors on vérifie les jours de naissance */
            else if (moisOrdi == this.dateNaissance.mois){
                /* Si le mois de decés = au mois de naissance et que le jour de decés < jour de naissance alors l'âge vaut année décès - année naissance - 1 */
                if (jourOrdi < this.dateNaissance.jour){
                    age = age - 1;
                    return age;
                }
                /* Si le mois de decés = au mois de naissance et que le jour de decés = jour de naissance alors l'âge vaut année decés - année naissance */
                else if (jourOrdi == this.dateNaissance.jour){
                    return age;
                }
            }
            return age;
        }
        else{
            age = this.dateDeces.annee - this.dateNaissance.annee;
            
            if (this.dateDeces.mois < this.dateNaissance.mois){
                age = age - 1;
                return age;
            }
            /* Si le mois de decés = au mois de naissance alors on vérifie les jours de naissance */
            else if (this.dateDeces.mois == this.dateNaissance.mois){
                /* Si le mois de decés = au mois de naissance et que le jour de decés < jour de naissance alors l'âge vaut année décès - année naissance - 1 */
                if (this.dateDeces.jour < this.dateNaissance.jour){
                    age = age - 1;
                    return age;
                }
                /* Si le mois de decés = au mois de naissance et que le jour de decés = jour de naissance alors l'âge vaut année decés - année naissance */
                else if (this.dateDeces.jour == this.dateNaissance.jour){
                    return age;
                }
            }
        }
        return age;
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
    
    public  DateTennis getDateNaissance()
    {
        return this.dateNaissance;
    }
    
    public  String getLieuNaissance()
    {
        return this.lieuNaissance;
    }
    
    public  DateTennis getDateDeces()
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
    
    /* Pas besoin de mutators étant donné qu'on n'a pas a changé les informations des personnes, juste les lires ! */
}