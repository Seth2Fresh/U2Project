public class Main {
    public static void main(String[] args) {

        int[][] m = createMatrix.generateMatrix(30);

        createMatrix.printMatrix(m);
        for (int i = 0; i < m.length; i++) {
            System.out.println(domSet.findDegree(m, i));
            System.out.println();
        }
        System.out.println(domSet.findPositionOfHighestDegree(m));
        System.out.println();
createMatrix.printMatrix((domSet.removeAdjacencyOfHighestDegree(m,domSet.findPositionOfHighestDegree(m))));
    }
}
