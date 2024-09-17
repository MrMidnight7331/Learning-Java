public class Array{
    String[][] coffee = {
            {"Cappuccino", "Latte", "Espresso"},
            {"Mocha", "Frappe", "Iced Coffee"},
            {"Black Coffee", "Turkish Coffee", "Irish Coffee"}
    };

    public void coffeeout(){
        for (int i=0; i<coffee.length; i++){
            System.out.println();
            
            for (int j=0; j<coffee[i].length; j++){
                System.out.println(coffee[i][j] + " ");
            }
        }
    }



}