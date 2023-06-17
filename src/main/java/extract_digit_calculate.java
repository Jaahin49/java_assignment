//A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?
// [Extract the digits from the paragraph and calculate the price]
public class extract_digit_calculate {
    public static void main(String[] args) {
        String str= "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, " +
                "what will be my total cost after giving 15% discount?";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr=(str.split(" "));
        double laptop_price = Double.parseDouble(arr[1]);
        double mouse_price  = Double.parseDouble(arr[2]);

        double regular_price=laptop_price + mouse_price;
        double after_discount=regular_price*.15;
        double total = (regular_price-after_discount);
        System.out.println("The total price is :" + total);
    }
}
