package Book;
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("1984", "George Orwell", 1949);

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}
