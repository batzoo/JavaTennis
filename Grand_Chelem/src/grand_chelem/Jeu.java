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
    int c=0;
    public Jeu(){
        this.ptsJ1=0;
        this.ptsJ2=0;
    }
    public int vainqueur_jeu(Joueur j1,Joueur j2){
        Joueur a;
       while(this.ptsJ1<4&&this.ptsJ2<4&&!(this.ptsJ1==3&&this.ptsJ2==3)){
           a=vainqueur_point(j1,j2);
           if(a==j1){
               this.ptsJ1++;
           }
           else if (a==j2){
               this.ptsJ2++;
           }
          
           System.out.println("Pts : "+score(this.ptsJ1)+"/"+score(this.ptsJ2));
       }
       if(this.ptsJ1==4){
           this.ptsJ1=0;
           this.ptsJ2=0;
           return 1;
       }
       else {
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
   public int avantage(Joueur j1,Joueur j2){
      
       Joueur a;
       while(this.ptsJ1<5&&this.ptsJ2<5&&!(this.ptsJ1==4&&this.ptsJ2==4)){
           a=vainqueur_point(j1,j2);
           if(a==j1){
               this.ptsJ1++;
           }
           else{
              this.ptsJ2++;
           }
           System.out.println(score(this.ptsJ1)+"/"+score(this.ptsJ2));
           }
        if(this.ptsJ1==4&&this.ptsJ2==4){
               this.ptsJ1--;
               this.ptsJ2--;
               return 0;
           }
           else if(this.ptsJ1==5){
               return 1;
           }
           else{
               return 2;
       }
   }
}
