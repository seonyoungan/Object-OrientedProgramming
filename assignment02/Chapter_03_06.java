import java.util.Scanner;
public class Chapter_03_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] unit = {50000,10000,1000,500,100,50,10,1};

        System.out.print("금액을 입력하시오>>");
        int money = scanner.nextInt();

        for(int i=0;i<unit.length;i++){
            System.out.println(unit[i]+" 짜리 : "+money/unit[i]);
            money -= (money/unit[i])*unit[i];
        }
        scanner.close();
    }
}
