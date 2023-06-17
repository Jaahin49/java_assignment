//Find out the second-largest element of the given array numbers=[5,3,9,7,4,1,8]
public class second_largest_element {
    public static void main(String[] args) {

        int[] arr = {5, 3, 9, 7, 4, 1, 8};
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest number is:" + secondLargest);
    }
}




