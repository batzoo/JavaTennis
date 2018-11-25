package grand_chelem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import grand_chelem.Joueur;
import grand_chelem.Stats_joueur;
import java.util.Scanner;
import java.lang.Exception;

/**
 *
 * @author Baptiste Delpierre/Giovanni Haddadi
 */
public class Echange {
    /**
     * @param proba variable tampon servant à déterminer s'il y a faute ou non
     * @param faute variable boolean : true s'il y af aute, et false s'il n'y a pas faute
     * @param coup numéro du coup dans l'échange 
     */
    private double proba;
    private boolean faute;
    private int coup;
    
    protected Stats_joueur stat;
    /**
     * Constructor qui initialise le point 
     */
    public Echange(){
        this.faute=false;
        this.coup=0;
        this.proba=0;
    }
/**
 * 
 * @return la proba donnant s'il y a faute ou pas
 */
    public double getProba(){ 
        
        return proba;
        
    }

    public boolean isFaute() {
        return faute;
    }

    public int getCoup() {
        return coup;
    }
    
    /**
     *
     * @return un boolean indiquant s'il y a faute ou non
     */

    public boolean faute() {
        this.proba=Math.random() ;
        return this.proba <= 0.1;
    }
    /**
     * 
     * @param j1 Serveur pendant le point
     * @param j2 Relanceur pendant le point
     * @return vainqueur du point simulé
     */
    public Joueur vainqueur_point_auto(Joueur j1,Joueur j2){
        int a;
       a=service_auto(j1);
       // Si service_auto retourne 0, alors le joueur qui retourne gagne le point
       if(a==0){
           return j2;
       }
       //S'il retourne autre chose : 
       else{
           //Tant qu'il n'y a pas faute, on continue l'échange
            while(!this.faute){
                this.coup++;
                //Coup suivant
                this.faute=faute();
                }
            // Si le nombre de coup vaut 1 --> il y a Ace 
            //Point pour j1 
            if(this.coup==1){
                this.coup=0;
                j1.stats.aces++;
                this.faute=false;
                return j1;
            }
            //Si le nombre de coups est pair,
            // cela veut dire que j2 à fait faute donc j1 gagne le point
            else if(this.coup%2==0){
                this.coup=0;
                this.faute=false;
                return j1;
            }
            //et inversement
            else{
                this.coup=0;
                this.faute=false;
                return j2;
            }
        }
    }
    /** 
     * Fonction qui retourne qui à gagné le point (manuel)
     * avec les services
     * @param j1 Joueur 1 du match
     * @param j2 Joueur 2 du match
     * @return Le Joueur ayant gagné le point
     */
    public Joueur vainqueur_point_manuel(Joueur j1,Joueur j2){
        //Variable recevant le résultat du service
        int service;
       //Scanner de saisie
        Scanner sc=new Scanner(System.in);
        System.out.println("Service "+j1.prenom+" "+j1.nomNaissance+" : ");
        //Premier service
        service=service(sc);
        //Si le service est faux, 2e service
        if(service==0){
            service=deuxieme_service(sc);
            //Si le 2e service est faux --> Double faute
            if(service==0){
                j1.stats.double_faute++;
                System.out.println("Point Joueur 2");
                return j2;
            }
            //Si c'est un ace, point j1
            else if(service==1){
                j1.stats.deuxieme_serv++;
                j1.stats.aces++;
                System.out.println("Point Joueur 1");
                return j1;
            }
            //Si il est bon, lancement de l'échange
            else{
                j1.stats.deuxieme_serv++;
                return echange_manuel(j1,j2,sc);
            }
        }
        //Si le premier service est un ace, point j1
        else if(service==1){
            j1.stats.premier_serv++;
            j1.stats.aces++;
            System.out.println("Point Joueur 1");
            return j1;
        }
        //S'il est juste bon, lancement de l'échange
        else{
            j1.stats.premier_serv++;
            return echange_manuel(j1,j2,sc);
        }
    }
    /**
     * 
     * @param j1 Joueur 1 du match
     * @param j2 Joueur 2 du match
     * @param sc Scanner d'entrée
     * @return le joueur ayant gagné le point après les services (manuel)
     */
    public Joueur echange_manuel(Joueur j1,Joueur j2,Scanner sc) {
        String faute;
        //variable contenant le numéro du joueur qui frappe
        int joueur=2;
        //a va permettre d'arrêter la boucle lorsqu'il y a faute
        int a=0;
        while(a==0){ 
            //Saisie de l'utilisateur
            System.out.println("Joueur "+joueur+" frappe : ");  
            System.out.println("(F)aute");
            System.out.println("(B)on");
            faute=sc.nextLine();
            try{//Exception levée si ce n'est pas ce que l'on veut
                 if(!(faute.compareTo("F")==0||faute.compareTo("f")==0||faute.compareTo("B")==0||faute.compareTo("b")==0)){
                     throw new Exception("Veuillez saisir F ou B !!");
                 }
                 else{
                     //Si f ou F --> on sort de la boucle
                    if(faute.compareTo("F")==0||faute.compareTo("f")==0){
                        a=1;
                    }
                    //Si b ou B --> on change de joueur qui frappe et on recommence
                    else if(faute.compareTo("B")==0||faute.compareTo("b")==0){
                        if(joueur==2){
                            joueur=1;
                        }
                        else{
                             joueur=2;
                        }
                    }
                }
            }
            catch(Exception mauvaise_saisie){
                System.err.println(mauvaise_saisie.getMessage());
            }
        }
            //Si joueur ==1, c'est qu'il à fait faute, donc j2 gagne le point
        if(joueur==1){
            System.out.println("Point Joueur 2");
            return j2;
        }
        //Et inversement
        else{
            System.out.println("Point Joueur 1");
            return j1;
        }
        
    }
    /** 
     * Fonction du service_auto
     * @return 0 si double faute, 1 si service_auto bon
     */
    public int service_auto(Joueur j1){
        //Premier service 
        this.faute=faute();
        if(this.faute==true){
            //si faute, deuxieme service
            this.faute=faute();
            if(this.faute==true){
                //--> Double faute retourne 0
                j1.stats.double_faute++;
                return 0;
            }
            else{//Deuxieme service bon retourne 1 
                j1.stats.deuxieme_serv++;
                return 1;
            }
        }
        else {//Si premier service bon, retourne 1
            j1.stats.premier_serv++;
            return 1;}
    }
    /**
     * Fonction de service manuel
     * @param sc Scanner de saisie
     * @return Un int donnant s'il y a double faute ou non 
     *         
     */
    public int service(Scanner sc) {
    String saisie;
        System.out.println("(S)ervice bon");
        System.out.println("(F)aute");
        System.out.println("(A)ce");
        saisie=sc.nextLine();
        try{
            // Exception si ce qui est saisi ne fait pas parti des options données
            if(!(saisie.compareTo("F")==0||saisie.compareTo("f")==0||saisie.compareTo("A")==0||saisie.compareTo("a")==0||saisie.compareTo("S")==0||saisie.compareTo("s")==0)){
                throw new Exception("Veuillez saisir S, F ou A");
            }
            else{
                if(saisie.compareTo("F")==0||saisie.compareTo("f")==0){
                return 0;
                
                }
                else if(saisie.compareTo("A")==0||saisie.compareTo("a")==0){
                    return 1;
                }
                else{
                    return 2;
                }
            }
        }
        catch(Exception saisie_mauvaise){
            System.err.println(saisie_mauvaise.getMessage());
        }
        return service(sc);
    }
    /** 
     * Fonction effectuant le deuxieme service du joueur 
     * @param sc Scanner d'entrée
     * @return un int : 0 si faute 1 si ace, et 2 si service bon
     */
    public int deuxieme_service(Scanner sc) {
        String saisie;
        System.out.println("Service bon par défaut ou si mauvaise saisie");
        System.out.println("(S)ervice bon");
        System.out.println("Double (F)aute");
        System.out.println("(A)ce");
        saisie=sc.nextLine();
        try{
            if(!(saisie.compareTo("F")==0||saisie.compareTo("f")==0||saisie.compareTo("A")==0||saisie.compareTo("a")==0||saisie.compareTo("S")==0||saisie.compareTo("s")==0)){
                throw new Exception("Veuillez saisir S, F ou A");
            }
            else{
                if(saisie.compareTo("F")==0||saisie.compareTo("f")==0){
                return 0;
                }
                else if(saisie.compareTo("A")==0||saisie.compareTo("a")==0){
                    return 1;
                }
                else{
                    return 2;
                }
            }
        }
        catch(Exception saisie_mauvaise){
            System.err.println(saisie_mauvaise.getMessage());
        }
        return deuxieme_service(sc);
    }
    
    }
    