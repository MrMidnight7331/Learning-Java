public class Shelf {
    private Stack<Box> boxes;
    private double totalWeight;
    private double weightLimit; 
    public Shelf(double weightLimit) {
        this.boxes = new Stack<>();
        this.totalWeight = 0;
        this.weightLimit = weightLimit;
    }


    public boolean pushBox(Box box) {
        if (weightLimit > 0 && (totalWeight + box.getWeight() > weightLimit)) {
            return false; 
        }
        boxes.push(box);
        totalWeight += box.getWeight();
        return true;
    }

    public Box popBox() {
        if (boxes.isEmpty()) {
            return null;
        }
        Box topBox = boxes.peek(); 
        boxes.pop();              
        totalWeight -= topBox.getWeight();
        return topBox;
    }


    public Box peekBox() {
        return boxes.peek();
    }


    public boolean isEmpty() {
        return boxes.isEmpty();
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public double getWeightLimit() {
        return weightLimit;
    }
}
