//Write a program that will find your key is found in the given array using linear search method numbers=[1,6,9,3,5,4,7]
// key=5
public class linear_search {
    public static void main(String[] args) {
        int [] numbers = {1,6,9,3,5,4,7};
        int key = 5;
        boolean found = false;
        for(int i = 0; i<numbers.length-1; i++){
            if(numbers[i] == key){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}
