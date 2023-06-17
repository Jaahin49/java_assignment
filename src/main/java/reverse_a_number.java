//Take any number as input and print the reverse of the number
//input: 12345
//output: 54321
public class reverse_a_number {
    public static void main(String[] args) {
        int num = 12345;
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse of the number is:" + reverse);
    }
}
