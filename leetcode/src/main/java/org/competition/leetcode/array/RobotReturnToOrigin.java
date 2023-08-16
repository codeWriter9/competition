package org.competition.leetcode.array;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        Map<String, Long> charCount = moves.codePoints().mapToObj(ch -> "" + (char)ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return charCount.getOrDefault("U", 0L).equals(charCount.getOrDefault("D", 0L))
                && charCount.getOrDefault("L", 0L).equals(charCount.getOrDefault("R", 0L));
    }
}
