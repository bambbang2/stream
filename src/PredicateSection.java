import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// 한 개의 Input을 받아서 true / false를 반환하는 boolean 함수
public class PredicateSection {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println(isPositive.test(10));

        List<Integer> inputs = Arrays.asList(10, -5, 4, -2, 0);
        System.out.println("Positive Number: " +  filter(inputs, isPositive));

        // negate : 선언한 isPositive의 반대를 나타냄
        System.out.println("Non-Positive Number: " +  filter(inputs, isPositive.negate()));

        // or : 선언한 조건 포함해서 나타냄
        System.out.println("Non-Negative Number: " +  filter(inputs, isPositive.or(x -> x == 0)));

        // 양수 중 짝수만
        System.out.println("Positive even Number: " +  filter(inputs, isPositive.and(x -> x % 2 == 0)));
    }

    public static <T> List<T> filter(List<T> inputs, Predicate<T> condition) {
        List<T> output = new ArrayList<>();
        for (T input : inputs) {
            if (condition.test(input)) output.add(input);
        }
        return output;
    }
}
