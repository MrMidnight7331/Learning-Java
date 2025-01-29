class Shelf {
    Stack<Box> stack = new Stack<>();
    double totalWeight = 0;
    double weightLimit;

    public Shelf(double weightLimit) {
        this.weightLimit = weightLimit;
    }

    public boolean addBox(Box box) {
        if (weightLimit == -1 || totalWeight + box.weight <= weightLimit) {
            stack.push(box);
            totalWeight += box.weight;
            System.out.printf("\n[INFO] Added Box %d | Weight: %.1f | Total Shelf Weight: %.1f\n", box.number, box.weight, totalWeight);
            return true;
        }
        System.out.printf("\n[WARNING] Cannot add Box %d. Weight limit exceeded.\n", box.number);
        return false;
    }

    public Box removeBox() {
        if (!stack.isEmpty()) {
            Box box = stack.peek();
            stack.pop();
            totalWeight -= box.weight;
            System.out.printf("\n[INFO] Removed Box %d | Weight: %.1f | Total Shelf Weight: %.1f\n", box.number, box.weight, totalWeight);
            return box;
        }
        System.out.println("\n[WARNING] Shelf is empty.\n");
        return null;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}