public class Main {
    public static void main(String[] args) {

        int[][] m = createMatrix.inputtedMatrix(4);

        createMatrix.printMatrix(m);
        for (int i = 0; i < m.length; i++) {
            System.out.println(domSet.findDegree(m, i));
        }
        System.out.println(domSet.findPositionOfHighestDegree(m));

    }
}
