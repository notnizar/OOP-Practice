public class Test {

    public static void main(String[] args) {
        Library myLibrary = new Library(5);

        Book b1 = new Book("Java 101", "Nizar", 20.0);
        Book b2 = new Book("Python 101", "Sara", 35.5);

        myLibrary.addBook(b1);
        myLibrary.addBook(b2);

        Book found = myLibrary.searchByTitle("Java 101");
        if (found != null) {
            System.out.println("Found: " + found);
        }

        myLibrary.removeBook("Java 101");

        Book found2 = myLibrary.searchByTitle("Java 101");
        if (found != null) {
            System.out.println("Found: " + found2);
        }
    }
}
