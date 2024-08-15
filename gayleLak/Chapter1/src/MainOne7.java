/**
 * Description: Given an image represented by an NxN matrix, where each pixel in the image is 4 Bytes.
 * Write a method to rotate the image by 90 degrees (in Place)
 */
public class MainOne7 {
    public static void rotateMatrix(int[][] matrix) {
        /* Intermediate swap */
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < rows; cols++) {
                if (rows == cols) {
                    continue;
                }

                int temp = matrix[rows][cols];
                matrix[rows][cols] = matrix[cols][rows];
                matrix[cols][rows] = temp;
            }
        }


        display2(matrix);
        // [[], [], []]
        /*Reverse the matrix row*/
        for (int i = 0; i < matrix.length; i++) {
            reverseArray(matrix[i]);
        }
    }

    public static void reverseArray(int[] matrix) {
        int p2 = (matrix.length) - 1;
        for (int p1 = 0; p1 < p2; p1++) {
            int temp = matrix[p1];//temp = 1; temp = 2
            matrix[p1] = matrix[p2];//matrix[0] = 5; matrix[1] = 4;
            matrix[p2] = temp;//matrix[5] = 1; matrix[4] = 2;
            p2--;
        }

    }

    public static String display(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += array[i] + ",";
        }

        return result;
    }

    public static void display2(int[][] array) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result += display(array[i]) + "\n";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[][] array = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        display2DRotation(array);
    }

    public static void display2DRotation(int[][] arr) {
        for(int row = 0; row < arr.length; row++) {
            for(int col = arr.length - 1; col >= 0; col--){
                System.out.print(arr[col][row] + " ");
            }
            System.out.println();
        }

    }


}
