package springprject.projectCar;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
    Tyre t;

    public Tyre getT() {
        return t;
    }

    public void setT(Tyre t) {
        this.t = t;
    }


    public void drive() {
        System.out.println("Bike..");
    }
}
