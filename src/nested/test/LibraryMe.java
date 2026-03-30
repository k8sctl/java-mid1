package nested.test;

public class LibraryMe {
    Book[] books;
    int bookCount;

    LibraryMe(int size) {
        this.books = new Book[size];
        this.bookCount = 0;
    }

    public void addBook(String title, String author) {

        if (bookCount >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
        } else {
            books[bookCount] = new Book();
            books[bookCount].setTitle(title);
            books[bookCount].setAuthor(author);
            bookCount++;
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0 ; i < bookCount ; i++) {
            System.out.println("도서 제목: " + books[i].getTitle() + ", 저자: " + books[i].getAuthor());
        }
    }

    class Book {
        String title;
        String author;

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }
    }
}
