package session2.class_problems;

/**
 * Problem 2: CSV Student Record Parser
 * Parses "Name,RollNumber,Department" lines into a formatted record.
 */
public class CsvStudentRecordParser {

    static void parseStudentRecord(String csvLine) {
        // TODO: split(",") into fields, validate exactly 3 fields present,
        // print "Name: ... | Roll No: ... | Dept: ..." or "Invalid Record"
    }

    public static void main(String[] args) {
        parseStudentRecord("Ananya Verma,RA2211003010123,CSE");
        parseStudentRecord("Ananya Verma,CSE");
    }
}
