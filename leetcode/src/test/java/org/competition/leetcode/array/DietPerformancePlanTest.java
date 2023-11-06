package org.competition.leetcode.array;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DietPerformancePlanTest {

    private DietPerformancePlan dietPerformancePlan;

    @Before
    public void setUp() throws Exception {
        dietPerformancePlan = new DietPerformancePlan();
    }

    @Test
    public void test() {
        assertNotNull(dietPerformancePlan);
        assertEquals(0,
                dietPerformancePlan.dietPlanPerformance(
                        new int[]{1, 2, 3, 4, 5}, 1, 3, 3
                ));
        assertEquals(1, dietPerformancePlan.dietPlanPerformance(
                new int[]{3, 2}, 2, 0, 1
                ));
        assertEquals(0, dietPerformancePlan.dietPlanPerformance(
                new int[]{6, 5, 0, 0}, 2, 1, 5
                ));

        assertEquals(0,
                dietPerformancePlan.dietPlanPerformanceFast(
                        new int[]{1, 2, 3, 4, 5}, 1, 3, 3
                ));
        assertEquals(1, dietPerformancePlan.dietPlanPerformanceFast(
                new int[]{3, 2}, 2, 0, 1
        ));
        assertEquals(0, dietPerformancePlan.dietPlanPerformanceFast(
                new int[]{6, 5, 0, 0}, 2, 1, 5
        ));

    }

    @After
    public void destroy() {
        dietPerformancePlan = null;
    }
}
