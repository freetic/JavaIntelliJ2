
public class Product {
	private String name; 
	private int qty, salemoney, buymoney, fee, sum;
	private double rate;
	public Product(String name, int qty, int salemoney, int buymoney, int fee) {
		this.name = name;
		this.qty = qty;
		this.salemoney = salemoney;
		this.buymoney = buymoney;
		this.fee = fee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getSalemoney() {
		return salemoney;
	}
	public void setSalemoney(int salemoney) {
		this.salemoney = salemoney;
	}
	public int getBuymoney() {
		return buymoney;
	}
	public void setBuymoney(int buymoney) {
		this.buymoney = buymoney;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return String.format("%s\t%d\t%d\t%d\t%d\t%d\t%.2f",
				             name, qty, salemoney, buymoney, fee, sum, rate);
	}
}
