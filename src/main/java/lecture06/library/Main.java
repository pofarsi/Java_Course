package lecture06.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Admin admin = new Admin(library);
        admin.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
    }
}
