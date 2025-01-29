public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        System.out.println("\n========== ADDING BOXES TO RECEIVING SHELF ==========");
        warehouse.addBoxToReceivingShelf(new Box(1, 30));
        warehouse.addBoxToReceivingShelf(new Box(2, 40));
        warehouse.addBoxToReceivingShelf(new Box(3, 50));
        warehouse.addBoxToReceivingShelf(new Box(4, 20));
        warehouse.addBoxToReceivingShelf(new Box(5, 60));

        warehouse.distributeBoxes();
    }
}
