class Person{
    String name;
    String id;
    
    public Person(String name){
        this.name = name;
    }
}

class Student extends Person{
 
      String grade;
      String department;
      
      public Student(String name){
          super(name); //부모의Person method로..
      }   
}

public class Example_upcasting {
    public static void main(String args[]) {
        Person p;
        Student s = new Student("이재문");
        // 레퍼런스 타입의 s는 Student 객체를 만들고 "이재문"이라는 인자를 Studnet 클래스의 Student메소드의 매개변수로 전달시킨다.
        //super(name) 함수로 Person(String name)함수에 접근해서 부모 클래스의 String name에 "이재문" 데이터를 대입한다.
        p = s; //업캐스팅
        //p도 s가 가리키고 있는 걸 가리키게한다.
        //그러나 p는 Student객체 멤버 중 Person이 가진 멤버만 접근 가능하다.

        System.out.println(p.name); // 접근 가능
       // p.grade = 'A'; //컴파일 오류. 
        // p.department = "computer";//컴파일오류
    }
}