public class Book {
    String title;
    String author;
    int numberOfPages;
    boolean isBorrowed;

    public Book(String title, String author,int numberOfPages,boolean isBorrowed){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.isBorrowed = isBorrowed;
    }
}
