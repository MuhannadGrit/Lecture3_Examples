package Printer;

public class TestOverloading {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print("Hello World");
        printer.print(123);
        printer.print(10.10f);
        printer.print(true);
        printer.print("My age", 25);
    }
}
