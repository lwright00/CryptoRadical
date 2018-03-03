import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CeaserCypherTests {
    @Test
    public void testCeaserCypherEncryption () {
        CeaserCypher cc = new CeaserCypher("zoobar");
        String es = cc.eText();
        assertEquals("string",es);
    }
}
