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
public class Jeu extends Echange {
    int ptsJ1;
    int ptsJ2;
    public Jeu(){
        this.ptsJ1=0;
        this.ptsJ2=0;
    }
    public int vainqueur_jeu(){
        int a;
       while(this.ptsJ1<4&&this.ptsJ2<4){
           a=vainqueur_point();
           if(a==1){
               this.ptsJ1++;
           }
           else if (a==2){
               this.ptsJ2++;
           }
          
           System.out.println("Pts : "+score(this.ptsJ1)+"/"+score(this.ptsJ2));
       }
       if(this.ptsJ1==4){
           this.ptsJ1=0;
           this.ptsJ2=0;
           return 1;
       }
       else{
           this.ptsJ1=0;
           this.ptsJ2=0;
           return 2;
       }
    }
   public int score(int score){
       switch (score){
           case 1:
               return 15;
           case 2:
               return 30;
           case 3: 
               return 40;
           default:
               return 0;
       }
              
   }
}
