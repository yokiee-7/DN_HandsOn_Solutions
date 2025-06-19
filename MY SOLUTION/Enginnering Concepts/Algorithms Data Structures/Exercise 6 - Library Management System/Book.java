public class Book {
    int book_id;
    String title;
    String author;

    
    public Book(int book_id, String title, String author) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
    }
    public String getBooktitle(){
        return title;
    }
    
    @Override
    public String toString() {
        return "Book [book_id=" + book_id + ", title=" + title + ", author=" + author + "]";
    }
}
