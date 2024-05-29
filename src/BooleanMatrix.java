//this class contains three different method of implementing a solution for boolean matrix
//it differs with space and time complexity
public class BooleanMatrix {
    public static void bruteForceBooleanMatrix(int[][] matrix) {
        int rowSize = matrix.length;
        int columnSize = matrix[0].length;
        int[][] outputMatrix = new int[rowSize][columnSize];
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int columns = 0; columns < matrix.length; columns++) {
                if (matrix[rows][columns] == 1) {
                    for (int columnIncrement = 0; columnIncrement < columnSize; columnIncrement++) {
                        outputMatrix[rows][columnIncrement] = 1;
                    }
                    for (int rowIncrement = 0; rowIncrement < rowSize; rowIncrement++) {
                        outputMatrix[rowIncrement][columns] = 1;
                    }
                }
            }

        }
    }

    public static void booleanMatrix(int[][] matrix) {

        int rowSize = matrix.length;
        int columnSize = matrix[0].length;

        int[] rowTable = new int[rowSize];
        int[] columnTable = new int[columnSize];
        for (int rows = 0; rows < rowSize; rows++) {
            for (int rowColumn = 0; rowColumn < columnSize; rowColumn++) {
                if (matrix[rows][rowColumn] == 1) {
                    rowTable[rows] = 1;
                    break;


                }

            }
        }
        for (int column = 0; column < columnSize; column++) {
            for (int columnRow = 0; columnRow < rowSize; columnRow++) {
                if (matrix[columnRow][column] == 1) {
                    columnTable[column] = 1;
                    break;

                }
            }
        }
        for (int rowLooper = 0; rowLooper < rowSize; rowLooper++) {
            for (int columnLooper = 0; columnLooper < columnSize; columnLooper++) {
                if (rowTable[rowLooper] == 1 || columnTable[columnLooper] == 1) {
                    matrix[rowLooper][columnLooper] = 1;
                }
            }

        }
    }

    public static void optimizedBooleanMatrix(int[][] matrix) {
        int rowSize = matrix.length;
        int columnSize = matrix[0].length;

        boolean firstRowHasOne = false;
        boolean firstColumnHasOne = false;

        for (int firstRow = 0; firstRow < rowSize; firstRow++) {
            for (int firstColumn = 0; firstColumn < columnSize; firstColumn++) {
                if (matrix[firstRow][0] == 1) {
                    firstRowHasOne = true;


                }
                if (matrix[0][firstColumn] == 1) {
                    firstColumnHasOne = true;

                }

            }
        }


        for (int remainingRow = 1; remainingRow < rowSize; remainingRow++) {
            for (int remainingColumn = 1; remainingColumn < columnSize; remainingColumn++) {
                if (matrix[remainingRow][remainingColumn] == 1) {
                    matrix[0][remainingColumn] = 1;
                    matrix[remainingRow][0] = 1;
                }
            }
        }


        for (int row = 1; row < rowSize; row++) {
            for (int col = 1; col < columnSize; col++) {
                if (firstRowHasOne || firstColumnHasOne) {
                    matrix[row][col] = 1;

                }
            }
        }


    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 0},
                {1, 0, 0},
                {1, 0, 0},
                {0, 0, 0}};
//        int[][] matrix = {{1, 0}, {0, 1}};

        optimizedBooleanMatrix(matrix);
    }
}



