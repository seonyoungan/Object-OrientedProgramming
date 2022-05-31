import java.util.Scanner;
class Book{
    String title, author;
    public Book(String t, String a){
        this.title = t;
        this.author = a;
    }
}
public class Example_04_07 {
    public static void main(String[] args){
        Book[] book = new Book[2];

        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<book.length;i++){
            System.out.print("제목>>");
            String title = scanner.nextLine();
            System.out.print("저자>>");
            String author = scanner.nextLine();
            book[i] = new Book(title, author); //book배열에 저장할 데이터들
        }
        for(int i=0;i<book.length;i++){
            System.out.println("("+book[i].title+", "+book[i].author+")");
        }
    }
}
