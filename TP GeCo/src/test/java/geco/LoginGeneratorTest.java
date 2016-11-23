package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {
    private LoginGenerator loginGenerator;
    @Before
    public void setUp() throws Exception {
        LoginService loginService = new LoginService(new String[] {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});
        loginGenerator = new LoginGenerator(loginService);
    }

    @Test
    public void testGenerateLoginForNomAndPrenom() throws Exception {
        assertEquals("PDUR", loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul"));
        assertEquals("JROL1", loginGenerator.generateLoginForNomAndPrenom("Rolling", "Jean"));
        assertEquals("PDUR1", loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul"));
        assertEquals("JRAL2", loginGenerator.generateLoginForNomAndPrenom("Ralling", "John"));
    }
}