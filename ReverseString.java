public class ReverseString {

    public static String reverse(String str, int index) {

        if (index < 0)
            return "";

                 return (str.charAt(index)) + reverse(str, index - 1);
    }

    public static void main(String[] args) {
        String s = "hello";
    System.out.println(s);
        String res =   reverse(s, s.length() - 1);

        System.out.println(res);
    }
}
