package adtGeneric;

public class KeyValueGeneric <K, V> {
    private String key;
    private V value;

    public KeyValueGeneric(String key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + ": " + value;
    }
}