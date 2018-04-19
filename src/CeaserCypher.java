public class CeaserCypher {
    public String text;
    private static char [] alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static int KEY = 70000;

    public CeaserCypher(String message){
        text = message;
    }
    public String eText(){
        StringBuilder sb = new StringBuilder ();
        for (char ch: text.toCharArray()){
            if (Character.isLetter(ch)) {
                // Get encryption index
                int alphabetIndex = asciiEncryptionIndex(ch);
                // Get encrypted character
                char encryptedChar = alphabet[alphabetIndex];
                // Add character to the string builder
                sb.append(encryptedChar);
            } else {
                sb.append(ch);
            }

        }
        return sb.toString();
    }
    public String deText (){
        StringBuilder sb = new StringBuilder ();
        for (char ch: text.toCharArray()) {
            if (Character.isLetter(ch)) {
                // Get decryption index
                int alphabetIndex = asciiDecryptionIndex(ch);
                // Get decrypted character
                char decryptedChar = alphabet[alphabetIndex];
                // Add character to the string builder
                sb.append(decryptedChar);
            } else {
                sb.append(ch);
            }

        }
        return sb.toString();
    }

    public int indexOfAscii(char c) {
        int i = (int)c;
        if (Character.isUpperCase(c)) {
            i = (i - 'A') + (alphabet.length / 2);
        } else {
            i = (i - 'a');
        }
        return i;
    }

    private int encryptionIndex(int i) {
        return (i + KEY) % alphabet.length;
    }

    private int asciiEncryptionIndex(char c) {
        return encryptionIndex(indexOfAscii(c));
    }

    private int decryptionIndex(int i) {
        return (i - KEY) % alphabet.length;
    }
    private int asciiDecryptionIndex (char c ){
        return (alphabet.length + decryptionIndex(indexOfAscii(c))) % alphabet.length;
    }
}
