# chapter04

Start Date: May 25, 2022
Status: 객체지향프로그래밍

## week8

### 01 객체 지향 특성: 추상화, 캡슐화, 상속, 다형성

1. 캡슐화: 객체를 캡슐로 싸서 내부를 볼 수 없게 함
    1. 외부 접근으로부터 객체 보호)\
    2. information hiding
2. 상속
    1. 상위 개체의 속성이 하위 개체에 물려짐
    2. 하위 객체가 상위 개체의 속성을 모두 가지는 관계
        - 단, 상위 객체의 private: 물려받지만 접근은 불가
    3. 자바의 상속
        - 자식 클래스가 부모 클래스의 속성을 물려받고 기능을 확장함
        - 장점: 생산성 상승(재사용에 용이함)
3. 다형성: 같은 이름의 메소드가 클래스나 객체에 따라 다르게 동작하도록 구현함
    1. 메소드 오버로딩 : 같은 이름이지만 다르게 작동하는 여러 메소드
    2. 메소드 오버라이딩: 슈퍼클래스의 메소드를 서브클래스마다 다르게 구현

---

### 02 절차 지향 프로그래밍과 객체 지향 프로그래밍

1. 객체 지향 프로그래밍: 객체들의 상호 관련성
2. 절차 지향 프로그래밍: 실행 절차

---

### 03 클래스와 객체

1. 클래스: 붕어빵틀
2. 객체: 붕어빵 (=인스턴스)
3. 클래스의 구성
    
    ```java
    public class Circle{
    	//field(variables)
    	pbulic int radius;
    
    	//method 
    	public class(){ radius * radius * 3.14}
    }
    ```
    
4. 객체 생성 및 접근
    1. 객체 생성: 반드시 new키워드 사용
        - 객체 내 생성자 코드 실행
            - 생성자 규칙: 클래스 명과 같은 이름 / 리턴타입 사용 안함
    2. 생성 과정: 객체에 대한 레퍼런스 변수 선언
        - 클래스 타입 크기의 메모리 할당됨
    3. 객체 멤버 접근: 객체의 레퍼런스.멤버 (점연산자 사용)

---

### 04 생성자 개념

1. 생성자: 객체가 생성될 때 초기화를 위해 실행되는 코드
    1. 예) 기본 객체: 민낯 → 생성자: 메이크업 중 → 초기화 객체: 산독기 가득
    
    ```java
    public class Circle{
    	int radius;
    	String name;
    
    	//오버로딩
    	public Circle(){ //매개변수 없는 생성자
    		radius = 1; name = ""; // 초기값
    	}
    	public Circle(int r, String n){ //매개변수 있는 생성자
    		radius = r; name = n;
    	}
    	public double getArea(){
    		return 3.14*radius*radius; //리턴값
    	}
    
    	public static void main(String[] args){
    		Circle pizza = new Circle(10, "자바피자"); //객체 생성됨, 매개변수 있는 생성자로 가겠지
    		//초기값은 그냥 0, null이었는데! 객체 생성시에 인스턴스변수를 가지게됨
    		.
    		.
    		.
    		Circle donut = new Circle(); //객채 생성됨, 매개변수 없는 생성자로 갈거얌
    		.
    		.
    		.
    }
    ```
    
2. 생성자의 특징
    1. 생성자 == 메소드
    2. 생성자의 이름 == 클래스의 이름
    3. 오버로딩 가능(=생성자 여러개 작성 가능)
    4. new를 통해 객체 생성, 객체당 한번 호출
    5. 리턴타입없음
    6. 목적은 초기화이다
    7. 객체 생성시 반드시 선언됨(즉 하나 이상 선언되어야함)
        - 개발자가 생성자 작성 안할 시 컴파일러가 자동으로 기본 생성자 삽입
3. this 레퍼런스
    1. 사용 형태: this.멤버
    2. 필요성
        - 객체 멤버 변수 이름 == 메소드 변수 이름
        - 다른 메소드 호출시 객체 자신의 레퍼런스 전달 시
        - 메소드가 객체 자신의 레퍼런스 반환 시
    3. this()로 다르 ㄴ생성자 호출
        - 클래스 내의 다른 생성자 호출
        - 생성자 내에서만 사용 가능
        - 반드시 생성자 코드 제일 처음에 수행

