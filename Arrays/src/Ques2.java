import java.util.Scanner;

// Searching an element
public class Ques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {10,32, 44, 65, 6, 78, 50};

        System.out.println("Enter the element you want to find: ");
        int x = in.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                System.out.println("The element is at " + i + " position");
                System.exit(0);
            }
        }
        System.out.println("The element is not present");

    }

}
