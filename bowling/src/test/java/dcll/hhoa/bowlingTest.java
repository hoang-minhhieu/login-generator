package dcll.hhoa;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class bowlingTest {
    private bowling g;

    @Before
    public void init() {
        g = new bowling();
    }

    void rollMany(int n, int pins, bowling g) {
        for (int i = 0; i < n; i++) g.lance(pins);
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
}