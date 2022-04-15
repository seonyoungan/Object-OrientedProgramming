import java.util.Scanner;

public class Chapter_02_04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 3개 입력>>");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int mid;

        if((num2 < num1 && num1 < num3) || (num3 < num1 && num1 < num2)){
            mid = num1;
            System.out.println("중간값은 " + mid);
        } else if((num1 < num2 && num2 < num3)||(num3 < num2 && num2 < num1)){
            mid = num2;
            System.out.println("중간값은 " + mid);
        } else if((num1 < num3 && num3 < num2)||(num2 < num3 && num3 < num1)){
            mid = num3;
            System.out.println("중간값은 " + mid);
        }
        scanner.close();
    }
}
