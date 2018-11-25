/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grand_chelem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Boolean.parseBoolean;
import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ISEN
 */
public class Save {
     public static void savePrenom(ArrayList<Joueur> tournoi,String savepath){
try {
            char separator = ';';
            File file = new File(savepath+"\\prenom.txt"); // dÃ©finir l'arborescence
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for(int i=0;i<tournoi.size();i++){
                bw.write(tournoi.get(i).prenom);
                bw.write(separator);
                        
            // Ã©crire une ligne dans le fichier clients.txt
            bw.write("\n");} // forcer le passage Ã  la ligne
            bw.close(); // fermer le fichier Ã  la fin des traitements
        } catch (Exception e) {
            System.err.println("NE MARCHE PAS");
        }
    }
      public static void saveNom(ArrayList<Joueur> tournoi,String savepath){
try {
            char separator = ';';
            File file = new File(savepath+"\\nom.txt"); // dÃ©finir l'arborescence
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for(int i=0;i<tournoi.size();i++){
                bw.write(tournoi.get(i).nomNaissance);
                bw.write(separator);
                       
            // Ã©crire une ligne dans le fichier clients.txt
            bw.write("\n"); } // forcer le passage Ã  la ligne
            bw.close(); // fermer le fichier Ã  la fin des traitements
        } catch (Exception e) {
            System.err.println("NE MARCHE PAS");
        }
    } 
      public static void saveGenre(ArrayList<Joueur> tournoi,String savepath){
try {
            char separator = ';';
            File file = new File(savepath+"\\genre.txt"); // dÃ©finir l'arborescence
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for(int i=0;i<tournoi.size();i++){
                bw.write(tournoi.get(i).genre);
                bw.write(separator);
                        
            // Ã©crire une ligne dans le fichier clients.txt
            bw.write("\n");} // forcer le passage Ã  la ligne
            bw.close(); // fermer le fichier Ã  la fin des traitements
        } catch (Exception e) {
            System.err.println("NE MARCHE PAS");
        }
    }
       public static void saveDate(ArrayList<Joueur> tournoi,String savepath){
try {
            char separator = ';';
            char sepdate='/';
            File file = new File(savepath+"\\date.txt"); // dÃ©finir l'arborescence
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for(int i=0;i<tournoi.size();i++){
                bw.write(Integer.toString(tournoi.get(i).dateNaissance.jour));
                bw.write(sepdate);
                bw.write(Integer.toString(tournoi.get(i).dateNaissance.mois));
                bw.write(sepdate);
                bw.write(Integer.toString(tournoi.get(i).dateNaissance.annee));
                bw.write(separator);
                        
            // Ã©crire une ligne dans le fichier clients.txt
            bw.write("\n");} // forcer le passage Ã  la ligne
            bw.close(); // fermer le fichier Ã  la fin des traitements
        } catch (Exception e) {
            System.err.println("NE MARCHE PAS");
        }
    }
      public static void saveNationalite(ArrayList<Joueur> tournoi,String savepath){
try {
            char separator = ';';
            File file = new File(savepath+"\\nationalite.txt"); // dÃ©finir l'arborescence
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for(int i=0;i<tournoi.size();i++){
                bw.write(tournoi.get(i).nationalite);
                bw.write(separator);
                        
            // Ã©crire une ligne dans le fichier clients.txt
            bw.write("\n"); // forcer le passage Ã  la ligne
            }
            bw.close(); // fermer le fichier Ã  la fin des traitements
        } catch (Exception e) {
            System.err.println("NE MARCHE PAS");
        }
    }
      public static void saveTaille(ArrayList<Joueur> tournoi,String savepath){
try {
            char separator = ';';
            File file = new File(savepath+"\\taille.txt"); // dÃ©finir l'arborescence
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for(int i=0;i<tournoi.size();i++){
                bw.write(Integer.toString(tournoi.get(i).taille));
                bw.write(separator);
                        
            // Ã©crire une ligne dans le fichier clients.txt
            bw.write("\n"); // forcer le passage Ã  la ligne
            }
            bw.close(); // fermer le fichier Ã  la fin des traitements
        } catch (Exception e) {
            System.err.println("NE MARCHE PAS");
        }
    }  public static void savePoids(ArrayList<Joueur> tournoi,String savepath){
try {
            char separator = ';';
            File file = new File(savepath+"\\poids.txt"); // dÃ©finir l'arborescence
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for(int i=0;i<tournoi.size();i++){
                bw.write(Float.toString(tournoi.get(i).poids));
                bw.write(separator);
                        
            // Ã©crire une ligne dans le fichier clients.txt
            bw.write("\n"); // forcer le passage Ã  la ligne
            }
            bw.close(); // fermer le fichier Ã  la fin des traitements
        } catch (Exception e) {
            System.err.println("NE MARCHE PAS");
        } 
    }
public static void saveMain(ArrayList<Joueur> tournoi,String savepath){
try {
            char separator = ';';
            File file = new File(savepath+"\\main.txt"); // dÃ©finir l'arborescence
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for(int i=0;i<tournoi.size();i++){
                bw.write(tournoi.get(i).getMain());
                bw.write(separator);
                        
            // Ã©crire une ligne dans le fichier clients.txt
            bw.write("\n"); // forcer le passage Ã  la ligne
            }
            bw.close(); // fermer le fichier Ã  la fin des traitements
        } catch (Exception e) {
            System.err.println("NE MARCHE PAS");
        }
    }
      public static void saveCouleur(ArrayList<Joueur> tournoi,String savepath){
try {
            char separator = ';';
            File file = new File(savepath+"\\couleur.txt"); // dÃ©finir l'arborescence
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for(int i=0;i<tournoi.size();i++){
                bw.write(tournoi.get(i).getCouleur());
                bw.write(separator);
                        
            // Ã©crire une ligne dans le fichier clients.txt
            bw.write("\n"); // forcer le passage Ã  la ligne
            }
            bw.close(); // fermer le fichier Ã  la fin des traitements
        } catch (Exception e) {
            System.err.println("NE MARCHE PAS");
        }
    }
     public static void saveJoueurs(ArrayList<Joueur> tournoi,String savepath){
         savePrenom(tournoi,savepath);
         saveNom(tournoi,savepath);
         saveGenre(tournoi,savepath);
         saveDate(tournoi,savepath);
         saveNationalite(tournoi,savepath);
         saveTaille(tournoi,savepath);
         savePoids(tournoi,savepath);
         saveMain(tournoi,savepath);
         saveCouleur(tournoi,savepath);
     }
}
