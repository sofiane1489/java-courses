package constructor;

public class Person {
  private String name;
  private int age;

    // Constructor with parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Creating an object of the Person class using the constructor
        Person person = new Person("John Doe", 25);

        // Accessing object properties using getter methods
        String name = person.getName();
        int age = person.getAge();

//       String n= person.name;
//        int a=person.age;
//        System.out.println(n+" "+a);

        // Printing the object properties
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

