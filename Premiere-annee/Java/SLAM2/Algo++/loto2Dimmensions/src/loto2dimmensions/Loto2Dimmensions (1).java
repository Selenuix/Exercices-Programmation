/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loto2dimmensions;

import sio.Saisir;

/**
 *
 * @author ACISZEK1
 */
public class Loto2Dimmensions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables
        int loto[][] = {{18,21,26,44,47,3},{5,10,15,43,45,9},{6,8,31,36,45,9},{2,13,24,39,48,1},{13,28,37,45,48,9},{7,8,22,28,38,10},{3,21,32,33,38,10},{4,7,14,31,37,8},{6,20,24,31,36,4},{4,14,23,35,46,7},{19,31,38,44,49,3},{18,21,32,33,41,9},{5,17,23,43,49,4},{2,10,13,35,40,1},{1,2,27,31,45,8},{11,18,24,41,48,2},{23,34,36,39,49,8},{22,23,26,29,40,5},{8,15,24,39,48,8},{1,3,7,14,38,5},{6,11,12,19,45,10},{7,13,24,36,42,4},{5,16,18,34,37,5},{7,13,30,44,48,7},{1,18,29,39,40,2},{21,28,39,46,49,1},{2,34,41,44,46,2},{9,21,42,43,46,6},{8,9,28,35,42,6},{25,29,34,44,47,9},{2,15,28,36,49,3},{1,9,18,24,46,7},{1,4,15,18,38,6},{6,8,16,32,37,7},{1,13,36,44,48,2},{10,11,23,43,49,10},{5,9,18,26,36,9},{2,17,23,25,37,7},{8,11,19,48,49,7},{9,25,34,38,49,1},{4,7,24,29,46,10},{3,17,27,34,41,4},{1,9,24,26,35,4},{2,17,22,38,44,8},{9,16,24,32,42,3},{2,9,12,21,29,7},{4,11,31,36,46,10},{13,22,33,36,49,4},{2,11,28,33,43,1},{17,18,21,36,47,6},{20,35,39,42,48,2},{5,32,33,46,49,1},{21,26,33,46,49,1},{3,6,22,35,47,1},{3,8,12,29,35,1},{2,17,40,46,48,10},{12,17,24,30,38,7},{9,26,27,29,36,5},{9,27,31,32,44,8},{14,22,23,27,28,4},{4,10,33,35,41,5},{1,16,29,31,39,2},{4,10,18,27,30,1},{8,11,12,26,48,6},{3,6,28,39,42,5},{14,17,18,28,44,2},{12,19,41,42,49,8},{7,11,16,37,47,10},{1,16,27,35,41,1},{24,35,37,45,48,2},{19,21,23,36,49,4},{3,9,15,40,48,10},{15,23,45,48,49,2},{15,24,30,43,48,7},{14,20,24,44,48,10},{26,28,29,42,48,1},{22,31,37,43,45,5},{11,14,17,23,43,10},{2,8,25,28,44,4},{7,10,25,37,47,10},{4,23,37,42,43,7},{7,16,18,33,43,5},{3,9,21,43,45,1},{10,16,24,27,47,5},{20,22,28,32,47,6},{5,11,26,30,48,1},{11,15,24,38,47,6},{12,27,30,32,42,7},{20,26,31,47,49,10},{22,31,33,39,43,10},{2,10,28,33,46,8},{3,16,22,28,49,4},{13,16,18,19,20,2},{19,23,36,39,49,3},{9,16,28,41,49,5},{8,14,29,44,48,7},{23,27,43,46,49,6},{13,22,28,31,40,9},{9,11,21,27,49,5},{5,7,8,22,26,2},{7,8,15,18,25,6},{5,6,27,43,46,7},{8,9,22,32,46,8},{16,32,37,38,44,3},{25,26,32,33,41,3},{1,15,22,23,46,9},{5,12,21,29,42,2},{2,14,17,37,38,1},{1,17,25,37,45,9},{1,7,11,33,43,1},{1,8,30,38,40,6},{8,25,33,39,43,8},{7,13,36,41,45,5},{13,21,24,44,47,3},{17,19,22,29,43,8},{9,11,15,42,49,3},{16,20,21,33,39,2},{4,14,22,35,38,5},{3,13,15,32,46,5},{4,10,36,40,41,10},{9,14,16,47,49,7},{11,13,18,24,33,7},{1,26,29,31,38,5},{1,13,22,37,46,9},{9,22,25,33,44,3},{1,4,9,20,35,8},{2,17,23,26,43,3},{6,25,33,37,43,1},{7,9,29,31,46,8},{7,13,16,35,41,1},{15,16,23,30,41,8},{9,10,15,43,44,5},{14,20,22,32,47,5},{4,17,21,23,26,2},{1,11,12,27,29,2},{4,9,30,38,46,10},{14,17,20,33,47,1},{5,17,25,29,38,2},{16,20,39,47,48,4},{6,9,14,35,47,9},{7,19,24,35,42,3},{6,15,33,46,49,1},{1,15,17,24,28,10},{11,15,29,46,47,3},{13,30,39,42,44,9},{7,10,16,29,30,5},{1,8,18,29,36,9},{6,9,13,23,32,4},{11,22,35,40,41,7},{4,6,16,28,37,8},{6,9,14,40,49,3},{3,9,11,28,38,1},{4,15,19,24,44,1},{13,25,30,33,36,9},{7,12,15,24,33,6},{14,31,32,34,46,3}};
        int freq1[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}, freq2[] = {0,0,0,0,0,0,0,0,0,0};
        int i, j, t, choix, semaine;
        String resultat;
        
        do {
            System.out.println("\n1- Exercice 1");
            System.out.println("2- Exercice 2");
            System.out.println("3- Exercice 3");
            System.out.println("4- Exercice 4");
            System.out.println("7- Quitter");
            
            // Demande du choix
            System.out.print("Choix --> ");
            choix = Saisir.i();
            
            switch(choix) {
                case 1:
                    // Parcours du tableau
                    for(i = 0; i <= 4 ;i++) {
                        resultat = loto[2][i] + " - ";
                        System.out.print(resultat);            
                    }
                    
                    // Affichage du résultat
                    System.out.print("numéro chance : " + loto[2][5] + " ");
                    break;
                    
                case 2:
                    // Parcours du tableau
                    for(j = 0; j <= 155; j++) {
                        resultat = loto[j][5] + " - ";
                        System.out.print(resultat);
                    }
                    break;
                    
                case 3:
                    i = 0;
                    for(semaine = 1; semaine <= 52; semaine++) {
                        System.out.println("\nSemaine " + semaine);
                        for(t = 1; t <= 3; t++) {
                            System.out.println("\nTirage : " + t);
                            for(j = 0; j <= 4; j++) {
                                resultat = loto[i][j] + " - ";
                                System.out.print(resultat);
                            }
                            // Affichage
                            System.out.print("numéro chance : " + loto[i][5]);
                            i++;
                        }
                    }
                    break;
                case 4:
                    for(i = 0; i <= 155; i++) {
                        for(j = 1; j <= 4; j++) {
                            System.out.print(loto[i][j] + " - ");
                        }
                    }
                    break;
                default:
                    System.out.println("Choix non disponible !");
                    break;
            }       
        
        }while(choix != 7);
    }
}
