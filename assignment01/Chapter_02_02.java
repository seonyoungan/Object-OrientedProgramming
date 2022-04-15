import java.util.Scanner;

public class Chapter_02_02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("2자리수 정수 입력(10~99)>>");
        int input = scanner.nextInt();

        int num10 = input / 10;
        int num01 = input % 10;

        if(num10 == num01){
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        } else{
            System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
        }
        scanner.close();
    }
}
