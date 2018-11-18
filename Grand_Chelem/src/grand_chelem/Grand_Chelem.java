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
        Tournoi_H femme=new Tournoi_H('F');
        Tournoi_H homme=new Tournoi_H('M');
        femme.tournoi_femmes();
        homme.tournoi_hommes();
        
               
    }
    
}
