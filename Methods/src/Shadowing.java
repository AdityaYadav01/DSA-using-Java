public class Shadowing {
    static int a = 18;
    public static void main(String[] args) {
        System.out.println(a);

        int a = 12;                 // the class variable at line 2 will be shadowed by this
        System.out.println(a);      // It will going to print 12. Also, '12' is only available inside the block

        fun();

    }
    static void fun(){
        System.out.println(a);
    }
}
