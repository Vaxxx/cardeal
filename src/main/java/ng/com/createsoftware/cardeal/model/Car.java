package ng.com.createsoftware.cardeal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name="cars")
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String color;
    private String registeredNumber;
    private int year;
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="owner")
    private Owner owner;

    public Car(String brand, String model, String color, String registeredNumber, int year, int price, Owner owner) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registeredNumber = registeredNumber;
        this.year = year;
        this.price = price;
        this.owner = owner;
    }
}
