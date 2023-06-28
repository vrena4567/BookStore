import java.util.ArrayList;
import java.util.List;

public class BookStore {
    private List<Book> bookList;

    public void addBook(Book book) {
        bookList.add(book);
    }

    public Book findBook(String title) throws BookNotFoundException {
        for (Book actual : bookList) {
            if (actual.equals(title)) {
                return actual;
            } else {
                throw new BookNotFoundException();
            }
        }
        return null;
    }

    public void displayBooks(){
        System.out.println(bookList);
    }
}
