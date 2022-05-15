package springprject.projectCar;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    private String brand;

    //constructor-arg
    /*public Tyre(String brand) {
        this.brand = brand;
    }*/

    public String getBrand() {
        return brand;
    }

    //set using beans
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
