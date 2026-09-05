package session2.class_problems;

/**
 * Problem 5: Bank Transaction Reference Generator & Validator
 * Normalizes and validates a 14-char reference: 3-letter bank code + 6-digit date (ddMMyy) + 5-digit sequence.
 */
public class BankTransactionReferenceGeneratorValidator {

    static String normalizeReference(String raw) {
        // TODO: trim() spaces, uppercase only the first 3 characters using substring() + concatenation
        return "";
    }

    static String validateAndFormat(String reference) {
        // TODO: validate exactly 14 chars; first 3 are letters (Character.isLetter());
        // remaining 11 are digits (Character.isDigit()) in a loop - no regex
        // if valid: "[BANKCODE] DATE: dd/MM/yy | SEQ: 12345" using StringBuilder
        // if invalid: print specific reason (wrong length / non-letter bank code / non-digit body)
        return "";
    }

    public static void main(String[] args) {
        String ref1 = normalizeReference(" hdf03022600042 ");
        System.out.println(validateAndFormat(ref1));

        String ref2 = normalizeReference("12F03022600042");
        System.out.println(validateAndFormat(ref2));
    }
}
