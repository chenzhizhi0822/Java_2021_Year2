public class string {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        if (s1.equals(s2)) {
            System.out.println("match");
        } else {
            System.out.println("bumatch");
        }
    }
}
