package org.competition.leetcode.graph;

public class ConnectedComponents {

    public int countComponents(int n, int[][] edges) {
        if (n == 1 || edges.length == 0) return n;
        UnionFind unionFind = new UnionFind(n);
        for (int [] edge : edges) {
            unionFind.union(edge[0], edge[1]);
        }
        return unionFind.getConnectedComponentCount();
    }
}