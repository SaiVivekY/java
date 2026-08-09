interface Product {

    void displayProduct();
}

class Item {

    String name;
    double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}



class Electronic extends Item implements Product {

    Electronic(String name, double price) {
        super(name, price);
    }

    public void displayProduct() {
        System.out.println("Electronic Product: " + name);
        System.out.println("Price: " + price);
    }
}

class Clothing extends Item implements Product {

    Clothing(String name, double price) {
        super(name, price);
    }

    public void displayProduct() {
        System.out.println("Clothing Product: " + name);
        System.out.println("Price: " + price);
    }
}

class Grocery extends Item implements Product {

    Grocery(String name, double price) {
        super(name, price);
    }

    public void displayProduct() {
        System.out.println("Grocery Product: " + name);
        System.out.println("Price: " + price);
    }
}


public class ecommerce {

    public static void main(String[] args) {

        Electronic e = new Electronic("Laptop", 60000);
        Clothing c = new Clothing("T-Shirt", 800);
        Grocery g = new Grocery("Rice", 500);


        e.displayProduct();
        c.displayProduct();
        g.displayProduct();
    }
}
