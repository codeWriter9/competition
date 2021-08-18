package org.competition.leetcode.strings;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class LongestCommonSuffixTest extends TestCase {

    private LongestCommonSuffix longestCommonSuffix;

    public LongestCommonSuffixTest(String name) {
        super(name);
        longestCommonSuffix = new LongestCommonSuffix();
    }

    public static Test suite() {
        return new TestSuite(LongestCommonSuffixTest.class);
    }

    public void testLongestCommonSuffix() {
        Assert.assertNotNull(longestCommonSuffix);
    }
}
