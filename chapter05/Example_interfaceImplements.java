interface PhoneInterface{
    //인터페이스
    final int TIMEOUT = 10000; //상수 필드 선언 (Java7까지는 상수와 메소드로만 구성함)
    void sendCall();//추상메소드, public abstract 생략함
    void receiveCall();//추상메소드, public abstract 생략함
    default void printLogo(){ //default메소드로 인터페이스에 코드가 작성되어야함(Java8부터 가능)
        System.out.println("**Hi, Galaxy**");
    }
}

class SamsungPhone implements PhoneInterface{
    //인터페이스 구현
    @Override
    public void sendCall(){
        System.out.println("띠리링띠리링");
    }
    
    @Override
    public void receiveCall(){
        System.out.println("전화가 왔습니다.");
    }

    //추가구현
    public void flash(){
        System.out.println("***flash ON***");
    }
}

public class Example_interfaceImplements{
    //실행
    public static void main(String[] args){
        SamsungPhone phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
        phone.flash();
        
    }
}