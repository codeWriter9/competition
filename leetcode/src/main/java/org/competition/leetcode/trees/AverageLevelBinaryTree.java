package org.competition.leetcode.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AverageLevelBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new LinkedList<>();
        List<List<Integer>> values = new ArrayList<>();
        average(root, 0, values);
        average(values, list);
        return list;
    }

    private void average(TreeNode root, int level, List<List<Integer>> values) {
        if(root != null) {
            if(level >= values.size()) {
                values.add(new ArrayList<>());
            }
            values.get(level).add(root.val);
            average(root.left, level + 1, values);
            average(root.right, level + 1, values);
        }
    }

    private void average(List<List<Integer>> values, List<Double> list) {
        for(List<Integer> value : values) {
            double sum = 0;
            for(Integer val : value) {
                sum += val;
            }
            list.add(sum / value.size());
        }
    }
}
