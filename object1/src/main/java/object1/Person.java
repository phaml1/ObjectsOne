package object1;

public class Person {// Define a class

    String name;
    int age = 0;

    int height = 0;

    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height; //height is in cm
        }

    // Declare and initialize an object
    Person person1 = new Person("John", 30, 180);
    }
