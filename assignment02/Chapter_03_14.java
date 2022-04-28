import java.util.Scanner;
public class Chapter_03_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int[] score = {95, 88, 76, 62, 55};

        String input;
        int i=0;
        do{
            System.out.print("과목 이름");
            input = scanner.nextLine();
            System.out.println(input);

            if(input == "그만"){
                break;
            }

            if(course[i].equals(input)){
                for(i = 0; i < course.length;i++)
                        System.out.println(course[i] + "의 점수는 " + score[i]);
            } else{
                System.out.println("없는 과목입니다.");
            }

        } while(input !="그만"); //그만이면 반복문 멈춤
        scanner.close();
    }
}
