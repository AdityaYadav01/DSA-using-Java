// Method Overloading - It allow the class to have multiple method/function with same name but different parameter lists.

public class MethodOverloading {
    public static void main(String[] args) {
        int ans = sum(20,20);            // Parameter list with 2 numbers
        System.out.println(ans);

        int ans2 = sum(20,20, 20);   // Parameter list with 3 numbers
        System.out.println(ans2);

    }
    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }
}
