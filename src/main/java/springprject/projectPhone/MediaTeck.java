package springprject.projectPhone;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class MediaTeck implements MobileProcessor {
    @Override
    public void process() {
        System.out.println("Media Teck");
    }
}
