import java.util.Scanner;
public class Chapter_02_12_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>>");
        int input1 = scanner.nextInt();
        String op = scanner.next();
        int input2 = scanner.nextInt();
        int result;

        switch (op){
            case "+": op.equals("+"); {
                result = input1 + input2;
                System.out.println(input1 + op + input2 + "의 계산 결과는 " + result);
                break;
            }
            case "-": op.equals("-"); {
                result = input1 - input2;
                System.out.println(input1 + op + input2 + "의 계산 결과는 " + result);
                break;
            }
            case "*": op.equals("*"); {
                result = input1 * input2;
                System.out.println(input1 + op + input2 + "의 계산 결과는 " + result);
                break;
            }
            case "/": op.equals("/"); {
                result = input1 / input2;
                System.out.println(input1 + op + input2 + "의 계산 결과는 " + result);
                break;
            }
            default:
                System.out.println("다시 입력하세요.");
                break;
        }
        scanner.close();
    }
}
