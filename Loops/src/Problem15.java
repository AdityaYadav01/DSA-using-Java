// Display number from 1 to 25 in 5 by 5 matrix
public class Problem15 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 ; j++) {
                System.out.format("%02d ",count);
                count++;
            }
            System.out.println();


        }

    }
}