---

### 05 인자 전달

1. 경우1: 기본타입의 값 전달 (값복사되어 전달)
2. 경우2: 객체 혹은 배열 전달(객체나 배열의 레퍼런스만 전달)

---

### 06 메소드 오버로딩

1. 이름이 같은 메소드 작성
    1. 매개변수의 개수, 타입 서로 다르고 이름이 동일한 메소드들
2. 리턴 타입은 오버로딩과 관련 없음

---

### 07 객체의 소멸과 가비지 컬렉션

1. 객체 소멸
    1. new에 의해 할당된 객체 메모리를 JVM의 가용 메모리로 돌려주는 행위
    2. 자바 응용프로그램에서 임의로 객체 소멸 불가
2. 가비지
    1. 가리키는 레퍼런스가 하나도 없는 객체
    2. 가비지컬렉션이 자동으로 가비지 수집 반환

---

## week9

### 01 자바의 패키지 개념 (접근 지정자 이해를 위함)

1. 관련 클래스 파일(컴파일된 .class)를 저장하는 directory
2. 자바 응용 프로그램은 하나 이상의 패키지로 구성된다.
3. 빌드하면 out에도 패키지와 클래스가 똑같은 구조로 존재한다.
4. 하위패키지와 상위 패키지는 다른 패키지이다

```java
package aaa.ccc;

public class AppInAaaCcc{
}
/* aaa 패키지 안에 ccc 패키지가 존재하고
그 안에 AppInAaaCcc라는 클래스가 존재함. 구분자는 '.'이다.*/
```

---

### 02 접근 지정자

1. 자바의 접근 지정자: private, default, protected, public
    1.  공개 범위
        - private: 외부로부터 완벽히 차단
        - default: 동일 패키지에서 허용 (=package-private)
        - protected: 동일 패키지와 자식 클래스에 허용
        - public: 모든 클래스에 허용
            
            ```java
            _____ class A{ //class 접근지정자: public과 디폴트 허용
            	____ int a; //field 접근지정자: private, default, protected, public
            	____ void f(){ //method 접근지정자: private, default, protected, public
            		____ int b; //method 내 변수 접근지정자: 올 수 없음
            	}
            }
            /*만일 A가 다른곳에서 호출되면 정의된 부분에 가서 접근함
            접근 했는데 접근 지정자 범위내: 정상
            접근 했는데 접근 지정자 범위외: 컴파일 에러
            */
            ```
            
    2. 접근 지정자 목적
        - 클래스나 일부 멤버를 공개해 다른 클래스에서 접근하도록 허용
        - OOP언어에서 캡슐화 정책: 멤버 보호
            - 접근 지정은 캡슐화에 묶인 보호를 일부 해제할 목적
2. 클래스 접근 지정
    1. public 클래스 : everywhere
    2. 디폴트 클래스: 같은 패키지 클래스만 허용
