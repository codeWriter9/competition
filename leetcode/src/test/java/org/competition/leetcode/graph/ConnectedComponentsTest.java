package org.competition.leetcode.graph;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ConnectedComponentsTest {

    private ConnectedComponents connectedComponents;

    @Before
    public void before() {
        connectedComponents = new ConnectedComponents();
    }

    @Test
    public void testConnectedComponentsNotNull() {
        assertNotNull(connectedComponents);
    }

    @Test
    public void testConnectedComponentsEmpty() {
        assertEquals(1, connectedComponents.countComponents(1, new int[][]{}));
    }

    @Test
    public void testConnectedComponents() {
        assertEquals(2, connectedComponents.countComponents(5, new int[][]{{0, 1}, {1, 2}, {3, 4}}));
    }

    @Test
    public void testConnectedComponents2() {
        assertEquals(1, connectedComponents.countComponents(5, new int[][]{{0, 1}, {1, 2}, {2, 3},{3, 4}}));
    }

    @After
    public void after() {
        connectedComponents = null;
    }
}