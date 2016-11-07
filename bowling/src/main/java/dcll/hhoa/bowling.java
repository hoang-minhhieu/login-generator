package dcll.hhoa;

/**
 * Created by 21107237 on 07/11/2016.
 */

public class bowling {

    private int reste;
    private int quillesTombees;
    private int nbEssais;

    public bowling(int r, int q, int e){
        reste = r;
        quillesTombees = q;
        nbEssais = e;
    }

    public int getReste() {
        return reste;
    }

    public int getQuillesTombees() {
        return quillesTombees;
    }

    public int getNbEssais(){
        return nbEssais;
    }

    public String strike(){
            return "X";
    }



}
