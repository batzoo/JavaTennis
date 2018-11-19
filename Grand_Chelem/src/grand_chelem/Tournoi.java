/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Baptiste Delpierre/Giovanni Haddadi
 */
public class Tournoi {
    /*
    Toutes les listes correspondent aux différents tours
    premier_tour contiendra 128 joueurs, deuxieme_tour 64, etc...
    */
    Match matchs;
    Arbitre arb=new Arbitre('M');
    //Différentes étapes du tournoi sous forme de liste 
    
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
    
    public Tournoi(char genre) {
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
    /**
     * 
     * @param genre 
     * effectue le premier tour du tournoi (128 joueurs)
     */
    public void premierTour(char genre){
        boolean automan;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<128;i=i+2){
            automan=saisieAuto_Manuel(sc);
            System.out.println("AUTOMAN="+automan);
            this.matchs=new Match(this.premier_tour.get(i),this.premier_tour.get(i+1),arb,genre);
            this.deuxieme_tour.add(this.matchs.vainqueur_match(automan));
        }
        System.out.println("Sont qualifiés au 2e tour : ");
        for (int i=0;i<64;i++){
            System.out.println(this.deuxieme_tour.get(i).prenom+" "+this.deuxieme_tour.get(i).nomNaissance);
        }
    }
    /**
     * 
     * @param genre 
     * effectue le deuxieme tour du tournoi (64 joueurs)
     */
    public void deuxiemeTour(char genre) {
        boolean automan;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<64;i=i+2){
            automan=saisieAuto_Manuel(sc);
            this.matchs=new Match(this.deuxieme_tour.get(i),this.deuxieme_tour.get(i+1),arb,genre);
            this.troisieme_tour.add(this.matchs.vainqueur_match(automan));
        }
        System.out.println("Sont qualifiés au 3e tour : ");
        for (int i=0;i<32;i++){
            System.out.println(this.troisieme_tour.get(i).prenom+" "+this.troisieme_tour.get(i).nomNaissance);
        }
    }
    /**
     * 
     * @param genre 
     * effectue le troisieme tour du tournoi (32 joueurs)
     */
    public void troisiemeTour(char genre){
        boolean automan;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<32;i=i+2){
            automan=saisieAuto_Manuel(sc);
            this.matchs=new Match(this.troisieme_tour.get(i),this.troisieme_tour.get(i+1),arb,genre);
            this.huitieme_de_finale.add(this.matchs.vainqueur_match(automan));
        }
        System.out.println("Sont qualifiés en 8e de finale : ");
        for (int i=0;i<16;i++){
            System.out.println(this.huitieme_de_finale.get(i).prenom+" "+this.huitieme_de_finale.get(i).nomNaissance);
        }
    }
    /**
     * 
     * @param genre 
     * effectue les huitiemes de finale du tournoi (16 joueurs)
     */
    public void huitiemes(char genre){
        boolean automan;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<16;i=i+2){
            automan=saisieAuto_Manuel(sc);
            this.matchs=new Match(this.huitieme_de_finale.get(i),this.huitieme_de_finale.get(i+1),arb,genre);
            this.quart_de_finale.add(this.matchs.vainqueur_match(automan));
        }
        System.out.println("Sont qualifiés en 1/4 de finale : ");
        for (int i=0;i<8;i++){
            System.out.println(this.quart_de_finale.get(i).prenom+" "+this.quart_de_finale.get(i).nomNaissance);
        }
    }
    /**
     * 
     * @param genre 
     * effectue les quarts de finale du tournoi (8 joueurs)
     */
    public void quarts(char genre) {
        boolean automan;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<8;i=i+2){
            automan=saisieAuto_Manuel(sc);
            this.matchs=new Match(this.quart_de_finale.get(i),this.quart_de_finale.get(i+1),arb,genre);
            this.demi_finale.add(this.matchs.vainqueur_match(automan));
        }
        System.out.println("Sont qualifiés en demi-finale : ");
        for (int i=0;i<4;i++){
            System.out.println(this.demi_finale.get(i).prenom+" "+this.demi_finale.get(i).nomNaissance);
        }
    }
    /**
     * 
     * @param genre 
     * effectue les demi-finale du tournoi (4 joueurs)
     */
    public void demies(char genre) {
        boolean automan;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i=i+2){
            automan=saisieAuto_Manuel(sc);
            this.matchs=new Match(this.demi_finale.get(i),this.demi_finale.get(i+1),arb,genre);
            this.finale.add(this.matchs.vainqueur_match(automan));
        }
        System.out.println("Sont qualifiés en  finale : ");
        for (int i=0;i<2;i++){
            System.out.println(this.finale.get(i).prenom+" "+this.finale.get(i).nomNaissance);
        }
    }
    /**
     * 
     * @param genre 
     * effectue la finale du tournoi (2 joueurs)
     */
    public void finale(char genre) {
        boolean automan;
        Scanner sc=new Scanner(System.in);
        automan=saisieAuto_Manuel(sc);
        this.matchs=new Match(this.finale.get(0),this.finale.get(1),arb,genre);
        this.vainqueur=this.matchs.vainqueur_match(automan);
        
        System.out.println("Le vainqueur du tournoi de "+this.lieuTournoi+" est : "+this.vainqueur.nom_Prenom());
    }
    /**
     * Fonction qui simule tous les tours du tournoi homme
     */
    public void tournoi_hommes() {
        this.premierTour('M');
        this.deuxiemeTour('M');
        this.troisiemeTour('M');
        this.huitiemes('M');
        this.quarts('M');
        this.demies('M');
        this.finale('M');
        
    }
    /*
    Fonction qui simule tous les tours du tournoi femme
    */
    public void tournoi_femmes() {
        this.premierTour('F');
        this.deuxiemeTour('F');
        this.troisiemeTour('F');
        this.huitiemes('F');
        this.quarts('F');
        this.demies('F');
        this.finale('F');
        
    }
    public boolean saisieAuto_Manuel(Scanner sc) {
        String saisie;
        System.out.println("Manuel ou Automatique : ");
        System.out.println("(Automatique par défaut et si mauvaise saisie)");
        System.out.println("(M)anuel");
        System.out.println("(A)utomatique");
        saisie=sc.nextLine();
        try{
            if(!(saisie.compareTo("M")==0||saisie.compareTo("m")==0||saisie.compareTo("A")==0||saisie.compareTo("a")==0)){
                throw new Exception("Veuillez saisir A ou M");
                
            }
            else{
                if(saisie.compareTo("M")==0||saisie.compareTo("m")==0){
                return false;
        }
            else {
            return true;
             }
            }
        }
        catch(Exception saisie_mauvaise){
            System.err.println(saisie_mauvaise.getMessage());
        }
        return saisieAuto_Manuel(sc);
        
    }
}
