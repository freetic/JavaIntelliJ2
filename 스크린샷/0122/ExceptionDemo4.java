public class ExceptionDemo4 {
	public static void main(String[] args) {
		//int su = Integer.parseInt("54cm");   //"54" --> 54
		//System.out.printf("su = %d\n", su);
		
		Bumo bumo = new Jasik();    bumo.display();
	}
}
class Bumo{
	public void display() throws  java.io.FileNotFoundException{ 
		System.out.println("나는 부모의 메소드");  }
}
class Jasik extends Bumo{
	@Override
	public void display() throws  java.io.IOException { 
		System.out.println("나는 자식의 메소드"); 
	}
}



