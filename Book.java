import java.util.Arrays;

//book class (isn't a book class just a library)
public class Book {
    //declaring the attributes(?) of the objects
    private String author;
    private String genre;
    private String title;
    private int pageNum;
    private int[] rating;

    //book constructor #1
    public Book(String author, String title, int pageNum, int[] rating) {
        this.author = author;
        this.title = title;
        this.rating = rating;
        this.pageNum = pageNum;
    }

    //book constructor #2
    public Book(String author, String title, String genre, int pageNum, int[] rating) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.pageNum = pageNum;
        this.rating = rating;
    }

    //adds ratings
    public static void addRating(Book book1, Book book2, Book book3, Book book4) {
        //variables that I use in the function because it got tedious to copy and paste them:
        //rating_ = randomized arrays of 3 ratings that I assign to the book objects
        int[] rating1 = randomize();
        int[] rating2 = randomize();
        int[] rating3 = randomize();
        int[] rating4 = randomize();

        //defining the rating for each object (this is also hardcoded)
        book1.rating = rating1;
        book2.rating = rating2;
        book3.rating = rating3;
        book4.rating = rating4;
    }

    //prints the "exceeds expectations" info
    public static void printExtraInfo(Book book1, Book book2, Book book3, Book book4){
        //book_Len = lengths of the book titles
        int book1Len = book1.title.length();
        int book2Len = book2.title.length();
        int book3Len = book3.title.length();
        int book4Len = book4.title.length();

        System.out.println("Total page count: " + (book1.pageNum + book2.pageNum + book3.pageNum));
        System.out.println("Total characters in titles: " + (book1Len + book2Len + book3Len + book4Len));
        System.out.println("First letter of each author's name (concatenated together): " + book1.author.charAt(0) + book2.author.charAt(0) + book3.author.charAt(0) + book4.author.charAt(0));
        System.out.println("Last letter of each book's title (concatenated together): " + book1.title.substring(book1Len - 1) + book2.title.substring(book2Len - 1) + book3.title.substring(book3Len - 1) + book4.title.substring(book4Len - 1));
        System.out.println("Total average rating: " + returnAvgRating(book1.rating, book2.rating, book3.rating, book4.rating) + "\n");
    }

    //I was too lazy to copy and paste Math.random 12 times, so I wrote this instead
    //which just creates 3 ratings automatically in an int array and returns it
    //(the variable is called temp because I never use it again)
    public static int[] randomize() {
        return new int[]{(int) (Math.random() * 6), (int) (Math.random() * 6), (int) (Math.random() * 6)};
    }

    //gets the total average rating except it's hardcoded, but I didn't really want to
    //go overboard since I think im not supposed to use an array anyways
    //So it stays hardcoded I suppose
    public static int returnAvgRating(int[] set1, int[] set2, int[] set3, int[] set4) {
        return ((set1[0] + set1[1] + set1[2]) + (set2[0] + set2[1] + set2[2]) + (set3[0] + set3[1] + set3[2]) + (set4[0] + set4[1] + set4[2])) / 12;
    }

    //print statements got annoying to copy and paste (this is for the first constructor)
    public void printAllDefault(Book this) {
        System.out.println("Book Title: " + this.title);
        System.out.println("Book Author: " + this.author);
        System.out.println("Page amount: " + this.pageNum);
        System.out.println("Ratings: " + Arrays.toString(this.rating) + "\n");
    }

    //print statements got annoying to copy and paste (this is for the second constructor)
    public void printAllGenre(Book this) {
        System.out.println("Book Title: " + this.title);
        System.out.println("Book Author: " + this.author);
        System.out.println("Book Genre: " + this.genre);
        System.out.println("Page amount: " + this.pageNum);
        System.out.println("Ratings: " + Arrays.toString(this.rating) + "\n");
    }
}
