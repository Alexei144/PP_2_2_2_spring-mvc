package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    public List<Car> allCars();

    public Car show(int id);

    //метод который возвращает заданное число машин
    public List<Car> returnTheSpecifiedNumberOfMachines(int count);


}
