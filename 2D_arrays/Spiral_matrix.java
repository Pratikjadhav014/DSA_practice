class Spiral_matrix {
    public static void main(String[] args) {

        /*int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13,14,15,16}
        };*/

        int arr[][] ={
            {1,2,3,11},
            {4,5,6,12},
            {7,8,9,13}
        };

        int n = arr.length, m = arr[0].length;

        int startRow = 0, startCol = 0;
        int endRow = n - 1, endCol = m - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Top row
            for (int a = startCol; a <= endCol; a++) {
                System.out.print(arr[startRow][a] + " ");
                
            }
            System.out.print(" ");

            // Right column
            for (int b = startRow + 1; b <= endRow; b++) {
                System.out.print(arr[b][endCol] + " ");
            }
            System.out.print(" ");

            // Bottom row
            if (startRow < endRow) {
                for (int c = endCol - 1; c >= startCol; c--) {
                    System.out.print(arr[endRow][c] + " ");
                }
                
            }
            System.out.print(" ");

            // Left column
            if (startCol < endCol) {
                for (int d = endRow - 1; d > startRow; d--) {
                    System.out.print(arr[d][startCol] + " ");
                }
                
            }
            System.out.print(" ");

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
}
