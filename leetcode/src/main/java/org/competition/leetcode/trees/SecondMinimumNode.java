package org.competition.leetcode.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondMinimumNode {

    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        iterate(list, root);
        Collections.sort(list);
        int secondMin = -1;
        for(int index=1;index<list.size();index++) {
            if(list.get(index) > list.get(index - 1)) return list.get(index);
        }
        return secondMin;
    }

    private void iterate(List<Integer> list, TreeNode root) {
        if(root != null) {
            list.add(root.val);
            iterate(list, root.left);
            iterate(list, root.right);
        }
    }
}
