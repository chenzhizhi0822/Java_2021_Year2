
public class StringReverser{
    public static void main(String[] args) {
        String s = args[0];
        for(int i=0; i<s.length(); i++){
            if (s.charAt(s.length()-i-1) != ' ') {
                System.out.print(s.charAt(s.length()-i-1));
            }
        }
    }
}