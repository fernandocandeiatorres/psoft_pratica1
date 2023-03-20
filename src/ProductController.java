public class ProductController {
    private ProductService ps;
    public ProductController(){
        this.ps = new ProductService();
    }

    public void criaProduto(Integer id, String name, String manufacturer, double price){
        ps.criaProduto(id, name, manufacturer, price);
    }
}
