//6. interface끼리의 상속은 다중상속이 가능하며, extends로 상속받는다.
public interface Father extends GrandFather, GrandMother {
	int MONEY = 100_000_00;
	void father();
}
