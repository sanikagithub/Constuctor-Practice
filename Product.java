public class Product {
    private String name;
    private int cost;
    private int quantity;


    // the class constructor
    public Product(String productName, int productQuantity, int productCost) {
        this.quantity = productQuantity;
        this.name = productName;
        this.cost = productCost;
    }

    public void totalCost() {
        int totalCost = cost * quantity;
        System.out.println("Total cost is " + totalCost);

    }

    public void printProduct(int cost, int quantity) {
        System.out.println("One donut costs $" + cost + " and " + quantity + " donuts were purchased");
    }

    
}