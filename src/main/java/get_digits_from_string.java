//Extract the OTP from the SMS. "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S"
public class get_digits_from_string {
    public static void main(String[] args) {
        String message="Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S";
        String code=message.replaceAll("[^0-9]", "").substring(0, 6);
        System.out.println(code);
    }
}
