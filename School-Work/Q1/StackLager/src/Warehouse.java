class Warehouse {
    Shelf receivingShelf = new Shelf(1000);
    Shelf[] storageShelves = {new Shelf(1000), new Shelf(1000), new Shelf(1000)};

    public Warehouse() {}

    public void addBoxToReceivingShelf(Box box) {
        System.out.printf("\n[INFO] Adding Box %d to Receiving Shelf...\n", box.number);
        receivingShelf.addBox(box);
    }

    public void distributeBoxes() {
        System.out.println("\n========== STARTING BOX DISTRIBUTION ==========");
        while (!receivingShelf.isEmpty()) {
            Box box = receivingShelf.removeBox();
            boolean stored = false;
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