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
    public String categorie;
    public Joueur_Homme joueur1;
    public Joueur_Homme joueur2;
    public Arbitre arbitre;
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
    public Match(Joueur_Homme joueur1,Joueur_Homme joueur2,Arbitre arbitre){
        Spectateur a;
        int z;
        this.joueur1=joueur1;
        this.joueur2=joueur2;
        this.arbitre=arbitre;
        this.categorie="Simple Hommes";
        this.setGagnants=3;
        presentationMatch();
        for (int i=0;i<100;i++){
            z=(int)(Math.random()*2);
            if(z==0){
                a=new Spec_Homme('H');
            }
            else{
                a=new Spec_Femme('F');
            }
            this.gradins.add(a);
        }
    }
    /*public Match(Joueur_Femme joueur1,Joueur_Femme joueur2,Arbitre arbitre){
        this.joueur1=joueur1;
        this.joueur2=joueur2;
        this.arbitre=arbitre;
        this.categorie="Simple Dames";
        this.setGagnants=2;
        this.setsJ1=0;
        this.setsJ2=0;
        
        presentationMatch();
    }*/
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
     * @param j1 Joueur 1 du match
     * @param j2 Joueur 2 du match
     * @return Le vainqueur du match (utilise la fonction vainqueur_set)
     */
    public Joueur_Homme vainqueur_match_H(Joueur_Homme j1,Joueur_Homme j2){
        Joueur_Homme a;
        while(this.setsJ1<this.setGagnants&&this.setsJ2<this.setGagnants){
            a=vainqueur_set_H(j1,j2);
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
        else{
            System.out.println("VAINQUEUR : "+j2.nomNaissance+" "+j2.prenom);
            System.out.println("SCORE : "+this.setsJ1+"/"+this.setsJ2);
            return j2;
        }
    }
    
}
