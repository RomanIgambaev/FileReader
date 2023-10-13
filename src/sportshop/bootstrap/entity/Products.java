package sportshop.bootstrap.entity;

public class Products {
    private int productId;
    private String name;
    private double price;
    private int quantityInStock;


    public Products(int productId, String name, double price, int quantityInStock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;

    }

    public int printProductInfo() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;

    }

    public void getProductInfo() {
        System.out.println("ID товара:  " + productId);
        System.out.println("Название товара: " + name);
        System.out.println("Цена товара: " + price);
        System.out.println("В наличии: " + quantityInStock);

    }

    public void setProductInfo(int productId, String name, double price, int quantityInStock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public void updateProductInfo(int newProductId, String newProductName, double newPrice, int newQuantityInStock) {
        this.productId = newProductId;
        this.name = newProductName;
        this.price = newPrice;
        this.quantityInStock = newQuantityInStock;
    }

    public void increaseStock(int quantity) {
        if (quantity >= 0) {
            this.quantityInStock += quantity;
        } else {
            System.out.println("Ошибка: Количество должно быть полложительным ");
        }
    }

    public void decreaseStock(int quantity) {
        if (quantity >= 0 && quantity <= quantityInStock) {
            this.quantityInStock -= quantity;
        } else if (quantity < 0) {
            System.out.println("Ошибка: Количество должно быть положительным числом");
        } else {
            System.out.println(" Ошибка: Недостаточно товара на складе  ");
        }

    }
}
