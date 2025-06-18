// What is a Class in Java?
// A class is a blueprint or template for creating objects. 
// It defines variables (attributes) and methods (functions) that describe the behavior 
// and state of the objects.
// What is an Object in Java?
// An object is an instance of a class. When a class is defined, 
// no memory is allocated until an object of that class is created using the new keyword.
public class ClassandObj {
    String title;
    String author;

    // Constructor
    ClassandObj(String t, String a) {
        title = t;
        author = a;
    }

    // Method to display information
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        // Create objects
        ClassandObj obj1 = new ClassandObj("1984", "George Orwell");
        ClassandObj obj2 = new ClassandObj("The Alchemist", "Paulo Coelho");

        // Call display method
        obj1.display();
        System.out.println();  // For spacing
        obj2.display();
    }
}
