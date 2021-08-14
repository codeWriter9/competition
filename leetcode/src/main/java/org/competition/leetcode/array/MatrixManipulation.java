package org.competition.leetcode.array;

public class MatrixManipulation {

    public int[][] transpose(int[][] ints) {
        for(int i=0;i< ints.length;i++) {
            for(int j=i;j< ints.length;j++) {
                int temp = ints[i][j];
                ints[i][j] = ints[j][i];
                ints[j][i] = temp;
            }

        }
        return ints;
    }

    public int[][] reflect(int[][] ints) {
        for(int i=0;i<ints.length;i++) {
            for(int j=0;j< ints.length/2;j++) { // i = 2, j = 0
                int temp = ints[i][j];// save a[2][0]
                ints[i][j] = ints[i][ints.length - j - 1];// replace a[2][0] with a[2][2]
                ints[i][ints.length - j - 1] = temp;// replace a[2][0] with saved a[2][2]
            }
        }
        return ints;
    }

    public int[][] rotate(int[][] ints) {
        return reflect(transpose(ints));
    }
}
