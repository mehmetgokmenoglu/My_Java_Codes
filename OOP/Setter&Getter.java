//The Person Class
public class Person {

    private String name;
    private int age;
    private String gender;
    private boolean isInitialized = false;

    public Person(String name) {
        this(name,19);
    }

    public Person(String name, int age) {
        this(name,age,"Male");
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        setAge(age);
        setGender(gender);
        isInitialized = true;
    }

    public String getName(){
        if(name.length()<3 || name.length()>20){
            return "error";
        }
        return "Name: " + this.name;
    }

    public String getAge(){
        if(age<18 || age>65){
            System.out.println("You can't work here");
        }
        return "Age: " + this.age;
    }

    public String getGender() {
        String result = "Gender: " + this.gender;
        if (this.gender.equalsIgnoreCase("Female")) {
            result += "\nYou can't work here lady";
        }
        return result;
    }

    public void setGender(String gender) {
        if (isInitialized) {
            System.out.println("Gender is being changed");  // Sadece nesne ilk oluşturulduktan sonra yazdırılır
        }
        this.gender = gender;
    }

    public void setAge(int age){
        if (isInitialized) {
            System.out.println("Age is being changed");  // Sadece nesne ilk oluşturulduktan sonra yazdırılır
        }
        this.age = age;
    }
}

//The Main Class
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jaja");

        System.out.println(person1.getName());

        System.out.println(person1.getAge());

        person1.setAge(23);

        System.out.println(person1.getAge());

        System.out.println(person1.getGender());

        person1.setGender("Female");

        System.out.println(person1.getGender());
    }
}
