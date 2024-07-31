import java.util.function.BiFunction;

public class BiFunctionSection {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        int result = add.apply(3,5);
        System.out.println(result);
    }
}
