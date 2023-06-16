package solid.lsp;

public class OrderBonus extends Order{

    public OrderBonus(int price, int qnt) {
        super(price, qnt);
    }

    @Override
    public int getAmount() {
        return 0;
    }
}
