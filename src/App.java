import java.io.FileOutputStream;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();
        books.add(new Book("X",43,"A",2022));
        books.add(new Book("Y",34,"B",2022));
        books.add(new Book("Z",54,"C",2022));
        books.add(new Book("T",65,"D",2022));
        books.add(new Book("U",54,"E",2022));

        System.out.println("Kitaplar isme göre sıralandı");
        for (Book book: books) {
            System.out.println(book.name + " " + book.pageNumber);
        }

        TreeSet<Book> books1 = new TreeSet<>(new OrderByPagesComparator());
        books1.addAll(books);
        System.out.println("Kitaplar sayfa sayısına göre sıralandı.");
        for (Book book :books1) {
            System.out.println(book.name + " " + book.pageNumber);
        }

    }
}
