import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// 값만 받고, retrun값이 없다. => Supplier와 반대 개념
public class ConsumerSection {
    public static void main(String[] args) {
        Consumer<String> myStringConsumer = str -> System.out.println(str);
        myStringConsumer.accept("Hello");
        myStringConsumer.accept("world");

        // Arrays.asList -> 변형을 할 수 없는 배열 ( Immutable )
        List<Integer> integerInputs = Arrays.asList(4, 2, 3);
        Consumer<Integer> myIntegerConsumer = x -> System.out.println("Processing Integer" + x);
        process(integerInputs, myIntegerConsumer);


        Consumer<Integer> myDifferentConsumer = x -> System.out.println("Processing Integer In Different" + x);
        process(integerInputs, myDifferentConsumer);

        Consumer<Double> myDoubleConsumer = x -> System.out.println("Processing Double" + x);
        List<Double> doubleInputs = Arrays.asList(1.1, 2.2, 3.3);
        process(doubleInputs, myDoubleConsumer);
    }

    public static <T> void process(List<T> inputs, Consumer<T> processor) {
        for(T i : inputs) {
            processor.accept(i);
        }

    }
}
