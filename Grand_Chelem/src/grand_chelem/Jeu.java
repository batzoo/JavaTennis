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
    /** 
     * @param ptsJ1 le nombre de points du Joueur 1 pendant le jeu
     * @param ptsJ2 le nombre de points du Joueur 2 pendant le jeu
     */
    int ptsJ1;
    int ptsJ2;
    public Jeu(){
        this.ptsJ1=0;
        this.ptsJ2=0;
    }
    /** 
     * @param j1 Joueur 1 du match (Serveur)
     * @param j2 Joueur 2 du match (Retour)
     * @return Vainqueur du jeu, utilise la fonction vainqueur_point_auto 
     */
    public Joueur vainqueur_jeu(Joueur j1,Joueur j2,boolean auto,boolean affich) {
        Joueur a;
       while(this.ptsJ1<4&&this.ptsJ2<4&&!(this.ptsJ1==3&&this.ptsJ2==3)){
           if(affich){
               System.out.println("Points : "+score(this.ptsJ1)+"/"+score(this.ptsJ2));
           }
           if(auto){
                a=vainqueur_point_auto(j1,j2);
           }
           else{
                a=vainqueur_point_manuel(j1,j2);
           }
           if(this.ptsJ2==3){
               j2.stats.balle_break++;
           }
           if(a==j1){
               j1.stats.points++;
               this.ptsJ1++;
           }
           else if (a==j2){
               j2.stats.points++;
               this.ptsJ2++;
           }
          
       }
       if(this.ptsJ1==4){
           this.ptsJ1=0;
           this.ptsJ2=0;
           return j1;
       }
       else if(this.ptsJ2==4){
           this.ptsJ1=0;
           this.ptsJ2=0;
           j2.stats.balle_break_gagnee++;
           return j2;
       }
       else{
           return avantage(j1,j2,auto,affich);
       }
       

    }
    
    
   
   /** 
    * 
    * @param j1
    * @param j2
    * @return le vainqueur du jeu en cas d'égalité 
    */
   public Joueur avantage(Joueur j1,Joueur j2,boolean auto,boolean affich) {
       //System.out.println("AVANTAGE");
       Joueur a;
       String av="AV";
       while(this.ptsJ1<5&&this.ptsJ2<5&&!(this.ptsJ1==4&&this.ptsJ2==4)){
           if(affich){
               
               if(this.ptsJ1==4){
                   System.out.println("Points : "+av+"/"+score(this.ptsJ2));
               }
               else if(this.ptsJ2==4){
                    System.out.println("Points : "+score(this.ptsJ1)+"/"+av);
               }
               else{
                   System.out.println("Points : "+score(this.ptsJ1)+"/"+score(this.ptsJ2));
               }
           }
           if(auto){
                a=vainqueur_point_auto(j1,j2);
           }
           else{
               a=vainqueur_point_manuel(j1,j2);
           }
           if(a==j1){
               j1.stats.points++;
               this.ptsJ1++;
           }
           else{
               j2.stats.points++;
               this.ptsJ2++;
           }
           //System.out.println(score(this.ptsJ1)+"/"+score(this.ptsJ2));
           }
        
           if(this.ptsJ1==5){
               this.ptsJ1=0;
               this.ptsJ2=0;
               return j1;
           }
           else if(this.ptsJ2==5){
               this.ptsJ1=0;
               this.ptsJ2=0;
               j2.stats.balle_break_gagnee++;
               return j2;
       }
           else{
               this.ptsJ1--;
               this.ptsJ2--;
               return avantage(j1,j2,auto,affich);
           }
   } 
   
   /**
     * 
     * @param score Score actuel du jeu (0,1,2,3,4)
     * @return le score actuel au "format tennis" (0,15,30,40)
     */
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
