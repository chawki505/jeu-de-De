/**
 * Created by chawki on 03/10/16.
 */
public class Joueur {

    private int scoreJoueur = 0;
    private int scoreTotalJoueur = 0;
    private String nomJoueur = "none";

    public Joueur(String n) {
        this.nomJoueur = n;
    }

    public int getScoreJoueur() {
        return scoreJoueur;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public int getScoreTotalJoueur() {
        return scoreTotalJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public void setScoreJoueur(int scoreJoueur) {
        this.scoreJoueur = scoreJoueur;
    }

    public void setScoreTotalJoueur(int x) {
        this.scoreTotalJoueur += x;
    }
}
