package com.farafon.util.encode;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;

public class CharacterSets {
    public static String fromHex(String input) throws DecoderException {
        byte[] decoded = Hex.decodeHex(input);
        return new String(decoded, StandardCharsets.UTF_8);
    }
}
