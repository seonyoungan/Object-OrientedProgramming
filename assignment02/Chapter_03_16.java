import java.util.Scanner;
public class Chapter_03_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = {"가위", "바위", "보"};
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        while(true){
            System.out.print("가위 바위 보!>>");
            String input = scanner.next();

            if(input.equals("그만")){
                System.out.println("게임을 종료합니다...");
                break;
            } else{
                int n = (int)(Math.random()*3); // 0 1 2

                if(input.equals("가위")){
                    if(str[n].equals("가위"))
                        System.out.println("사용자 = 가위, 컴퓨터 = 가위, 비겼습니다.");
                    else if(str[n].equals("바위"))
                        System.out.println("사용자 = 가위, 컴퓨터 = 바위, 졌습니다.");
                    else if(str[n].equals("보"))
                        System.out.println("사용자 = 가위, 컴퓨터 = 보, 이겼습니다.");
                }

                else if(input.equals("바위")){
                    if(str[n].equals("바위"))
                        System.out.println("사용자 = 바위, 컴퓨터 = 가위, 이겼습니다.");
                    else if(str[n].equals("바위"))
                        System.out.println("사용자 = 바위, 컴퓨터 = 바위, 비겼습니다.");
                    else if(str[n].equals("보"))
                        System.out.println("사용자 = 바위, 컴퓨터 = 보, 졌습니다.");
                }

                else if(input.equals("보")){
                    if(str[n].equals("보"))
                        System.out.println("사용자 = 보, 컴퓨터 = 가위, 졌습니다.");
                    else if(str[n].equals("바위"))
                        System.out.println("사용자 = 보, 컴퓨터 = 바위, 이겼습니다.");
                    else if(str[n].equals("보"))
                        System.out.println("사용자 = 보, 컴퓨터 = 보, 비겼습니다.");
                }
            }
        }
        scanner.close();
    }
}
