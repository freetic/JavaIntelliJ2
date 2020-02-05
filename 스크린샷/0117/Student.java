
public class Student /*extends Person*/ implements IPerson {
	private String hakbun;
	private int score;
	
	//public Student() {}

	public Student(/*String name, int age, String address, */String hakbun, int score) {
		//super(name, age, address);
		this.hakbun = hakbun;   this.score = score;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void printInfo() {
		System.out.println("학번 = " + hakbun + ", 점수 = " + score);
	}
	//String name, int age, String address
//	@Override
//	public String toString() {
//		return String.format("%s, %d, %s, %s, %d\n", 
//							getName(), getAge(), getAddress(), hakbun, score);
//	}
}
