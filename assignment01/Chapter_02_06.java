import java.util.Scanner;
public class Chapter_02_06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오>>");

        int input = scanner.nextInt();
        int num10 = input / 10;
        int num01 = input % 10;

        if(input>=1 && input <=99){
            if((num10 == 3 || num10 == 6 || num10 == 9) && (num01 == 3 | num01 == 6 || num01 == 9)){
                System.out.println("박수짝짝");
            } else if((num10 != 3) && (num01 == 3 || num01 == 6 || num01 == 9)){
                System.out.println("박수짝");
            }
        } else{
            System.out.println("1~99 사이의 정수를 입력하세요.");
        }
        scanner.close();
    }
}
