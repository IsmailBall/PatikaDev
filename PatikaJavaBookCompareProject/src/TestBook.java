
import java.time.LocalDate;
import java.util.Comparator;
import java.util.TreeSet;


class BookComparatorPage implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getPageNumber(), o2.getPageNumber());
    }
}
class BookComparatorName implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class TestBook {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet(new BookComparatorName());
        books.add(new Book("Ucurtma Avcisi", 375, "Khaled Hosseini", LocalDate.now()));
        books.add(new Book("1984", 475, "George Orwell", LocalDate.now()));
        books.add(new Book("Satranç", 575, "Stefan Zweig", LocalDate.now()));
        books.add(new Book("Seker Portakalı", 275, "Jose Mauro De Vasconcelos", LocalDate.now()));
        books.add(new Book("Simyacı", 675, "Paulo Coelho", LocalDate.now()));
        
        TreeSet<Book> booksNew = new TreeSet(new BookComparatorPage());
        booksNew.add(new Book("Ucurtma Avcisi", 375, "Khaled Hosseini", LocalDate.now()));
        booksNew.add(new Book("1984", 475, "George Orwell", LocalDate.now()));
        booksNew.add(new Book("Satranç", 575, "Stefan Zweig", LocalDate.now()));
        booksNew.add(new Book("Seker Portakalı", 275, "Jose Mauro De Vasconcelos", LocalDate.now()));
        booksNew.add(new Book("Simyacı", 675, "Paulo Coelho", LocalDate.now()));
        
        System.out.println(books.toString());
        System.out.println(booksNew.toString());
    }
}
