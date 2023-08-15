package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarDao {

    public List<Car> allCars();

    public Car show(int id);

    public List<Car> returnTheSpecifiedNumberOfMachines(int count);
}
