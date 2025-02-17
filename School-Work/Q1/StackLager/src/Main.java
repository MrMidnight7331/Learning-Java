public class Main{
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();


        warehouse.getShelf0().pushBox(new Box(1, 30));
        warehouse.getShelf0().pushBox(new Box(2, 40));
        warehouse.getShelf0().pushBox(new Box(3, 50));
        warehouse.getShelf0().pushBox(new Box(4, 40));
        warehouse.getShelf0().pushBox(new Box(5, 70));
        warehouse.getShelf0().pushBox(new Box(6, 10));
        warehouse.getShelf0().pushBox(new Box(7, 60));

        String result = warehouse.distributeBoxes();
        System.out.println(result);

        System.out.println("Shelf1 total weight: " + warehouse.getShelf1().getTotalWeight());
        System.out.println("Shelf2 total weight: " + warehouse.getShelf2().getTotalWeight());
        System.out.println("Shelf3 total weight: " + warehouse.getShelf3().getTotalWeight());
        System.out.println("Shelf0 is empty: " + warehouse.getShelf0().isEmpty());
    }
}