package Prog3;
// Person class
class Person {
    // Private attribute (name)
    private String name;

    // Public attributes (gender and age)
    public String gender;
    public int age;

    // Constructor to initialize all attributes
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // Getter method to access the private name attribute
    public String getName() {
        return name;
    }

    // Setter method to update the private name attribute (optional, if needed)
    public void setName(String name) {
        this.name = name;
    }

    // Method to display person details
    public void displayPersonDetails() {
        System.out.println("Name: " + getName()); // Access private variable via getter
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }
}

// Main class to demonstrate the Person class
public class Main {

    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person("John Doe", "Male", 30);

        // Display person details
        person.displayPersonDetails();

        // Optionally, you can use the setter to update the private variable
        // person.setName("Jane Doe");
        // person.displayPersonDetails();
    }
}
