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
public class Match extends Set{
    public String categorie;
    public Joueur joueur1;
    public Joueur joueur2;
    public Arbitre arbitre;
    int setGagnants;
    int tour;
    int setsJ1;
    int setsJ2;
    public Match(Joueur_Homme joueur1,Joueur_Homme joueur2,Arbitre arbitre){
        this.joueur1=joueur1;
        this.joueur2=joueur2;
        this.arbitre=arbitre;
        this.categorie="Simple Hommes";
        this.setGagnants=3;
        presentationMatch();
    }
    public Match(Joueur_Femme joueur1,Joueur_Femme joueur2,Arbitre arbitre){
        this.joueur1=joueur1;
        this.joueur2=joueur2;
        this.arbitre=arbitre;
        this.categorie="Simple Dames";
        this.setGagnants=2;
        this.setsJ1=0;
        this.setsJ2=0;
        
        presentationMatch();
    }
    public float calcul_PointsATP(Match duel){
        int diff=duel.joueur1.classement-duel.joueur2.classement;
        float coeff=diff/3+4;
        return coeff;
    }
    private void presentationMatch(){
        System.out.println("Bienvenue a ce match de "+this.categorie+" opposant "+this.joueur1.nom_Prenom()+" et "+this.joueur2.nom_Prenom()+" arbitré par M. "+this.arbitre.nomNaissance);
        System.out.println("Le match se jouera en "+this.setGagnants+" sets gagnants");
    }
    public Joueur vainqueur_match(Joueur j1,Joueur j2){
        int a;
        while(this.setsJ1<this.setGagnants&&this.setsJ2<this.setGagnants){
            a=vainqueur_set();
            if(a==1){
                this.setsJ1++;
            }
            else if(a==2){
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
