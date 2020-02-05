/*
 * 1. final variable  ==> Constant
 * 2. final method
 * 3. final class
 */
public class FinalDemo {
	final int NUM;   //member constant     ﬂ»‚¶
	static final int ENG = 90;   //class constant
	
	public FinalDemo(int num) {    //Constructor
		this.NUM = num;
	}
	public static void main(String[] args) {
		{
			final int SU = 5;     //local constant
			//SU = 100;
		}
		System.out.println(SU);
	}
	static void change(final int su) {
		su *= 100;
	}
}









