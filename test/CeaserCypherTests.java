import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CeaserCypherTests {
    @Test
    public void testCeaserCypherEncryption () {
        String message = "This is a very important message to encrypt";
        CeaserCypher cc = new CeaserCypher(message);
        String es = cc.eText();
        CeaserCypher dc = new CeaserCypher(es);
        String ds = dc.deText();
        assertEquals(message, ds);
    }

    @Test
    public void testAsciiToIndex_LowercaseLetter() {
        CeaserCypher cc = new CeaserCypher("");
        int I = cc.indexOfAscii('z');
        assertEquals(I,25);
    }

    @Test
    public void testAsciiToIndex_UppercaseLetter() {
        CeaserCypher cc = new CeaserCypher("");
        int index = cc.indexOfAscii('Z');
        assertEquals(index,51);
    }
}
