import java.util.Scanner;

public class OOP_04_ScannerExample {
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in); //입력받음
        System.out.print(">>");
        while(s1.hasNext()){ //입력 받은 부분에서 enter를 치는 순간 while문 실행
            System.out.println(s1.next()); //문자 출력->공백 다음 문자 출력... 반복 실행)
            //hasNext(); 종료키는 os마다 다르긴하다.

            s1.close();
            //system.in은 한번 닫고 다시 열면 런타임 오류가 난다.
            //system.in은 또 사용할 것 같으면 닫지 않는다!@
        }
    }
}
