//1. interface���� public static final�� ������ ����� �����ϰ� �ݵ�� �ʱ�ȭ�ؾ� �Ѵ�.
//2. interface���� public abstract�� ������ �߻�޼ҵ常 �����ϴ�.
public interface Weekable {
	int SUN=0, MON=1, TUE=2, WED=3, THU=4, FRI=5, SAT=6; 
	void set(int date);
	int get();
}
