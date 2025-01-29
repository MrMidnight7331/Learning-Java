class Warehouse {
    Shelf receivingShelf = new Shelf(1000);
    Shelf[] storageShelves = {new Shelf(1000), new Shelf(1000), new Shelf(1000)};

    void addBoxToReceivingShelf(Box box) {
        System.out.printf("\n[INFO] Adding Box %d to Receiving Shelf...\n", box.number);
        receivingShelf.addBox(box);
    }

    void distributeBoxes() {
        System.out.println("\n========== STARTING BOX DISTRIBUTION ==========");
        while (!receivingShelf.isEmpty()) {
            Box box = receivingShelf.removeBox();
            boolean stored = false; // Track if the box was successfully stored
            for (Shelf shelf : storageShelves) {
                if (shelf.addBox(box)) {
                    stored = true;
                    break;
                }
            }
            if (!stored) {
                System.out.printf("\n[WARNING] Box %d could not be stored, all shelves are full!\n", box.number);
                receivingShelf.addBox(box);
            }
        }
        System.out.println("\n========== DISTRIBUTION COMPLETE ==========");
    }
}