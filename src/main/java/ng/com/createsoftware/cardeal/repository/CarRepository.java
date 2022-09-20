package ng.com.createsoftware.cardeal.repository;

import ng.com.createsoftware.cardeal.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
//specifying a url path for the model...so rather than car, it now shows vehicle
//@RepositoryRestResource(path="vehicle")

//include queries in url(postman) created in the repository
@RepositoryRestResource
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    //fetch Cars by brand
    //List<Car> findByBrand(String brand);
    List<Car> findByBrand(@Param("brand")String brand);

    //fetch cars by color
    List<Car> findByColor(String color);

    //fetch cars by year
    List<Car> findByYear(String year);

    //fetch by brand and model
    List<Car> findByBrandAndModel(String brand, String model);

    //fetch cars by brand or color
    List<Car> findByBrandOrColor(String brand, String color);

    //fetch cars by brand and sort by year
    List<Car> findByBrandOrderByYearAsc(String brand);

    //fetch cars by brand using sql
  //   @Query("select c from Car c where c.brand = ?1")
   // List<Car> findByBrand(String brand);
}
