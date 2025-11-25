public class Main {
    public static void main(String[] args) {

        int[][] m = createMatrix.generateMatrix(10);

        createMatrix.printMatrix(m);
        for (int i = 0; i < m.length; i++) {
            System.out.println(domSet.findDegree(m, i));
            System.out.println();
        }
        int x = domSet.findPositionOfHighestDegree(m);
        System.out.println(domSet.findPositionOfHighestDegree(m));
        System.out.println();
        System.out.println(domSet.AdjacencyOfHighestDegree(m,x));
        createMatrix.printMatrix(domSet.repeatRemoveIndexofMatrix(m,domSet.AdjacencyOfHighestDegree(m,x)));


    }
}