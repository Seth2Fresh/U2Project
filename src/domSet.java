import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

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

    public static List<Integer> AdjacencyOfHighestDegree(int[][] matrix, int pOHDV) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(pOHDV);
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][pOHDV] == 1) {
                myList.add(i);
            }
        }
        return myList;

    }

    public static int[][] removeIndexofMatrix(int[][] matrix, int index) {
        int n = matrix.length;
        int[][] newMatrix = new int[n - 1][n - 1];

        int r = 0;
        for (int i = 0; i < n; i++) {
            if (i == index) continue;

            int c = 0;
            for (int j = 0; j < n; j++) {
                if (j == index) continue;

                newMatrix[r][c] = matrix[i][j];
                c++;
            }
            r++;
        }
        return newMatrix;
    }

    public static String sort(String s) {
        char[] arr = s.toCharArray(); //had to look up how to do this
        java.util.Arrays.sort(arr);
        return new StringBuilder(new String(arr)).reverse().toString();
    }

    public static int[][] repeatRemoveIndexofMatrix(int[][] matrix, List adjacencylist) {
        Collections.sort(adjacencylist, Collections.reverseOrder());

        int[][] newMatrix = matrix;

        for (int i = 0; i < adjacencylist.size(); i++) {
            int index = (int) adjacencylist.get(i);
            newMatrix = removeIndexofMatrix(newMatrix, index);
        }
        return newMatrix;
    }

    public static int minimalDomSet(int[][] matrix){
        int[][] x = matrix;

        int count = 0;
        while(x.length != 0){
            x = domSet.repeatRemoveIndexofMatrix(x,domSet.AdjacencyOfHighestDegree(x,domSet.findPositionOfHighestDegree(x)));
            count ++;
        } return count;
    }

}