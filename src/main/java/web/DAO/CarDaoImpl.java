package web.DAO;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl {
    private static int CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Tundra","white", ++CARS_COUNT));
        cars.add(new Car("Tank","black", ++CARS_COUNT));
        cars.add(new Car("UAZ","green", ++CARS_COUNT));
        cars.add(new Car("Prado","yellow", ++CARS_COUNT));
        cars.add(new Car("Urus","blue", ++CARS_COUNT));

    }

    public List<Car> allCars() {
        return cars;
    }

    public Car show(int id) {
        return cars.stream().filter(car -> car.getId() == id).findAny().orElse(null);
    }

    public List<Car> returnTheSpecifiedNumberOfMachines(int count){

       return cars.stream().limit(count).collect(Collectors.toList());
          // через стрим

    }
}
