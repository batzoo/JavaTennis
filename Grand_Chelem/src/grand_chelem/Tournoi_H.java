/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;

import java.util.ArrayList;

/**
 *
 * @author Baptiste Delpierre/Giovanni Haddadi
 */
public class Tournoi_H {
    /*
    Toutes les listes correspondent aux différents tours
    premier_tour contiendra 128 joueurs, deuxieme_tour 64, etc...
    */
    Match matchs;
    Arbitre arb=new Arbitre('M');
    ArrayList<Joueur> premier_tour;  
    ArrayList<Joueur> deuxieme_tour;
    ArrayList<Joueur> troisieme_tour;
    ArrayList<Joueur> huitieme_de_finale;
    ArrayList<Joueur> quart_de_finale;
    ArrayList<Joueur> demi_finale;
    ArrayList<Joueur> finale;
    Joueur vainqueur;
    String lieuTournoi;
    String surface;
    
    public Tournoi_H(char genre) {
        //Joueur tampon
        if(genre=='M'){
            Joueur_Homme a;
            this.premier_tour = new ArrayList<>();
            for(int i=1;i<129;i++){
                a=new Joueur_Homme('M',i);
                this.premier_tour.add(a);
            }     
             
        }
        else if(genre=='F'){
            Joueur_Femme a;
            this.premier_tour = new ArrayList<>();
            for(int i=1;i<129;i++){
                a=new Joueur_Femme('F',i);
                this.premier_tour.add(a);
            }     
        }
        this.deuxieme_tour=new ArrayList<>();       
        this.troisieme_tour=new ArrayList<>();   
        this.huitieme_de_finale= new ArrayList<>();   
        this.quart_de_finale= new ArrayList<>();   
        this.demi_finale= new ArrayList<>();   
        this.finale=new ArrayList<>();  
        this.lieuTournoi=lieuT_random();
        this.surface=surface_terrain(this.lieuTournoi);
    }
    public String lieuT_random(){
        String lieuxT[]={"Paris","Londres","Melbourne","New York"};
        return lieuxT[(int)(Math.random()*4)];
    }
    public String surface_terrain(String lieu){
        if(lieu=="Paris"){
            return "Terre battue";
        }
        else if(lieu=="Londres"){
            return "Gazon";
        }
        else if(lieu=="Melbourne"){
            return "Plexicusion";
        }
        else{
            return "Decoturf";
        }
    }
    public void premierTour(char genre){
        for(int i=0;i<128;i=i+2){
            this.matchs=new Match(this.premier_tour.get(i),this.premier_tour.get(i+1),arb,genre);
            this.deuxieme_tour.add(this.matchs.vainqueur_match());
        }
        System.out.println("Sont qualifiés au 2e tour : ");
        for (int i=0;i<64;i++){
            System.out.println(this.deuxieme_tour.get(i).prenom+" "+this.deuxieme_tour.get(i).nomNaissance);
        }
    }
    public void deuxiemeTour(char genre){
        for(int i=0;i<64;i=i+2){
            this.matchs=new Match(this.deuxieme_tour.get(i),this.deuxieme_tour.get(i+1),arb,genre);
            this.troisieme_tour.add(this.matchs.vainqueur_match());
        }
        System.out.println("Sont qualifiés au 3e tour : ");
        for (int i=0;i<32;i++){
            System.out.println(this.troisieme_tour.get(i).prenom+" "+this.troisieme_tour.get(i).nomNaissance);
        }
    }
    public void troisiemeTour(char genre){
        for(int i=0;i<32;i=i+2){
            this.matchs=new Match(this.troisieme_tour.get(i),this.troisieme_tour.get(i+1),arb,genre);
            this.huitieme_de_finale.add(this.matchs.vainqueur_match());
        }
        System.out.println("Sont qualifiés en 8e de finale : ");
        for (int i=0;i<16;i++){
            System.out.println(this.huitieme_de_finale.get(i).prenom+" "+this.huitieme_de_finale.get(i).nomNaissance);
        }
    }
    public void huitiemes(char genre){
        for(int i=0;i<16;i=i+2){
            this.matchs=new Match(this.huitieme_de_finale.get(i),this.huitieme_de_finale.get(i+1),arb,genre);
            this.quart_de_finale.add(this.matchs.vainqueur_match());
        }
        System.out.println("Sont qualifiés en 1/4 de finale : ");
        for (int i=0;i<8;i++){
            System.out.println(this.quart_de_finale.get(i).prenom+" "+this.quart_de_finale.get(i).nomNaissance);
        }
    }
    public void quarts(char genre){
        for(int i=0;i<8;i=i+2){
            this.matchs=new Match(this.quart_de_finale.get(i),this.quart_de_finale.get(i+1),arb,genre);
            this.demi_finale.add(this.matchs.vainqueur_match());
        }
        System.out.println("Sont qualifiés en demi-finale : ");
        for (int i=0;i<4;i++){
            System.out.println(this.demi_finale.get(i).prenom+" "+this.demi_finale.get(i).nomNaissance);
        }
    }
    public void demies(char genre){
        for(int i=0;i<4;i=i+2){
            this.matchs=new Match(this.demi_finale.get(i),this.demi_finale.get(i+1),arb,genre);
            this.finale.add(this.matchs.vainqueur_match());
        }
        System.out.println("Sont qualifiés en  finale : ");
        for (int i=0;i<2;i++){
            System.out.println(this.finale.get(i).prenom+" "+this.finale.get(i).nomNaissance);
        }
    }
    public void finale(char genre){
            this.matchs=new Match(this.finale.get(0),this.finale.get(1),arb,genre);
            this.vainqueur=this.matchs.vainqueur_match();
        
        System.out.println("Le vainqueur du tournoi de "+this.lieuTournoi+" est : "+this.vainqueur.nom_Prenom());
    }
    public void tournoi_hommes(){
        this.premierTour('M');
        this.deuxiemeTour('M');
        this.troisiemeTour('M');
        this.huitiemes('M');
        this.quarts('M');
        this.demies('M');
        this.finale('M');
        
    }
    public void tournoi_femmes(){
        this.premierTour('F');
        this.deuxiemeTour('F');
        this.troisiemeTour('F');
        this.huitiemes('F');
        this.quarts('F');
        this.demies('F');
        this.finale('F');
        
    }
}
