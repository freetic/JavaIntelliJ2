import java.util.Scanner;

public class IfDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  //keyboard
		System.out.print("좋아하시는 계절 : ");
		String season = scan.next();
		System.out.println("season = " + season);
		switch(season) {
			case "spring":
				System.out.println("개나리, 진달래");  break;
			case "summer":
				System.out.println("장미, 아카시아");  break;
			case "fall":
				System.out.println("코스모스, 백합");  break;
			case "winter":
				System.out.println("동백, 매화");  break;
		}
		/*
		 * if(season.equals("spring")) { System.out.println("개나리, 진달래"); }else
		 * if(season.equals("summer")) { System.out.println("장미, 아카시아"); }else
		 * if(season.equals("fall")) { System.out.println("코스모스, 백합"); }else
		 * if(season.equals("winter")){ System.out.println("동백, 매화"); }
		 */
	}
}
