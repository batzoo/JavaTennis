/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;

import static grand_chelem.Save.saveJoueurs;
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
    ArrayList<Arbitre> arb;
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
    
    public Tournoi(char genre,String savepath) {
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
        this.arb=new ArrayList<>();
        Arbitre b;
        for (int i=0;i<10;i++){
            b=new Arbitre('M');
            this.arb.add(b);
        }
        this.deuxieme_tour=new ArrayList<>();       
        this.troisieme_tour=new ArrayList<>();   
        this.huitieme_de_finale= new ArrayList<>();   
        this.quart_de_finale= new ArrayList<>();   
        this.demi_finale= new ArrayList<>();   
        this.finale=new ArrayList<>();  
        this.lieuTournoi=lieuT_random();
        this.surface=surface_terrain(this.lieuTournoi);
        presentation_joueurs_tournoi(this.premier_tour);
        demande_sauvegarde(savepath);
    }
    /**
     * Constructor avec joueur de l'utilisateur
     * @param j1 Joueur Homme ou femme 
     */
    public Tournoi(Joueur j1,String savepath){
         //Joueur tampon
        this.premier_tour = new ArrayList<>();
        this.premier_tour.add(j1);
        if(j1.genre=='M'){
            Joueur_Homme a;
            for(int i=1;i<128;i++){
                a=new Joueur_Homme('M',i);
                this.premier_tour.add(a);
            }     
             
        }
        else if(j1.genre=='F'){
            Joueur_Femme a;
            for(int i=1;i<129;i++){
                a=new Joueur_Femme('F',i);
                this.premier_tour.add(a);
            }     
        }
        this.arb=new ArrayList<>();
        Arbitre b;
        for (int i=0;i<10;i++){
            b=new Arbitre('M');
            this.arb.add(b);
        }
        
        this.deuxieme_tour=new ArrayList<>();       
        this.troisieme_tour=new ArrayList<>();   
        this.huitieme_de_finale= new ArrayList<>();   
        this.quart_de_finale= new ArrayList<>();   
        this.demi_finale= new ArrayList<>();   
        this.finale=new ArrayList<>();  
        this.lieuTournoi=lieuT_random();
        this.surface=surface_terrain(this.lieuTournoi);
        System.out.println("Bienvenue au tournoi "+this.lieuTournoi+"se jouant sur "+this.surface);
        presentation_joueurs_tournoi(this.premier_tour);
        demande_sauvegarde(savepath);
        
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
        boolean affichage;
        int z;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<128;i=i+2){
            z=(int)(Math.random()*10);
            this.matchs=new Match(this.premier_tour.get(i),this.premier_tour.get(i+1),arb.get(z),genre);
            automan=saisieAuto_Manuel(sc);
            if(automan){
                affichage=saisie_affichage();
                this.deuxieme_tour.add(this.matchs.vainqueur_match(automan,affichage));
            }
            else{
                affichage=true;
                this.deuxieme_tour.add(this.matchs.vainqueur_match(automan,affichage));
            }
        }
        presentation_joueurs_tournoi(this.deuxieme_tour);
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
        boolean affichage;
        int z;
        presentation_joueurs_tournoi(this.deuxieme_tour);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<this.deuxieme_tour.size();i=i+2){
            z=(int)(Math.random()*10);
            
            this.matchs=new Match(this.deuxieme_tour.get(i),this.deuxieme_tour.get(i+1),arb.get(z),genre);
            automan=saisieAuto_Manuel(sc);
            if(automan){
                affichage=saisie_affichage();
                this.troisieme_tour.add(this.matchs.vainqueur_match(automan,affichage));
            }
            else{
                affichage=true;
                this.troisieme_tour.add(this.matchs.vainqueur_match(automan,affichage));
            }
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
        boolean affichage;
        int z ;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<32;i=i+2){
            z=(int)(Math.random()*10);
            automan=saisieAuto_Manuel(sc);
            this.matchs=new Match(this.troisieme_tour.get(i),this.troisieme_tour.get(i+1),arb.get(z),genre);
            if(automan){
                affichage=saisie_affichage();
                this.huitieme_de_finale.add(this.matchs.vainqueur_match(automan,affichage));
            }
            else{
                affichage=true;
                this.huitieme_de_finale.add(this.matchs.vainqueur_match(automan,affichage));
            }
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
        boolean affichage;
        int z;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<16;i=i+2){
            z=(int)(Math.random()*10);
            automan=saisieAuto_Manuel(sc);
            this.matchs=new Match(this.huitieme_de_finale.get(i),this.huitieme_de_finale.get(i+1),arb.get(z),genre);
            if(automan){
                affichage=saisie_affichage();
                this.quart_de_finale.add(this.matchs.vainqueur_match(automan,affichage));
            }
            else{
                affichage=true;
                this.quart_de_finale.add(this.matchs.vainqueur_match(automan,affichage));
            }
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
        boolean affichage;
        int z ;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<8;i=i+2){
            z=(int)(Math.random()*10);
            automan=saisieAuto_Manuel(sc);
            this.matchs=new Match(this.quart_de_finale.get(i),this.quart_de_finale.get(i+1),arb.get(z),genre);
            if(automan){
                affichage=saisie_affichage();
                this.demi_finale.add(this.matchs.vainqueur_match(automan,affichage));
            }
            else{
                affichage=true;
                this.demi_finale.add(this.matchs.vainqueur_match(automan,affichage));
            }
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
        boolean affichage;
        int z;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i=i+2){
            automan=saisieAuto_Manuel(sc);
            z=(int)(Math.random()*10);
            this.matchs=new Match(this.demi_finale.get(i),this.demi_finale.get(i+1),arb.get(z),genre);
            if(automan){
                affichage=saisie_affichage();
                this.finale.add(this.matchs.vainqueur_match(automan,affichage));
            }
            else{
                affichage=true;
                this.finale.add(this.matchs.vainqueur_match(automan,affichage));
            }
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
        boolean affichage;
        int z;
        z=(int)(Math.random()*10);
        Scanner sc=new Scanner(System.in);
        automan=saisieAuto_Manuel(sc);
        this.matchs=new Match(this.finale.get(0),this.finale.get(1),arb.get(z),genre);
        if(automan){
                affichage=saisie_affichage();
                this.vainqueur=this.matchs.vainqueur_match(automan,affichage);
            }
            else{
                affichage=true;
                this.vainqueur=this.matchs.vainqueur_match(automan,affichage);
            }
        
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
    /**
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
    /**
     * Fonction pour choix de l'utilisateur 
     * entre automatique et manuel 
     * @param sc Scanner de saisie
     * @return true pour automatique et false pour manuel
     */
    public boolean saisieAuto_Manuel(Scanner sc) {
        String saisie;
        System.out.println("Manuel ou Automatique : ");
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
            return saisieAuto_Manuel(sc);
        }
    }
   /**
    * Fonction pour choix de l'utilisateur 
    * pour afficher ou non les détails du match
    * @return true si oui et false pour non
    */
