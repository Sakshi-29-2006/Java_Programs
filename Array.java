
public class Array {
    //An array in Java is a collection of elements of the 
    // same type stored in contiguous memory locations. 
    // It allows you to store multiple values in a single variable instead of declaring separate variables for each value.
//     Arrays are fixed in size (once declared, the size cannot be changed).

// Each element is accessed by its index (starting from 0).

// It can hold primitive types (like int, float, char) or objects (like String, Integer, etc.).
    public static void main(String[] args){
        int[] age = new int[4];
        age[0] = 18;
        age[1] = 67;
        age[2] = 15;
        age[3] = 36;
        int[] marks = {85, 90, 78, 92, 88};
        //or the array can be declared in another way as:
        // marks[0] = 85;
        //so on upto
        // marks[4] = 88;
        //to find the size of the array i.e the number of elements we use arr_name.length
        System.out.println("Size of the marks array:"+marks.length);
        //to output all the elements of the array we use a for loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

    }

}
