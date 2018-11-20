package grand_chelem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISEN
 */
public class Stats_match {
    int acesJ1;
    int setsJ1;
    int jeuxJ1;
    int pointsJ1;
    int premier_servJ1;
    int deuxieme_servJ1;
    int double_fauteJ1;
    int servicesJ1;
    int balle_breakJ1;
    int balle_break_gagneeJ1;
    int acesJ2;
    int setsJ2;
    int jeuxJ2;
    int pointsJ2;
    int premier_servJ2;
    int deuxieme_servJ2;
    int double_fauteJ2;
    int servicesJ2;
    int balle_breakJ2;
    int balle_break_gagneeJ2;
    Match z;
    public Stats_match(){
        this.acesJ1=0;
        this.setsJ1=0;
        this.jeuxJ1=0;
        this.pointsJ1=0;
        this.premier_servJ1=0;
        this.deuxieme_servJ1=0;
        this.servicesJ1=0;
        this.double_fauteJ1=0;
        this.balle_breakJ1=0;
        this.balle_break_gagneeJ1=0;
        this.acesJ2=0;
        this.setsJ2=0;
        this.jeuxJ2=0;
        this.pointsJ2=0;
        this.premier_servJ2=0;
        this.deuxieme_servJ2=0;
        this.double_fauteJ2=0;
        this.servicesJ2=0;
        this.balle_breakJ2=0;
        this.balle_break_gagneeJ2=0;
    }
    public void afficher_stats_match(Match match){
        System.out.println("Joueurs : "+match.joueur1.nom_Prenom()+" <--> "+match.joueur2.nom_Prenom());
        System.out.println("Sets : "+this.setsJ1+" <--> "+this.setsJ2);
        System.out.println("Jeux gagnés : "+this.jeuxJ1+" <--> "+this.jeuxJ2);
        System.out.println("Points gagnés : "+this.pointsJ1+" <--> "+this.pointsJ2);
        System.out.println("Aces : "+this.acesJ1+" <--> "+this.acesJ2);
        System.out.println("Doubles fautes : "+this.double_fauteJ1+" <--> "+this.double_fauteJ2);
        System.out.println("Premier services : "+this.premier_servJ1+" <--> "+this.premier_servJ2);
        System.out.println("Deuxiemes services : "+this.deuxieme_servJ1+" <--> "+this.deuxieme_servJ2);
        System.out.println("Balles de breaks : "+this.balle_break_gagneeJ1+"/"+this.balle_breakJ1+" <--> "+this.balle_break_gagneeJ2+"/"+this.balle_breakJ2);
        
    }
}
