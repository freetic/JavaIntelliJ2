//3. interface를 상속받는 Class는 implements로 상속받는다.
//4. interface를 상속받는 Class는 반드시 interface의 모든 추상메소드를 public 재정의해야 한다.
public class Week extends Object implements Weekable {
	private int date;
	@Override
	public void set(int date) {
		this.date = date;
	}

	@Override
	public int get() {
		return this.date;
	}

}
