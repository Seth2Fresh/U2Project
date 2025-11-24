public class domSet {
    public static int findDegree(int[][] matrix, int row) {
        int x = 0;
        for (int i = 0; i < matrix.length; i++) {
            x += matrix[i][row];
        }
        return x;
    }

    public static int findPositionOfHighestDegree(int[][] matrix) {
        int p = 0;
        int x = -1;
        for (int i = 0; i < matrix.length; i++) {
            if (domSet.findDegree(matrix, i) > x) {
                x = domSet.findDegree(matrix, i);
                p = i;
            }

        }
        return p;
    }

    public static int AdjacencyOfHighestDegree(int[][] matrix, int pOHDV) {
        int position = pOHDV;
        int count = 10;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][pOHDV] == 1) {
                position += (i) * count;
                count *= 10;
            }}
        return position ;

    }
    public static int[][] removeIndexofMatrix(int[][] matrix, int row){
        int [][] newMatrix = new int[matrix.length-1][matrix.length-1];
        int removalp;
        int removali = 0;
        for (int i = 0; i < matrix.length; i++) {
            removalp=0;
            for (int p = 0; p < matrix.length; p++) {
                if(p!=row && i!=row) {
                    newMatrix[i - removali][p - removalp] = matrix[i][p];
                }
                if(i == row){removali++;}
                if(p == row){removalp++;}



            }

        } return newMatrix;
    }
}

