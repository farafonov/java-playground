package com.farafon.util.encode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CharacterSetsTest {
    @Test
    public void testFromHexToChar() throws Exception
    {
        String space = CharacterSets.fromHex("20");
        assertEquals(" ", space);
        assertEquals("!", CharacterSets.fromHex("21"));

    }

    @Test
    public void testOctal() {
        int oct = 010;
        int dec = 10;
        assertNotEquals(oct, dec);
        assertEquals(oct, 8);
    }
}
