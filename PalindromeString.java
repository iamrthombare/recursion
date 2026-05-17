import java.util.*;

class PalindromeString {

    static boolean isPalindrome(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sc.next();

        if (isPalindrome(s, 0, s.length() - 1)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
