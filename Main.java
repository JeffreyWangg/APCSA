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

        //this calls the big one
        Book.addRating(book1, book2, book3, book4);
        Book.printExtraInfo(book1, book2, book3, book4);

        //print statement flood
        book1.printAllGenre();
        book2.printAllGenre();
        book3.printAllDefault();
        book4.printAllDefault();

    }
}
