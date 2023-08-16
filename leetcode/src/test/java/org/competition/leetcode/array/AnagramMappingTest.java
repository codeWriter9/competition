package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class AnagramMappingTest {

    private AnagramMapping anagramMapping;

    @Before
    public void before() {
        anagramMapping = new AnagramMapping();
    }

    @Test
    public void testAnagramMapping() {
        assertNotNull(anagramMapping);
        assertArrayEquals(new int[]{1, 4, 3, 2, 0},
                anagramMapping.anagramMappings(new int[]{12, 28, 46, 32, 50}, new int[]{50, 12, 32, 46, 28}));
        assertArrayEquals(new int[]{0, 1},
                anagramMapping.anagramMappings(new int[]{84, 46}, new int[]{84, 46}));
        assertArrayEquals(new int[]{5, 4, 3, 4, 3, 5},
                anagramMapping.anagramMappings(new int[]{21, 5, 74, 5, 74, 21}, new int[]{21, 5, 74, 74, 5, 21})
        );
    }

    @After
    public void after() {
        anagramMapping = null;
    }
}
