package Caesar_Menu;

public class Cipher {
    public static String encode(String str, int shift) {
        StringBuilder encoded = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                encoded.append((char) ((ch - base + shift) % 26 + base));
            } else {
                encoded.append(ch);
            }
        }
        return encoded.toString();
    }

    public static String decode(String str, int shift) {
        return encode(str, 26 - (shift % 26));
    }
}