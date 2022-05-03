import java.util.Scanner;

public class Chapter_03_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 몇개?");
        int input = scanner.nextInt();;

        //1~99숫자만입력받기
        if(input <0 || input >100){
            System.out.println("1이상 100미만 정수 입력하세요.");
        }

        int[] array = new int[input]; // input 개수 만큼의 배열 생성

        //랜덤삽입 및 중복제거
        for(int i = 0; i<array.length;i++) {
            array[i] = (int) (Math.random() * 100 + 1); //랜덤값 생성
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;
                    break;
                }
            }
        }

        //배열을 10개 단위로 줄바꿈해서 출력하기
        for(int i = 0; i<array.length; i++){
            if(i % 10 == 0)
                System.out.println();
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}
