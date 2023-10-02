package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class UncommonWordsInSentencesTest {

    private UncommonWordsInSentences uncommonWordsInSentences;

    @Before
    public void setUp() throws Exception {
        uncommonWordsInSentences = new UncommonWordsInSentences();
    }

    @Test
    public void testUncommonFromSentences() throws Exception {
        assertNotNull(uncommonWordsInSentences);
        assertArrayEquals(new String[]{"sweet", "sour"},
                uncommonWordsInSentences.uncommonFromSentences("this apple is sweet", "this apple is sour"));
        assertArrayEquals(new String[]{"banana"},
                uncommonWordsInSentences.uncommonFromSentences("apple apple", "banana"));
    }

    @After
    public void tearDown() throws Exception {
        uncommonWordsInSentences = null;
    }
}
