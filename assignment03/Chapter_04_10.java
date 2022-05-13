import java.util.Scanner;
public class Chapter_04_10 {
    public static class Dictionary{
        private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
        private static String[] eng = {"love", "baby", "money", "future", "hope"};
        public static String kor2Eng(String word) {
            int i;
            String answer = "";

            for (i = 0; i < kor.length; i++) {
                if (kor[i].equals(word)) {
                    answer = (word + "은 " + eng[i]);
                    break;
                }
            }
            if(i==kor.length)
                answer = (word + "는 저의 사전에 없습니다.");
            return answer;
        }
        public static class DictionaryApp{
            Scanner scanner = new Scanner(System.in);
            String word;
            DictionaryApp(){
                System.out.println("한영 단어 검색 프로그램 입니다.");
                while(true) {
                    System.out.print("한글 단어?");
                    word=scanner.next();

                    if(word.equals("그만"))
                        break;
                    else
                        System.out.println(Dictionary.kor2Eng(word));
                }
            }
        }

        public static void main(String[] args) {
           DictionaryApp App = new DictionaryApp();
        }
    }
}
