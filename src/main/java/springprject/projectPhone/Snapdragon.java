package springprject.projectPhone;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {
    @Override
    public void process() {
        System.out.println("Spandragon");
    }
}
