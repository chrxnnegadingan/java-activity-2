
public class LibraryManagement {

    public static void main(String[] args) {

        String bookTitle = "Introduction to Programming";
        String borrowerName = "Juan Dela Cruz";
        int availableBooks = 10;
        int borrowedBooks = 3;
        double bookPrice = 450.50;
        boolean isReturned = false;

        // ERROR 1: Missing semicolon at the end of the statement.
        int remainingBooks = availableBooks - borrowedBooks

        // ERROR 2: The variable lateFee is not declared.
        lateFee = 50.00;

        // ERROR 3: A String cannot store a numeric calculation
        // without converting the result to a String.
        String totalFine = lateFee * 2;

        // ERROR 4: The assignment operator is used instead of ==.
        if (availableBooks = 0) {
            System.out.println("No books available.");
        }

        // ERROR 5: The variable returnDate is not declared.
        System.out.println("Return Date: " + returnDate);

        // ERROR 6: The method printLine() does not exist
        // in System.out. The correct method is println().
        System.out.printLine("Book: " + bookTitle);

        // ERROR 7: Incorrect capitalization of the variable name.
        System.out.println("Borrower: " + borrowername);

        System.out.println("Available Books: " + availableBooks);
        System.out.println("Remaining Books: " + remainingBooks);
        System.out.println("Book Price: " + bookPrice);
        System.out.println("Total Fine: " + totalFine);
        System.out.println("Returned: " + isReturned);
    }
}
