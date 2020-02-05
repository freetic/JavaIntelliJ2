//1. interface에는 public static final이 생략된 상수만 가능하고 반드시 초기화해야 한다.
//2. interface에는 public abstract이 생략된 추상메소드만 가능하다.
public interface Weekable {
	int SUN=0, MON=1, TUE=2, WED=3, THU=4, FRI=5, SAT=6; 
	void set(int date);
	int get();
}
