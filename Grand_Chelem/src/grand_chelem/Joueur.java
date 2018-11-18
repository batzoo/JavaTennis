/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;

import java.util.InputMismatchException;

/**
 *
 * @author Baptiste Delpierre/Giovanni Haddadi
 */
public class Joueur extends Personne
{
    /**
     * @param main D pour droitier G pour gaucher
     * 
     */
    char main;
    String sponsor;
    int classement;
    String entraineur;
    char genre;
    String couleur;
    //Construcor pour Joueur avec comme paramètres les différents attributs
    public Joueur(String nomNaissance,String prenom ,
                  char genre,DateTennis dateNaissance,String lieuNaissance,
                  DateTennis dateDeces,String nationalite,int taille,float poids,
                  char main,String sponsor,int classement,String entraineur,String couleur){
        super(nomNaissance,prenom,genre,dateNaissance,lieuNaissance,dateNaissance,nationalite,taille,poids);
        this.main=main;
        this.sponsor=sponsor;
        this.classement=classement;
        this.entraineur=entraineur;
        this.couleur=couleur;
    }
    //Constructor pour Joueur aléatoire
    public Joueur(char genre,int classement){
        super(genre);
        this.main=main_random();
        this.sponsor=sponsor_random();
        this.classement=classement;
        this.entraineur=entraineur_random();
        this.couleur=couleur_random();
        
        
    }
    /**
     * 
     * @return Le nom et prénom du joueur séparés d'un espace
     */
    public String nom_Prenom(){
        return this.prenom+" "+this.nomNaissance;
    }
    public char main_random(){
        int a =(int)(Math.random()*2);
        if(a==0){
            return 'G';
        }
        else{
            return 'D';
        }
    }
    public String sponsor_random(){
        String sponsors[]={"Nike","Adidas","Asics","Puma","Reebok","Wilson","Babolat","Artengo","Kipsta","Kappa"};
        return sponsors[(int)(Math.random()*10)];
    }
    public String entraineur_random(){
        String entraineurs[]={"Yannick Noah","John McEnroe","Henri Lecomte","Mickael Llodra","Fred Perry","Jack Kramer","Pete Sampras","Andre Agassi","Bjorn Borg","Ivan Lendl"};
        return entraineurs[(int)(Math.random()*10)];
    }
    public String couleur_random(){
        String couleurs[]={"Rouge","Bleu","Vert","Jaune","Orange","Noir","Blanc","Bordeaux","Violet"};
        return couleurs[(int)(Math.random()*9)];
    }
    public void changementCouleur(String couleur){
        this.couleur=couleur;
    }
}
