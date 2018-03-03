public class CeaserCypher {
    public String text;
    private static char [] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public CeaserCypher(String message){
        text = message;
    }
    public String eText(){
        StringBuilder sb = new StringBuilder ();
//        for (int i = 0; i<text.length(); i++) {
//            sb.append(alphabet[i+])
//        }
        for (char ch: text.toCharArray()){
            int value = (int)ch;
            int eValue = (value + 5) % 26;
            char cValue = (char)eValue;
            sb.append(cValue);
        }
        return sb.toString();
    }

}
