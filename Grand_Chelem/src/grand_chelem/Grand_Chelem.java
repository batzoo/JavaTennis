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
        Tournoi rolandGarros=new Tournoi();
        rolandGarros.premierTourHommes();
        rolandGarros.deuxiemeTourHommes();
        rolandGarros.troisiemeTourHommes();
        rolandGarros.huitiemesHommes();
        rolandGarros.quartsHommes();
        rolandGarros.demisHommes();
        rolandGarros.finale();
    }
    
}
