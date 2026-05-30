import java.util.ArrayList;
import java.util.List;

class Publisher {
    private String name;
    private String address;
    private String website;
    List<Book> books = new ArrayList<>();

    public Publisher (String n, String a, String w){
        name = n;
        address = a;
        website = w;
    }

    public String getName(){
        return name;
    }

    
    public String getAddress(){
        return address;
    }
    
    public String getWebsite(){
        return website;
    }

    public void printDetails(){
        System.out.println("Publisher: " + name + "\nAddress: " + address + "\nWebsite: " + website + "\nBooks Published: ");
        for(Book b : books)
            System.out.println(" - " + b.getTitle());
    }
}

class Book{
    private String bookNumber;
    private String title;
    private String subtitle;
    private String copyright;
    private double unitPrice;
    private Publisher publisher;
    List<Author> authors = new ArrayList<>();
    List<Customer> customers = new ArrayList<>();

    public Book(String bookNumber, String t, String subtitle, String c, double u, Publisher p){
        this.bookNumber = bookNumber;
        title = t;
        this.subtitle = subtitle;
        copyright = c;
        unitPrice = u;
        publisher = p;
    }

    public String getBookNumber(){
        return bookNumber;
    }

    public String getTitle(){
        return title;
    }

    public String getSubtitle(){
        return subtitle;
    }

    public String getCopyright(){
        return copyright;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public void printDetails(){
        System.out.println("Book Number: " + bookNumber + "\nTitle: " + title + "\nSubtitle: " + subtitle + "\nCopyright: " + copyright + "\nUnit Price: RM" + unitPrice + "\nPublisher: " + publisher.getName() + "\nAuthors: ");
        for(Author a : authors)
            System.out.println(" - " + a.getName());
        System.out.println("Customers who purchased this book:");
        for(Customer c : customers)
            System.out.println(" - " + c.getName());
    }
}

class Author{
    private String name;
    private String website;
    private String email;
    List<Book> books = new ArrayList<>();

    public Author(String n, String w, String e){
        name = n;
        website = w;
        email = e;
    }

    public String getName(){
        return name;
    }

    public String getWebsite(){
        return website;
    }

    public String getEmail(){
        return email;
    }

    public void printDetails(){
        System.out.println("Author: " + name + "\nWebsite: " + website + "\nEmail: " + email + "\nBooks Written:");
        for(Book b : books)
            System.out.println(" - " + b.getTitle());
    }
}

class Customer{
    private String email;
    private String name;
    private String shippingAddress;
    List<Book> purchased = new ArrayList<>();

    public Customer(String e, String n, String a){
        email = e;
        name = n;
        shippingAddress = a;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getShippingAddress(){
        return shippingAddress;
    }

    public void printDetails(){
        System.out.println("Customer: " + name + "\nEmail: " + email + "\nShipping Address: " + shippingAddress + "\nPurchased Books:");
        for(Book b : purchased)
            System.out.println(" - " + b.getTitle());
    }
}

public class BookStore{
    public static void main(String[] args) {
        Publisher pearson = new Publisher("Pearson", "Prentice Hall", "www.pearson.com");
        Author daniel = new Author("Y. Daniel Liang", "yongdanielliang.github.io", "y.daniel.liang@gmail.com");
        Book java = new Book("8th Edition", "Introduction to Java Programming", "A comprehensive guide", "2011", 79.99, pearson);
        Customer ruby = new Customer("ruby.doe@example.com", "Ruby Doe", "123 Kuala Lumpur");

        pearson.books.add(java);
        java.authors.add(daniel);
        daniel.books.add(java);
        ruby.purchased.add(java);
        java.customers.add(ruby);

        pearson.printDetails();
        System.out.println();
        daniel.printDetails();
        System.out.println();
        java.printDetails();
        System.out.println();
        ruby.printDetails();
    }
}
