package test;

import main.A;
import main.B;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nicolas on 28/12/16.
 */
public class AppTest {
    A a;
    B b;

    @org.junit.Before
    public void setUp() throws Exception {
        a = new A();
        b = new B(a);
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @Test
    public void testFoo()
    {

        int result = 0;
        try {
            result = b.fooB(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(6, result);
    }

    @Test
    public void testBar()
    {

        int result = 0;
        try {
            result = b.barB(5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(14, result);
    }

}