public class BookStoreApplication {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        Book book1 = new Book("Harry Potter", "J.K.Rowling", 15);
        Book book2 = new Book("Valami más", "Hemingway", 20);
        Book book3 = new Book("Harry Potter 2", "J.K.Rowling", 15);
        bookStore.addBook(book1);
        bookStore.addBook(book2);
        bookStore.addBook(book3);
    }
}