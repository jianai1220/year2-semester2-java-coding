public class Library {
    private static int totalBooks = 0;

    private String bookTitle;
    private String author;

    public Library(String bookTitle, String author){
        this.bookTitle = bookTitle;
        this.author = author;
        totalBooks++;
    }
    public static int getTotalBooks(){
        return totalBooks;
    }

    public void displayBookInfo(){
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + author);
        
    }
    
    public static void addBook(String title, String author){
        Library newBook = new Library(title, author);
        System.out.println("New Book Added: ");
        newBook.displayBookInfo();
    }

    public static void main(String[] args){
        Library book1 = new Library("To Kill a Mockingbird", "Harper Lee");
        Library book2 = new Library("1984", "George Orwell");

        System.out.println("Book 1 Information: ");
        book1.displayBookInfo();

        System.out.println("Book 2 Information: ");
        book2.displayBookInfo();
        
        Library.addBook("Object Oriented Programming using Java", "Norazah Yusof");

        System.out.println("\nTotal Number of Books in the Library: " + Library.getTotalBooks());
    }
}
