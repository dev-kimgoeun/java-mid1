package nested.test.ex1;

public class Library {

private Book[] books;
private int bookCount;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {
        //검증로직 처리
        if(bookCount>= books.length){
            System.out.println("도서 저장 공간이 부족합니다.");
            return;
        }

        //정상로직 실행
        books[bookCount++] = new Book(title,author);


    }

    public void showBooks() {
        System.out.println(" == 책 목록 출력 == ");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("도서제목 : " + books[i].title + "저자 : "+ books[i].author);
        }
    }

    private static class Book{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
