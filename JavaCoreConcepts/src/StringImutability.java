public class StringImutability {

    public static void main(String[] args) {
        String s = "bababababababa";

        while (s.length() > 0) {
            s = s.replaceFirst("ba", "");
            System.out.println(s);
        }
    }


}
