package quiz.quiz2.Ex1;

public class Book {

    // 필드
    String title;
    String author;
    int year;

    // 생성자

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // 메서드
    public void displayInfo() {
        System.out.println("Title : " + title + ", Author : " + author + ", Year : " + year);
    }

}
