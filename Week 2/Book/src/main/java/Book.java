public class Book {
    //fields
    private String title;
    private String author;
    private String isbn;
    private double price;
    private int quantity;

    //constructor
    public Book(String title, String author, String isbn, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.quantity = quantity;
    }

    //read accessors
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public String getIsbn() {return isbn;}
    public double getPrice() {return price;}
    public int getQuantity() {return quantity;}

    //set accessors
    public void SetPrice(double price) {this.price = price;}
    public void GetQuantity(int quantity) {this.quantity = quantity;}

}


