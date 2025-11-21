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
            String s = position + "";
        System.out.println(s);
            newMatrix = new int[matrix.length-s.length()][matrix.length - s.length()];
                for(int i=0; i<s.length(); i++) {
                    int z = Integer.parseInt(s.substring(i,i+1));
                    System.out.println("z is" + z);

                    for (int x = 0; x < newMatrix.length-1; x++) {
                        int removal = 0;
                        for (int p = 0; p < newMatrix.length-1; p++) {
                            if(p==z) {
                                removal++;
                            }
                            else {
                                newMatrix[x][p] = matrix[x][p-removal];
                                newMatrix[p][x] = matrix[p][x-removal];

                            }
                        }
            }
        }                return newMatrix;

    }
}

