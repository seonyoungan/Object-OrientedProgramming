import java.util.Scanner;
public class Example_04_02 {
    int width;
    int height;

    public int getArea(){ //계산하는 메소드
        return width*height;
    }

    public static void main(String[] args){
        Example_04_02 rect = new Example_04_02(); //객체 생성
        Scanner scanner = new Scanner(System.in);

        System.out.print(">>");
        //사용자한테 입력받기
        rect.width = scanner.nextInt();
        rect.height = scanner.nextInt();
        System.out.println("사각형의 면적은"+rect.getArea());

        scanner.close();
    }
}

