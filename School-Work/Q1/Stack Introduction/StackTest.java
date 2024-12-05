public class StackTest {
    private Stack<Integer> lulstack;

    public StackTest() {
        lulstack = new Stack<Integer>();

        lulstack.push(1);
        lulstack.push(2);
        lulstack.push(3);
        lulstack.push(4);
        lulstack.push(5);
        lulstack.push(6);
        lulstack.push(7);
        lulstack.push(8);
        lulstack.push(9);
        lulstack.push(10);
    }

    public void output() {
        Stack<Integer> tmp = new Stack<Integer>();

        while (!lulstack.isEmpty()) {
            Integer top = lulstack.peek();
            System.out.println(top); 
            tmp.push(top); 
            lulstack.pop(); 
        }

        while (!tmp.isEmpty()) {
            lulstack.push(tmp.peek());
            tmp.pop();
        }
    }

    public boolean search(Integer pNum) {
        Stack<Integer> tmp = new Stack<Integer>();
        boolean found = false;

        while (!lulstack.isEmpty()) {
            Integer top = lulstack.peek();
            if (top.equals(pNum)) {
                found = true; 
            }
            tmp.push(top); 
            lulstack.pop(); 
        }

        while (!tmp.isEmpty()) {
            lulstack.push(tmp.peek());
            tmp.pop();
        }

        return found;
    }

    public int count() {
        Stack<Integer> tmp = new Stack<Integer>();
        int count = 0;

        while (!lulstack.isEmpty()) {
            tmp.push(lulstack.peek());
            lulstack.pop();
            count++;
        }

        while (!tmp.isEmpty()) {
            lulstack.push(tmp.peek());
            tmp.pop();
        }

        return count;
    }
}
