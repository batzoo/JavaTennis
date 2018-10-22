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
       Joueur_Femme bob= new Joueur_Femme("Marley","Bob",'M',naissance,"Paris",mort,"Francais",185,75,'R',"Nike",1,"Noah","Rouge");
       bob.changementCouleur("bleu");
    }
    
}
