public class Array_2d {
    public static void main(String[] args) {

        // To initialize 2D Array
        int[][] arr = new int[3][3];   // The 1st square bracket represents no. of rows & 2nd square bracket represents no. of columns
        //OR
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};

        for (int[] ints : arr1) {   //arr1.length represents no. of rows
            for (int j = 0; j < arr1[0].length; j++) {    // arr1[0].length represents no. of columns
                System.out.print(ints[j] + " ");

            }
            System.out.println();

        }


    }
}
