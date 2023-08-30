import java.sql.Array;
import java.util.ArrayList;

public class BookRepository {

    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
        books.add(new Book("83456","The Dead of Night","Horror",null,"S.K. Eleton", 10 , 7));
        books.add(new Book("12345","Tribute von Panem","Adventure",null,"Suzanne Collins" , 15 , 1));
        books.add(new Book("54321","Time Riders","Science Fiction",null,"Alex Scarrow" , 5 , 5));
        books.add(new Book("33667","That one time i found a coin","Comedy",null,"Test Author" , 11 , 10));
    }

    public Book findByIsbn(String isbn) {
        for(Book book: books){
            if(book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String keyword){
        ArrayList<Book> booksFound = new ArrayList<>();
        for(Book book : books){
            if(book.getTitle().toLowerCase().contains(keyword.toLowerCase())){
                booksFound.add(book);
            }
        }
        return booksFound;
    }
}
