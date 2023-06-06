package method_class;

// Define a class called "Person"
public class Person {
    // Attributes
    String name;
    int age;


//    static int tall;
//
//    static int myTall(int x){
//       x=tall;
//        return x;
//    }

    // Method to introduce the person
   public void introduce() {
        System.out.println("Hi, my name is " + name + " and I'm " + age + " years old.");
    }

    public static void main(String[] args) {
        // Create objects of the "Person" class
        Person person1 = new Person();
        Person person2 = new Person();

// Set values for the attributes of the objects
        person1.name = "Alice";
        person1.age = 25;

        person2.name = "Bob";
        person2.age = 30;

// Invoke the "introduce" method on the objects
        person1.introduce();
        person2.introduce();



    }

}
