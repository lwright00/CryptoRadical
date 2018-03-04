public class CeaserCypher {
    public String text;
    private static char [] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public CeaserCypher(String message){
        text = message;
    }
    public String eText(){
        StringBuilder sb = new StringBuilder ();
        for (char ch: text.toCharArray()){
            // Get the encryption index
            int I = eAtoI(ch);
            // use the encryption index get the character from the alphabet array
            char eChar = alphabet[I];
            // add the new encryption character to sb
            sb.append(eChar);
        }
        return sb.toString();
    }
    public String deText (){
        StringBuilder sb = new StringBuilder ();
        for (char ch: text.toCharArray()) {
            int I = dAtoI(ch);
            char dChar = alphabet[I];
            sb.append(dChar);
        }
        return sb.toString();
    }

    public int atoi(char c) {
        int i = (int)c;
        i = (i - 'a');
        return i;

    }
    private int eAtoI (char c) {
        int e = (atoi(c) + 3976) % 26;
        return e;
    }

    private int dAtoI ( char c ){
        int d = (atoi(c) - 3976) % 26;
        return d;
    }
}
