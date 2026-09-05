package session2.class_problems;

/**
 * Problem 4: Masked Phone Number Formatter
 * Masks a 10-digit phone number, showing only the last 4 digits.
 */
public class MaskedPhoneNumberFormatter {

    static String maskPhoneNumber(String phone) {
        // TODO: validate exactly 10 digits (all numeric)
        // build "XXXXXX-<last4>" using StringBuilder
        // return the masked number, or "Invalid phone number"
        return "";
    }

    public static void main(String[] args) {
        System.out.println(maskPhoneNumber("9876543210"));
        System.out.println(maskPhoneNumber("98765"));
    }
}
