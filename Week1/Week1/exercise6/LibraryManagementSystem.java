import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    private List<Book> books;

    public LibraryManagementSystem() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    public Book binarySearchByTitle(String title) {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Book midBook = books.get(mid);
            int comparison = midBook.getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return midBook;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        Book book1 = new Book("1", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("2", "1984", "George Orwell");
        Book book3 = new Book("3", "To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("All Books:");
        library.displayBooks();

        System.out.println("\nSearching for book titled '1984':");
        Book foundBook = library.linearSearchByTitle("1984");
        System.out.println(foundBook != null ? foundBook : "Book not found.");
    }
}
