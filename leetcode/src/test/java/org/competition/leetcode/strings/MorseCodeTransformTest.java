package org.competition.leetcode.strings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MorseCodeTransformTest {

    private MorseCodeTransform morseCodeTransform;

    @Before
    public void setUp() {
        morseCodeTransform = new MorseCodeTransform();
    }

    @Test
    public void testMorseCodeTransform() {
        assertNotNull(morseCodeTransform);
        assertEquals(2, morseCodeTransform.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
        assertEquals(1, morseCodeTransform.uniqueMorseRepresentations(new String[]{"a"}));
    }

    @After
    public void tearDown() {
        morseCodeTransform = null;
    }
}
