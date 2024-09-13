public class ParametersInMethods {
    public static void main(String[] args) {
        // Pass the value of numbers when you are calling methods in main
        int ans = sum3(20,30);
        System.out.println(ans);

        String message = name(" Aditya Yadav");
        System.out.println(message);
    }

    static int sum3(int a, int b){
        int sum = a+b;
        return sum;  // sum3 method will stop working here
    }

    // String Example


    static String name(String YourName){
        String message2 = "Hello" + YourName;
        return message2;
    }
}
