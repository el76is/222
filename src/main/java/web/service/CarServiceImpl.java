package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final Car car1 = new Car("Model1", "Color1", 1);
    private final Car car2 = new Car("Model2", "Color2", 2);
    private final Car car3 = new Car("Model3", "Color3", 3);
    private final Car car4 = new Car("Model4", "Color4", 4);
    private final Car car5 = new Car("Model5", "Color5", 5);

    private final List<Car> carsList = new ArrayList<>();

    {
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car5);
    }

    public List<Car> getList(int count) {
        if (count <= 0 | count > carsList.size()) {
            return carsList;
        } else {
            return carsList.subList(0, count);
        }
    }
}
