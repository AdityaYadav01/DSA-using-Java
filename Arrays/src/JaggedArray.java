public class JaggedArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[5];       // Adding 5 colunms in 1st row
        arr[1] = new int[3];       // Adding 3 colunms in 2nd row
        arr[2] = new int[7];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
