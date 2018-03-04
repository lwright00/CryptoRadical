import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CeaserCypherTests {
    @Test
    public void testCeaserCypherEncryption () {
        CeaserCypher cc = new CeaserCypher("zoobar");
        String es = cc.eText();
        CeaserCypher dc = new CeaserCypher(es);
        String ds = dc.deText();
        assertEquals("zoobar",ds);
    }
    @Test
    public void testAtoI() {
        CeaserCypher cc = new CeaserCypher("zoobar");
        int I = cc.atoi('z');
        assertEquals(I,26);
    }
}
