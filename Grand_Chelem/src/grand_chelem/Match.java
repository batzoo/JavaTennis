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
public class Match {
    public String categorie;
    public Joueur joueur1;
    public Joueur joueur2;
    int setGagnants;
    int tour;
    public Match(Joueur_Homme joueur1,Joueur_Homme joueur2){
        this.joueur1=joueur1;
        this.joueur2=joueur2;
        this.categorie="Simple Hommes";
        this.setGagnants=3;
        PresentationMatch();
    }
    public Match(Joueur_Femme joueur1,Joueur_Femme joueur2){
        this.joueur1=joueur1;
        this.joueur2=joueur2;
        this.categorie="Simple Dames";
        this.setGagnants=2;
        PresentationMatch();
    }
    public float Calcul_PointsATP(Match duel){
        int diff=duel.joueur1.classement-duel.joueur2.classement;
        float coeff=diff/3+4;
        return coeff;
    }
    private void PresentationMatch(){
        System.out.println("Bienvenue a ce match de "+this.categorie+" opposant "+this.joueur1.nom_Prenom()+" et "+this.joueur2.nom_Prenom());
        System.out.println("Le match se jouera en "+this.setGagnants+" sets");
    }
}
