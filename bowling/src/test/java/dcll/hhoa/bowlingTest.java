package dcll.hhoa;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class bowlingTest {
    private Bowling g;

    @Before
    public void init() {
        g = new Bowling();
    }

    void rollMany(int n, int pins, Bowling g) {
        for (int i = 0; i < n; i++) {
            g.lance(pins);
        }
    }

    @Test
    public void testGetLancerCourant(){
        g.lance(5);
        g.lance(4);
        g.lance(6);
        assertEquals(3, g.getLancerCourant());
    }

    @Test
    public void testLancer(){
        g.lance(7);
        g.lance(3);
        int[] l = g.getLancer();
        assertEquals(l[0], 7);
        assertEquals(l[1], 3);
    }

    @Test
    public void testZero() {
        rollMany(20, 0, g);
        assertEquals(0, g.score());
    }

    @Test
    public void testAllOnes() {
        rollMany(20, 1, g);
        assertEquals(20, g.score());
    }

    @Test
    public void testOneSpare() {
        g.lance(5);
        g.lance(5);
        g.lance(3);
        rollMany(17, 0, g);
        assertEquals(16, g.score());
    }

    @Test
    public void testOneStrike() {
        g.lance(10);
        g.lance(3);
        g.lance(4);
        rollMany(16, 0, g);
        assertEquals(24, g.score());
    }

    @Test
    public void testPerfectGame() {
        rollMany(12, 10, g);
        assertEquals(300, g.score());
    }

    @Test
    public void testScore1(){
        g.lance(9);
        g.lance(0);
        g.lance(9);
        g.lance(0);
        g.lance(9);
        g.lance(0);
        g.lance(9);
        g.lance(0);
        g.lance(9);
        g.lance(0);

        g.lance(9);
        g.lance(0);
        g.lance(9);
        g.lance(0);
        g.lance(9);
        g.lance(0);
        g.lance(9);
        g.lance(0);
        g.lance(9);
        g.lance(0);

        assertEquals(90, g.score());
    }

    @Test
    public void testScore2(){
        g.lance(5);
        g.lance(5);
        g.lance(5);
        g.lance(5);
        g.lance(5);

        g.lance(5);
        g.lance(5);
        g.lance(5);
        g.lance(5);
        g.lance(5);

        g.lance(5);
        g.lance(5);
        g.lance(5);
        g.lance(5);
        g.lance(5);

        g.lance(5);
        g.lance(5);
        g.lance(5);
        g.lance(5);
        g.lance(5);

        g.lance(5);

        assertEquals(150, g.score());
    }
}