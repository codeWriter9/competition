package org.competition.leetcode.array;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class MatrixManipulationTest extends TestCase {

    private MatrixManipulation matrixManipulation;

    public MatrixManipulationTest(String testName) {
        super(testName);
        matrixManipulation = new MatrixManipulation();
    }

    public static Test suite() {
        return new TestSuite(MatrixManipulationTest.class);
    }

    public void testMatrixTranspose3X3() {
        Assert.assertArrayEquals(new int[][]{
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}}, matrixManipulation.transpose(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}}));
    }

    public void testMatrixTranspose4X4() {
        Assert.assertArrayEquals(new int[][]{
                {1, 5, 9,  13},
                {2, 6, 10, 14},
                {3, 7, 11, 15},
                {4, 8, 12, 16}}, matrixManipulation.transpose(new int[][]{
                {1,   2,  3,  4},
                {5,   6,  7,  8},
                {9,  10, 11, 12},
                {13, 14, 15, 16}}));
    }

    public void testMatrixReflect3X3() {
        Assert.assertArrayEquals(new int[][]{
                {3, 2, 1},
                {6, 5, 4},
                {9, 8, 7}}, matrixManipulation.reflect(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}}));
    }

    public void testMatrixReflect4X4() {
        Assert.assertArrayEquals(new int[][]{
                {4,   3,  2, 1},
                {8,   7,  6, 5},
                {12, 11, 10, 9},
                {16, 15, 14, 13}}, matrixManipulation.reflect(new int[][]{
                { 1,  2,  3,  4},
                { 5,  6,  7,  8},
                { 9, 10, 11, 12},
                {13, 14, 15, 16}}));
    }

    public void testMatrixRotate3X3() {
        Assert.assertArrayEquals(new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}}, matrixManipulation.rotate(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}}));
        }

    public void testMatrixRotate4X4() {
        Assert.assertArrayEquals(new int[][]{
                {15, 13,  2,  5},
                {14,  3,  4,  1},
                {12,  6,  8,  9},
                {16,  7, 10, 11}}, matrixManipulation.rotate(new int[][]{
                { 5,  1,  9, 11},
                { 2,  4,  8, 10},
                {13,  3,  6,  7},
                {15, 14, 12, 16}}));
        }
}