
public class InheritanceDemo {
	public static void main(String[] args) {
//		TwoD twod = new TwoD();
		ThreeD threed = new ThreeD();
		threed.display();
	}
}
class TwoD extends Object{
	int x= 40, y = 50;
	void display() {  System.out.printf("(x, y) = (%d, %d)", x, y); }
}
class ThreeD extends TwoD{
	int z;
}