public class Warehouse {
    private Shelf shelf0; 
    private Shelf shelf1; 
    private Shelf shelf2; 
    private Shelf shelf3; 

    public Warehouse() {
        shelf0 = new Shelf(0);    
        shelf1 = new Shelf(100);
        shelf2 = new Shelf(100);
        shelf3 = new Shelf(100);
    }

    public Shelf getShelf0() {
        return shelf0;
    }

    public Shelf getShelf1() {
        return shelf1;
    }

    public Shelf getShelf2() {
        return shelf2;
    }

    public Shelf getShelf3() {
        return shelf3;
    }


    public String distributeBoxes() {

        Shelf[] targets = { shelf1, shelf2, shelf3 };

        for (Shelf target : targets) {
            boolean candidateFound = true;
            while (candidateFound) {
                candidateFound = false;
                double remainingCapacity = target.getWeightLimit() - target.getTotalWeight();
                if (remainingCapacity <= 0) {
                    break; 
                }
                Box bestCandidate = null;
                
                Stack<Box> temp = new Stack<>();
                while (!shelf0.isEmpty()) {
                    Box current = shelf0.peekBox();
                    shelf0.popBox();
                    if (current.getWeight() <= remainingCapacity) {
                        if (bestCandidate == null || current.getWeight() > bestCandidate.getWeight()) {
                            bestCandidate = current;
                        }
                    }
                    temp.push(current);
                }
                
                boolean removedCandidate = false;
                while (!temp.isEmpty()) {
                    Box b = temp.peek();
                    temp.pop();
                    if (!removedCandidate && bestCandidate != null && b == bestCandidate) {
                        removedCandidate = true;
                        continue;
                    }
                    shelf0.pushBox(b);
                }
                
                if (bestCandidate != null) {
                    target.pushBox(bestCandidate);
                    candidateFound = true;
                }
            }
        }

        if (!shelf0.isEmpty()) {
            return "Some boxes remain in the incoming shelf (shelf0).";
        } else {
            return "All boxes have been distributed successfully.";
        }
    }
}
