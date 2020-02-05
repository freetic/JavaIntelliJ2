public class EncapsulationDemo1 {
	public static void main(String[] args) {
//		Product ballpen = new Product();
//		System.out.println(ballpen.name);
//		System.out.println(ballpen.price);
		Calendar now = new Calendar();
		System.out.println(now.year);
	}
}
class Calendar{
	int year, month, day;
	public Calendar() {  //Default Constructor Overriding
		this.year = 2020;   this.month = 1;   this.day = 14;
	}
}
//class Product{
//	String name, maker;
//	int price;
//	public Product() {     
//		this.name = "¸ð³ª¹Ì º¼Ææ";   this.maker = null;
//		this.price = 200;
//	}
//}