import java.util.Vector;

public class Output {
	private Vector<Member> vector;

	public Output(Vector<Member> vector) {
		this.vector = vector;
	}
	
	public void output() {
		//printLabel();
		for(Member member : this.vector) {
			System.out.println(member);  //sal.toString()
		}
	}
	private void printLabel() {}
}
