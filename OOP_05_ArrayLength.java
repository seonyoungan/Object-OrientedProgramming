import java.util.Scanner;
public class OOP_05_ArrayLength {
    public static void main(String[] args){
        int intArray[] = new int[5];
        int sum = 0;
        double avg = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(intArray.length+"개의 정수를 입력하세요.>>");
        for(int i=0;i<intArray.length;i++){
            intArray[i] = scanner.nextInt();
        }
        for(int i=0;i<intArray.length;i++){
            sum += intArray[i]; //sum에 intArray[0]~intArray[4]값 합산하기(누적)
        }
        avg = sum / intArray.length;
        //System.out.println("평균은"+(double)sum/intArray.length+" 입니다.");
        System.out.println("평균은"+avg+" 입니다.");
        scanner.close();
    }
}
