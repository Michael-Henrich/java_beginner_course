import java.util.ArrayList;

public class LibraryApp {
    private BookRepository bookRepo = new BookRepository();
    public void searchByIsbn(String isbn){
        System.out.printf("Searching for books with ISBN %s.\n" , isbn);
        Book book = bookRepo.findByIsbn(isbn);

        if(book != null){
            System.out.printf("1 book found:\n\tTitle: %s\n\tAuthor: %s",book.getTitle(),book.getAuthor());
        }else{
            System.out.printf("0 books found.");
        }
        System.out.print("\n\n");
    }

    public void searchByTitle(String keyword){
        System.out.printf("Searching for books with '%s' in the title...\n", keyword);
        ArrayList<Book> books = bookRepo.findByTitle(keyword);
        System.out.printf("%s books found%s\n",books.size(),books.size() > 0 ? ":" : ".");
        for(Book book : books){
            System.out.printf("\tTitle: %s\n\tAuthor: %s\n\t---\n",book.getTitle(),book.getAuthor());
        }
        System.out.println();
    }

    public void checkOutBook(String isbn){
        Book book = bookRepo.findByIsbn(isbn);
        if(book != null) {
            if (book.checkOut()) {
                System.out.println("Book checked out successfully.");
                System.out.printf("\tISBN: %s\n\tTitle: %s\n\t---\n", book.getIsbn(), book.getTitle());
            } else {
                System.out.printf("Failed to check out book. \n");
                System.out.printf("\tISBN: %s\n\tTitle: %s\n\t---\n", book.getIsbn(), book.getTitle());
                System.out.printf("Reason: No more books available.\n", isbn);
            }
        }
        System.out.println();
    }

    public void checkInBook(String isbn){
        Book book = bookRepo.findByIsbn(isbn);
        if(book != null){
            book.checkIn();
            System.out.println("Book checked out successfully.");
            System.out.printf("\tISBN: %s\n\tTitle: %s\n\t---\n",book.getIsbn(),book.getTitle());
        }else{
            System.out.printf("Failed to check out book. \n");
            System.out.printf("Reason: there is no book with ISBN %s on record.\n", isbn);
        }
        System.out.println();
    }


}
