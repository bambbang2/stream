package MethodReference;

import model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class Section3 {

    public static void main(String[] args) {
        Map<String, BiFunction<String, String, Car>> carTypeToContructorMap = new HashMap<>();
        carTypeToContructorMap.put("sedan", Sedan::new);
        carTypeToContructorMap.put("suv", Suv::new);
        carTypeToContructorMap.put("van", Van::new);

        BiFunction<Integer, String, User> userCreator = User::new;
        User charlie = userCreator.apply(3, "Charlie");
        System.out.println(charlie);

        String[][] inputs = new String[][] {
                { "sedan", "Sonata", "Hyundai" },
                { "van", "Sienna", "Toyota" },
                { "sedan", "Model S", "TESLA" },
                { "suv", "Sorento", "KIA" },
        };

        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < inputs.length; i++) {
            String[] input = inputs[i];
            String type = input[0];
            String name = input[1];
            String brand = input[2];

            cars.add(carTypeToContructorMap.get(type).apply(name, brand));
        }

        for(Car car : cars) {
            car.drive();
        }
    }
}
