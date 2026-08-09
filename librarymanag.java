class Book {
    final String isbn;
    String title;
    String author;
    double price;

    Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("ISBN   : " + isbn);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
}

public class librarymanag {
    public static void main(String[] args) {
        Book b1 = new Book("978-0134685991", "Java programming", "Sai Vivek", 6500.0);

        b1.displayDetails();

    }
}
