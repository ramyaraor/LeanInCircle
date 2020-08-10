import java.util.*;
class JavaProgram2DArraySort {

    // Function to sort by column
    public static void sortbyColumn(int arr[][], int col)
    {
        // Using built-in sort function , Arrays.sort
        // Interface Comparator<T>
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            // Compare values according to columns
            public int compare( int[] entry1,
                                int[] entry2) {
                // To sort
                if (entry1[col] > entry2[col])
                    return 1;
                else
                    return -1;
            }
        });  // End of function call sort().
    }

    // Driver Code
    public static void main(String args[])
    {
        int matrix[][] = { { 39, 27, 55, 42 },
                           { 10, 93, 5000, 90 },
                           { 54, 78, 50, 89 },
                           { 24, 64, 5, 65 } };
        // Sort matrix
        int col = 3;
        sortbyColumn(matrix, col - 1);

        // Display the sorted Matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}