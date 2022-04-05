package org.competition.leetcode.recursive;

import java.util.ArrayList;
import java.util.List;

public class NCharacterPassword {

    public List<String> password(String characters) {
        List<String> allPasswords = new ArrayList<>();
        return password(characters.toCharArray(), new StringBuilder(), allPasswords, new boolean[characters.length()]);
    }

    private List<String> password(char [] characters, StringBuilder password, List<String> passwords,
                          boolean [] visited) {
        if(password.length() == characters.length) {
            passwords.add(password.toString());
            return passwords;
        }
        for(int index=0;index<characters.length;index++) {
            if(visited[index]) continue;
            visited[index] = true;
            password.append(characters[index] + "");
            password(characters, new StringBuilder(password), passwords, visited);
            password.deleteCharAt(password.length() - 1);
            visited[index] = false;
        }
        return passwords;
    }

}
