/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;
import java.util.Calendar;  /* Permet d'obtenir la date du système */
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ISEN
 */
public class Personne {
    
    protected String nomNaissance;
    protected String nomCourant;
    protected String prenom;
    protected char genre;
    protected DateTennis dateNaissance;
    protected String lieuNaissance;
    protected DateTennis dateDeces;
    protected String nationalite;
    protected int taille;
    protected float poids;
    /**
     * 
     * @param nomNaissance 
     *          nom de famille de naissance
     * @param prenom
     * @param genre
     * @param dateNaissance
     * @param lieuNaissance
     * @param dateDeces
     *          la date de décès est prédéfinie lors de la création de la personne
     * @param nationalite
     * @param taille
     * @param poids 
     */
    Personne(String nomNaissance,String prenom,
    char genre,DateTennis dateNaissance,String lieuNaissance,
    DateTennis dateDeces,String nationalite, int taille,float poids){
        this.nomNaissance=nomNaissance;
        this.prenom=prenom;
        this.genre=genre;
        this.dateNaissance=dateNaissance;
        this.lieuNaissance=lieuNaissance;
        this.dateDeces=dateDeces;
        this.nationalite=nationalite;
        this.taille=taille;
        this.poids=poids;
    }
    /**
     * Constructor de personne aléatoire */
    Personne(char genre){
        DateTennis d=new DateTennis();
        this.nomNaissance=random_nom();
        if(genre=='M'){
            this.prenom=random_prenom_H();
        }
        else if(genre=='F'){
            this.prenom=random_prenom_F();
        }
        this.genre=genre;
        this.dateNaissance=d.date_naissance_hasard();
        this.lieuNaissance=lieu_random();
        this.dateDeces=dateDeces;
        this.nationalite=nationalite(this.lieuNaissance);
        this.taille=(int)(Math.random()*60)+150;
        this.poids=(int)(Math.random()*45)+50;
    }
    /**
     * Constructor pour la saisie des attributs par l'utilisateur
     * @param sc Scanner de saisie
     */
    public Personne(Scanner sc){
        this.prenom=saisiePrenom(sc);
        this.nomNaissance=saisieNom(sc);
        this.genre=saisieGenre(sc);
        this.dateNaissance=new DateTennis(saisieJourNaissance(sc),saisieMoisNaissance(sc),saisieAnneeNaissance(sc));
        this.lieuNaissance=saisieLieuNaissance(sc);
        this.nationalite=saisieNationalite(sc);
        this.taille=saisieTaille(sc);
        this.poids=saisiePoids(sc);
        //this.dateDeces.dateDeces();
    }
    /* Accesseurs */
    public String getNomNaissance()
    {
        return this.nomNaissance;
    }
    
    public String getNomCourant()
    {
        return this.nomCourant;
    }
    
    public String getPrenom()
    {
        return this.prenom;
    }
    
    public char getGenre()
    {
        return this.genre;
    }
    
    public  DateTennis getDateNaissance()
    {
        return this.dateNaissance;
    }
    
    public  String getLieuNaissance()
    {
        return this.lieuNaissance;
    }
    
    public  DateTennis getDateDeces()
    {
        return this.dateDeces;
    }
    
    public  String getNationalite()
    {
        return this.nationalite;
    }
    
    public  int getTaille()
    {
        return this.taille;
    }
    
