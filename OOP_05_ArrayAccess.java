import java.util.Scanner;
public class OOP_05_ArrayAccess {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int intArray[] = new int[5]; //배열생성
        int max = 0; //max값 초기화
        System.out.println("양수 5개를 입력하세요.: ");
        for(int i=0;i<5;i++) { // 0~4번쨰 인덱스까지 반복
            intArray[i] = scanner.nextInt(); //입력받은정수를 배열에 저장
            if(intArray[i] > max) { //입력받은 정수가 max보다 크면
                max = intArray[i]; // max에 대입해라 (=> 제일 큰 수와 비교해서 대입됨.)
            }
        }
        System.out.println("가장 큰 수는 " + max + " 입니다."); // 최종적으로 제일 큰 수 산출
        scanner.close(); //scanner사용끝
    }

}
