package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        System.out.println("REEEE");
    }
    Person person = new Person("Bob", 28, 170);
    Car car1 = new Car("Honda", "Civic", 2008, 180000);

}
