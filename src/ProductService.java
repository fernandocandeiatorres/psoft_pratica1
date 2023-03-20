public class ProductService {
    private ProductRepository pr;

    public ProductService(){
        this.pr = new ProductRepository();
    }
    public void criaProduto(Integer id, String nome, String manufacturer, double price) {
        Product p = new Product(id, nome, manufacturer, price);
        pr.criaProduto(p);
    }
}
