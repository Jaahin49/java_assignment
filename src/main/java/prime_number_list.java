//Print the prime numbers of 2 to 100
public class prime_number_list {
    public static void main(String[] args) {

        int num = 100;
        for(int i = 2; i<=num; i++){
            boolean isPrime = true;
            for (int j = 2; j <i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
