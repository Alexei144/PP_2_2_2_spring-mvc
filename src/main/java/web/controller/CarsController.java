package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {

    //всё через сервис
    private final CarService carService;

    @Autowired
    public CarsController (CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String allCars(Model model) {
        model.addAttribute("cars", carService.allCars());
        return "cars/cars";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("car",carService.show(id));
        return "cars/show";
    }

    @GetMapping("/car")
    public String returnTheSpecifiedNumberOfMachines(@RequestParam(value = "count", defaultValue = "5") int count,
                                                     Model model){
        model.addAttribute("count", carService.returnTheSpecifiedNumberOfMachines(count));
        return "cars/cars";
    }





}
