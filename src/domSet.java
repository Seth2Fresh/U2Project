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

    public static int[][] removeAdjacencyOfHighestDegree(int[][] matrix, int pOHDV) {
        for (int i = 0; i < matrix.length; i++) {
        if(matrix[i][pOHDV] = 1;){}
        }
    }
}


