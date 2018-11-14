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
public class Echange {
    double proba;
    boolean faute;
    int coup;
    public Echange(){
        this.faute=false;
        this.coup=0;
        this.proba=0;
    }
    
    public boolean faute(){ 
        
        this.proba=Math.random() ;
        return this.proba <= 0.1;
        
    }

    public Joueur vainqueur_point(Joueur j1,Joueur j2){
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
