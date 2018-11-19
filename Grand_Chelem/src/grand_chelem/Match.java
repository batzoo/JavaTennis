/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;

import java.util.ArrayList;

/**
 *
 * @author ISEN
 */
public class Match extends Set{
    public ArrayList<Spectateur> gradins=new ArrayList<>();
    /** Catégorie du match (Simple Homme ou Femme)*/
    public String categorie;
    /** Joueur qui sert */
    public Joueur joueur1;
    /**  Joueur qui reçoit*/
    public Joueur joueur2;
    /** Booléen donnant le mode utilisé : Auto ou Manuel */
    public boolean auto;
    /* Arbitre du match */
    public Arbitre arbitre;
    /** Nombre de sets nécéssaire pour gagner le match : 2 pour femmes, 3 pour hommes */
    int setGagnants;
    int tour;
    /* SetsJ1 --> nombre de sets du Joueur 1*/
    int setsJ1;
    
    /* SetsJ2 --> nombre de sets du Joueur 1*/
    int setsJ2;
    /**
     * Constructor du match : Deux différents
     * Match homme --> le nombre de sets pour gagner = 3
     * Match femme --> Sets gagnants = 2
     */
    public Match(Joueur joueur1,Joueur joueur2,Arbitre arbitre,char genre){
        Spectateur a;
        this.setGagnants=0;
        int z;
        this.joueur1=joueur1;
        this.joueur2=joueur2;
        this.arbitre=arbitre;
        if(genre=='M'){
            this.categorie="Simple Hommes";
            this.setGagnants=3;
        }
        else {
            
            this.categorie="Simple Femmes";
            this.setGagnants=2;
        }
        presentationMatch();
        
    
    }
    
    /**
     * 
     * @param duel Match en cours 
     * @return Le nombre de points en jeu pour le classement
     */
    public float calcul_PointsATP(Match duel){
        int diff=duel.joueur1.classement-duel.joueur2.classement;
        float coeff=diff/3+4;
        return coeff;
    }
    /**
     * Fonction qui présente le match :
     * Catégorie, joueurs et arbitre et le nombre de sets pour gagner
     */
    private void presentationMatch(){
        System.out.println("Bienvenue a ce match de "+this.categorie+" opposant "+this.joueur1.nom_Prenom()+" et "+this.joueur2.nom_Prenom()+" arbitré par M. "+this.arbitre.nomNaissance);
        System.out.println("Le match se jouera en "+this.setGagnants+" sets gagnants");
    }
    /**
     * 
     * @param auto Variable pour savoir quel mode utiliser :
     *              true pour automatique
     *              false pour manuel
     * @return Le vainqueur du match (utilise la fonction vainqueur_set)
     */
    public Joueur vainqueur_match(boolean auto){
        Joueur a;
        Joueur j1=this.joueur1;
        Joueur j2=this.joueur2;
        
        while(this.setsJ1<this.setGagnants&&this.setsJ2<this.setGagnants&&!(this.setsJ1==(this.setGagnants-1)&&this.setsJ2==(this.setGagnants-1))){
            a=vainqueur_set(j1,j2,auto);
            if(a==j1){
                
                this.setsJ1++;
            }
            else if(a==j2){
                this.setsJ2++;
            }
            
        }
        if(this.setsJ1==this.setGagnants){
            System.out.println("VAINQUEUR : "+j1.nomNaissance+" "+j1.prenom);
            System.out.println("SCORE : "+this.setsJ1+"/"+this.setsJ2);
            return j1;
        }
        else if(this.setsJ2==this.setGagnants){
            System.out.println("VAINQUEUR : "+j2.nomNaissance+" "+j2.prenom);
            System.out.println("SCORE : "+this.setsJ1+"/"+this.setsJ2);
            return j2;
        }
        else{
            a=vainqueur_set_final(j1,j2,auto);
            return a;
        }
    }
     
    
}
