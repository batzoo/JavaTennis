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
public class Date {
    private int jour;
    private int mois;
    private int annee;
    public Date(int jour,int mois,int annee){
        this.jour=jour;
        this.mois=mois;
        this.annee=annee;
    }
    public int getJour(){
        return this.jour;
    }
    public int getMois(){
        return this.mois;
    }
    public int getAnnee(){
        return this.annee;
    }
    public void afficherDate(){
        System.out.println(this.getJour()+"/"+this.getMois()+"/"+this.getAnnee());
    }
}
