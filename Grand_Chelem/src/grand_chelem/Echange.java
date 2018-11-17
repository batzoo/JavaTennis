/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;

/**
 *
 * @author Baptiste Delpierre/Giovanni Haddadi
 */
public class Echange {
    /**
     * @param proba variable tampon servant à déterminer s'il y a faute ou non
     * @param faute variable boolean : true s'il y af aute, et false s'il n'y a pas faute
     * @param coup numéro du coup dans l'échange 
     */
    double proba;
    boolean faute;
    int coup;
    public Echange(){
        this.faute=false;
        this.coup=0;
        this.proba=0;
    }
    /** 
     * 
     * @return un boolean indiquant s'il y a faute
     */
    public boolean faute(){ 
        
        this.proba=Math.random() ;
        return this.proba <= 0.1;
        
    }
    /**
     * 
     * @param j1 Joueur 1 du match 
     * @param j2 Joueur 2 du match
     * @return vainqueur du point simulé
     */
    public Joueur_Homme vainqueur_point_H(Joueur_Homme j1,Joueur_Homme j2){
        this.faute=faute();
        if (this.faute){
            this.faute=false;
            
        this.faute=faute();
        if (this.faute){
            return j2;
        }
        }
            while(!this.faute){
                this.coup++;
                
                //System.out.println(this.coup);
                this.faute=faute();
                }
            if(this.coup%2==0){
                this.coup=0;
                this.faute=false;
                return j1;
            }
            else{
                this.coup=0;
                this.faute=false;
                return j2;
            }
        }
    }
