/*1. Variable Arguments/VarArgs - It allows the function/method to accept arbitrary numbers of arguments */


import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {

        Varargs(1, 34, 54, 89, 88, 76);
        multi(1,2,"Aditya", "Yadav");

    }
    static void Varargs(int ...a){
        System.out.println(Arrays.toString(a));
    }

    // Taking input of multiple arguments
    static void multi(int a, int b, String ...s){     // Variable Argument should always come in last
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(s));
    }


}
