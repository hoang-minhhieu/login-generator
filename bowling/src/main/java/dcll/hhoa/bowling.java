package dcll.hhoa;

/**
 * Created by 21107237 on 07/11/2016.
 */

public class bowling {
    int[] lancer;
    int lancerCourant;

    public bowling() {
        this.lancer = new int[21];
    }

    public void lance(int p) {
        lancer[lancerCourant++] = p;
    }

    public int score() {
        int score = 0;
        int jeu = 0;

        for (int i = 0; i < 10; i++) {
            if (isStrike(jeu)) {
                score += 10 + strikeBonus(jeu);
                jeu++;
            } else if (isSpare(jeu)) {
                score += 10 + spareBonus(jeu);
                jeu += 2;
            } else {
                score += sumOfRolls(jeu);
                jeu += 2;
            }
        }
        return score;
    }

    private boolean isStrike(int jeu) {
        return lancer[jeu] == 10;
    }

    private boolean isSpare(int jeu) {
        return sumOfRolls(jeu) == 10;
    }

    private int strikeBonus(int jeu) {
        return sumOfRolls(jeu+1);
    }

    private int spareBonus(int jeu) {
        return lancer[jeu+2];
    }

    private int sumOfRolls(int frame) {
        return lancer[frame] + lancer[frame+1];
    }
}
