import java.util.Vector;

public class Calc {
    Vector<Product> products;

    public Calc(Vector<Product> products) {
        this.products = products;
    }

    public void calc(){
        for(int i = 0; i < products.size(); i++){
            Product p = products.get(i);
            int salTot = p.getAmount() * p.getPrice();
            int buyTot = p.getAmount() * p.getBuyPrice();
            int profit = salTot - (buyTot + p.getCostOfTransport());
            double profitRatio = 1.0*profit/buyTot*100;
            p.setProfit(profit);
            p.setProfitRatio(profitRatio);
        }
    }
}
