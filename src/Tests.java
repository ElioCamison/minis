import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void fractionTest() {
        Fraction f;

        f = new Fraction(10, 20);
        assertEquals("1/2", f.toString());

        f = new Fraction(20, 40);
        assertEquals("1/2", f.toString());

        f = new Fraction(200, 400);
        assertEquals("1/2", f.toString());

        f = new Fraction(50, 2);
        assertEquals("25", f.toString());

        f = new Fraction(3453, 4366);
        assertEquals("3453/4366", f.toString());

        f = new Fraction(764562, 345874);
        assertEquals("382281/172937", f.toString());

        f = new Fraction(6100413547l, 6080359541l);
        assertEquals("80917/80651", f.toString());
    }

    @Test
    public void clapTest() {
        assertEquals(2, Clap.claps(10));
        assertEquals(7, Clap.claps(25));
        assertEquals(37, Clap.claps(90));
        assertEquals(79, Clap.claps(190));
        assertEquals(59123, Clap.claps(105465));
        //assertEquals(59123, Clap.claps(655467845));
    }

    @Test
    public void pow2Test() {
        assertEquals(1, Pow2.maxPow2(1));
        assertEquals(4, Pow2.maxPow2(4));
        assertEquals(2, Pow2.maxPow2(18));
        assertEquals(32, Pow2.maxPow2(96));
        assertEquals(512, Pow2.maxPow2(1536));
        assertEquals(4194304, Pow2.maxPow2(12582912));
        assertEquals(2097152, Pow2.maxPow2(6291456));
    }

    @Test
    public void ipTest() {
        assertEquals(11, IP.port("127.0.0.1"));
        assertEquals(29, IP.port("192.168.1.1"));
        assertEquals(35, IP.port("172.76.54.21"));
        assertEquals(80, IP.port("216.58.214.164"));
    }

    @Test
    public void triangleTest() {
        Triangle t = new Triangle(0,0,10,10,0,10);
        assertArrayEquals(new double[]{45,45,90}, t.angles(), 0.01);

        t = new Triangle(0,0,20,5,0,10);
        assertArrayEquals(new double[]{75.96,28.07,75.96}, t.angles(), 0.01);

        t = new Triangle(0,0,3,5,0,5);
        assertArrayEquals(new double[]{30.96,59.03,90}, t.angles(), 0.01);

        t = new Triangle(0,0,3,5,0,6);
        assertArrayEquals(new double[]{30.96,77.47,71.56}, t.angles(), 0.01);
    }
}