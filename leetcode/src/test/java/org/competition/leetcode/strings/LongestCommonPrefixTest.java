package org.competition.leetcode.strings;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class LongestCommonPrefixTest extends TestCase {

    private LongestCommonPrefix longestCommonPrefix;

    public LongestCommonPrefixTest(String name) {
        super(name);
        longestCommonPrefix = new LongestCommonPrefix();
    }

    public static Test suite() {
        return new TestSuite(LongestCommonPrefixTest.class);
    }

    public void testLongestCommonPrefix() {
        Assert.assertNotNull(longestCommonPrefix);
        Assert.assertEquals("ha", longestCommonPrefix.longestCommonPrefix(new String[]{"hall", "hallow", "hat"}));
        Assert.assertEquals("fl", longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

}
