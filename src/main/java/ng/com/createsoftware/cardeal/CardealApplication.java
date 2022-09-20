package ng.com.createsoftware.cardeal;

import ng.com.createsoftware.cardeal.model.Car;
import ng.com.createsoftware.cardeal.model.Owner;
import ng.com.createsoftware.cardeal.model.User;
import ng.com.createsoftware.cardeal.repository.CarRepository;
import ng.com.createsoftware.cardeal.repository.OwnerRepository;
import ng.com.createsoftware.cardeal.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.Key;
import java.util.Arrays;

@SpringBootApplication
//public class CardealApplication implements CommandLineRunner {
public class CardealApplication   {

    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private UserRepository userRepository;

    private static final Logger logger =
            LoggerFactory.getLogger(CardealApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(CardealApplication.class, args);
    }


  ///user created with 12345678 vax
    //admin Vakporize admin
    //   @Override
//    public void run(String... args) throws Exception {
//        //Add owner objects and save these to db
//        Owner owner1 = new Owner("Vax", "Okagbare");
//        Owner owner2 = new Owner("Miranda", "Tarunda");
//        ownerRepository.saveAll(Arrays.asList(owner1, owner2));
//
//        //add car object and link to owner and save to db
//        Car car1 = new Car("Ford", "Mustang", "Brown", "ABJ-201-GWA", 2020, 60000, owner1 );
//        Car car2 = new Car("Toyota", "Corolla", "Grey", "ABJ-1947-GWA", 2021, 63000, owner2 );
//        Car car3 = new Car("Benz", "AutoMatic", "White", "ABJ-143-GWA", 2022, 98000, owner1 );
//        Car car4 = new Car("Toyota", "Camry", "Black", "ABJ-3202-GWA", 2022, 69000, owner2 );
//        carRepository.saveAll(Arrays.asList(car1, car2, car3, car4));
//
//        for(Car car: carRepository.findAll()){
//            logger.info(car.getBrand() + " " + car.getModel());
//        }
//
//
//        userRepository.save(new User("vax", "$2a$10$cQtlIqTUCt.af9SiDwDwTO65Wj9.drJPsbThBx45W9ayqJHcm5VQq", "USER"));
//        userRepository.save(new User("admin", "$2a$10$I7KupjhoxVeCq8DJTlj4PexRuSZKoju7ofQ5HP7s53GwpXbVxyX8.", "ADMIN"));
//
//    }


}
