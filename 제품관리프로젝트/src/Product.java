public class Product implements Comparable<Product>{
    String pName;
    int amount;
    int price;
    int buyPrice;
    int costOfTransport;
    int profit;
    double profitRatio;

    public Product(String pName, int amount, int price, int buyPrice, int costOfTransport) {
        this.pName = pName;
        this.amount = amount;
        this.price = price;
        this.buyPrice = buyPrice;
        this.costOfTransport = costOfTransport;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getCostOfTransport() {
        return costOfTransport;
    }

    public void setCostOfTransport(int costOfTransport) {
        this.costOfTransport = costOfTransport;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public double getProfitRatio() {
        return profitRatio;
    }

    public void setProfitRatio(double profitRatio) {
        this.profitRatio = profitRatio;
    }

    @Override
    public String toString() {
        return String.format("%s\t%d\t%d\t%d\t%d\t%d\t%.2f", pName,
                amount, price, buyPrice, costOfTransport, profit, profitRatio);
    }

    @Override
    public int compareTo(Product o) {
        if(this.getProfitRatio() > o.getProfitRatio()) return -1;
        else if(this.getProfitRatio() < o.getProfitRatio()) return 1;
        else return 0;
    }
}
