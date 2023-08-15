package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {

    List<Car> allCars();

    Car show(int id);

    List<Car> returnTheSpecifiedNumberOfMachines(int count);
}
