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
    // Jeux du joueur 1
    int jeuxJ1;
    // Jeux du joueur 2
    int jeuxJ2;
    //Constructor : mets les jeux à 0
    public Set(){
        this.jeuxJ1=0;
        this.jeuxJ2=0;
    }
    /**
     * 
     * @param j1 Joueur 1 du match
     * @param j2 Joueur 2 du match
     * @return Vainqueur du set final
     */
    public Joueur vainqueur_set_final(Joueur j1,Joueur j2){
       this.jeuxJ1=0;
       this.jeuxJ2=0;
       Joueur c;
       while((this.jeuxJ1<6&&this.jeuxJ2<6)||abs(this.jeuxJ1-this.jeuxJ2)<2){
           c=vainqueur_jeu(j1,j2);
           if(c==j1){
               this.jeuxJ1++;
           }
           else if(c==j2){
               this.jeuxJ2++;
           }
           System.out.println(this.jeuxJ1+"/"+this.jeuxJ2);
       }
       if(this.jeuxJ2<this.jeuxJ1){
           
           System.out.println("SET JOUEUR 1");
           return j1;
       }
       else{
           System.out.println("SET JOUEUR 2");
           return j2;
       }
    
    } 
    
    /** 
     * 
     * @param j1 Joueur 1 du match
     * @param j2 Joueur 2 du match
     * @return le vainqueur du set (appelle vainqueur_jeu de la classe Jeu)
     */
    
   public Joueur vainqueur_set(Joueur j1,Joueur j2){
       //Joueur tampon
       Joueur a;
       //Tant que les joueurs n'ont pas atteint 6 jeux,
       //Et tant qu'il n'y a pas 5-5
       //On continue d'appeler la fonction vainqueur_jeu
       while(this.jeuxJ1<6 &&this.jeuxJ2<6&&!(this.jeuxJ1==5&&this.jeuxJ2==5)){ 
           System.out.println("Jeux : "+this.jeuxJ1+" "+this.jeuxJ2);
           a=vainqueur_jeu(j1,j2);
           if(a==j1){
               this.jeuxJ1++;
            }
           else if (a==j2){
               this.jeuxJ2++;
            }
        }
        //System.out.println(this.jeuxJ1+" "+this.jeuxJ2);
        //Vérification des conditions de victoire
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
        //en cas de 5-5, on appella fonction jeux_decart_H
       else{
           return jeux_decart(j1,j2);
       }
    }
   
   /**
    * 
    * @return le vainqueur du set en cas de 5/5
    */
   public Joueur jeux_decart(Joueur j1,Joueur j2){
       Joueur a;
       //tant que les joueurs n'ont pas atteint 7 jeux ou qu'il n'y a pas 6-6
       //On appelle la fonction vainqueur_jeu 
       while(this.jeuxJ1<7&&this.jeuxJ2<7&&!(this.jeuxJ1==6&&this.jeuxJ2==6)){
           a=vainqueur_jeu(j1,j2);
           if(a==j1){
               this.jeuxJ1++;
       }
           else if (a==j2){
               this.jeuxJ2++;
       }
       }
       //Vérification des conditions de victoire
       if(this.jeuxJ1==7){
           System.out.println("SET JOUEUR 1");
           this.jeuxJ1=0;
           this.jeuxJ2=0;
           return j1;
       }
       else if(this.jeuxJ2==7){
           System.out.println("SET JOUEUR 2");
           this.jeuxJ1=0;
           this.jeuxJ2=0;
           return j2;
       }
       //En cas de 6-6 on appelle la fonction donnatn le gagnat du jeu décisif : tiebreak
       else{
           this.jeuxJ1=0;
           this.jeuxJ2=0;
           a=tiebreak(j1,j2);
           return a;
       }

   }
   
  
   /** 
    * 
    * @return le vainqueur du tiebreak en cas de 6-6
    */
   public Joueur tiebreak(Joueur j1,Joueur j2){
       int a=0;
       int b=0;
       Joueur c;
       while((a<7&&b<7)||abs(a-b)<2){
           c=vainqueur_point(j1,j2);
           if(c==j1){
               a++;
           }
           else if(c==j2){
               b++;
           }
           System.out.println("TieBreak : "+a+"/"+b);
       }
       if(b<a){
           
           System.out.println("SET JOUEUR 1");
           return j1;
       }
       else{
           System.out.println("SET JOUEUR 2");
           return j2;
       }
    }
    
}
