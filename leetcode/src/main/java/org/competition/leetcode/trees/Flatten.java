package org.competition.leetcode.trees;

import java.util.LinkedList;
import java.util.List;

public class Flatten {

    public void flatten(TreeNode root) {
        root = new TreeNode(0);
//        List<Integer> nodes = new LinkedList<>();
//        preOrder(root, nodes);
//        build(nodes, root); TODO: Fix this
    }

    private void preOrder(TreeNode root, List<Integer> nodes) {
        if(root != null) {
            nodes.add(root.val);
            preOrder(root.left, nodes);
            preOrder(root.right, nodes);
        }
    }

    private TreeNode build(List<Integer> nodes, TreeNode root) {
        if(nodes!=null && !nodes.isEmpty()) {
            root = new TreeNode(nodes.get(0));
            TreeNode current = root;
            for(int index=1;index<nodes.size();index++) {
                current.right = new TreeNode(nodes.get(index));
                current.left = null;
                current = current.right;
            }
            return root;
        }
        else return null;
    }
}
