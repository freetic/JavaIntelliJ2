
public class Test<T extends Number> {
	private T value;
	public Test(T value) {  this.value = value; }
	public void setValue(T value) { this.value = value; }
	public T getValue() { return this.value; }
}
