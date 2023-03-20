import java.util.Date;

public class Lote {
    private Product p;
    private int qtd;
    private String dataString;

    public Lote(Product p, int qtd, String dataString){
        this.p = p;
        this.qtd = qtd;
        this.dataString = dataString;
    }
}
