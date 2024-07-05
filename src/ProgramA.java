public class ProgramA {
    public static void main(String[] args) {
        ProgramB b = new ProgramB();
        ProgramC c = new ProgramC();
        System.out.println("Sum of 2 numbers:" + b.add(5, 10));
        c.printMessage();
    }
}