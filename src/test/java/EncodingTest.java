import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingTest {
    Encoding testEncoding = new Encoding("KELVIN", 2);
    @Test
    public void checkIfItCreatesInstance()
    {
        assertEquals(true, testEncoding instanceof Encoding);
    }

    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("KELVIN", testEncoding.getInputText() );
    }

}