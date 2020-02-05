import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MainClass {
	private ArrayList<Product> list;
	public MainClass() {
		this.list = new ArrayList<Product>();
	}
	public static void main(String[] args) {
		MainClass mc = new MainClass();
		mc.input();    mc.calc();   mc.sort();  mc.output();
	}
	private void input(){
		try(FileInputStream fis = new FileInputStream("productdata.txt")) {
			byte [] buffer = new byte[fis.available()];
			int number = fis.read(buffer);
			String str = new String(buffer, 0, number);
			StringTokenizer st = new StringTokenizer(str, "\n");
			String [] array = new String[st.countTokens()];
			for(int i = 0 ; i < array.length ; i++) {
				array[i] = st.nextToken();  //NOTEBOOK	36000	5000	4700	2000
				Scanner scan = new Scanner(array[i]).useDelimiter("\\s+");
				Product product = new Product(scan.next(), scan.nextInt(), scan.nextInt(),
						                                      scan.nextInt(), scan.nextInt());
				this.list.add(product);
			}
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
	private void calc(){
		for(Product product : this.list) {
			//판매금액 = 수량 * 판매단가
			int sales = product.getQty() * product.getSalemoney(); 
			//매입금액 = 수량 * 매입단가
			int buy = product.getQty() * product.getBuymoney();
			//이익금 =판매금액 - (매입금액 + 운송료)
			int sum = sales - (buy + product.getFee());
			//이익율 = 이익금 / 매입금액 * 100
			double rate = sum / (double)buy * 100;
			product.setSum(sum);  product.setRate(rate);
		}
	}
	private void sort(){}
	private void output(){
		for(Product product : this.list) {
			System.out.println(product);
		}
	}
}
