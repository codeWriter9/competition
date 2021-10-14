package org.competition.leetcode.graph;

public class UnionFindRnkNPthCmp {

    private int[] root;
    private int[] rank;

    public UnionFindRnkNPthCmp(int n) {
        root = new int[n];
        rank = new int[n];
        for(int i=0;i<n;i++) {
            root[i] = i;// root of the vertex is vertex it self
            rank[i] = 1;// rank of the vertex is 1
        }
    }

    public void edges(int [][] edges) {
        for(int [] edge : edges) {
            union(edge[0], edge[1]);
        }
    }

    public int find(int z) {
        if (z == root[z]) { // if the vertex is disjoint or is its own parent
            return z;// return thyself
        }
        return root[z] = find(root[z]);// else find the parent of the parent of the vertex and return
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                root[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                root[rootX] = rootY;
            } else {
                root[rootY] = rootX;
                rank[rootX] += 1;
            }
        }
    }

    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }
}