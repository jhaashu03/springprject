package springprject;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springprject.projectCar.Tyre;
import springprject.projectCar.Vehicle;

import org.springframework.context.*;
import springprject.projectPhone.AppConfig;
import springprject.projectPhone.Samsung;

/**
 * Hello world!
 *
 */


public class App 
{


    public static void main( String[] args )
    {
        //projectCar
        /*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //Vehicle vehicle = new Car();
        Vehicle vehicle = (Vehicle)context.getBean("car");
        vehicle.drive();
        //System.out.println( "Hello World!" );

        Tyre t = (Tyre) context.getBean("tyre");
        System.out.println(t);*/

        //projectPhone
        //AnnotationBasedConfig
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        //Samsung s7 = new Samsung();
        Samsung s7 = factory.getBean(Samsung.class);
        s7.config();

    }
}
