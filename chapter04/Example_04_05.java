public class Example_04_05 {
    //this()로 다른 생성자 호출하기
    String title;
    String author;
    void show(){System.out.println(title + " " + author);}

    public Example_04_05(){ //생성자
        this("",""); //이 메소드가 적용될 때 이 틀이 반영됨(?) 이표현이 맞나..
        System.out.println("생성자가 호출됨"); //실행하면 무조건 호출됨. 즉 이 메소드를 호출하지 않아도 이 표현은 실행된다.
    }

    public Example_04_05(String title) { //생성자
        this(title, "작자미상");
    }

    public Example_04_05(String title, String author){ //생성자
        this.title = title; this.author = author;
    }

    public static void main(String[] args){
        Example_04_05 littlePrince = new Example_04_05("어린왕자", "생텍쥐페리"); //public Example_04_05(String title, String author){...}생성자
        Example_04_05 loveStory = new Example_04_05("춘항전"); // public Example_04_05(String title) {...} 생성자
        Example_04_05 emptyBook = new Example_04_05(); // public Example_04_05(){...} 생성자

        littlePrince.show();
        loveStory.show();
        emptyBook.show();
    }

}
