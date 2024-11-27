package SuperExamples;

public class Person2 {
    Person2(){
        System.out.println("Person 2 Class Constructor");
    }
}


class StudentTest extends Person2{
    StudentTest(){
        super();
        System.out.println("StudentTest Class Constructor");
    }
}

class Person2Test{
    public static void main(String[] args) {
        StudentTest st = new StudentTest();
    }
}