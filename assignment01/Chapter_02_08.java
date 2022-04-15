import java.util.Scanner;
public class Chapter_02_08 {
    public static boolean inRect1(int x, int y, int rectx1, int recty1, int rectx2, int recty2){
            if((x >= rectx1 && x <= rectx2) && (y >= recty1 & y <= recty2)){
                return true;
            } else{
                return false;
            }
    }
    public static boolean inRect2(int x, int y, int rectx1, int recty1, int rectx2, int recty2){
        if((x >= rectx1 && x <= rectx2) || (y >= recty1 & y <= recty2)){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("점(x1,y1), (x2, y2)의 좌표를 입력하시오>>");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean case1 = inRect1(x1, y1, 100,100,200,200);
        boolean case2 = inRect1(x2, y2, 100,100,200,200);
        boolean case3 = inRect2(x1, y1, 100,100,200,200);
        boolean case4 = inRect2(x2, y2, 100,100,200,200);

        if(case1 == true || case2 == true  || case3 == true || case4 == true){
            System.out.println("직사각형이 충돌합니다.");
        } else{
            System.out.println("직사각형이 충돌하지 않습니다.");
        }
        scanner.close();
    }
}
