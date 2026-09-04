package session1.assignment_problems;

/**
 * Assignment 1: The Exam Hall Seat Duplication Checker
 * Flags duplicate seat numbers using arrays and nested loops only (no Collections).
 */
public class ExamHallSeatDuplicationChecker {

    static void checkDuplicateSeats(int[] seatNumbers) {
        boolean foundDuplicate = false;
        // TODO: compare every seat number against every other seat number
        // print "Duplicate Seat Number Found: X" for each duplicate found
        if (!foundDuplicate) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        checkDuplicateSeats(new int[]{101, 102, 103, 102, 105});
        checkDuplicateSeats(new int[]{101, 102, 103, 104, 105});
    }
}
