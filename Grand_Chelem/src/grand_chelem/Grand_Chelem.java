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
    public static void main(String[] args)  {
        Tournoi femme=new Tournoi('F');
        Tournoi homme=new Tournoi('M');
        femme.tournoi_femmes();
        homme.tournoi_hommes();
        Stats_joueur s=new Stats_joueur();
        Arbitre arb=new Arbitre('M');
        Joueur_Homme a=new Joueur_Homme('M',1);
        Joueur_Homme b=new Joueur_Homme('M',1);
        Match e=new Match(a,b,arb,'M');
        e.vainqueur_match(true, true);
    }
    
}
