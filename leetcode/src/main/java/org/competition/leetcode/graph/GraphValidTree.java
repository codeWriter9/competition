package org.competition.leetcode.graph;

public class GraphValidTree {

    private int[] root;

    public boolean validTree(int n, int[][] edges) {
        if(edges.length != n - 1) return false;// as per wiki definition
        root = new int[n];// create a root array for all vertices
        for(int i=0;i<n;i++) {
            root[i] = i;//Every node/vertex is a parent of itself
        }
        for(int [] edge : edges) {
            if(!union(edge[0], edge[1])) return false;// unless we find they are not
        }
        return true;
    }

    public int find(int z) {
        return root[z];
    }

    public boolean union(int x, int y) {// union X and Y
        int rootX = find(x);// find parent
        int rootY = find(y);// find parent
        if (rootX != rootY) {// if parent is not same make them same
            for (int i = 0; i < root.length; i++) {// for all vertices
                if (root[i] == rootY) {// if parent is rootY
                    root[i] = rootX;// then it is also parent of rootX
                }
            }
            return true;// union complete
        }
        else return false;// if we found same parent even before we unionized them then there is a cycle
    }
}
