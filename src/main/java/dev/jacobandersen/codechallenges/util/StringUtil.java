package dev.jacobandersen.codechallenges.util;

public class StringUtil {
    private StringUtil() {
    }

    public static String toHex(byte[] bytes) {
        final StringBuilder builder = new StringBuilder();
        for (byte b : bytes) {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }

    public static Integer tryParseInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            return null;
        }
    }
}
