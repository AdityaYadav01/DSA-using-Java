/* Display

1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5

*/
public class Problem14 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) { // i represent rows
            for (int j = 1; j <=5 ; j++) {  //j represent columns
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
