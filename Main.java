import java.util.Arrays;

//Main function class method (im not entirely sure what to call it)
public class Main {
    public static void main(String[] args){
        //I need to have an array inside the constructor for the program
        //to work, because I don't know how to add attributes dynamically
        //and I don't even know if that's possible, and so I made this temporary blank
        //array to make sure the program works :)
        int[] temp = {};

        //constructing objects
        Book book1 = new Book("Mary Jane", "Her", "Fan-fiction", 12, temp);
        Book book2 = new Book("John Smith", "Him","Horror",  8765, temp);
        Book book3 = new Book("Author man", "The scary mouse", 3, temp);
        Book book4 = new Book("Lordof Theflies", "Jim Jom", "Comedy", 0, temp);

        //calling addRating + printExtraInfo
        //does everything in addRating in the Book class
        //and also prints the info for "exceeds expectations"
        Book.addRating(book1, book2, book3, book4);
        Book.printExtraInfo(book1, book2, book3, book4);

        //methods that print all the info from the book objects
        book1.printAllGenre();
        book2.printAllGenre();
        book3.printAllDefault();
        book4.printAllDefault();

    }
}
