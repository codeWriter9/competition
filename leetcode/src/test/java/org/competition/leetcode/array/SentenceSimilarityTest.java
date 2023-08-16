package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class SentenceSimilarityTest {

    private SentenceSimilarity sentenceSimilarity;

    @Before
    public void before() {
        sentenceSimilarity = new SentenceSimilarity();
    }

    @Test
    public void testSentenceSimilarity() {
        assertNotNull(sentenceSimilarity);
        assertTrue(sentenceSimilarity.areSentencesSimilar(
                        new String[]{"great", "acting", "skills"},
                        new String[]{"fine", "drama", "talent"},
                        Arrays.asList(Arrays.asList("great", "fine"),
                                Arrays.asList("drama", "acting"),
                                Arrays.asList("skills", "talent"))
                )
        );
        assertTrue(sentenceSimilarity.areSentencesSimilar(
                        new String[]{"great"},
                        new String[]{"great"},
                        Collections.EMPTY_LIST
                )
        );
        assertFalse(sentenceSimilarity.areSentencesSimilar(
                        new String[]{"great"},
                        new String[]{"doubleplus", "good"},
                        Arrays.asList(Arrays.asList("great", "doubleplus"))
                )
        );
    }

    @After
    public void after() {
        sentenceSimilarity = null;
    }
}
