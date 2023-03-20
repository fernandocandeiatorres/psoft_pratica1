import java.util.HashMap;
import java.util.Map;

public class ProductRepository {
    Map<Integer, Product> products;
    public ProductRepository(){
        products = new HashMap<>();
    }
    public void criaProduto(Product p) {
        products.put(p.getId(), p);
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }
}
