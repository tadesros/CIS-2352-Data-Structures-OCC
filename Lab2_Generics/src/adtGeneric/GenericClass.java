package adtGeneric;


public class GenericClass<T> {

    private String key;
    private T value;

    public GenericClass(String key,T value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString()
    {
        return String.format(key.toString() +":"+value.toString());
    }
}