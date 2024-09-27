// Array - Array is a data structure which allow us to store similar datatype

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Syntax:-

        //datatype[] variable_name = new datatype[size]
        int[] roll = new int[5];  //Here, we have created integer datatype array to store roll no.
        //OR
        int[] rollno = {23, 45, 56, 67, 89};  //We can directly store it.

        System.out.println(Arrays.toString(rollno));

        String[] name;             // Declaration of Array: Name is getting defined in the stack
        name = new String[10];    // Initialization of Array: Here, Object is created into heap memory

        // Taking input in array using for loop

        System.out.println("Input the number: ");

        for (int i = 0; i < roll.length; i++) {
            roll[i] = in.nextInt();

        }
        System.out.println(Arrays.toString(roll));

        //Enhanced for-loop
        for(int num: rollno){
            System.out.print(num + " ");     // num represents elements of the array
        }
    }
}
