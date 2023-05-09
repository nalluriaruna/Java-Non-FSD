
public class MatrixAdd {

    public static void main(String[] args) {
        int rows = 3, columns = 3;
        int[][] A = { {2, 3, 4}, {5, 2, 3},{2,3,4}};
        int[][] B = { {4, 5, 3}, {5, 6, 3},{5,6,7 }};

        // Adding Two matrices
        System.out.println("addition of A and B is:");
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = A[i][j] + B[i][j];
                System.out.print(sum[i][j]+ "  ");
            }
            System.out.println();
        }

        //multiplying two numbers
        System.out.println("multiplication of A and B is:");
        int[][] multi = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                multi[i][j] = A[i][j] * B[i][j];
                System.out.print(multi[i][j]+ "  ");
            }
            System.out.println();
        }
    }

   }