    public  float getPoids()
    {
        return this.poids;
    }
    /**
     * 
     * @return UN nom de Naissance aléatoire
     */
    public String random_nom(){
        String NOMS[]={"Federer","Savard","Mbappé","Zidane","Cena","Malou","Thuram","Anelka","Tatsaki","Dupont","Vardy","Aubameyang","Djokovic","Nadal","Monfils","Gasquet","Coupet","Smith","Cole","Johnson","Ford","Ashe","Richmond","Tank","Silva","Lee","Pirlo","Puyol","Messi","Ronaldo","Willian","Cilic","Terbich","Modric","Carlos","Santos","Migos","Gluk","Blanc","Kent","Wayne","Rooney","Varane","Umtiti","Zverev","Anderson","Thiem","Nishikori","Isner","Khachanov","Fognini","Edmund","Medvedev","Goffin","Simon","Millman","Pouille","Kyrgios","Harrison","Garrisson","Ramos","Vida","Pavard","Hernandez","Kimpembe","Lizarazu","McDonald","Tomic","Giroud","Dembele","Griezmann","Kanté","Pogba","Tolisso","Areola","Lloris","Llodra","Norrie","Yu","Debuchy","Barthez","Vieira","Dessailly","Henry","Deschamps","Hazard","De Bruyne","Lacazette","Benzema","Gourcuff","Toulalan","Blackzyckczowskizky","Tirzkzykowszcki","Sigurdsson","Eriksen","Christensen","Hansson","Witsel","Mané","Sané","Sidibé","Cissé","Mirte","Bout","Casillas","Hart","Pickford","Roux","Grandson","Dadson","Momson","Shot","Ace","Garros","Halliday","Durand","Cuvelier","Saquet","Dumbledore","Potter","Skywalker","Macron","De Gaulle","Jobs","Musk","Brin d'acier","Pakonten","Konten"};
        return NOMS[(int)(Math.random()*128)];
    }
    /**
     * 
     * @return un prénom masculin aléatoire
     */
    public String random_prenom_H(){
        String PRENOMS_H[]={"Paul","Pierre","Juan","Roberto","Alexandre","Zinedine","Eddy","Alexis","Clément","N'golo","Jérémy","Novak","Rafael","Roger","Hugo","Killian","John","Lillian","Eric","Gael","Richard","Gregory","Joe","Henry","Fernando","André","Carlos","Lionel","Laurent","Michel","Patrick","Lucas","Samuel","Kevin","Benjamin","Oussmane","Dominic","Kei","David","Gilles","Ronald","Olivier","Louis","Baptiste","Germain","Léo","Jack","Johnny","Brayan","Didier","Fabien","Bixente","Steve","Grant","Pablo","François","Francesco","Frank","Claude","Antoine"};
        return PRENOMS_H[(int)(Math.random()*60)];
    }
    /**
     * 
     * @return un prénom féminin aléatoire
     */
    public String random_prenom_F(){
        String PRENOMS_F[]={"Paule","Pierrette","Jeanne","Roberte","Alexandra","Julia","Fatima","Alexia","Clémentine","Jennifer","Zoé","Noémie","Rafaella","Elise","Huguette","Marie","Josiane","Maria","Monique","Gaelle","Cléa","Léa","Joelle","Henriette","Alizée","Andrée","Charlotte","Michelle","Laurence","Victoria","Patricia","Lucie","Samantha","Anais","Anna","Sarah","Dominique","Anne","Irma","Irène","Mireille","Olivia","Louise","Brenda","Germaine","Gwendoline","Simona","Caroline","Petra","Naomi","Fabienne","Serena","Camille","Lise","Venus","Françoise","Francesca","Danielle","Claude","Antoinette"};
        return PRENOMS_F[(int)(Math.random()*60)];
    }
    /**
     * 
     * @return un lieu de naissance aléatoire 
     */
    public String lieu_random(){
        String LIEUX[]={"Paris","Londres","Tokyo","Madrid","Lisbonne","Berlin","New York","Ottawa","Varsovie","Moscou","Armentières","Caen","Lille","Rome","Dublin","Athènes","Mexico City","Buenos Aires","Brasilia","Rio de Janeiro","Montevideo","Helsinki","Stockholm","San Francisco","Zagreb","Springfield","South Park","Marseille","Bordeaux","Strasbourg"};
        return LIEUX[(int)(Math.random()*30)];
    }
    /**
     * 
     * @param naissance lieu de naissance de la personne
     * @return la nationalité en fonction du lieu de naissance
     */
    public String nationalite(String naissance){
        if(naissance=="Paris"||naissance=="Caen"||naissance=="Lille"||naissance=="Armentières"||naissance=="Marseille"||naissance=="Bordeaux"||naissance=="Strasbourg"){
            return "Francaise";
        }
        else if(naissance=="Londres"){
            return "Anglaise";
        }
        else if(naissance=="Tokyo"){
            return "Japonaise";
        }
        else if(naissance=="New York"||naissance=="San Francisco"||naissance=="Springfield"||naissance=="South Park"){
            return "Américaine";
        }
        else if(naissance=="Brasilia"||naissance=="Rio de Janeiro"){
            return "Brésilienne";
        }
        else if(naissance=="Madrid"){
            return "Espagnole";
        }
        else if(naissance=="Lisbonne"){
            return "Portugaise";
        }
        else if(naissance=="Berlin"){
            return "Allemande";
        }
        else if(naissance=="Ottawa"){
            return "Canadienne";
        }
        else if(naissance=="Varsovie"){
            return "Polonaise";
        }
        else if(naissance=="Moscou"){
            return "Russe";
        }
        else if(naissance=="Rome"){
            return "Italienne";
        }
        else if(naissance=="Athènes"){
            return "Grecque";
        }
        else if(naissance=="Mexico City"){
            return "Mexicaine";
        }
        else if(naissance=="Buenos Aires"){
            return "Argentine";
        }
        else if(naissance=="Montevideo"){
            return "Uruguayenne";
        }
        else if(naissance=="Helsinki"){
            return "Finlandaise";
        }
        else if(naissance=="Stockholm"){
            return "Suédoise";
        }
        else if(naissance=="Zagreb"){
         return "Croate";   
        }
        else {
            return "Pas de nationalité";
        }
    }
    /** Pas besoin de mutators étant donné qu'on n'a pas a changé les informations des personnes, juste les lires ! */
    
