/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;

import java.util.Scanner;
import grand_chelem.Tournoi;
import static grand_chelem.Tournoi.jeu;
/**
 *
 * @author ISEN
 */
public class Grand_Chelem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        //Joueur c=new Joueur(sc);
        Joueur_Homme a=new Joueur_Homme('M',1);
        Joueur_Homme b=new Joueur_Homme('M',1);
        jeu(sc);
    }
    
}
