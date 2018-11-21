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
public class Stats {
    int aces;
    int sets;
    int jeux;
    int points;
    int premier_serv;
    int deuxieme_serv;
    int double_faute;
    int services;
    int balle_break;
    int balle_break_gagnee;
    
    Match z;
    public Stats(){
        this.aces=0;
        this.sets=0;
        this.jeux=0;
        this.points=0;
        this.premier_serv=0;
        this.deuxieme_serv=0;
        this.services=0;
        this.double_faute=0;
        this.balle_break=0;
        this.balle_break_gagnee=0;
    }
    public void afficher_stats_match(Match match){
        System.out.println("Joueurs : "+match.joueur1.nom_Prenom()+" <--> "+match.joueur2.nom_Prenom());
        System.out.println("Sets : "+match.joueur1.stats.sets+" <--> "+match.joueur2.stats.sets);
        System.out.println("Jeux gagnés : "+match.joueur1.stats.jeux+" <--> "+match.joueur2.stats.jeux);
        System.out.println("Points gagnés : "+match.joueur1.stats.points+" <--> "+match.joueur2.stats.points);
        System.out.println("Aces : "+match.joueur1.stats.aces+" <--> "+match.joueur2.stats.aces);
        System.out.println("Doubles fautes : "+match.joueur1.stats.double_faute+" <--> "+match.joueur2.stats.double_faute);
        System.out.println("Premier services : "+match.joueur1.stats.premier_serv+" <--> "+match.joueur2.stats.premier_serv);
        System.out.println("Deuxiemes services : "+match.joueur1.stats.deuxieme_serv+" <--> "+match.joueur2.stats.deuxieme_serv);
        System.out.println("Balles de breaks : "+match.joueur1.stats.balle_break_gagnee+"/"+match.joueur1.stats.balle_break+" <--> "+match.joueur1.stats.balle_break_gagnee+"/"+match.joueur2.stats.balle_break);
        
    }
}
