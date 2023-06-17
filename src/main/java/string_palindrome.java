//Check if the given string is palindrome or not. Palindrome means after reversing a string, it will be same.
public class string_palindrome {
    public static void main(String[] args) {
        String str = "civic";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    }

