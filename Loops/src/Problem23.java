import java.util.Scanner;

// Check if alphabet is vowel or consonant
public class Problem23 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the alphabet: ");
        char ch = in.next().trim().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            System.out.println(ch + " is a vowel");
        }else{
            System.out.println(ch + " is a consonant");
        }


    }

}
