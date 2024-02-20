package access_modifier.com.library.management;

public class BookMain {
    public static void main(String[] args) {
        Library library = new Library(10);
        Book book = new Book("노인과 바다", "해밍");
        Book book2 = new Book("Why?", "홍길동");
    }
}
