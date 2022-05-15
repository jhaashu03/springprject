package springprject.projectPhone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "springprject.projectPhone")
public class AppConfig {

    //Use @Component instead of this but just define @ComponentScan
   /* @Bean
    public Samsung getPhone(){
        return new Samsung();
    }

    @Bean
    public MobileProcessor getProcessor(){
        return new Snapdragon();
    }*/
}
