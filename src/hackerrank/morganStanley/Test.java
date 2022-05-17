package hackerrank.morganStanley;

public class Test<T> {
    T value;

    public Test(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        Test<String> first = new Test<>("a");
        Test<Integer> two = new Test<>(123);
        System.out.println(first.getValue());
        System.out.println(two.getValue());
    }
}
