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
public class Set extends Jeu {
    int jeuxJ1;
    int jeuxJ2;
    public Set(){
        this.jeuxJ1=0;
        this.jeuxJ2=0;
    }
   public int vainqueur_set(Joueur j1,Joueur j2){
        int a;
       while(this.jeuxJ1<6 &&this.jeuxJ2<6&&!(this.jeuxJ1==5&&this.jeuxJ2==5)){ 
           System.out.println("Jeux : "+this.jeuxJ1+" "+this.jeuxJ2);
           a=vainqueur_jeu(j1,j2);
           
       if(a==1){
           this.jeuxJ1++;
       }
       else if (a==2){
           this.jeuxJ2++;
       }
       }
       System.out.println(this.jeuxJ1+" "+this.jeuxJ2);
       if(this.jeuxJ1==6){
           System.out.println("SET JOUEUR 1");
           this.jeuxJ1=0;
           this.jeuxJ2=0;
           return 1;
       }
       else {
           System.out.println("SET JOUEUR 2");
           this.jeuxJ1=0;
           this.jeuxJ2=0;
           return 2;
       }
       
    }
}
