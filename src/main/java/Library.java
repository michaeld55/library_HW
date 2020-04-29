import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;
    private HashMap<String, Integer> stock;

    public Library(int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
        this.stock = new HashMap<String, Integer>();
    }

    public int getCapacity() {
        return this.capacity;
    }


    public void getStock() {

        String genre;
        int counter = 0;
        for (Book book : books){
            genre = book.getGenre();
            if (stock.containsKey(genre)) {
                counter = stock.get(genre);
                stock.put(genre, counter += 1);
            }else{
                stock.put(genre, 1);
            }

        }

    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if(checkCapacity()) this.books.add(book);
    }

    public Book removeBook() {
        return this.books.remove(0);
    }

    public boolean checkCapacity(){
        return capacity > this.books.size();
    }
}
