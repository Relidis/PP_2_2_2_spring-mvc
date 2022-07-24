package web.Dao;


import org.springframework.stereotype.Component;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Ford", "3"));
        cars.add(new Car(2, "Mazda", "3"));
        cars.add(new Car(3, "BMW", "7"));
        cars.add(new Car(4, "Mersedes", "190"));
        cars.add(new Car(5, "Mersedes", "124"));
    }

    public List<Car> getCars() {
        return cars;
}
    public Car getSomeCars(int number) {
        return cars.stream().limit(number).findAny().orElse(null);
    }
}