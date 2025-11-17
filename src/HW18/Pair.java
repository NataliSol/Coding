package HW18;

public class Pair<K, V> {
    K key;
    V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value=value;
    }
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair<String, Integer>  first=new Pair<>("hello", 11);
        Pair<Double, String> second=new Pair<>(88.0, "iii");
        System.out.println(first.getKey());
        System.out.println(first.getValue());
        System.out.println(second.getKey());
        System.out.println(second.getValue());
    }
}
