import org.junit.Test;

import static org.junit.Assert.*;

public class DecodingTest {
    Decoding testDecoding = new Decoding( 2, "MGNXKP MQUIGK");

    @Test
    public void checkIfSavesInputText()
    {
        assertEquals("MGNXKP MQUIGK", testDecoding.getInputText() );
    }

    @Test
    public void checkKeyIsSaved()
    {
        assertEquals(2,testDecoding.getKey());
    }

    @Test
    public void isValidInputText()
    {
        assertEquals(true, testDecoding.isValidInputText());
    }
}