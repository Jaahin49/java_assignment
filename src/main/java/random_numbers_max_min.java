//Generate random 10 integer numbers in an array and print out all the numbers from array and also
// print the max and min number from the array
import java.util.Arrays;
public class random_numbers_max_min {
    public static void main(String[] args) {

            int[] numbers = new int[10];
            for(int i = 0; i < numbers.length; i++) {
                numbers[i] = (int)(Math.random()*10);
            }
            System.out.println("Numbers: " + Arrays.toString(numbers));

        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Max number is:" + max);
        System.out.println("Min number is:" + min);

    }
}
