package session2.class_problems;

/**
 * Problem 3: File Extension Validator
 * Checks whether a filename has an accepted extension (pdf, docx, zip).
 */
public class FileExtensionValidator {

    static String validateFileExtension(String filename) {
        // TODO: find last '.' using lastIndexOf('.'), extract extension with substring()
        // compare case-insensitively against pdf, docx, zip
        // return "Accepted" or "Rejected — invalid file type"
        return "";
    }

    public static void main(String[] args) {
        System.out.println(validateFileExtension("Assignment1.PDF"));
        System.out.println(validateFileExtension("notes.txt"));
    }
}
