public class FeistelCipher {

    public static void main(String[] args) {
        String plaintext = "hello";
        String key = "1010";

        String ciphertext = encrypt(plaintext, key);
        System.out.println("Ciphertext: " + ciphertext);

        String decryptedText = decrypt(ciphertext, key);
        System.out.println("Decrypted text: " + decryptedText);
    }

    public static String encrypt(String plaintext, String key) {
        StringBuilder ciphertext = new StringBuilder();

        for (char ch : plaintext.toCharArray()) {
            String binary = String.format("%8s", Integer.toBinaryString(ch))
                    .replace(' ', '0');
            String encrypted = feistelRound(binary, key);
            ciphertext.append(encrypted);
        }

        return ciphertext.toString();
    }

    public static String decrypt(String ciphertext, String key) {
        StringBuilder plaintext = new StringBuilder();

        for (int i = 0; i < ciphertext.length(); i += 8) {
            String block = ciphertext.substring(i, i + 8);
            String decrypted = feistelRound(block, key);
            int ascii = Integer.parseInt(decrypted, 2);
            plaintext.append((char) ascii);
        }

        return plaintext.toString();
    }

    public static String feistelRound(String binary, String key) {
        String left = binary.substring(0, 4);
        String right = binary.substring(4, 8);

        String newLeft = right;
        String feistelOutput = feistelFunction(right, key);
        String newRight = xor(left, feistelOutput);

        return newRight + newLeft;
    }

    public static String feistelFunction(String right, String key) {
        int r = Integer.parseInt(right, 2);
        int k = Integer.parseInt(key, 2);
        int result = (2 * (int) Math.pow(r, k)) % 16;
        return String.format("%4s", Integer.toBinaryString(result)).replace(' ', '0');
    }

    public static String xor(String a, String b) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char bitA = a.charAt(i);
            char bitB = b.charAt(i);
            char xorBit = (bitA != bitB) ? '1' : '0';
            result.append(xorBit);
        }

        return result.toString();
    }
}
