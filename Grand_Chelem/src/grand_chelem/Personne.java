/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;
import java.util.Calendar;  /* Permet d'obtenir la date du système */

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
    //Constructor de personne aléatoire 
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
            this.dateDeces = d.dateDeces();
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
}