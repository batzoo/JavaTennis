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
    ArrayList<Joueur> premier_tour_H;  
    ArrayList<Joueur> deuxieme_tour_H;
    ArrayList<Joueur> troisieme_tour_H;
    ArrayList<Joueur> huitieme_de_finale_H;
    ArrayList<Joueur> quart_de_finale_H;
    ArrayList<Joueur> demi_finale_H;
    ArrayList<Joueur> finale_H;
    Joueur vainqueur_H;
    String lieuTournoi;
    String surface;
    
    public Tournoi_H(char genre) {
        //Joueur tampon
        if(genre=='M'){
            Joueur_Homme a;
            this.premier_tour_H = new ArrayList<>();
            for(int i=1;i<129;i++){
                a=new Joueur_Homme('M',i);
                this.premier_tour_H.add(a);
            }     
            this.deuxieme_tour_H=new ArrayList<>();       
            this.troisieme_tour_H=new ArrayList<>();   
            this.huitieme_de_finale_H= new ArrayList<>();   
            this.quart_de_finale_H= new ArrayList<>();   
            this.demi_finale_H= new ArrayList<>();   
            this.finale_H=new ArrayList<>();   
        }
        else if(genre=='F'){
            Joueur_Femme a;
            this.premier_tour_H = new ArrayList<>();
            for(int i=1;i<129;i++){
                a=new Joueur_Femme('F',i);
                this.premier_tour_H.add(a);
            }     
            this.deuxieme_tour_H=new ArrayList<>();       
            this.troisieme_tour_H=new ArrayList<>();   
            this.huitieme_de_finale_H= new ArrayList<>();   
            this.quart_de_finale_H= new ArrayList<>();   
            this.demi_finale_H= new ArrayList<>();   
            this.finale_H=new ArrayList<>();   
        }
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
    public void premierTourHommes(){
        for(int i=0;i<128;i=i+2){
            System.out.println("i= "+i);
            this.matchs=new Match(this.premier_tour_H.get(i),this.premier_tour_H.get(i+1),arb,'M');
            this.deuxieme_tour_H.add(this.matchs.vainqueur_match(this.matchs.joueur1,this.matchs.joueur2));
        }
        System.out.println("Sont qualifiés au 2e tour : ");
        for (int i=0;i<64;i++){
            System.out.println(this.deuxieme_tour_H.get(i).prenom+" "+this.deuxieme_tour_H.get(i).nomNaissance);
        }
    }
    public void deuxiemeTourHommes(){
        for(int i=0;i<64;i=i+2){
            this.matchs=new Match(this.deuxieme_tour_H.get(i),this.deuxieme_tour_H.get(i+1),arb,'M');
            this.troisieme_tour_H.add(this.matchs.vainqueur_match(this.matchs.joueur1,this.matchs.joueur2));
        }
        System.out.println("Sont qualifiés au 3e tour : ");
        for (int i=0;i<32;i++){
            System.out.println(this.troisieme_tour_H.get(i).prenom+" "+this.troisieme_tour_H.get(i).nomNaissance);
        }
    }
    public void troisiemeTourHommes(){
        for(int i=0;i<32;i=i+2){
            this.matchs=new Match(this.troisieme_tour_H.get(i),this.troisieme_tour_H.get(i+1),arb,'M');
            this.huitieme_de_finale_H.add(this.matchs.vainqueur_match(this.matchs.joueur1,this.matchs.joueur2));
        }
        System.out.println("Sont qualifiés en 8e de finale : ");
        for (int i=0;i<16;i++){
            System.out.println(this.huitieme_de_finale_H.get(i).prenom+" "+this.huitieme_de_finale_H.get(i).nomNaissance);
        }
    }
    public void huitiemesHommes(){
        for(int i=0;i<16;i=i+2){
            this.matchs=new Match(this.huitieme_de_finale_H.get(i),this.huitieme_de_finale_H.get(i+1),arb,'M');
            this.quart_de_finale_H.add(this.matchs.vainqueur_match(this.matchs.joueur1,this.matchs.joueur2));
        }
        System.out.println("Sont qualifiés en 1/4 de finale : ");
        for (int i=0;i<8;i++){
            System.out.println(this.quart_de_finale_H.get(i).prenom+" "+this.quart_de_finale_H.get(i).nomNaissance);
        }
    }
    public void quartsHommes(){
        for(int i=0;i<8;i=i+2){
            this.matchs=new Match(this.quart_de_finale_H.get(i),this.quart_de_finale_H.get(i+1),arb,'M');
            this.demi_finale_H.add(this.matchs.vainqueur_match(this.matchs.joueur1,this.matchs.joueur2));
        }
        System.out.println("Sont qualifiés en demi-finale : ");
        for (int i=0;i<4;i++){
            System.out.println(this.demi_finale_H.get(i).prenom+" "+this.demi_finale_H.get(i).nomNaissance);
        }
    }
    public void demisHommes(){
        for(int i=0;i<4;i=i+2){
            this.matchs=new Match(this.demi_finale_H.get(i),this.demi_finale_H.get(i+1),arb,'M');
            this.finale_H.add(this.matchs.vainqueur_match(this.matchs.joueur1,this.matchs.joueur2));
        }
        System.out.println("Sont qualifiés en  finale : ");
        for (int i=0;i<2;i++){
            System.out.println(this.finale_H.get(i).prenom+" "+this.finale_H.get(i).nomNaissance);
        }
    }
    public void finale(){
            this.matchs=new Match(this.finale_H.get(0),this.finale_H.get(1),arb,'M');
            this.vainqueur_H=this.matchs.vainqueur_match(this.matchs.joueur1,this.matchs.joueur2);
        
        System.out.println("Le vainqueur du tournoi de "+this.lieuTournoi+" est : "+this.vainqueur_H.nom_Prenom());
    }
    public void tournoi_hommes(){
        this.premierTourHommes();
        this.deuxiemeTourHommes();
        this.troisiemeTourHommes();
        this.huitiemesHommes();
        this.quartsHommes();
        this.demisHommes();
        this.finale();
        
    }
}
