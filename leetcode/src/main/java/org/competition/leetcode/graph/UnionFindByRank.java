package org.competition.leetcode.graph;

public class UnionFindByRank {

    private int[] root;
    private int[] rank;

    public UnionFindByRank(int size) {
        root = new int[size];// Initialize root to number of vertices
        rank = new int[size];// Initialize rank to number of vertices
        for (int i = 0; i < size; i++) { // for all vertices
            root[i] = i;// each vertice is parent of its own
            rank[i] = 1;// each vertice has rank 1
        }
    }

    public int find(int z) {
        while (z != root[z]) {// while parent of z is not z assigned parent at index z as z
            z = root[z];
        }
        return z;
    }

    public void union(int x, int y) {
        int rootX = find(x);// find parent of x
        int rootY = find(y);// find parent of y
        if (rootX != rootY) { // if parent of X is not parent of Y
            if (rank[rootX] > rank[rootY]) { // if rank of X is greater than rank of Y
                root[rootY] = rootX;// parent of X is set as parent of Y
            } else if (rank[rootX] < rank[rootY]) {// if rank of X is less than rank of Y
                root[rootX] = rootY;// parent of Y is set as parent of X
            } else {// if rank of X is equal to rank of Y
                root[rootY] = rootX;// parent of X is set as parent of Y
                rank[rootX] += 1;// increment rank of X
            }
        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }
}