public boolean saisie_affichage(){
        String saisie;
        Scanner sc=new Scanner(System.in);
        System.out.println("Souhaitez vous afficher le détail des matchs ?");
        System.out.println("(O)ui");
        System.out.println("(N)on");
        saisie=sc.nextLine();
        try{
            if(!(saisie.compareTo("O")==0||saisie.compareTo("o")==0||saisie.compareTo("N")==0||saisie.compareTo("n")==0)){
                throw new Exception("Veuillez saisir O ou N ");
            }
            else{
                if(saisie.compareTo("O")==0||saisie.compareTo("o")==0){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        catch(Exception mauvaise_saisie) {
            System.err.println(mauvaise_saisie.getMessage());
            return saisie_affichage();
        }
    }
/**
 * Fonction d'interface avec l'utilisateur
 * @param sc Scanner de saisie
 * @return un caractère : H pour tournoi hommes, F pour tournoi femmes et C pour créer un joueur
 */
public static char interface_utilisateur(Scanner sc){
    String saisie;
    System.out.println("Bonjour et bienvenue à ce projet de Java Tennis ");
    System.out.println("Réalisé par Baptiste Delpierre et Giovanni Haddadi");
    System.out.println("Choisissez si vous voulez créer votre joueur ou simplement lancer un tournoi : ");
    System.out.println("(C)réer Joueur");
    System.out.println("Tournoi (H)ommes");
    System.out.println("Tournoi (F)emmes");
    saisie=sc.nextLine();
        try{
            if(!(saisie.compareTo("C")==0||saisie.compareTo("c")==0||saisie.compareTo("H")==0||saisie.compareTo("h")==0||saisie.compareTo("F")==0||saisie.compareTo("f")==0)){
                throw new Exception("Veuillez saisir C,H ou F ");
            }
            else{
                if(saisie.compareTo("C")==0||saisie.compareTo("c")==0){
                    return 'C';
                }
                else if(saisie.compareTo("H")==0||saisie.compareTo("h")==0)
                    return 'H';
                
                else {
                    return 'F';
            }
            }
        }
        catch(Exception mauvaise_saisie) {
            System.err.println(mauvaise_saisie.getMessage());
            return interface_utilisateur(sc);
        }
    
}
/**
 * Fonction de redirection en fonction du choix de l'utilisateur
 * @param sc Scanner de saisie
 */
public static void jeu(Scanner sc,String savepath){
    Tournoi grand_chelem_;
    char c=interface_utilisateur(sc);
    if (c=='H'||c=='h'){
        grand_chelem_=new Tournoi('M',savepath);
        grand_chelem_.tournoi_hommes();
    }
    else if(c=='F'||c=='f'){
        grand_chelem_=new Tournoi('F',savepath);
        grand_chelem_.tournoi_femmes();
    }
    else{
       Joueur j1= new Joueur(sc);
        grand_chelem_=new Tournoi(j1,savepath);
        if(j1.genre=='M'||j1.genre=='m'){
            grand_chelem_.tournoi_hommes();
        }
        else{
            grand_chelem_.tournoi_femmes();
        }
    }
}
/**
 * Fonction d'affichage des joueurs du tournoi
 * @param tour Liste des joueurs
 */
public  void presentation_joueurs_tournoi(ArrayList<Joueur> tour){
    for(int i=0;i<tour.size();i++){
        System.out.println(tour.get(i).prenom+" "+tour.get(i).nomNaissance);
    }
}
/**
 * Fonction qui demande à l'utilisateur s'il veut sauvegarder ses joueurs
 */
public void demande_sauvegarde(String savepath){
        Scanner sc =new Scanner(System.in);
        System.out.println("Voulez vous sauvegarder les joueurs ?");
        System.out.println("(O)ui");
        System.out.println("(N)on");
        String saisie=sc.nextLine();
        try{
            if(!(saisie.compareTo("o")==0||saisie.compareTo("O")==0)||(saisie.compareTo("n")==0||saisie.compareTo("N")==0)){
                throw new Exception("Veuillez saisir O ou N ");
            }
            else{
                if((saisie.compareTo("o")==0||saisie.compareTo("O")==0)){
                    saveJoueurs(this.premier_tour,savepath);
                    System.out.println("Joueurs sauvegardés !");
                }
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
}
}

