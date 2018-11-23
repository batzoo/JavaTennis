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
public class Stats_joueur {
    protected int aces;
    protected int sets;
    protected int jeux;
    protected int points;
    protected int premier_serv;
    protected int deuxieme_serv;
    protected int double_faute;
    protected int services;
    protected int balle_break;
    protected int balle_break_gagnee;
    
    public Match z;
    public Stats_joueur(){
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

    
    public int getAces(){
        return aces;
        
    }

    public int getSets() {
        return sets;
    }

    public int getJeux() {
        return jeux;
    }

    public int getPoints() {
        return points;
    }

    public int getPremier_serv() {
        return premier_serv;
    }

    public int getDeuxieme_serv() {
        return deuxieme_serv;
    }

    public int getDouble_faute() {
        return double_faute;
    }

    public int getServices() {
        return services;
    }

    public int getBalle_break() {
        return balle_break;
    }

    public void setAces(int aces) {
        this.aces = aces;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public void setJeux(int jeux) {
        this.jeux = jeux;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setPremier_serv(int premier_serv) {
        this.premier_serv = premier_serv;
    }

    public void setDeuxieme_serv(int deuxieme_serv) {
        this.deuxieme_serv = deuxieme_serv;
    }

    public void setDouble_faute(int double_faute) {
        this.double_faute = double_faute;
    }

    public void setServices(int services) {
        this.services = services;
    }

    public void setBalle_break(int balle_break) {
        this.balle_break = balle_break;
    }

    public void setBalle_break_gagnee(int balle_break_gagnee) {
        this.balle_break_gagnee = balle_break_gagnee;
    }
    
    /**
     * Fonction affichant les stats du match
     * @param match Match en cours
     */
    public int getBalle_break_gagnee() {
        return balle_break_gagnee;
    }

    public void afficher_stats_match(Match match) {
        System.out.println("Joueurs : "+match.getJoueur1().nom_Prenom()+" <--> "+match.getJoueur2().nom_Prenom());
        System.out.println("Sets : "+match.getJoueur1().stats.sets+" <--> "+match.getJoueur2().stats.sets);
        System.out.println("Jeux gagnés : "+match.getJoueur1().stats.jeux+" <--> "+match.getJoueur2().stats.jeux);
        System.out.println("Points gagnés : "+match.getJoueur1().stats.points+" <--> "+match.getJoueur2().stats.points);
        System.out.println("Aces : "+match.getJoueur1().stats.aces+" <--> "+match.getJoueur2().stats.aces);
        System.out.println("Doubles fautes : "+match.getJoueur1().stats.double_faute+" <--> "+match.getJoueur2().stats.double_faute);
        System.out.println("Premier services : "+match.getJoueur1().stats.premier_serv+" <--> "+match.getJoueur2().stats.premier_serv);
        System.out.println("Deuxiemes services : "+match.getJoueur1().stats.deuxieme_serv+" <--> "+match.getJoueur2().stats.deuxieme_serv);
        System.out.println("Balles de breaks : "+match.getJoueur1().stats.balle_break_gagnee+"/"+match.getJoueur1().stats.balle_break+" <--> "+match.getJoueur2().stats.balle_break_gagnee+"/"+match.getJoueur2().stats.balle_break);
    }
}
