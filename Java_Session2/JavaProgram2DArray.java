import java.util.Scanner;

public class JavaProgram2DArray {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in); // Object Initialization
        System.out.println("Enter The Number Of  Rows");
        int matrixRow = inputReader.nextInt();
        System.out.println("Enter The Number Of  Columns");
        int matrixCol = inputReader.nextInt();
        //defining 2D array to hold Order of birth & Names data - 5 Rows 2 Columns
        String[][] Store = new String[matrixRow][matrixCol];
        //String[][] Store = new String[5][2]
        // Enter Data - Initialisation on data
        // Function call - to enter data
        enterMatrixData(inputReader, Store, matrixRow, matrixCol);
        // Function call - Print Data
        printMatrix(Store, matrixRow, matrixCol);
    }
    // Function Definition-to enter data
    public static void enterMatrixData(Scanner inputReader, String[][] Store, int matrixRow, int matrixCol){
        System.out.println("Enter Matrix Data");

        for (int i = 0; i < matrixRow; i++)
        {
            for (int j = 0; j < matrixCol; j++)
            {
                Store[i][j] = inputReader.next(); // Reads your data 10  times
            }
        }
    }
    // Function Definition-to print data
    public static void printMatrix(String[][] Store, int matrixRow, int matrixCol){
        System.out.println("------Pandavas 2D Array Matrix----- "+"\n");
        for (int i = 0; i < matrixRow; i++)
        {
            for (int j = 0; j < matrixCol; j++)
            {
                System.out.print(Store[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}