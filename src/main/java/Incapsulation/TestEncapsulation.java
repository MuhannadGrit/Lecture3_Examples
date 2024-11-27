package Incapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Person person = new Person("Muhannad Satouf", 25);
        System.out.println("User Name: " + person.getName());

        person.setAge(26);
        System.out.println("User Name: " + person.getAge());
    }
}
