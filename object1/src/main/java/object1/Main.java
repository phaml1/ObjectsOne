package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");
        Person[] people = new Person[4];
        Person person1 = new Person("Bob", 28, 170);
        Person person2 = new Person("Bob", 28, 170);
        Person person3 = new Person("Bob", 28, 170);
        Person person4 = new Person("Bob", 28, 170);

        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        people[3] = person4;

        Car car1 = new Car("Honda", "Civic", 2008, 180000);
        Chair chairNew = new Chair("Glass", "Black", 2);
        Dog doge = new Dog("DogeCoin", 4, "Shiba");
        System.out.println(car1.getYear());
    }

}

