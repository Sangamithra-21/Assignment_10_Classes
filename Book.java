package Assignment_10_class;

public class Book {
    String title;
    int ISBN;
    static int isbn=1;
    String author;
    private float price;
    public void display()
    {
        System.out.println("Book Title  : "+title);
        System.out.println("ISBN Number : "+ISBN);
        System.out.println("Author Name : "+author);
        System.out.println("Book Price  : "+price);
    }
}
