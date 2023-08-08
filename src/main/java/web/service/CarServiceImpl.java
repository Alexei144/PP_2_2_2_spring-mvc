package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDaoImpl;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarDaoImpl carDao;

    @Override
    public List<Car> allCars(){
        return carDao.allCars();
    }

    @Override
    public Car show(int id){
      return carDao.show(id);
    }


    @Override
    public List<Car> returnTheSpecifiedNumberOfMachines(int count) {
        return carDao.returnTheSpecifiedNumberOfMachines(count);
    }

    //реализация интерфейса
}