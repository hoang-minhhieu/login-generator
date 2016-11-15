package dcll.hhoa;

/**
 * Created by 21107237 on 07/11/2016.
 */

public class bowling {
    /**
     * Le nombre de jeu.
     */
    public static final int NBJEU = 10;
    /**
     * Le score on gagne si strike/spare.
     */
    public static final int MAX_SCORE = 10;
    /**
     * Taille max du tableau lance.
     */
    public static final int MAX_TAILLE = 21;
    /**
        Le tableau pour enregistrer les scores de chaque jeu.
     */
    private int[] lancer;
    /**
     * Le score du lancer courant.
     */
    private int lancerCourant;

    /**
        Constructeur.
     */
    public bowling() {
        this.lancer = new int[MAX_TAILLE];
    }

    /**
        @return  Lancer Courant
     */
    public final int getLancerCourant() {
        return lancerCourant;
    }

    /**
        @return  Lancer
     */
    public final int[] getLancer() {
        int[] l = lancer;
        return l;
    }

    /**
        @param p la valeur d'un lance
     */
    public final void lance(final int p) {
        lancer[lancerCourant++] = p;
    }

    /**
        @return score le résultat du score final
     */
    public final int score() {
        int score = 0;
        int jeu = 0;

        for (int i = 0; i < NBJEU; i++) {
            if (isStrike(jeu)) {
                score = score + NBJEU + strikeBonus(jeu);
                jeu = jeu + 1;
            } else if (isSpare(jeu)) {
                score = score + NBJEU + spareBonus(jeu);
                jeu = jeu + 2;
            } else {
                score = score + sumOfRolls(jeu);
                jeu = jeu + 2;
            }
        }
        return score;
    }

    /**
     *  @param jeu un jeu
        @return boolean si c'est un strike
     */
    private boolean isStrike(final int jeu) {
        return lancer[jeu] == MAX_SCORE;
    }

    /**
     *  @param jeu  un jeu
        @return boolean si c'est un spare
     */
    private boolean isSpare(final int jeu) {
        return sumOfRolls(jeu) == MAX_SCORE;
    }

    /**
     *  @param jeu un jeu
        @return le bonus d'un strike
     */
    private int strikeBonus(final int jeu) {
        return sumOfRolls(jeu + 1);
    }

    /**
     *  @param jeu un jeu
        @return le bonus d'un spare
     */
    private int spareBonus(final int jeu) {
        return lancer[jeu + 2];
    }

    /**
        @param jeu un jeu
        @return La somme de 2 jeux consécutifs
     */
    private int sumOfRolls(final int jeu) {
        return lancer[jeu] + lancer[jeu + 1];
    }
}
