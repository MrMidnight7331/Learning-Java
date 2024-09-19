public class Array{
    String[][] coffee = {
        {"Cappuccino", "Espresso", "Latte"},
        {"Icde Coffee", "Cold brew", "Frappe"},
        {"Mocha", "Macchiato", "Irish Coffee"}
    };

    public void extrude(){
        for (int i = 0; i < coffee.length; i++){
            System.out.println();
            for (int j = 0; j < coffee[i].length; j++){
                System.out.println(coffee[i][j] + " ");
            }
        }
    }
}