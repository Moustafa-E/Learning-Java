package uk.project;


import org.junit.jupiter.api.Test;
import static uk.project.Main.fletcher32;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainFunctionsTest {
    @Test
    public void fletcher32Test(){
        byte[] data = {0x48, 0x65, 0x6C, 0x6C, 0x6F};
        int expectedChecksum = 16711935;

        String expectedHexString = Integer.toHexString(expectedChecksum);
        String result = Integer.toHexString(fletcher32(data));

        assertEquals(expectedHexString, result);
    }

}
