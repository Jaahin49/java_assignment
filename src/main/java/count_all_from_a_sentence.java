//Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
public class count_all_from_a_sentence {
    public static void main(String[] args) {
        String mystr = "I live in Bangladesh";
        String[] str = mystr.split(" ");
        System.out.println("Number of words: " + str.length);
        int charCount = mystr.replaceAll(" ", "").length();
        System.out.println("Number of chars without spaces " + charCount);
        int vCount = 0, cCount = 0;
        String mstr = mystr.toLowerCase();
        for (int i = 0; i < mstr.length(); i++) {
            if (mstr.charAt(i) == 'a' || mstr.charAt(i) == 'e' || mstr.charAt(i) == 'i' || mstr.charAt(i) ==
                    'o' || mstr.charAt(i) == 'u')
            {
                vCount++;
            }
            else if(mstr.charAt(i) >= 'a' && mstr.charAt(i)<='z') {

                cCount++;
            }
        }
        System.out.println("Number of vowels " + vCount);
        System.out.println("Number of constant " + cCount);
    }
}

