import java.util.Scanner;

public class OOP_03_ScannerEx {
    public static void main(String args[]) {
        System.out.println("이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력하세요");
        Scanner scanner = new Scanner(System.in); //입력 받기

        String name = scanner.next(); //문자열 읽기
        System.out.println("이름: "+name+",");

        String city = scanner.next(); //빈칸 이후의 다음 문자열 읽기
        System.out.println("도시: "+city+",");

        String age = scanner.next();
        System.out.println("나이: "+age+",");

        String weight = scanner.next();
        System.out.println("체중: "+weight+",");

        String single = scanner.next();
        System.out.println("독신여부: "+single);

    }
}