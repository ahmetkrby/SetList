import java.util.Comparator;
import java.util.Date;

public class Book implements Comparable<Book> {

    String name;
    int pageNumber;
    String autorName;
    int date;

    public Book(String name, int pageNumber, String autorName, int date) {
        this.name = name;
        this.autorName = autorName;
        this.date = date;
        this.pageNumber = pageNumber;
    }
    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public Book() {

    }

}
