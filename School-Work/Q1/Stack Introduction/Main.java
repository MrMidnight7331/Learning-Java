public class Main {
    public static void main(String[] args) {
        StackTest stacks = new StackTest();

        stacks.output();
    

        System.out.println("Nums: " + stacks.count());
        System.out.println("Exists? " + stacks.search(3));
        
    }    
}
