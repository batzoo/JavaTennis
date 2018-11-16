/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;

import static java.lang.Math.abs;

/**
 *
 * @author Baptiste Delpierre/Giovanni Haddadi
 */
public class Set extends Jeu {
    int jeuxJ1;
    int jeuxJ2;
    public Set(){
        this.jeuxJ1=0;
        this.jeuxJ2=0;
    }
    /** 
     * 
     * @param j1 Joueur 1 du match
     * @param j2 Joueur 2 du match
     * @return le vainqueur du set (appelle vainqueur_jeu de la classe Jeu)
     */
   public Joueur_Homme vainqueur_set_H(Joueur_Homme j1,Joueur_Homme j2){
       Joueur_Homme a;
       while(this.jeuxJ1<6 &&this.jeuxJ2<6&&!(this.jeuxJ1==5&&this.jeuxJ2==5)){ 
           System.out.println("Jeux : "+this.jeuxJ1+" "+this.jeuxJ2);
           a=vainqueur_jeu_H(j1,j2);
       
           if(a==j1){
               this.jeuxJ1++;
       }
           else if (a==j2){
               this.jeuxJ2++;
       }
       }
       System.out.println(this.jeuxJ1+" "+this.jeuxJ2);
       if(this.jeuxJ1==6){
           System.out.println("SET JOUEUR 1");
           this.jeuxJ1=0;
           this.jeuxJ2=0;
           return j1;
       }
       else if(this.jeuxJ2==6){
           System.out.println("SET JOUEUR 2");
           this.jeuxJ1=0;
           this.jeuxJ2=0;
           return j2;
       }
       else{
           return jeux_decart_H(j1,j2);
       }
    }
   /**
    * 
    * @return le vainqueur du set en cas de 5/5
    */
   public Joueur_Homme jeux_decart_H(Joueur_Homme j1,Joueur_Homme j2){
       Joueur_Homme a;
       while(this.jeuxJ1<7&&this.jeuxJ2<7&&!(this.jeuxJ1==6&&this.jeuxJ2==6)){
           a=vainqueur_jeu_H(j1,j2);
           if(a==j1){
               this.jeuxJ1++;
       }
           else if (a==j2){
               this.jeuxJ2++;
       }
       }
       if(this.jeuxJ1==7){
           this.jeuxJ1=0;
           this.jeuxJ2=0;
           return j1;
       }
       else if(this.jeuxJ2==7){
           this.jeuxJ1=0;
           this.jeuxJ2=0;
           return j2;
       }
       else{
           this.jeuxJ1=0;
           this.jeuxJ2=0;
           return tiebreak(j1,j2);
       }
       
   }
   /** 
    * 
    * @return le vainqueur du tiebreak en cas de 6-6
    */
   public Joueur_Homme tiebreak(Joueur_Homme j1,Joueur_Homme j2){
       int a=0;
       int b=0;
       Joueur_Homme c;
       while((a<7&&b<7)||abs(a-b)<2){
           c=vainqueur_point_H(j1,j2);
           if(c==j1){
               a++;
           }
           else if(c==j2){
               b++;
           }
           System.out.println("TieBreak : "+a+"/"+b);
       }
       if(b<a){
           return j1;
       }
       else{
           return j2;
       }
    }
}
