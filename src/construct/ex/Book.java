package construct.ex;

public class Book {
    String title;
    String autor;
    int page;

    Book() {
        this("","",0);
    }
    Book(String title,String autor) {
        this(title,autor,0);
    }

    Book(String title,String autor,int page) {
        this.title = title;
        this.autor = autor;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목: "+this.title+" 저자: "+this.autor+" 페이지: "+this.page);
    }
}
