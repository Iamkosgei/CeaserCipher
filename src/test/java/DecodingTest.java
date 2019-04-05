import org.junit.Test;

import static org.junit.Assert.*;

public class DecodingTest {
    Decoding decoding = new Decoding( 2, "MGNXKP MQUIGK");

    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("MGNXKP MQUIGK", decoding.getInputText() );
    }
}