import util.TriFunction;

public class TriFunctionSection {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> addThreeNumbers = (a, b, c) -> a + b + c;

        int result = addThreeNumbers.apply(3, 4, 5);
        System.out.println(result);
    }
}
