package models;
public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        if (name == null || name.isBlank()){
            throw  new IllegalArgumentException("name cannot be blank/null");
        }
        this.name = name;
        if(price < 0){
            throw  new IllegalArgumentException("price cannot be less than zero.");
        }
        this.price = price;
        if(quantity < 0){
            throw  new IllegalArgumentException("quantity cannot be less than zero.");
        }
        this.quantity = quantity;
    }
    public Item(Item source) {
        this.name = source.name;
        this.price = source.price;
        this.quantity = source.quantity;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setName(String name) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("The name cannot be blank/null");
        }
        this.name = name;
    }
    public void setPrice(double price) {
        if(price < 0){
            throw new IllegalArgumentException("Price cannot be less than 0");
        }
        this.price = price;
    }
    public void setQuantity(int quantity) {
        if(quantity < 0){
            throw new IllegalArgumentException("quantity cannot be less than 0");
        }
        this.quantity = quantity;
    }

    public String toString() {
        return this.name + ": " + this.price + " ("+this.quantity+")";
    }

}
