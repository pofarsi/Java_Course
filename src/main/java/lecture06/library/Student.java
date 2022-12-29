package lecture06.library;

public class Student {
    private Library library;

    public Student(Library library) {
        this.library = library;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book is not available");
        }
    }
}