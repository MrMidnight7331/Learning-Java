public class Stackalgo {
    private Stack<Integer> A;
    private Stack<Integer> B;
    private Stack<Integer> C;

    public Stackalgo() {
        A = new Stack<>();
        B = new Stack<>();
        C = new Stack<>();
        A.push(4);
        A.push(3);
        A.push(1);
        A.push(2);
        A.push(5);
        A.push(7);
        A.push(9);
        A.push(8);
        A.push(6);
        A.push(11);
        A.push(10);
        A.push(12);
    }

    public void sort() {
        while (!A.isEmpty()) {
            int tmp = A.peek();
            A.pop();
            if (C.isEmpty() || tmp >= C.peek()) {
                C.push(tmp);
            } else {
                B.push(tmp);
            }
        }
        while (!B.isEmpty()) {
            int tmp = B.peek();
            B.pop();
            while (!C.isEmpty() && C.peek() > tmp) {
                B.push(C.peek());
                C.pop();
            }
            C.push(tmp);
        }
        while (!C.isEmpty()) {
            A.push(C.peek());
            C.pop();
        }
    }

    public void output() {
        Stack<Integer> tmp = new Stack<>();
 
        while (!A.isEmpty()) {
            int top = A.peek();
            System.out.println(top);
            tmp.push(top);
            A.pop();
        }
        while (!tmp.isEmpty()) {
            A.push(tmp.peek());
            tmp.pop();
        }
    }

}
