package geco;

import java.util.Random;

/**
 * Created by 21107237 on 30/11/2016.
 */
public class PasswordGeneration {

    static final String AB = "abcdefghijklmnopqrstuvwxyz";
    static Random rnd = new Random();
    
    public String getRandomPassword(){
        StringBuilder sb = new StringBuilder(8);
        for( int i = 0; i < 8; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }

}
