public class Test<T> extends Number{
    private T value;
    public Test(T value) {
        this.value = value;
    }
    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return this.value;
    }

    public Test() {
        super();
    }

    @Override
    public byte byteValue() {
        return super.byteValue();
    }

    @Override
    public short shortValue() {
        return super.shortValue();
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
