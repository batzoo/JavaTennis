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
public class Grand_Chelem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date naissance=new Date(25,01,1998);
        Date mort=new Date(15,12,2091);
        Jeu aze=new Jeu();
        Joueur a;
        int R=0;
        int B=0;
        Set set=new Set();
        Arbitre paul=new Arbitre("Dufour","Paul",'M',naissance,"Paris",mort,"Francaise",185,75);
        Joueur_Homme jeanne= new Joueur_Homme("Federer","Roger",'M',naissance,"Paris",mort,"Francaise",185,75,'R',"Nike",1,"Noah","Rouge");
        Joueur_Homme michelle= new Joueur_Homme("Savard","Bob",'M',naissance,"Paris",mort,"Francaise",185,75,'R',"Nike",3,"Noah","Rouge");
        Match Premier_tour=new Match(jeanne,michelle,paul);
        Premier_tour.vainqueur_match(jeanne, michelle);
        
    }
    
}
