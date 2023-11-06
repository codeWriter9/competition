package org.competition.leetcode.recursive;

import java.util.ArrayList;
import java.util.List;

public class Permute {

    /**
     *
     *  1 5 8 4 7 6 5 3 1
     *  1 5 8 |4| 7 6 5 3 1  <- find the first decreasing element from the end
     *  1 5 8 |4| 7 6 |5| 3 1  <- find the first element from end greater than the first decreasing element
     *  1 5 8 |5| 7 6 |4| 3 1  <- swap
     *  1 5 8 |5| 1 3 |4| 6 7  <- reverse
     *  1 5 8 5 1 3 4 6 7   <- Done
     *
     * @param nums
     */
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;// as per leet code - will fails for any array with size less than 2
        while (i >= 0 && nums[i + 1] <= nums[i]) { // find the first decreasing element from the end
            i--;
        }
        if (i >= 0) {// if we did not reach the start
            int j = nums.length - 1;// get the end
            while (nums[j] <= nums[i]) {// while the end is less or equal to the first decreasing element
                j--;
            }
            swap(nums, i, j); // swap the first decreasing element with the first element from end greater than the first decreasing element
        }
        reverse(nums, i + 1);// reverse the rest of the array
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<List<Integer>> permutations(int [] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        List<List<Integer>> collection = new ArrayList<>();
        boolean [] visited = new boolean[nums.length];
        permutations(nums, collection, new ArrayList<>(), visited);
        return collection;
    }

    private void permutations(int [] nums, List<List<Integer>> collection, List<Integer> current, boolean [] visited) {
        if(current.size() == nums.length) {
            collection.add(current);
            return;
        } else {
            for(int index=0;index<nums.length;index++) {
                if(!visited[index]) { // only if not visited
                    visited[index] = true;// set this as visited
                    current.add(nums[index]);
                    permutations(nums, collection, new ArrayList<>(current), visited);
                    current.remove(current.size() - 1);
                    visited[index] = false;// reset this as not visited
                }
            }
        }
    }
}
