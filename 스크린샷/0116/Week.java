//3. interface�� ��ӹ޴� Class�� implements�� ��ӹ޴´�.
//4. interface�� ��ӹ޴� Class�� �ݵ�� interface�� ��� �߻�޼ҵ带 public �������ؾ� �Ѵ�.
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
