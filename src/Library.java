public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.2";
        Book book = new Book();
        book.title = "W pustyni i w puszczy";
        book.author = "Henryk Sienkiewicz";
        book.releaseDate = 2010;
        book.pages = 296;
        book.publisher = "Greg";
        book.isbn = "9788373271890";

        System.out.println(appName);
        System.out.println("Books avaiable in library:");
        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.releaseDate);
        System.out.println(book.pages);
        System.out.println(book.publisher);
        System.out.println(book.isbn);
    }
}
