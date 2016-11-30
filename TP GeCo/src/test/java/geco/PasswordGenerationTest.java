package geco;

import static org.junit.Assert.*;

public class PasswordGenerationTest {
    private PasswordGeneration pg;
    public void testSetRandomPassword(){
        assertNotEquals(pg.getRandomPassword(), pg.getRandomPassword());
    }

}