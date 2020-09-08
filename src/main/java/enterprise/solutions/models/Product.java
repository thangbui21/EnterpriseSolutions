package enterprise.solutions.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//Định nghĩa product và các phương thức khởi tạo.
@EntityScan
@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String productName;
    private String type;
    private float productPrice;
    private float soldToday;
    private float inStock;

    public Product() {
    }

    public Product(String id, String productName, String type, float productPrice, float soldToday, float inStock) {
        this.id = id;
        this.productName = productName;
        this.type = type;
        this.productPrice = productPrice;
        this.soldToday = soldToday;
        this.inStock = inStock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public float getSoldToday() {
        return soldToday;
    }

    public void setSoldToday(float soldToday) {
        this.soldToday = soldToday;
    }

    public float getInStock() {
        return inStock;
    }

    public void setInStock(float inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productName='" + productName + '\'' +
                ", type='" + type + '\'' +
                ", productPrice=" + productPrice +
                ", soldToday=" + soldToday +
                ", inStock=" + inStock +
                '}';
    }
}
