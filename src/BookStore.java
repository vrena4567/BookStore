import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookStore {
    private Map<Book, Integer> bookList;

    BookStore() {
        this.bookList = new HashMap<>();
    }

    public void addBook(Book book) {
        if (bookList.containsKey(book)) {
            int eddigMennyiIlyenKonyvVan = bookList.get(book);
            bookList.put(book, eddigMennyiIlyenKonyvVan + 1);
        } else {
            bookList.put(book, 1);
        }
    }

    public void addMultipleBooks(Book book, int quantity) {
        bookList.put(book, quantity);
    }

    public Book findBook(String title) throws BookNotFoundException {
        for (Book actual : bookList.keySet()) {
            if (actual.getTitle().equals(title)) {
                return actual;
            }
        }
        throw new BookNotFoundException("Book not found " + title);
    }

    public void displayBooks() {
        System.out.println(bookList);
    }
}
