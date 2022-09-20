package ng.com.createsoftware.cardeal.controller;

import lombok.AllArgsConstructor;
import ng.com.createsoftware.cardeal.model.Car;
import ng.com.createsoftware.cardeal.repository.CarRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class CarController {

    private CarRepository carRepository;

    @GetMapping("/cars")
    public Iterable<Car> getCars(){
        return carRepository.findAll();
    }
}