    /**
     * 
     * @return vrai pour mort et faux pour vivant
     * Permet de savoir si la personne est en vie ou non
     */
    public boolean estMort() 
    { 
        DateTennis d = new DateTennis();
        
        int mort =(int) (Math.random()*4);
        if (mort == 0){
            this.dateDeces.dateDeces();
            return true; 
        } 
        else{
            return false; 
        } 
    }
    /**
     * 
     * @return l'age de la personne
     */
    public int age() 
    { 
        Calendar dateOrdi = Calendar.getInstance(); 
        int anneeOrdi = dateOrdi.get(Calendar.YEAR); 
        int moisOrdi = dateOrdi.get(Calendar.MONTH) + 1; /* Les mois commencent à 0 donc il faut rajouter 1 pour obtenir le bon numéro */ 
        int jourOrdi = dateOrdi.get(Calendar.DATE); 
 
        int age; 
        if (estMort() == false){ 
            age = anneeOrdi - this.dateNaissance.annee; 
             
            if (moisOrdi < this.dateNaissance.mois){ 
                age = age - 1; 
                return age; 
            } 
            /* Si le mois de decés = au mois de naissance alors on vérifie les jours de naissance */ 
            else if (moisOrdi == this.dateNaissance.mois){ 
                /* Si le mois de decés = au mois de naissance et que le jour de decés < jour de naissance alors l'âge vaut année décès - année naissance - 1 */ 
                if (jourOrdi < this.dateNaissance.jour){ 
                    age = age - 1; 
                    return age; 
                } 
                /* Si le mois de decés = au mois de naissance et que le jour de decés = jour de naissance alors l'âge vaut année decés - année naissance */ 
                else if (jourOrdi == this.dateNaissance.jour){ 
                    return age; 
                } 
            } 
            return age; 
        } 
        else{ 
            age = this.dateDeces.annee - this.dateNaissance.annee; 
             
            if (this.dateDeces.mois < this.dateNaissance.mois){ 
                age = age - 1; 
                return age; 
            } 
            /* Si le mois de decés = au mois de naissance alors on vérifie les jours de naissance */ 
            else if (this.dateDeces.mois == this.dateNaissance.mois){ 
                /* Si le mois de decés = au mois de naissance et que le jour de decés < jour de naissance alors l'âge vaut année décès - année naissance - 1 */ 
                if (this.dateDeces.jour < this.dateNaissance.jour){ 
                    age = age - 1; 
                    return age; 
                } 
                /* Si le mois de decés = au mois de naissance et que le jour de decés = jour de naissance alors l'âge vaut année decés - année naissance */ 
                else if (this.dateDeces.jour == this.dateNaissance.jour){ 
                    return age; 
                } 
            } 
        } 
        return age; 
    }
    /**
     * Fonction de saisie du prénom
     * @param sc Scanner de saisie
     * @return le prénom sous forme de String
     */
    public String saisiePrenom(Scanner sc){
        System.out.println("Saisissez prénom : ");
        System.out.println("Si vous entrez des nombres, ils seront supprimés");
        System.out.println("Et les espaces remplacés par des '-'");
        String saisie=sc.nextLine();
        saisie=saisie.replaceAll("[*0-9]", "");
        saisie=saisie.replaceAll(" ", "-");
        System.out.println(saisie);
        return saisie;
    }
    /**
     * Fonction de saisie du Nom de famille
     * @param sc Scanner de saisie
     * @return Le nom sous forme de String
     */
    public String saisieNom(Scanner sc){
        System.out.println("Saisissez votre nom de famille : ");
        System.out.println("Si vous entrez des nombres, ils seront supprimés");
        System.out.println("Et les espaces remplacés par des '-'");
        String saisie=sc.nextLine();
        saisie=saisie.replaceAll("[*0-9]", "");
        saisie=saisie.replaceAll(" ", "-");
        System.out.println(saisie);
        return saisie;
    }
    /**
     * Fonction de saisie du lieu de naissance
     * @param sc Scanner de saisie
     * @return Le lieu de naissance sous forme de String
     */
    public String saisieLieuNaissance(Scanner sc){
        System.out.println("Saisissez votre lieu de naissance : ");
        System.out.println("Si vous entrez des nombres, ils seront supprimés");
        System.out.println("Et les espaces remplacés par des '-'");
        String saisie=sc.nextLine();
        saisie=saisie.replaceAll("[*0-9]", "");
        saisie=saisie.replaceAll(" ", "-");
        System.out.println(saisie);
        return saisie;
    }
    /**
     * Fonction de saisie de la nationalité
     * @param sc Scanner de saisie
     * @return Nationalité sous forme de String
     */
    public String saisieNationalite(Scanner sc){
        System.out.println("Saisissez votre nationalité : ");
        System.out.println("Si vous entrez des nombres, ils seront supprimés");
        System.out.println("Et les espaces remplacés par des '-'");
        String saisie=sc.nextLine();
        saisie=saisie.replaceAll("[*0-9]", "");
        saisie=saisie.replaceAll(" ", "-");
        System.out.println(saisie);
        return saisie;
    }
    /** 
     * Fonction de la saisie du Jour de naissance
     * @param sc Scanner de saisie
     * @return un int entre 1 et 31
     */
    public int saisieJourNaissance(Scanner sc){
        System.out.println("Saisissez votre jour de naissance : ");
        boolean continueSaisie=true;
        int saisie=0;
        do {
        try{
            saisie = sc.nextInt();
            if(saisie>31||saisie<1){
                throw new Exception("Doit être compris entre 1 et 31");
            }
            continueSaisie = false;
            
        }
        catch (InputMismatchException ex) {
            System.err.println("Veuillez saisir un nombre !!");
            sc.nextLine();
            }
        catch(Exception e){
                System.err.println(e.getMessage());
                sc.nextLine();
                }
        }
        while (continueSaisie);
        return saisie;
   
        }
    /**
     * Fonction de saisie du mois 
     * @param sc Scanner de saisie
     * @return un int entre 1 et 12
     */
    public int saisieMoisNaissance(Scanner sc){
        System.out.println("Saisissez votre mois de naissance : ");
        boolean continueSaisie=true;
        int saisie=0;
        do {
        try{
            saisie = sc.nextInt();
            if(saisie>12||saisie<1){
                throw new Exception("Doit être compris entre 1 et 12");
            }
            continueSaisie = false;
            
        }
        catch (InputMismatchException ex) {
            System.err.println("Veuillez saisir un nombre !!");
            sc.nextLine();
            }
        catch(Exception e){
                System.err.println(e.getMessage());
                sc.nextLine();
                }
        }
        while (continueSaisie);
        return saisie;
   
        }
    /**
     * Fonction de saisie de l'année de naissance
     * @param sc Scanner de saisie
     * @return Un int entre 1978 et 2000
     */
    public int saisieAnneeNaissance(Scanner sc){
        System.out.println("Saisissez votre année de naissance : ");
        boolean continueSaisie=true;
        int saisie=0;
        do {
        try{
            saisie = sc.nextInt();
            if(saisie>2000){
                if(saisie<2018){
                throw new Exception("Moins de 18 ans ? Vous ne pouvez pas participer a ce tournoi ...");
                }
                else if(saisie>2018){
                    throw new Exception("Jouer avant la naissance, compliqué non ?");
                }
            }
            else if(saisie<1978){
                throw new Exception("Plus de 40 ans et toujours joueur de tennis ?! On n'y croit pas !");
            }
            else{
                return saisie;
            }
            continueSaisie = false;
            
        }
        catch (InputMismatchException ex) {
            System.err.println("Veuillez saisir un nombre !!");
            sc.nextLine();
            }
        catch(Exception e){
                System.err.println(e.getMessage());
                sc.nextLine();
               }
        }
        while (continueSaisie);
        return saisie;
   
        }
    /**
     * Fonction de saisie de la taille
     * @param sc Scanner de saisie
     * @return Un int entre 100 et 220 
     */
    public int saisieTaille(Scanner sc){
        System.out.println("Saisissez votre taille (en cm) : ");
        boolean continueSaisie=true;
        int saisie=0;
        do {
        try{
            saisie = sc.nextInt();
            if(saisie>220){
                throw new Exception("Plus grand que 2m20 ?? Mensonge, veuillez saisir une vraie taille ;)");
            }
            else if(saisie<100){
                throw new Exception("Moins de 1m ??? Ne vous sous estimez pas ");
            }
            continueSaisie = false;
            
        }
        catch (InputMismatchException ex) {
            System.err.println("Veuillez saisir un nombre !!");
            sc.nextLine();
            }
        catch(Exception e){
                System.err.println(e.getMessage());
                sc.nextLine();
                }
        }
        while (continueSaisie);
        return saisie;
   
        }
    /**
     * Fonction de saisie du poids 
     * @param sc Scanner de saisie
     * @return un int entre 130 et 40
     */
     public int saisiePoids(Scanner sc){
        System.out.println("Saisissez votre poids (en kg) : ");
        boolean continueSaisie=true;
        int saisie=0;
        do {
        try{
            saisie = sc.nextInt();
            if(saisie>130){
                throw new Exception("Plus que 130 kg ?? Peu commun chez les joueurs de tennis ... Veuillez resaisir un poids raisonnable " );
            }
            else if(saisie<40){
                throw new Exception("Moins de 40 kg ??? Peu commun chez les joueurs de tennis ... Veuillez resaisir un poids raisonnable ");
            }
            continueSaisie = false;
            
        }
        catch (InputMismatchException ex) {
            System.err.println("Veuillez saisir un nombre !!");
            sc.nextLine();
            }
        catch(Exception e){
                System.err.println(e.getMessage());
                sc.nextLine();
                }
        }
        while (continueSaisie);
        return saisie;
   
        }
     /**
      * Fonction de saisie du genre 
      * @param sc Scanner de saisie
      * @return un char : M pour Homme et F pour femme 
      */ 
      
     public char saisieGenre(Scanner sc){
        String saisie;
        System.out.println("Saisissez votre genre ");
        System.out.println("M : Homme ");
        System.out.println("F : Femme ");
        saisie=sc.nextLine();
        try{
            if(!(saisie.compareTo("M")==0||saisie.compareTo("m")==0||saisie.compareTo("F")==0||saisie.compareTo("f")==0)){
                throw new Exception("Veuillez saisir M ou F ");
            }
            else{
                if(saisie.compareTo("f")==0||saisie.compareTo("m")==0){
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
            return saisieGenre(sc);
        }
     }
}