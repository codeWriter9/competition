package org.competition.leetcode.strings;

import java.util.HashSet;
import java.util.Set;

public class ValidEmail {

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email : emails) {
            String[] parts = email.split("@");
            String[] local = parts[0].split("\\+");
            String[] localParts = local[0].split("\\.");
            String localPart = "";
            for(String part : localParts) {
                localPart += part;
            }
            String domain = parts[1];
            String newEmail = localPart + "@" + domain;
            set.add(newEmail);
        }
        return set.size();
    }
}
