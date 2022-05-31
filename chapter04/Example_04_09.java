//가비지 발생
public class Example_04_09 {
    public static void main(String[] args){
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Soso");
        String d, e;
        a = null;
        d = c;
        c = null;
        //결과예상: a = null b =Bad, c= null, d = Soso, e = 컴파일 오류
        System.out.print(a+" "+b+" "+c+" "+d+" ");
    }
}
