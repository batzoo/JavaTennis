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
public class Tournoi {
    //Objet qui va permettre de simuler les matchs
    Match matchs;
    Arbitre arb=new Arbitre('M');
    String lieuTournoi;
    String surface; 
    /**
     * 
     * @return un lieu random entre les 4 lieux des tournois 
     * du grand Chelem 
     */
    public String lieuT_random(){
        String lieuxT[]={"Paris","Londres","Melbourne","New York"};
        return lieuxT[(int)(Math.random()*4)];
    }
    /**
     * 
     * @param lieu lieu du tournoi
     * @return la surface ne fonction du lieu du tournoi
     */
    public String surface_terrain(String lieu){
        if(lieu=="Paris"){
            return "Terre battue";
        }
        else if(lieu=="Londres"){
            return "Gazon";
        }
        else if(lieu=="Melbourne"){
            return "Plexicusion";
        }
        else{
            return "Decoturf";
        }
    }
}