3. 멤버 접근 지정
    1. public 멤버: everywhere
    2. private멤버: 동일 클래스 내 접근 / 상속 받은 자식 클래스에서 접근 불가
    3. protected멤버: 같은 패키지 내 다른 모든 클래스에게 접근 허용 / 상속 받은 자식 클래스는 다른 패키지에 있어도 접근 가능 (즉, 조건 : 상속(extends)
    4. 디폴트 멤버: 같은 패키지 내의 다른 클래스에게 접근 허용
4. 접근 지정자 활용
    1. 적재적소에서 활용 해야 함
    2. 모르겠으면 private → protected → default → public
        - field: 대부분 private 사용 / 상속 받을 경우 protected / final이 붙은 경우(상수) public 사용
            - field는 private한 후 getter/setter사용
            
            ```java
            //field의 경우
            class Person{
            	private String name; // 접근지정자 하나로 read, write 구분할 수 었음.
            	public String getName(){ return name;} //read 행위
            	private void setName(String name){ // write 행위
            		this.name = name;
            	}
            }
            
            //method의 경우
            class Person{
            	public f(){
            		f1();
            		f2();
            		f3();
            	}
            	private f1(){ ... }
            	private f2(){ ... }
            	private f3(){ ... }
            } //호출하는 부분은 public 또는 디폴트로, 동작 부분은 private로
            ```
            
        - 이해를 돕기 위한 예시
            
            ```java
            //나=클래스, 가족=패키지, 다른 사람들=다른 패키지
            protected String get현관비밀번호(){ ... } //또는 디폴트
            private String get통장비밀번호(){ ... } //나만 알도록..
            private String 통장비밀번호;
            public String get청첩장{ ... } //모두한테 알리기..
            ```
            

---

### 03 static 멤버와  non-static 멤버

1. non-static 멤버들의 특성
    1. 공간적 특성
        - 객체마다 독립적으로 별도 존재 (=인스턴스 멤버)
    2. 시간적 특성
        - 객체 생성때 멤버 생성
        - 생성 후 바로 사용 가능
        - 객체 사라지면 멤버 사라짐
    3. 비공유 특성
        - 다른 객체에 의해 공유되지 않고 배타적 존재
2. static 멤버들의 특성
    1. 공간적 특성
        - 클래스당 하나만 생성 (=클래스 멤버)
        - 멤버는 객체 내부가 안니 별도의 공간(클래스 코드 적재되는 메모리)에 생성
        - 객체마다 생기지 않음
        - 객체를 생성하지 않고 바로 사용 가능
    2. 시간적 특성
        - 클래스가 로딩될 때 공간 할당
        - 객체 생기기 전에 이미 생성
        - 객체 생기기 전에도 사요 ㅇ가능
        - 객체가 사라져도 멤버는 사라지지 않음
        - 멤버는 프로그램이 종료될 때 사라짐
    3. 공유의 특성
        - 동일한 클래스의 모든 객체에 의해 공유

```java
//non-static 선언
class Sample{
	int n;
	void g() { ... }
}

//static 선언
class Sample{
	static int m;
	static void g(){ ... }
}
```

1. static의 활용
    1. 전역변수와 전역 함수 만들 때
        - static 멤버를 가진 클래스 사례: MATH클래스(JAVA.LANG.mATH)
    2. 공유 멤버 작성할 때 : static 필드, 메소드는 하나만 ㅅ생성, 클래스의 객체들 공유
2. static의 제약조건
    1. static 메소드는 non-static멤버 접근할 수 없음
        - 객체가 생성되지 않은 상황에서도 static 메소드는 실행될 수 있기 때문에, non-static 메소드와 필드 사용 불가
        - non-static 메소드는 static멤버 사용 가능
    2. static 메소드에서 this 사용 불가
        - static메소드: 객체 생성되지 않은 상황에서도 호출 가능함 → 혀재객체를 가리키는 this 레퍼런스를 사용할 수 없음
        
        ```java
        class StaticAndThis{
        	int n;
        	static int m;
        	void f1(int x){this.n = x;} //정상실행
        	void f2(int x){this.m = x;} //정상실행
        	static void s1(int x){this.n=x;} //컴파일 에러 static메소드에서 this 사용 불가
        	static void s2(int x){this.m=x;} //컴파일 에러 static메소드에서 this 사용 불가	
        }
        ```
        

---

 

### 04 final 클래스와 메소드

1. final 클래스: 클래스 상속 불가
    
    ```java
    final class FinalClass{ ... }
    class SubClass extends FinalClass { ...} //컴파일 에러
    ```
    
2. final 메소드: 오버라이딩 불가
    
    ```java
    public class SuperClass{
    	protected final int finalMethod(){ ... } // 참고로 protected는 조건(상속)이 부합하면 다른 패키지도 접근 가능
    }
    class SubClass extends SuperClass{
    	protected finalMethod(){ ... } //컴파일 에러
    }
    ```
    
3. final 필드: 상수 선언
    - 주의점: 선언시 초기값 지정 / 실행 중 값 변경 불가
    
    ```java
    class SharedClass{
    	public static final double PI = 3.14;
    }
    ```
    

---