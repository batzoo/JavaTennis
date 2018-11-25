/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;

import java.util.Scanner;


/**
 *
 * @author Baptiste Delpierre/Giovanni Haddadi
 */
public class Joueur extends Personne
{
    /**
     * @param main D pour droitier G pour gaucher
     * 
     */
    private char main;
    private String sponsor;
    private int classement;
    private String entraineur;
    private String couleur;
    Stats_joueur stats;
    //Construcor pour Joueur avec comme paramètres les différents attributs
    public Joueur(String nomNaissance,String prenom ,
                  char genre,DateTennis dateNaissance,String lieuNaissance,
                  DateTennis dateDeces,String nationalite,int taille,float poids,
                  char main,String sponsor,int classement,String entraineur,String couleur){
        super(nomNaissance,prenom,genre,dateNaissance,lieuNaissance,dateNaissance,nationalite,taille,poids);
        this.main=main;
        this.sponsor=sponsor;
        this.classement=classement;
        this.entraineur=entraineur;
        this.couleur=couleur;
        this.stats=new Stats_joueur();
    }
    //Constructor pour Joueur aléatoire
    public Joueur(char genre,int classement){
        super(genre);
        this.main=main_random();
        this.sponsor=sponsor_random();
        this.classement=classement;
        this.entraineur=entraineur_random();
        this.couleur=couleur_random();
        this.stats=new Stats_joueur();
        
    }
    public Joueur(Scanner sc){
        super(sc);
        saisieMain(sc);
        saisieSponsor(sc);
        saisieEntraineur(sc);
        saisieCouleur(sc);
        this.PresentationJoueur();
        this.stats=new Stats_joueur();
    }

    public char getMain() {
        return main;
    }

    public String getSponsor() {
        return sponsor;
    }

    public int getClassement() {
        return classement;
    }

    public String getEntraineur() {
        return entraineur;
    }

    public char getGenre() {
        return genre;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setMain(char main) {
        this.main = main;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public void setClassement(int classement) {
        this.classement = classement;
    }

    public void setEntraineur(String entraineur) {
        this.entraineur = entraineur;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
    /**
     * 
     * @return Le nom et prénom du joueur séparés d'un espace
     */
    public String nom_Prenom(){
        return this.prenom+" "+this.nomNaissance;
    }
    
    /**
     * 
     * @return Droitier ou gaucher de manière aléatoire
     */
    public char main_random(){
        int a =(int)(Math.random()*2);
        if(a==0){
            return 'G';
        }
        else{
            return 'D';
        }
    }
    /**
     * 
     * @return un sponsor random
     */
    public String sponsor_random(){
        String sponsors[]={"Nike","Adidas","Asics","Puma","Reebok","Wilson","Babolat","Artengo","Kipsta","Kappa"};
        return sponsors[(int)(Math.random()*10)];
    }
    /**
     * 
     * @return un entraineur random
     */
    public String entraineur_random(){
        String entraineurs[]={"Yannick Noah","John McEnroe","Henri Lecomte","Mickael Llodra","Fred Perry","Jack Kramer","Pete Sampras","Andre Agassi","Bjorn Borg","Ivan Lendl"};
        return entraineurs[(int)(Math.random()*10)];
    }
    /**
     * 
     * @return une couleur random
     */
    public String couleur_random(){
        String couleurs[]={"Rouge","Bleu","Vert","Jaune","Orange","Noir","Blanc","Bordeaux","Violet"};
        return couleurs[(int)(Math.random()*9)];
    }
    /**
     * 
     * @param couleur nouvelle couleur de la tenue du joueur
     */
    public void changementCouleur(String couleur){
        this.couleur=couleur;
    }
    public String saisieSponsor(Scanner sc){
        System.out.println("Saisissez Sponsor : ");
        System.out.println("Si vous entrez des nombres, ils seront supprimés");
        System.out.println("Et les espaces remplacés par des '-'");
        String saisie=sc.nextLine();
        saisie=saisie.replaceAll("[*0-9]", "");
        saisie=saisie.replaceAll(" ", "-");
        System.out.println(saisie);
        return saisie;
    }
    public String saisieEntraineur(Scanner sc){
        System.out.println("Saisissez votre Entraineur : ");
        System.out.println("Si vous entrez des nombres, ils seront supprimés");
        String saisie=sc.nextLine();
        saisie=saisie.replaceAll("[*0-9]", "");
        System.out.println(saisie);
        return saisie;
    }
    public String saisieCouleur(Scanner sc){
        System.out.println("Saisissez votre couleur en jeu : ");
        System.out.println("Si vous entrez des nombres, ils seront supprimés");
        String saisie=sc.nextLine();
        saisie=saisie.replaceAll("[*0-9]", "");
        System.out.println(saisie);
        return saisie;
    }
    public char saisieMain(Scanner sc){
        String saisie;
        System.out.println("Saisissez votre main forte ");
        System.out.println("D : Droite ");
        System.out.println("G : Gauche ");
        saisie=sc.nextLine();
        try{
            if(!(saisie.compareTo("D")==0||saisie.compareTo("d")==0||saisie.compareTo("G")==0||saisie.compareTo("g")==0)){
                throw new Exception("Veuillez saisir D ou G ");
            }
            else{
                if(saisie.compareTo("d")==0||saisie.compareTo("g")==0){
                    String toUpperCase = saisie.toUpperCase();
                    return toUpperCase.charAt(0);
                    
                }
                else{
                return saisie.charAt(0);
                }
            }
        }
        catch(Exception mauvaise_saisie) {
            System.err.println(mauvaise_saisie.getMessage());
            return saisieMain(sc);
        }
     }
    public void PresentationJoueur(){
        System.out.print("Bonjour je suis "+this.prenom+" "+this.nomNaissance+" née à "+this.lieuNaissance+" en ");
        dateNaissance.afficherDate();
        System.out.println("Ma nationalité est"+this.nationalite+"Ma jupe est "+this.getCouleur());
        System.out.println("je suis n°"+this.getClassement()+" mondial");
    }
}
