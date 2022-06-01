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

public class Example_downcasting {
    public static void main(String args[]) {
        Person p = new Student("이재문"); //업캐스팅, 좋은코드
        //Student s = p; //컴파일오류.
        //why? Student s는 더 큰놈일 수 있는데.. 더 잘할 수 있는데.. p가 가리키고 있는 건 Student객체긴 하지만.. 모든 멤버에 접근할 수 없잖아..
        Student s= (Student)p; //이케 강제형변환해주듯 명시적으로 선언해주어야함
        //그냥 애초에 다운캐스팅으로 안만드는 게 ... 베스트일듯!?!?
        System.out.println(p.name);
        System.out.println(s.name);
        
        s.grade = "A";
        s.department = "computer";
        System.out.println(s.name+"("+s.grade+", "+s.department+")");
        
        //p.grade = "A"; //컴파일오류
        //p.department = "media"; //컴파일오류
    }
}