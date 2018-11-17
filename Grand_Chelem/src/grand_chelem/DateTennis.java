/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;

/**
 *
<<<<<<< HEAD:Grand_Chelem/src/grand_chelem/DateTennis.java
 * @author ISEN
 */
public class DateTennis {
    protected int jour;
    protected int mois;
    protected int annee;
    
    public DateTennis(int jour,int mois,int annee){
=======
 * @author Baptiste Delpierre/Giovanni Haddadi
 */
public class Date {
    private int jour;
    private int mois;
    private int annee;
    public Date(int jour,int mois,int annee){
>>>>>>> osef:Grand_Chelem/src/grand_chelem/Date.java
        this.jour=jour;
        this.mois=mois;
        this.annee=annee;
    }
<<<<<<< HEAD:Grand_Chelem/src/grand_chelem/DateTennis.java
=======
    public Date(){
        this.jour=0;
        this.mois=0;
        this.annee=0;
    }
    /** 
     * Accessors  
     */
>>>>>>> osef:Grand_Chelem/src/grand_chelem/Date.java
    public int getJour(){
        return this.jour;
    }
    public int getMois(){
        return this.mois;
    }
    public int getAnnee(){
        return this.annee;
    }
<<<<<<< HEAD:Grand_Chelem/src/grand_chelem/DateTennis.java
    public void afficherDate(){
        System.out.print(this.getJour()+"/"+this.getMois()+"/"+this.getAnnee());
=======
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
    public Date date_naissance_hasard(){
        this.annee=(int) (Math.random() * 17)+1983;
        this.mois=(int) (Math.random() * 11)+1;
        if(this.mois==2){
            this.jour=(int) (Math.random() * 27)+1;
        }
        else{
            this.jour=(int) (Math.random() * 30)+1;
        }
        return this;
>>>>>>> osef:Grand_Chelem/src/grand_chelem/Date.java
    }
}
