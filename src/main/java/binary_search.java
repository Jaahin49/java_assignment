//Write a program that will find your key is found in the given array using binary search method numbers=[1,6,9,3,5,4,7]
//key=5
import java.util.Arrays;
public class binary_search {
    public static void main(String[] args) {
        int key =5;
        int [] numbers = {1,6,9,3,5,4,7};
        Arrays.sort(numbers);
        int l = 0;
        int h = numbers.length-1;
        int m = (l+h)/2;
        while(l<=h) {
            if (numbers[m] < key) {
                l = m + 1;
            }
            else if (numbers[m] == key) {
                System.out.println("Element is found at index: " + m);
            break;
        }
            else {
                h = m - 1;
            }
            m = (l + h) / 2;
        }
        if (l > h) {
            System.out.println("Element is not found!");
        }

        }
}






