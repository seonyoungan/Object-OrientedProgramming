public class Example_04_04 {
    String title;
    String author;

    public Example_04_04(String t){ //작자미상 생성자
        title = t;
        author = "작자미상"; //추후에 이 생성자를 활용한다면 변수에 담길 데이터를.. 다른걸로 수정하면됨
    };

    public Example_04_04(String t, String a){ //타이틀 작자 ok 생성자
        title = t;
        author = a;
    }

    public static void main(String[] args){
        Example_04_04 littlePrince = new Example_04_04("어린왕자", "생텍쥐페리");
        Example_04_04 loveStory = new Example_04_04("춘항전");
        System.out.println(littlePrince.title + ", " + littlePrince.author);
        System.out.println(loveStory.title + ", " + loveStory.author);
    }
}
