public class Main {
    public static void main(String[] args) {
        Stackalgo stack = new Stackalgo();

        System.out.println("Before sort:");
        stack.output();

        stack.sort();

        System.out.println("After sort:");
        stack.output();
    }    
}
