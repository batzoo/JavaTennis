/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;
import java.util.Calendar;

/**
 *
 * @author Baptiste Delpierre/Giovanni Haddadi
 */
public class DateTennis {
    
    protected int jour;
    protected int mois;
    protected int annee;
    /**
     * Constructor pour date précise
     * @param jour jour de la dage
     * @param mois mois de la date
     * @param annee année de la date
     */
    public DateTennis(int jour,int mois,int annee){
        this.jour=jour;
        this.mois=mois;
        this.annee=annee;
    }
    /**
     * Constructor avec date 0/0/0
     */
    public DateTennis(){
        this.jour=0;
        this.mois=0;
        this.annee=0;
    }
    /** 
     * Accessors  
     */
    public int getJour(){
        return this.jour;
    }
    public int getMois(){
        return this.mois;
    }
    public int getAnnee(){
        return this.annee;
    }
    /**
     * Affiche la date
     */
    public void afficherDate(){
        System.out.println(this.getJour()+"/"+this.getMois()+"/"+this.getAnnee());
    }
    
    /**
     * 
     * @return Une date de naissance au hasard
     * entre 1983 et 2000 (18 à 35 ans)
     */
    public DateTennis date_naissance_hasard(){
        this.annee=(int) (Math.random() * 17)+1983;
        this.mois=(int) (Math.random() * 11)+1;
        if(this.mois==2){
            this.jour=(int) (Math.random() * 27)+1;
        }
        else{
            this.jour=(int) (Math.random() * 30)+1;
        }
        return this;
    }
    /**
     * 
     * @return Une date de décès au hasard
     */
     public DateTennis dateDeces(){
        Calendar dateOrdi = Calendar.getInstance();
        this.annee = (int)( Math.random() *((dateOrdi.get(Calendar.YEAR))-date_naissance_hasard().annee) ) + date_naissance_hasard().annee;
        this.mois = (int)(Math.random()*11)+1;
        this.jour = (int)(Math.random()*30)+1;
        return this;
    }
}
