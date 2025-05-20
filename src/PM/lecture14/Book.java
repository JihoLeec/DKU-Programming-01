package PM.lecture14;

public class Book {
    // Professor's pick! Effective Java for Junior, Senior

    String title;
    String author;
    String publisher;
    int pages;
    
    public Book(String title, String author, int pages, String publisher) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.publisher = publisher;
    }
    public Book(String title, String author) {
        this(title, author, 1, null);
        // this 생성자. 같은 클래스의 다른 생성자를 호출하며, 생성자 첫 번째 줄에만 작성 가능
    }
}
