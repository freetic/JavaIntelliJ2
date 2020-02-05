import java.util.Scanner;
import java.util.Calendar;

public class SwitchDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		int current_year = now.get(Calendar.YEAR);
		System.out.print("ÀÌ¸§ : ");    String name = scan.next();
		System.out.print("Ãâ»ı³âµµ : ");  int born_year = scan.nextInt();
		System.out.printf("%s(%d¼¼)´Ô! ", name, (current_year - born_year + 1));
		switch(born_year % 12) {
			case 0: System.out.println("¿ø¼şÀÌ¶ìÀÔ´Ï´Ù.");  break;  //½Å
			case 1: System.out.println("´ß¶ìÀÔ´Ï´Ù.");  break;       //À¯
			case 2: System.out.println("°³¶ìÀÔ´Ï´Ù.");  break;       //¼ú
			case 3: System.out.println("µÅÁö¶ìÀÔ´Ï´Ù.");  break;       //ÇØ
			case 4: System.out.println("Áã¶ìÀÔ´Ï´Ù.");  break;       //ÀÚ
			case 5: System.out.println("¼Ò¶ìÀÔ´Ï´Ù.");  break;       //Ãà
			case 6: System.out.println("È£¶ûÀÌ¶ìÀÔ´Ï´Ù.");  break;       //ÀÎ
			case 7: System.out.println("Åä³¢¶ìÀÔ´Ï´Ù.");  break;       //¹¦
			case 8: System.out.println("¿ë¶ìÀÔ´Ï´Ù.");  break;       //Áø
			case 9: System.out.println("¹ì¶ìÀÔ´Ï´Ù.");  break;       //»ç
			case 10: System.out.println("¸»¶ìÀÔ´Ï´Ù.");  break;     //¿À
			default: System.out.println("¾ç¶ìÀÔ´Ï´Ù.");  break;     //¹Ì
		}
	}
}
