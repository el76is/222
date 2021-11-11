package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    @Autowired
    private CarServiceImpl carService;

    @RequestMapping("/cars")
    public String getCars(@RequestParam(defaultValue = "0") int count, Model model) {
        model.addAttribute("cars", carService.getList(count));
        return "cars-example";
    }
}
