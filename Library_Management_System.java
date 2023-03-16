import java.util.*;

class Book{
    public String name, authorName;
    public Book(String name, String authorName){
        this.name = name;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book{ name='"+name+'\''+", author='"+authorName + '\''+"}"+"\n";
    }
}

class MyLibrary{
    public ArrayList<Book> books;
    public MyLibrary(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println(book+" book has been added to the Library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issuedTo){
        System.out.println(book+" book has been removed from the Library"+issuedTo);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println(b+" book has been returned to the Library");
        this.books.add(b);
    }
}

public class Library_Management_System {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("OperatingSystem","PriyanshuBaral");
        bk.add(b1);
        Book b2 = new Book("CompetitiveProgramming","AbhishekMishra");
        bk.add(b2);
        Book b3 = new Book("AppDevelopment","AshishMishra");
        bk.add(b3);
        Book b4 = new Book("WebDevelopment","NitinKumar");
        bk.add(b4);
        MyLibrary ml = new MyLibrary(bk);
        System.out.println(ml.books);
        System.out.println();
        ml.issueBook(b3, " Vaibhav");
        System.out.println(ml.books);
        System.out.println();
        ml.addBook(new Book("MachineLearning","Rajendra"));
        System.out.println(ml.books);
        System.out.println();
        ml.returnBook(b3);
        System.out.println(ml.books);
    }
}
