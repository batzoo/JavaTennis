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
        DateTennis naissance=new DateTennis(25,01,1998);
        DateTennis vivant = new DateTennis(00,00,0000);
        DateTennis mort=new DateTennis(15,12,2091);
        Arbitre paul=new Arbitre("Dufour","Paul",'M',naissance,"Paris",mort,"Francaise",185,75);
        Joueur_Homme jeanne= new Joueur_Homme("Federer","Roger",'M',naissance,"Paris",vivant,"Francaise",185,75,'R',"Nike",1,"Noah","Rouge");
        Joueur_Homme michelle= new Joueur_Homme("Savard","Bob",'M',naissance,"Paris",mort,"Francaise",185,75,'R',"Nike",3,"Noah","Rouge");
        Match Premier_tour=new Match(jeanne,michelle,paul);
        Premier_tour.vainqueur_match(jeanne,michelle);
        
        System.out.println(jeanne.enVie());
        System.out.println(jeanne.age());
        System.out.println(michelle.enVie());
        System.out.println(michelle.age());
    }
    
}
