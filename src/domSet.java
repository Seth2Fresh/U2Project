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
        int position = pOHDV;
        int count = 10;
        int[][] newMatrix;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][pOHDV] == 1) {
                position += (i) * count;
                count *= 10;
            }}
            String s = (String) position;
            newMatrix = new int[matrix.length - s.length()][matrix.length - s.length()];
                for(int i=0; i<s.length(); i++){
                    int z = (int) (position/Math.pow(10,i));
                    for (int x = 0; x < matrix.length; x++) {
                        int count = 0;
                        for (int p = 0; p < matrix.length; p++) {
                        if(p!=z||x!=z){
                        newMatrix[i][p] = matrix[i][p];
                        }
                        }
            }
        }                return newMatrix;

    }
}

