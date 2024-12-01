public class TestBook {
    public static void main(String[] args) {
        //create Book objects
        Book book1 = new Book("Clockers", "R Price","978-0395537619",22.89,10);
        Book book2 = new Book("Fan", "D Rhodes", "978-1909807808",9.92,5);

        //display program title
        System.out.println("\nBOOK CLASS EXAMPLE" );

        //display state
        System.out.println("\nBook 1 Title and Price: " + book1.getTitle() + " " + book1.getPrice());
        System.out.println("\nBook 2 Title and Quantity: " + book2.getTitle() + " " + book2.getQuantity());

        //change price for book 1
        book1.SetPrice(23);
        System.out.println("\nChanging price of Book 1");
        System.out.println(("Book 1 title and price:" + book1.getTitle() + " " + book1.getPrice()));

        //chane quantity for book 2
        book2.GetQuantity(2);
        System.out.println("\nChanging quantity of Book 2");
        System.out.println(("Book 2 title and quantity:" + book2.getTitle() + " " + book2.getQuantity()));
    }
}
