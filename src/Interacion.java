
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by chawki on 03/10/16.
 */

public class Interacion {

    private List<Joueur> joueurs = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);


    public void showMenu() {

        System.out.print("Combien de joueur vous etes : ");
        int nbJoueur = sc.nextInt();

        //TODO: boucle de controle

        //boucle pour creer des joueur
        for (int i = 0; i < nbJoueur; i++) {
            joueurs.add(new Joueur("player " + (i + 1)));

        }


        System.out.print("Combien de parti voulez vous : ");
        int nbparti = sc.nextInt();

        //TODO: boucle de controle


        System.out.println("\nVous etes " + joueurs.size() + " joueur , la parti peu commencer en " + nbparti + " manche !!");

        //boucle pour le deroulement de la parti
        for (int j = 0; j < nbparti; j++) {

            System.out.println("\n+--- Parti n : " + (j + 1) + " --+\n|                  |");


            for (int i = 0; i < joueurs.size(); i++) {
                joueurs.get(i).setScoreJoueur(De.aleatoire());
                joueurs.get(i).setScoreTotalJoueur(joueurs.get(i).getScoreJoueur());
                System.out.println("|  -" + joueurs.get(i).getNomJoueur() + " : " + joueurs.get(i).getScoreJoueur() + "   |");
            }

            System.out.println("+------------------+");

        }

        System.out.println("\n==== Affichage du score totale des joueur ====");

        for (int i = 0; i < joueurs.size(); i++) {
            System.out.println("     score total du joueur n " + (i + 1) + " : " + joueurs.get(i).getScoreTotalJoueur());
        }

        winner();

    }
    //methode pour trouver le gagnant de la parti
    private void winner() {
        int winner = joueurs.get(0).getScoreTotalJoueur();
        int position = 0;
        for (int i = 1; i < joueurs.size(); i++) {
            if (joueurs.get(i).getScoreTotalJoueur() > winner) {
                winner = joueurs.get(i).getScoreTotalJoueur();
                position = i;

            }
        }
        System.out.println("\nLe gagnant est " + joueurs.get(position).getNomJoueur() + " avec un score total de " + joueurs.get(position).getScoreTotalJoueur());
    }


}
