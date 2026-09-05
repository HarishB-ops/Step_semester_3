package session2.assignment_problems;

/**
 * Assignment 4: Library ISBN Normalizer & Validator
 * Normalizes and validates a 13-char code: 3-letter publisher code + 4-digit year + 6-digit catalog number.
 */
public class LibraryIsbnNormalizerValidator {

    static String normalizeCode(String raw) {
        // TODO: trim() spaces, uppercase only the first 3 characters using substring() + concatenation
        return "";
    }

    static String validateAndFormat(String code) {
        // TODO: validate exactly 13 chars; first 3 are letters, remaining 10 are digits
        // (Character.isLetter() / isDigit() in a loop - no regex)
        // if valid: "[PUBCODE] YEAR: 20XX | CATALOG: 123456" using StringBuilder
        // if invalid: print specific reason (wrong length / non-letter publisher code / non-digit body)
        return "";
    }

    public static void main(String[] args) {
        String code1 = normalizeCode(" pen2026004251 ");
        System.out.println(validateAndFormat(code1));

        String code2 = normalizeCode("12N2026004251");
        System.out.println(validateAndFormat(code2));
    }
}
