import java.util.Collections;
import java.util.Vector;

//�����ȣ ������ �������� ����
public class Sort {
	private Vector<Member> vector;

	public Sort(Vector<Member> vector) {
		this.vector = vector;
	}
	
	public void sort() {
		Collections.sort(this.vector);
	}
}




