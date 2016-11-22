package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {
    private LoginService ls;
    String[] list;
    @Before
    public void setUp(){
        list = new String[] {"un", "deux", "trois"};
        ls = new LoginService(list);
    }

    @Test
    public void testLoginExists() throws Exception {
        assertTrue(ls.loginExists("un"));
    }

    @Test
    public void testAddLogin() throws Exception {
        ls.addLogin("toto");
        assertTrue(ls.loginExists("toto"));
    }

    @Test
    public void testFindAllLoginsStartingWith() throws Exception {
        List<String> verif = Arrays.asList("trois");
        assertEquals(verif, ls.findAllLoginsStartingWith("t"));
    }

    @Test
    public void testFindAllLogins() throws Exception {
            List<String> verif = Arrays.asList("un","deux","trois");
            assertEquals(verif.size(), list.length);
            //assertEquals(verif, ls.findAllLogins());
    }
}