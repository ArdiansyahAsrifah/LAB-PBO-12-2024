public class no2 {

    private String id;
    private String name;
    private int stock;
    private double price;

    public no2(String id, String name, int stock, double price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    public void displayProductInfo() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Stock: " + stock);
        System.out.println("Product Price: rp" + price);
        System.out.println("Product is " + (isAvailable() ? "available" : "not available") + " in stock");
    }

    public static void main(String[] args) {
       no2 product = new no2("P001", "pepsodent", 10, 10.000);
 
        product.displayProductInfo();
    }
}
