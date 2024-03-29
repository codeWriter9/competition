package org.competition.leetcode.graph;

public class UnionFind {

    private int[] root;

    public UnionFind(int size) {
        root = new int[size];
        for (int i = 0; i < size; i++) {
            root[i] = i;
        }
    }

    public int find(int z) {
        return root[z];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            for (int i = 0; i < root.length; i++) {
                if (root[i] == rootY) {
                    root[i] = rootX;
                }
            }
        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }

    // count the number of roots
    int getConnectedComponentCount() {
        if(root.length == 0) return 0;
        int count = 0;
        for (int i=0; i<root.length; i++) {
            if (root[i] == i) {
                count++;
            }
        }
        return count;
    }

}