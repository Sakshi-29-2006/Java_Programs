// What is Abstraction in Java?
// Simple Definition:
// Abstraction means hiding the complex parts of code 
// and showing only the important features to the user.
// Why Do We Use Abstraction?
// To simplify complex systems.
// To avoid exposing internal logic (which may confuse or overwhelm).
// Just like:
// You use a phone to call, text, take photos.
// You don’t know what goes on inside the phone to make those things happen.
// In Java, abstraction helps us to focus on what an object does, not how it does it.
// Let’s Understand with a Very Simple Example
// Example: Using a Remote Control
// You press a button on a remote to turn the TV on/off.
// Do you know how electricity flows inside? How signals are sent?
// NO! You only care about what the button does, not how it does it.

// Remote-->An abstract class. You can’t create a Remote object directly.
abstract class Remote {
    // Abstract method – no body
    abstract void pressButton();
    
    // Concrete method – has body
    void showBrand() {
        System.out.println("This is a Sony Remote.");
    }
}
// Subclass
class TVRemote extends Remote {
    // Implementing the abstract method
    void pressButton() {
        System.out.println("TV is turned ON.");
    }
}

// Main class to run
public class Main {
    public static void main(String[] args) {
        TVRemote myRemote = new TVRemote();
        myRemote.pressButton();  // Output: TV is turned ON.
        myRemote.showBrand();    // Output: This is a Sony Remote.
    }
}
