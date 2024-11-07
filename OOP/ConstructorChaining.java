// The Person Class

public class Person {

    // Fields to store the name, age, and gender of the person
    public String name;
    public int age;
    public String gender;

    // Constructor to initialize Person with name and default age (19)
    public Person(String name) {
        this(name, 19);  // Calls the second constructor with age set to 19
    }

    // Constructor to initialize Person with name and age, default gender ("Male")
    public Person(String name, int age) {
        this(name, age, "Male");  // Calls the third constructor with "Male" as the default gender
    }

    // Constructor to initialize Person with name, age, and gender provided
    public Person(String name, int age, String gender) {
        this.name = name;   // Assigns the provided name to the 'name' field
        this.age = age;     // Assigns the provided age to the 'age' field
        this.gender = gender;  // Assigns the provided gender to the 'gender' field
    }
}



// The Main Class
public class Main {
    public static void main(String[] args) {

        // Create a Person object with only name provided, default age 18 and gender "Male"
        Person person1 = new Person("Mehmet");

        // Output the details of the first person
        System.out.println("Name: " + person1.name);  // Prints the name
        System.out.println("Age: " + person1.age);    // Prints the age (default is 18)
        System.out.println("Gender: " + person1.gender);  // Prints the gender (default is "Male")

        // Separator line for clarity
        System.out.println("----------------------------------");

        // Create a Person object with name and age provided, default gender "Male"
        Person person2 = new Person("Burak", 20);

        // Output the details of the second person
        System.out.println("Name: " + person2.name);  // Prints the name
        System.out.println("Age: " + person2.age);    // Prints the age (provided as 20)
        System.out.println("Gender: " + person2.gender);  // Prints the gender (default is "Male")

        // Separator line for clarity
        System.out.println("----------------------------------");

        // Create a Person object with name, age, and gender provided
        Person person3 = new Person("Mavera", 21, "Female");

        // Output the details of the third person
        System.out.println("Name: " + person3.name);  // Prints the name
        System.out.println("Age: " + person3.age);    // Prints the age (provided as 21)
        System.out.println("Gender: " + person3.gender);  // Prints the gender (provided as "Female")

    }
}
