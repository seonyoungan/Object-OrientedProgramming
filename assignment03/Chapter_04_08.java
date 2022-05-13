import java.sql.SQLOutput;
import java.util.Scanner;

public class Chapter_04_08 {
    public static class Phone{
        String name;
        String number;
        public Phone(String name, String number){
            this.name = name;
            this.number = number;
        }
    }
    public static class PhoneBook{
        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.print("인원수>>");
            int count = scanner.nextInt();

            Phone[] phone = new Phone[count]; //count만큼의 크기

            for(int i=0;i<phone.length;i++){
                System.out.print("이름과 번호는 빈 칸없이 입력)>>");
                String name = scanner.next();
                String number = scanner.next();
                phone[i] = new Phone(name, number);
            }
            System.out.println("저장되었습니다...");

            while(true) {
                System.out.print("검색할 이름>>");
                String nameSearch = scanner.next();
                if (nameSearch.equals("그만"))
                    break;
                int i = 0;
                for (i = 0; i < count; i++) {
                    if ((phone[i].name).equals(nameSearch)) {
                        System.out.println(phone[i].name + "의 번호는 " + phone[i].number + "입니다.");
                        break;
                    }
                }
                if(i == count)
                    System.out.println(nameSearch + " 이 없습니다.");
            }
            scanner.close();
        }
    }
}
