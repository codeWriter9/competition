package org.competition.leetcode.recursive;

/**
 * </><a>https://www.mathpages.com/home/kmath091.htm<a/>
 * <a>https://introcs.cs.princeton.edu/java/23recursion/Partition.java.html<a/>
 *
 * count=1|n=0|max=1
 *
 * count=1|n=0|max=2
 * count=2|n=0|max=1
 *
 * count=1|n=0|max=3
 * count=2|n=0|max=1
 * count=3|n=0|max=1
 *
 * count=1|n=0|max=4
 * count=2|n=0|max=1
 * count=3|n=0|max=2
 * count=4|n=0|max=1
 * count=5|n=0|max=1
 *
 *
 */
public class PartitionFunctions {

    public int partitions(int n) {
        int count = 0;
        return partitions(n, n, count, new StringBuilder());
    }

    private int partitions(int n, int max, int count, StringBuilder builder) {
        if (n == 0) { // numbers add upto n
            count++;// so increase count
            System.out.println("count=" + count + "|n=" + n + "|max=" + max + "|" + builder.toString());
            builder.append(",");
            return count;// Done for this partition
        }
        for (int i = Math.min(max, n); i >= 1; i--) {// from
            count = partitions(n - i, i, count, builder.append(" ").append(i));//
        }
        return count;// Done for all partitions
    }
}