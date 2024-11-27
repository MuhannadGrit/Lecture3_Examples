package Printer;

public class Printer
{
    public void print(String data){
        System.out.println("String Parameter" + data);
    }

    public void print(int data){
        System.out.println("int Parameter" + data);
    }

    public void print(double data){
        System.out.println("double Parameter" + data);
    }

    public void print(boolean data){
        System.out.println("boolean Parameter" + data);
    }

    public void print(String label, int data){
        System.out.println("Two Parameters" + " label" + label + " data" + data );
    }
}
