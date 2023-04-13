import java.util.*;

public class BookCategory {
    String categoryName;
    ArrayList<Book> books = new ArrayList<Book>();

    BookCategory(String categoryName){
        this.categoryName = categoryName;
    }


    void displayBook(){
        for(int i = 0; i < books.size(); i++){
            System.out.println(books.get(i).bookName);
        }
    }

    void addBook(String name, String syn, String author){
        // Book newlyAddedBook = new Book(name, syn, author);
        // books.add(newlyAddedBook);
        books.add(new Book(name, syn, author));

    }
}
