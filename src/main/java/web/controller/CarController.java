package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.Dao.CarDao;

@Controller
@RequestMapping("/cars")
public class CarController {


    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    private CarDao carDao;
    @GetMapping
    public String getCars( Model model) {
        model.addAttribute("cars",carDao.getCars());
        return "cars/ollCars";
    }
    @GetMapping("/{id}")
    public String getSomeCars(@PathVariable("id") int id, Model model) {
        model.addAttribute("cars",carDao.getSomeCars(id));
        return "cars/someCars";
    }

}
